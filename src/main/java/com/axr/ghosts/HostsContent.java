package com.axr.ghosts;

/**
 * Hosts 内容类
 * @author xinrui.an
 * @date 2025/03/21
 */
public class HostsContent {
    private final String hostStr;
    private final String updateTime;

    public HostsContent(String hostStr, String updateTime) {
        this.hostStr = hostStr;
        this.updateTime = updateTime;
    }

    public String getHostStr() {
        return hostStr;
    }

    public String getUpdateTime() {
        return updateTime;
    }
}