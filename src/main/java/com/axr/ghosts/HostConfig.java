package com.axr.ghosts;

/**
 * Host 配置类
 * @author xinrui.an
 * @date 2025/03/21
 */
public class HostConfig {
    private final String url;
    private final String ip;

    public HostConfig(String url, String ip) {
        this.url = url;
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public String getIp() {
        return ip;
    }
}