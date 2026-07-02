# kingtype-resource · Agent 说明

- **职责**：提供全项目共用的资源与通信能力（文件存储 OSS/S3、邮件、短信、WebSocket、SSE 等）。
- **入口类**：`com.kingtype.resource.RuoYiResourceApplication`（本目录为独立可运行服务）
- **关键**：文件配置与存储、OSS 客户端、消息推送；auth 等服务通过 Dubbo 调用本服务接口；接口定义在 kingtype-api-resource
- **修改建议**：存储/邮件/短信配置在 Nacos 或 common-oss、common-mail、common-sms；修改接口时需同步 kingtype-api-resource；保持 API 稳定避免破坏 auth/modules。
