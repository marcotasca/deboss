package com.bsf.deboss.bot.config;

public class DebossConfiguration {

    private DebossDepopAuthConfiguration authConfiguration;

    private DebossBotConfiguration botConfiguration;

    public DebossConfiguration() {
        setAuthConfiguration(new DebossDepopAuthConfiguration());
        setBotConfiguration(new DebossBotConfiguration());
    }

    public DebossDepopAuthConfiguration getAuthConfiguration() {
        return authConfiguration;
    }

    public void setAuthConfiguration(DebossDepopAuthConfiguration authConfiguration) {
        this.authConfiguration = authConfiguration;
    }

    public DebossBotConfiguration getBotConfiguration() {
        return botConfiguration;
    }

    public void setBotConfiguration(DebossBotConfiguration botConfiguration) {
        this.botConfiguration = botConfiguration;
    }
}
