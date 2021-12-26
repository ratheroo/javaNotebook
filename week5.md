*spring*

**class1**

- spring 技术体系都有什么？
- spring boot 是什么？
  - 用来简化spring 体系
  - 方便开发
- orm 是什么？
- λ表达式是什么？
- spring 编程有什么路数？
- java 8 有什么特色？

*1*

- jms 是什么？
- 处理消息指什么消息？
- http server/web server/j2ee server 是如何划分的？
- ejb容器是什么？
- jndi 是什么？
- 连接池的作用是什么？
- rod johnson的什么理念使得不用ejb?
- spring framework 的功能都有什么？
- spring boot 如何简化 spring 体系？
- 响应式是什么？
- spring 为何是 java 的事实标准？
- ga 是什么意思？
  - general avalible 基本可用
- snapshot 是什么意思？
  - 日常构建的包
- rc 版本是什么？
  - 候选发布
  - candidate release
- release 是 ga 版本
- spring 5 有哪些新功能？
- 什么算是框架？
  - 特定语义是什么？
  - 框架里有哪些技术选择？
- 脚手架是什么？
  - 框架加一些通用的功能
- sas 是什么？
  - 云端部署
  - 权限管理
- java 咖啡
- bean 和 context 与 aop 有什么关系？
  - aop 对 bean 增强
  - context 是bean 的容器
- mock 是什么？
- tx是什么？
  - 事务管理
  - transaction
- webflux 是什么？
- integration模块是什么？
  - 如何融合其它技术？
- kotlin/groovy基于jvm
- 为何有 kotlin/grooby ？
- batch 的作用是什么？
- jpa 是什么？
- spring 有哪些技术选型？
- 为何 spring 会导致分层模式？
- 分层的好处是什么？
  - 拆解粒度
  - 方便任务安排



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
- starter 用来集成第三方类库或者组件
- starter 的作用是什么？
- set/get 方法与 public 有什么区别？
- 被 spring boot 掉起来的auto configuration类有什么作用？
- datasource 类型的bean是什么？
- 为何先装配shardingSphereDataSource可以避免冲突？
- 先装配如何避免冲突？
- 环境配置是什么？
- 自动配置究竟配置什么？



*jdbc*

- jdbc 是什么？
  - Java 访问数据库的接口定义
- 数据库的驱动包何时安装？
- statement 是什么？
  - 逻辑的连结
- connection 物理的连接
- resultset 相当于表结构
- 创建多个数据库连结成本高
- 事务包括哪些操作？
- 数据库的重连如何通过连接池实现？
- commonpool 都有哪些应用？
- oracle 是否有慢日志？
- Hikari 的作用是什么？
- 一个spring中只能由一个datasource bean 么？
- spring profiles 机制是什么？
  - 指定多个环境
  - 通过active profiles 指定用哪个环境
  - 每个环境对应一个配置文件
- orm 是什么？
  - object relational mapping
  - 对象和关系的映射
- 关系运算是什么？
- 对象和sql之间哪里不匹配？
- hql是什么？
  - from 后面是什么？
- Criteria 如何使用？
- hibernate 实体类与表可以一对多的关系
- 数据库方言是什么？
  - 非通用的 SQL？
- mapper 接口的方法是什么？
  - mapper 中的方法
  - 可以直接在 mapper 上用注解写 SQL
- mybatis 的注解写在何处？
  - mapper/dao 中的方法上



*jpa*

- jpa java persistence api
  - 操作实体对象
- entityManager 管理实体
- jpa 是一系列接口
- jdbc直接面向数据库
- jpa面向实体对象
- jdbc有哪些方法？
- jdbc 操作 datasource
  - datasource 是什么？
- jpa 和 orm 的关系是什么？
  - orm 是什么？
  - orm 进行 sql 与 实体的映射
  - jpa 操作实体
  - jpa 通过 orm 操作数据库
- spring 操作非关系数据库的建模原理是什么？
  - 类似 jpa
- template 操作方式是什么？
- 事务是什么？
  - 多个操作看成一个整体
- 每条sql是一个事务
- 哪里可以声明事务？
- 可以在哪里添加事务aop？
- 吞异常会导致事务完整性被破坏
- 事务的传播指什么？
  -  是否将内层事务纳入到外层大事务
- 事务的隔离级别是什么？
- 事务的锁加在什么地方？
- 回滚策略都有什么？
  - 抛出指定异常
- 分库分表是什么？
- 事务管理器里为何要塞数据源？
- 代理类是什么？
- sessionFactory 和 transactionManager 是什么类？
- mybatis 扫描配置的作用是什么？
  - 加载 dao 类
  - dao 根据 mapper 配置执行 sql
  - 结果再根据 mapper 配置的映射返回实体
- mapper 文件在什么位置？
  - resources 文件夹里
- spring 文件里需要配置扫描类的作用是什么？
  - 拉起这个类
- spring 配置文件配置事务管理器和sqlsession 的作用是什么？
  - sqlSessionFactory 根据 mapper 配置文件生成 sql？
- spring boot 为何需要配实体类的路径？
  - 扫描实体类？
- @Entity 作用是什么？
- hibernate 适配器如何自动生成类？
- hibernate都有哪些配置？
- 自己 new 的对象不走 spring 框架
- routing 数据源是什么？
- 如何包装多个数据源？
- 重连、超时配置最好加
- 级联查询是什么？
  - 多级关联的数据都查询出来
- prepareStatement 是什么？
- Hikari 连接池有哪些配置？













