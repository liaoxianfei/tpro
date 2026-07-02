# kingtype-monitor · Agent 说明

- **职责**：提供全项目共用的监控能力（Spring Boot Admin），监控各微服务健康、日志、指标等。
- **入口类**：`com.kingtype.modules.monitor.RuoYiMonitorApplication`（本目录为独立可运行服务）
- **依赖**：需 Nacos 及各服务注册并开启 Actuator
- **修改建议**：监控端配置与安全（如账号）在 Nacos 或 application；详细见官方 Spring Boot Admin 文档；保持与 common、各业务服务的 Actuator 配置一致。
