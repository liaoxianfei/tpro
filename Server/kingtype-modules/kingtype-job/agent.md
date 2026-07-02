# kingtype-job · Agent 说明

- **职责**：提供全项目共用的定时/分布式任务执行能力（SnailJob 客户端，分片、重试、DAG 等），与 snailjob-server 配合。
- **入口类**：`com.kingtype.job.RuoYiJobApplication`（本目录为独立可运行服务）
- **关键**：任务执行器、与 system 等服务的 Dubbo 调用；任务配置在 SnailJob 控制台或 Nacos；数据库见 script/sql/ry-job.sql
- **修改建议**：新增或修改任务逻辑在本模块；涉及配置时同步检查 Nacos 或 snailjob-server；保持与 common、api 的依赖一致。
