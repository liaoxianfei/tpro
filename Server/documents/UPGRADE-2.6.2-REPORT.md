# TPro 升级报告：RuoYi-Cloud-Plus 2.5.3 → 2.6.2

**升级日期**：2026-07-01  
**命名空间**：保持 `com.kingtype` / `kingtype-*` 不变  
**备份位置**：`d:\Projects\TPro-backup-20260701-153617.zip`

---

## 1. 升级概要

| 项目 | 升级前 | 升级后 |
|------|--------|--------|
| 框架版本 | RuoYi-Cloud-Plus 2.5.3 | RuoYi-Cloud-Plus 2.6.2 |
| 项目版本 `${revision}` | 2.5.3 | 2.6.2 |
| groupId | com.kingtype | com.kingtype（不变） |
| artifactId | OLT-Cloud-Plus | OLT-Cloud-Plus（不变） |
| Java 包名 | com.kingtype.* | com.kingtype.*（不变） |

## 2. 变更统计

| 类型 | 数量 |
|------|------|
| 新增文件 | 176 |
| 删除文件 | 147 |
| 更新文件 | 125 |
| 需人工复核 | 17 |

## 3. 新增模块

### kingtype-gateway-mvc

基于 Spring MVC（Undertow）的网关实现，与现有 WebFlux 网关 `kingtype-gateway` 并列。

- 启动类：`com.kingtype.gateway.RuoYiGatewayMvcApplication`
- Nacos 配置：`script/config/nacos/kingtype-gateway-mvc.yml`
- 已加入根 POM `<modules>`

## 4. 依赖版本升级对照

| 依赖 | 2.5.3 | 2.6.2 |
|------|-------|-------|
| spring-boot | 3.5.9 | 3.5.15 |
| spring-cloud | 2025.0.1 | 2025.0.3 |
| spring-boot-admin | 3.5.6 | 3.5.8 |
| swagger.core | 2.2.41 | 2.2.47 |
| springdoc | 2.8.15 | 2.8.17 |
| snailjob | 1.9.0 | 1.10.0 |
| satoken | 1.44.0 | 1.45.0 |
| lombok | 1.18.42 | 1.18.44 |
| skywalking-toolkit | 9.5.0 | 9.6.0 |
| bouncycastle | bcprov-jdk15to18 1.80 | bcpkix-jdk18on 1.83 |
| ip2region | 3.3.2 | 3.3.7 |
| sms4j | 3.3.4 | 3.3.5 |
| anyline | 8.7.3-20251210 | 8.7.3-20260319 |
| warm-flow | 1.8.4 | 1.8.5 |
| rocketmq | 2.3.4 | 2.3.5 |

## 5. 主要功能变更（来自上游 Release Notes）

- **Dubbo 元数据中心**：使用 Redisson 重写（`RedissonMetadataReport`），替代 Jedis 实现
- **全局异常拦截器**：不返回具体异常内容到前端，避免信息泄漏
- **Token 日志**：截断 token 输出，防止盗用
- **工作流**：修复多次驳回无法锁定审批人问题；新增 `TaskOperationEnum`
- **Gateway**：修复默认请求头无法覆盖问题；MVC/Flux 网关异常返回一致性
- **findInSet**：增加参数校验防止 SQL 注入
- **代码生成**：禁止生成到本地路径（CVE 修复）
- **Excel**：修复 `ExcelBigNumberConvert` 导入转换问题

## 6. 需人工复核的文件

以下文件在升级前与 baseline 存在差异（可能含本地定制），已用上游 2.6.2 版本覆盖，请确认：

- `pom.xml`（已保留 OLT-Cloud-Plus 自定义元数据）
- `README.md`
- `kingtype-common/kingtype-common-dubbo/src/main/resources/common-dubbo.yml`
- `kingtype-gateway/pom.xml`（已修复 parent 为 OLT-Cloud-Plus）
- `kingtype-modules/kingtype-gen/.../VelocityUtils.java`
- `kingtype-modules/kingtype-system/.../RemoteUserServiceImpl.java`
- `kingtype-modules/kingtype-system/.../SysUserServiceImpl.java`
- `kingtype-modules/kingtype-workflow/.../FlwTaskAssigneeServiceImpl.java`
- `kingtype-modules/kingtype-workflow/.../FlwTaskServiceImpl.java`
- `script/config/nacos/application-common.yml`
- `script/docker/docker-compose.yml`
- `script/sql/*.sql`（ry-cloud、ry-job、oracle、postgres）

## 7. 编译验证

```
mvn -DskipTests clean compile  # 全项目编译通过
```

## 8. 部署注意事项

1. **Nacos 配置**：需将 `script/config/nacos/` 下更新的配置同步到 Nacos（尤其 `application-common.yml`、`kingtype-gateway-mvc.yml`）
2. **数据库**：如有表结构变更，执行 `script/sql/update/` 下对应升级脚本
3. **网关选择**：可选用 `kingtype-gateway`（WebFlux）或 `kingtype-gateway-mvc`（MVC），二选一部署
4. **Seata**：`kingtype-seata-server` 内置 jar 已升级至 2.6.0

## 9. Git 状态

本机未安装 Git（winget 安装失败），未执行 `git init`。备份 zip 位于 `d:\Projects\TPro-backup-20260701-153617.zip`，可用于回滚。

升级工作目录与脚本：`d:\Projects\TPro-upgrade-work\`
