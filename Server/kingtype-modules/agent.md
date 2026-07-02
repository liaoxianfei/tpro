# kingtype-modules · Agent 说明

- **职责**：提供全项目业务微服务能力；各子模块可独立启动，通过 Nacos 发现与配置，无统一启动类。
- **子模块与入口**：kingtype-system → RuoYiSystemApplication；kingtype-gen → RuoYiGenApplication；kingtype-job → RuoYiJobApplication；kingtype-resource → RuoYiResourceApplication；kingtype-workflow → RuoYiWorkflowApplication
- **修改建议**：在对应 kingtype-xxx 子模块中修改；新增业务在 kingtype-modules 下新建 Maven 子模块、父 pom 为本模块并加入根 pom 的 modules，若需 RPC 则在 kingtype-api 中增加对应 api 子模块；保持与 common、api 的依赖与接口一致。
