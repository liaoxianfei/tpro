# kingtype-gateway · Agent 说明

- **职责**：提供全项目共用的网关能力（请求路由、全局/路由级鉴权、限流、租户传递、请求体缓存、跨域、日志）。
- **入口类**：`com.kingtype.gateway.RuoYiGatewayApplication`（本目录为独立可运行服务）
- **依赖**：spring-cloud-starter-gateway、kingtype-common-nacos、common-satoken、common-redis、common-tenant
- **修改建议**：路由/过滤器查找 `GatewayConfig`、`Filter`、`GlobalFilter` 等；路由规则多在 Nacos `ruoyi-gateway.yml`；保持与 auth、modules 的鉴权与路由约定一致。
