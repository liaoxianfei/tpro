# kingtype-nacos · Agent 说明

- **职责**：提供全项目共用的注册中心与配置中心能力（Nacos Server），供全项目服务注册与拉取配置。
- **入口**：见本模块主类（Nacos 启动类）（本目录为独立可运行服务）
- **配置**：script/config/nacos 下为导出的配置；实际运行配置在 application 或 Nacos 自身配置中
- **修改建议**：部署时通常最先启动；其他服务依赖其地址（如 ruoyi-*.yml 中的 server-addr）；修改配置时同步检查各服务 Nacos 地址与命名空间。
