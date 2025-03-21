package com.axr.ghosts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * GitHub 相关域名常量类
 * 包含了 GitHub 服务使用的所有重要域名
 * @author xinrui.an
 * @date 2025/03/21
 */
public class GitHubUrls {
    /**
     * GitHub 主站
     */
    public static final String GITHUB_MAIN = "github.com";
    /**
     * GitHub API 服务
     */
    public static final String GITHUB_API = "api.github.com";
    /**
     * GitHub Gist 代码片段服务
     */
    public static final String GITHUB_GIST = "gist.github.com";
    /**
     * GitHub Pages 静态网站服务
     */
    public static final String GITHUB_IO = "github.io";
    /**
     * GitHub 服务状态页面
     */
    public static final String GITHUB_STATUS = "githubstatus.com";
    /**
     * GitHub 社区论坛
     */
    public static final String GITHUB_COMMUNITY = "github.community";
    /**
     * GitHub 企业版中央服务
     */
    public static final String GITHUB_CENTRAL = "central.github.com";

    /**
     * GitHub 静态资源
     */
    public static final String GITHUB_ASSETS = "github.githubassets.com";
    /**
     * GitHub CDN 资源
     */
    public static final String GITHUB_ASSETS_CDN = "assets-cdn.github.com";
    /**
     * GitHub Desktop 客户端资源
     */
    public static final String GITHUB_DESKTOP = "desktop.githubusercontent.com";
    /**
     * Fastly CDN 节点
     */
    public static final String GITHUB_FASTLY_NET = "github.map.fastly.net";
    /**
     * Fastly SSL CDN 节点
     */
    public static final String GITHUB_SSL_FASTLY = "github.global.ssl.fastly.net";

    /**
     * 仓库原始文件访问
     */
    public static final String RAW_CONTENT = "raw.githubusercontent.com";
    /**
     * 代码下载服务
     */
    public static final String CODELOAD = "codeload.github.com";
    /**
     * 媒体文件
     */
    public static final String MEDIA_CONTENT = "media.githubusercontent.com";

    /**
     * 用户上传图片
     */
    public static final String USER_IMAGES = "user-images.githubusercontent.com";
    /**
     * 外部图片代理和缓存
     */
    public static final String CAMO = "camo.githubusercontent.com";
    /**
     * 网站图标
     */
    public static final String FAVICONS = "favicons.githubusercontent.com";

    /**
     * 主要头像服务
     */
    public static final String AVATARS = "avatars.githubusercontent.com";
    /**
     * 头像分片服务 0
     */
    public static final String AVATARS_0 = "avatars0.githubusercontent.com";
    /**
     * 头像分片服务 1
     */
    public static final String AVATARS_1 = "avatars1.githubusercontent.com";
    /**
     * 头像分片服务 2
     */
    public static final String AVATARS_2 = "avatars2.githubusercontent.com";
    /**
     * 头像分片服务 3
     */
    public static final String AVATARS_3 = "avatars3.githubusercontent.com";
    /**
     * 头像分片服务 4
     */
    public static final String AVATARS_4 = "avatars4.githubusercontent.com";
    /**
     * 头像分片服务 5
     */
    public static final String AVATARS_5 = "avatars5.githubusercontent.com";

    /**
     * GitHub 云存储
     */
    public static final String S3_CLOUD = "github-cloud.s3.amazonaws.com";
    /**
     * GitHub 主要存储
     */
    public static final String S3_MAIN = "github-com.s3.amazonaws.com";
    /**
     * 发布包资源存储
     */
    public static final String S3_RELEASE_ASSETS = "github-production-release-asset-2e65be.s3.amazonaws.com";
    /**
     * 用户资源存储
     */
    public static final String S3_USER_ASSETS = "github-production-user-asset-6210df.s3.amazonaws.com";
    /**
     * 仓库文件存储
     */
    public static final String S3_REPOSITORY_FILES = "github-production-repository-file-5c1aeb.s3.amazonaws.com";

    /**
     * 私有构造函数，防止实例化
     */
    private GitHubUrls() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * 获取所有 GitHub 域名的列表
     *
     * @return 包含所有 GitHub 域名的列表
     */
    public static List<String> getAllDomains() {
        return new ArrayList<>(Arrays.asList(
                GITHUB_MAIN,
                GITHUB_API,
                GITHUB_GIST,
                GITHUB_IO,
                GITHUB_STATUS,
                GITHUB_COMMUNITY,
                GITHUB_CENTRAL,
                GITHUB_ASSETS,
                GITHUB_ASSETS_CDN,
                GITHUB_DESKTOP,
                GITHUB_FASTLY_NET,
                GITHUB_SSL_FASTLY,
                RAW_CONTENT,
                CODELOAD,
                MEDIA_CONTENT,
                USER_IMAGES,
                CAMO,
                FAVICONS,
                AVATARS,
                AVATARS_0,
                AVATARS_1,
                AVATARS_2,
                AVATARS_3,
                AVATARS_4,
                AVATARS_5,
                S3_CLOUD,
                S3_MAIN,
                S3_RELEASE_ASSETS,
                S3_USER_ASSETS,
                S3_REPOSITORY_FILES
        ));
    }
}
