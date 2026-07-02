# 将此文件夹下所有配置文件内容复制到 `nacos` 对应的配置中

> 注意：`alternatives/` 子目录下为可选替代方案的配置，**不要**默认上传到 Nacos。
> 例如 `alternatives/kingtype-gateway-mvc.yml` 是网关的 Servlet MVC 版配置；本项目当前 JDK 版本为 17，
> 统一使用 `ruoyi-gateway.yml`（对应 `kingtype-gateway` 模块，Spring Cloud Gateway WebFlux 版）。
> 只有在升级到 JDK 21 并切换使用 `kingtype-gateway-mvc` 模块时，才需要改为上传 `alternatives/kingtype-gateway-mvc.yml`，
> 且需与 `ruoyi-gateway.yml` 二选一，禁止同时上传/同时部署两个网关。