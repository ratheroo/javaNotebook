*分布式服务*

- 分布式服务治理是什么？
- 服务的过滤与流控都有什么？



*rpc到微服务*

- 如何管理服务的集群？
  - 如何分组
  - 如何维护不同版本线上运行？
- 如何注册与发现服务？
- 负载均衡和路由如何设计？
- 熔断和限流如何设计？
- 心跳重试策略如何设计？
- 高可用如何实现？
- 监控与性能如何设计？
- rpc 与分布式服务化有何区别？
  - 技术角度
  - 业务角度，偏向业务系统集成
- 如何设计分布式场景下的业务服务？
- 服务为何不等于接口？
  - 服务是业务领域
- 分布式服务与soa/esb有什么区别？
  - 分布式服务中没有类似esb的中心节点
  - esb性能为服务天花板
- 直连调用，侧边增强什么意思？
  - 所有调用都是直连
  - 通过侧边做配置注册中心功能
  - 与侧边打交道为异步的方式
- 什么是有状态的？

- 配置中心的作用是什么？
  - 状态是什么？
    - 需要持久化的东西
  - 没有状态的东西包括什么？
    - 路由/负载均衡等
- 没有状态的东西为何可以放在业务侧？
- zoom keeper 是什么？
- 配置/注册/元数据中心的作用是什么？
  - 配置中心
    - 系统配置参数
    - 给大规模集群统一下发，做统一控制
  - 配置中心
    - 管理服务注册
    - 运行时生成的中间信息
    - 可丢
  - 元数据信息
    - 业务相关的参数
    - 确定业务模型
- 为何需要配置中心？
  - 大量配置信息需要统一管理
  - 配置信息变更
  - 不断重启
- 配置中心如何持久化？
- 有哪些配置中心？
  - zookeeper、etcd、nacos、applos
- 为什么需要注册中心？
  - 管理机器节点
  - 让服务调用者感知节点变化
- curl作用是什么？
- 负载均衡如何探测节点服务？
- DNS是什么？
- VIP机制是什么？
- HTTP场景是什么？
- 为什么需要元数据中心？
  - 定义业务模型
  - 类似 swagger
- 如何设计实现中心？
  - 存取数据能力
  - 临时数据是什么？
  - 变化通知机制？
  - 主流基座有什么？
    - zk
    - namespace 机制如何实现？
  - 如何建立适配层？