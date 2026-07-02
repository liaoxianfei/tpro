# OLT-Cloud-Plus · Agent 说明

供 AI Agent 在本仓库中执行代码理解、修改、搜索时快速定位入口与约定。

- **职责**：本仓库为根项目；根 POM 为 `pom.xml`（版本 `${revision}` 当前 2.6.2）；README.md 含项目整体分析（技术栈、模块结构、配置与部署）
- **无独立启动类**：可运行应用入口在各子模块（kingtype-gateway、kingtype-auth、kingtype-modules/*、kingtype-visual/*），见各子目录 `agent.md`
- **配置与脚本**：Nacos 配置 `script/config/nacos/`；SQL `script/sql/`；Docker `script/docker/`；各服务仅 `application.yml` 引导到 Nacos
- **修改建议**：编译用根目录 `mvn clean install -DskipTests`；单模块运行需先启 Nacos/Redis/MySQL；查找 Controller 看各模块 `controller` 包、Dubbo 看 `@DubboService`；业务扩展在 kingtype-modules 下新增子模块并同步维护该目录 `.cursor.md` / `agent.md`
