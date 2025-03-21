package com.axr.ghosts;

import java.io.IOException;
import java.util.List;

/**
 * 启动入库
 * @author xinrui.an
 * @date 2025/03/21
 */
public class Application {
    public static void main(String[] args) throws IOException {
        List<String> urls = GitHubUrls.getAllDomains();
        List<HostConfig> hostConfigs = HostsService.resolveUrls(urls);
        HostsContent hosts = HostsService.generateHosts(hostConfigs);
        HostsService.writeHosts(hosts);
    }
}