# kingtype-system · Agent 说明

- **职责**：提供全项目共用的系统管理能力（用户/角色/菜单/部门/岗位/字典/参数/租户/通知/日志等），为 auth 与前端提供数据与 RPC 接口。
- **入口类**：`com.kingtype.system.RuoYiSystemApplication`（本目录为独立可运行服务）
- **关键包**：controller、service、dal（mapper/entity）、api 实现等；权限与菜单数据在此维护
- **修改建议**：涉及权限模型或组织架构时在此模块修改；接口定义在 kingtype-api-system，需保持同步；涉及配置时同步检查 Nacos 或各服务 yml。
