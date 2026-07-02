# kingtype-api · Agent 说明

- **职责**：提供全项目共用的对外 API 定义（Dubbo 接口、DTO、枚举），供 kingtype-auth、kingtype-modules 等依赖，无业务实现。
- **无独立启动类**：本目录为 BOM + 多 api-xxx 子模块；每个子模块被上层服务通过 Maven 依赖引用。
- **修改建议**：在对应 api-xxx 子模块中修改接口/DTO；实现类在 kingtype-modules/kingtype-xxx 的 service/dubbo 包下，需保持签名一致；涉及配置时同步检查 Nacos 或各服务 yml，保持 API 稳定避免破坏 auth/gateway/modules。
