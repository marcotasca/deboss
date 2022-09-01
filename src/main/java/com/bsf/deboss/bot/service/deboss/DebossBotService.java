package com.bsf.deboss.bot.service.deboss;

import com.bsf.deboss.bot.config.DebossConfiguration;

import java.util.List;

public interface DebossBotService {
    String getTokenAccess(String username, String password);
    void followContactsByProductKeywords(String token, List<String> keywords);
}
