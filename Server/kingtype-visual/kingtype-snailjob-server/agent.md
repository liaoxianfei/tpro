# kingtype-snailjob-server · Agent 说明

- **职责**：提供全项目共用的分布式任务调度能力（SnailJob 调度中心），管理任务、执行器、分片、重试、DAG 等。
- **入口类**：本模块 SnailJobServerApplication（本目录为独立可运行服务）
- **依赖**：数据库与 Nacos；执行端为 kingtype-modules/kingtype-job
- **修改建议**：任务与执行器配置在控制台或 Nacos；库表见官方或 script/sql；保持与 kingtype-job 客户端及 common 的配置一致。
