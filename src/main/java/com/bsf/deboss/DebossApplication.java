package com.bsf.deboss;

import com.bsf.deboss.api.service.depopweb.DepopWebApiService;
import com.bsf.deboss.api.dto.login.LoginDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import com.bsf.deboss.bot.DebossBot;
import com.bsf.deboss.bot.config.DebossConfiguration;
import com.bsf.deboss.bot.service.deboss.DebossBotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class DebossApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DebossApplication.class, args);
    }
    
    @Autowired
    DebossBotService debossBotService;

    Logger log = LoggerFactory.getLogger(DebossApplication.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Deboss");

        String username = System.getenv("auth.username");
        String password = System.getenv("auth.password");
        LoginDto login = new LoginDto(username, password);

        DebossConfiguration configuration = new DebossConfiguration();
        configuration.getAuthConfiguration().setUsername(login.getUsername());
        configuration.getAuthConfiguration().setPassword(login.getPassword());

        configuration.getBotConfiguration().setProductKeywords(Arrays.asList("Jordan 1 Mocha", "University"));

        Thread thread = new Thread(() -> {
            DebossBot debossBot = new DebossBot(configuration, debossBotService);
            debossBot.init();
        });
        thread.start();

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

    }

}
