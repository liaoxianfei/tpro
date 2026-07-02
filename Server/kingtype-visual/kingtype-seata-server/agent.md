# kingtype-seata-server · Agent 说明

- **职责**：提供全项目共用的分布式事务协调能力（Seata Server，AT/TCC 等）。
- **入口类**：`org.apache.seata.server.SeataServerApplication`（本目录为独立可运行服务）
- **前置**：Nacos 已启动；Seata 库表已初始化（script/sql/ry-seata.sql）
- **修改建议**：配置在 application 或 script/config；业务服务通过 kingtype-common-seata 连接；保持与 common-seata 及各业务服务配置一致。
