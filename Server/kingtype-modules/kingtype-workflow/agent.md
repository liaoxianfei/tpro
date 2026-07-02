# kingtype-workflow · Agent 说明

- **职责**：提供全项目共用的工作流能力（Warm-Flow：流程定义、发起、审批、转办、委派、会签/或签等）。
- **入口类**：`com.kingtype.workflow.RuoYiWorkflowApplication`（本目录为独立可运行服务）
- **关键**：流程图表、节点配置、与 system 用户/角色集成；API 在 kingtype-api-workflow；数据库表见 script/sql/ry-workflow.sql
- **修改建议**：流程逻辑与扩展在 service 与 Warm-Flow 配置；接口变更需同步 kingtype-api-workflow；涉及配置时同步检查 Nacos。
