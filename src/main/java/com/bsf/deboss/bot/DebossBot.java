package com.bsf.deboss.bot;

import com.bsf.deboss.bot.config.DebossConfiguration;
import com.bsf.deboss.bot.service.deboss.DebossBotService;

public class DebossBot {

    private DebossBotService debossBotService;

    private DebossConfiguration debossConfiguration;

    public DebossBot(DebossConfiguration configuration, DebossBotService debossBotService) {
        setDebossBotService(debossBotService);
        setDebossConfiguration(configuration);
    }

    private void setDepopAuthConfiguration() {
        getDebossConfiguration()
                .getAuthConfiguration()
                .setToken(
                        debossBotService.getTokenAccess(
                                getDebossConfiguration().getAuthConfiguration().getUsername(),
                                getDebossConfiguration().getAuthConfiguration().getPassword()
                        )
                );
    }

    public DebossConfiguration getDebossConfiguration() {
        return debossConfiguration;
    }

    public void setDebossConfiguration(DebossConfiguration debossConfiguration) {
        this.debossConfiguration = debossConfiguration;
    }

    public DebossBotService getDebossBotService() {
        return debossBotService;
    }

    public void setDebossBotService(DebossBotService debossBotService) {
        this.debossBotService = debossBotService;
    }

    public void init() {
        setDepopAuthConfiguration();
        debossBotService.followContactsByProductKeywords(
                getDebossConfiguration().getAuthConfiguration().getToken(),
                getDebossConfiguration().getBotConfiguration().getProductKeywords()
        );
    }
}
