# sharp
锋刃-简化开发的架构项目

集成功能:
    1.swagger ui 便于查看和测试接口
    2.yml dev测试环境切换  pro生产环境
    3.spring-boot-devtools 开发环境热部署
    4.支持log4j2日志
    5.添加了对于druid数据源的支持(mysql数据库)
    6.支持了dubbo服务的无缝对接.
      6.1.在消费者端使用@DubboConsumer注解标签.
      6.2.在服务端在service层的类上添 加@DubboProvider(interfaceClass = 暴露的类名.class)注解
