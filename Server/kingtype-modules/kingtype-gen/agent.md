# kingtype-gen · Agent 说明

- **职责**：提供全项目共用的代码生成能力（按表结构一键生成 Controller/Service/Mapper/VO 及前端等），支持多数据源。
- **入口类**：`com.kingtype.gen.RuoYiGenApplication`（本目录为独立可运行服务）
- **关键**：模板引擎（Velocity）、数据源配置、生成规则；生成结果需符合项目命名与 Javadoc 规范
- **修改建议**：在对应 common-xxx 或本模块中修改生成逻辑/模板；数据源配置在 Nacos 或 datasource 配置中；保持 API 稳定，避免破坏其他服务依赖。
