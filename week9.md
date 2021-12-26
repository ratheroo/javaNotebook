*spi*

- api 和 spi 的区别是什么？
  - api 调用框架 api
  - spi 需要在业务代码实现框架 api
- 框架如何访问业务包中的实现类？
  - serviceloader
  - meta-inf / 接口全限定名文件
  - 文件内容为业务侧实现类的类名
  - load接口时，jvm扫描所有jar包，扫描metainfo下接口名的文件
  - 如果有，每一行当作接口实现new出来
  - 找到的实现作为自定义实现
- serviceloader 机制是什么？
- Callback 和 listener 机制是什么？
  - 集合中放入实现类
  - 调用实现时调用集合中的实现
- eventBus机制是什么？
  - 通过eventbus发消息
  - 子项目订阅消息
  - 调用方发送消息，event调用子项目具体实现方法
- dubbo的扩展机制是什么？
  - xxx=com.xxx.xxx
- dubbo作为一个容器
- 找到所有spi接口，捞出实现，装配，缓存到extensionloader
- dubbo服务如何暴露？
  - serviceconfig配置服务描述
  - 创建代理
  - 封装invoker
  - 挂在exporter
- 封装的invoker的作用是什么？
- exporter的实现方式是什么？
- 服务如何引用？
  - servicereference
  - referenceconfig配置远程服务引用
  - 指定protocol
  - 引用invoker，通过代理转成远程调用
- 集群和路由
  - directory 获取所有可用服务列表 List<invoker>
  - router 选取此次此次调用可以提供服务的invoker集合
  - loadbalance从上面集合选取最终调用者
- 泛化引用是什么？
  - 利用字符串作为方法名调用远程方法
  - GenericService
  - 隐式
- 隐式传参
  - 调用时传递额外附加数据
  - rpccontext.getContext().setAttachment()
  - 如何实现？
    - http header(key-value)
    - tcp 二进制序列化，原先序列化报文增加dubble头
- mock
  - mock=true
  - 本地查找mock实现类
- 注册中心的部署位置在哪里？



*dubbo的应用场景*

- 垂直拆分改造是什么？
- 数据改造有哪些？
- 服务设计有哪些原则？
- 走向微服务的道路
- msa架构包括什么？
- 开放模式是什么？
  - 其它系统直接调用api
- 容器模式/商场模式是什么？
  - spi
  - 提供格子
  - 由用户提供实现
  - 容器将组件拉起来
- esb是什么？
- soa是什么？
  - 面向服务的架构
  - 每个系统服务包装成webservice
  - 注册到esb总线（企业服务总线）
- 作为BFF前端使用的后端
- 为何不建议做BFF？
  - 变化多需要经常调整
- 什么是业务中台？
  - 稳定的业务能力
  - 承上启下



*dubbo最佳实践*

- 开发分包是什么？
  - 子项目
- 如何设计分包？
  - 服务接口、模型、异常放在api包（服务提供者消费者都用）
  - api包打到企业私服
  - 对相近业务做抽象，防止接口爆炸
- 环境隔离和分组的作用是什么？
- 分布式事务问题是什么?
- 多注册中心制是什么？
- group机制是什么？
  - 逻辑隔离
  - 注册时候指定分组
  - tag
- 版本机制是什么？
  - 调用时候指定版本
- 线程池大小影响系统哪些方面？
- 参数配置
  - consumer > provider
  - 尽量在provider端配置
- 容器化部署是什么？
  - 注册ip为容器ip
    - docker使用宿主机网络
    - docker参数指定注册的ip和端口
    - dubbo的docker镜像
  - docker 是什么？
  - docker -e 参数是什么？
  - dubbo 如何配置 端口映射？
- 运维与监控有什么功能？
  - tracing  apm（skywalking）
  - metrics promethus+grafana
  - logging elk 
- 如何做去重？
- 分布式事务
  - dubbo如何支持分布式事务
  - 不支持xa
- 幂等是什么？
  - dubbo服务调用失败默认重试2次
- 如何设计幂等接口？
  - 去重，订单ID roaring bitmap
  - 乐观锁，订单标识作为判断条件



- 如何阅读dubbo源码？
  - 整体目录
  - 重点模块
    - 核心概念层
    - common/config/filter
    - rpc/remoting/serialization
    - 集群与分布
    - cluster
    - registry/configcenter/metadata
  - 怎么看代码？
    - 类似看书
    - 代码静态，实际动态，run demo
      - 做笔记
    - 组成小组，多探讨
      - 交流节省时间
      - 分析总结的能力重要么？
  - 尝试实现一个新的rpc的作用是什么？
    - 真正理解
    - 一手知识