# kingtype-auth · Agent 说明

- **职责**：提供全项目共用的认证授权能力（登录、登出、Token 签发/校验、验证码、社交登录、限流、加解密、多租户）。
- **入口类**：`com.kingtype.auth.RuoYiAuthApplication`（本目录为独立可运行服务）
- **依赖**：kingtype-api-resource、kingtype-common-service-impl、common-security/social/tenant/dubbo/seata 等
- **修改建议**：登录/权限逻辑在 Controller 与 Service 包下（login、token、oauth 相关类）；Sa-Token 配置见 common-satoken 与 Nacos；保持 API 稳定，避免破坏 gateway/modules 调用。
