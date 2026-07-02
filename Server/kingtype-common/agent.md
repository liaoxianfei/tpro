# kingtype-common · Agent 说明

- **职责**：提供全项目共用的基础设施与扩展能力（配置、缓存、ORM、RPC、安全、多租户、文件、消息等），以插件化子模块形式被 auth、gateway、modules 按需依赖。
- **无独立启动类**：本目录为 BOM + 多 common-xxx 子模块；每个子模块被上层服务通过 Maven 依赖引用。
- **修改建议**：在对应 common-xxx 子模块中修改；涉及配置时同步检查 Nacos 或各服务 yml；保持 API 稳定，避免破坏 auth/gateway/modules。
