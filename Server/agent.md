# OLT-Cloud-Plus · Agent 说明

供 AI Agent 在本仓库中执行代码理解、修改、搜索时快速定位入口与约定。

- **职责**：本仓库为根项目；根 POM 为 `pom.xml`（版本 `${revision}` 当前 2.6.2）；README.md 含项目整体分析（技术栈、模块结构、配置与部署）
- **无独立启动类**：可运行应用入口在各子模块（kingtype-gateway、kingtype-auth、kingtype-modules/*、kingtype-visual/*），见各子目录 `agent.md`
- **配置与脚本**：Nacos 配置 `script/config/nacos/`；SQL `script/sql/`；Docker `script/docker/`；各服务仅 `application.yml` 引导到 Nacos
- **修改建议**：编译用根目录 `mvn clean install -DskipTests`；单模块运行需先启 Nacos/Redis/MySQL；查找 Controller 看各模块 `controller` 包、Dubbo 看 `@DubboService`；业务扩展在 kingtype-modules 下新增子模块并同步维护该目录 `.cursor.md` / `agent.md`
- **网关选型**：项目内置 `kingtype-gateway`（Spring Cloud Gateway WebFlux 版）与 `kingtype-gateway-mvc`（Servlet MVC 版，官方建议配合 JDK 21 虚拟线程使用）两套网关，**二者只能选一个部署，不允许同时运行**。本项目 JDK 版本为 17，因此**统一使用 `kingtype-gateway`**；`kingtype-gateway-mvc` 仅保留源码作为未来升级 JDK 21 后的备选方案，不参与构建部署（其 Nacos 配置已移至 `script/config/nacos/alternatives/kingtype-gateway-mvc.yml`，不在默认上传范围内；`docker-compose.yml` 与 `.run/` 中也均未包含该模块）。
