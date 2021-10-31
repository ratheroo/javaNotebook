*AOP*

- AOP 是什么？
  - 什么是切面？
  - 生成的子类?
- 对bean的增强指什么？
- ioc 是什么？
  - inverse
- di 和 ioc 分别描述什么？
  - 依赖注入
  - 控制反转
- 上层依赖下层指什么？
  - 接口依赖实现类？
- 实现类如何被装配到指定位置？
  - 配置文件？
- 循环依赖的本质问题是什么？
  - 属性循环依赖可以解决
  - 构造器循环依赖无法解决
- bean的创建有什么过程？
- 为何属性依赖可以解决，构造器依赖无法解决？
- 什么是bean?
- 如何代理类？
- jdkProxy的作用是什么？
  - 生成代理
- 什么是代理？
- 增强操作都有哪些？
- 有接口类和没有接口类有什么区别？
- CGLIB是什么？
- 增强功能如何作用在方法上？
- jdk动态代理和字节码增强技术有什么区别？
  - 字节码增强相当于内存中创建一个新的类
- pojo 是什么？
- lombok 的作用是什么？
- autowired 和 resource 有什么区别？
  - 按类型注入
  - 按名字注入
  - 按名字是什么名字？
- around 参数为何是固定的？
  - proceeding join point
  - 用来执行实际方法
- 切点和切面分别指什么？
  - 切点用来匹配
  - 切面中指定命中后的行为
- 代理类型是什么？
- 事务控制是什么？
- agent 层对 jar 包预处理都能做什么？
- instrumentation 有什么功能？
- 全链路监控指什么？



*spring bean*

- bean factory  的作用是什么？
  - 定义bean
- applicationContext 是spring 核心容器
- bean 的生命周期如何管理？
- spring 如何做懒加载？
- beanfactoryaware 和 contextaware 传递的是哪个 spring?
- 为何会有额外的spring？
- 如何给bean 配置 init 方法？
- 关闭bean 都做什么？
- aware 相关接口的作用是什么？
- application context 的继承关系如何实现？
- application context 的层级结构有何作用？
- 类中的字段和属性有什么区别？
- spring bean 里 id 和 name 没有区别
- 前置处理和后置处理是针对所有bean么？能否单独针对某个bean?
  - 可以在处理器里做判断处理



*xml配置原理*

- spring 自定义的属性有哪些？
- schemas 的定义是什么？
  - spring 配置文件模式
- handler 如何拉起 bean？
  - 每个namespace对应一个handler
  - 在handler中解析
  - 加载成 bean 
- handler 在何处定义？
  - java 文件
- xml-bean 相互转换有哪些技术？
- @bean 的作用是什么？
- @configuration 注解的是什么内容？
- @AutoConfigure 加载的是什么内容？
- @Condition 的作用是什么？
  - 配置条件怎么写

*spring messaging*

- mq是什么？
  - 结构关系简单
- 消息是什么？
  - 传递的信息
- messaging system
- jms 是什么？
  - java message service
  - j2ee 规范
  - 接口规范
- 投递的模式是什么？
- 同步转异步是什么？
  - 不用等相应
  - 间接通信
- jdbc 是什么？
- jdbc 规范都有什么？
- esb soa 是什么？
- EIP 企业集成模式
- queue 和 topic 有什么区别？
  - queue 只能给一个消费者
  - topic 可以广播给所有订阅者
  - 生产/消费和发布/订阅模式
- ActiveMQ是什么？
- jmsTemplate作用是什么？
- activeMq 如何判定一个消息是否被消费？



*spring boot*

- 方法上加 @bean 注解如何使用？
- 方法返回值如何变成bean?
- spring 庞大为何影响开发？
- 限定性框架和非限定性框架分别指什么？
- 约定大于配置如何得出？
- 哪些方面由约定整合?
- 为何要去web容器化？
  - 完整自洽
- pom 是什么？
  - 描述项目的模型
- nexus的作用是什么？
- spring boot 默认搭配了什么？
  - 目录结构 resources 存放配置文件
  - 打包方式 jar
  - 默认配置文件
  - 配置文件选择
  - starter 自动装配
  - 内置web容器
- starter 是什么？
- 如何配置 production-ready特性？
- starter service url 配置什么？
- 选是不是web项目有哪些不同？
  - 依赖组件不同
- spring boot 的各文件夹有什么含义？



*核心原理*

- spring 框架就是一个架子
- spring boot 往框架里填第三方组件
- starter 相当于胶水
- 装配单元为何以starter为单位？
  - 每一个单元都需要一个starter
- 配置类是什么？
- @ConditionalOnBean 的条件是 bean是否存在么？
  - 是
- 自定义的autoconfiguration都需要在spring.factories里配置么？
  - 是

*starter*

- starter 以什么方式呈现？
  - 一个包
- starter 的结构是什么？
  - 类似 spring boot 项目
- starter 如何起作用？



