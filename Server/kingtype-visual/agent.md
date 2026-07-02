# kingtype-visual · Agent 说明

- **职责**：提供全项目共用的基础设施与可视化运维能力（Nacos、监控中心、Seata 服务端、SnailJob 服务端等）。
- **无统一启动类**：各子模块有独立启动类（Nacos、RuoYiMonitorApplication、SeataServerApplication、SnailJobServerApplication），见各子目录 agent.md。
- **配置**：Nacos 配置在 script/config/nacos；各服务另有 application.yml 或 Nacos 配置
- **修改建议**：在对应子模块中修改；改动基础设施前注意影响范围；Nacos 为源码集成可调试扩展；保持与 common、modules 的配置与依赖一致。
