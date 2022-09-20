package com.example.ddddemo.application;

/**
 * Application（应用层）：
 * 它主要存放应用层服务组合和编排相关的代码。
 * 应用服务向下基于微服务内的领域服务或外部微服务的应用服务完成服务的编排和组合，向上为用户接口层提供各种应用数据展现支持服务。
 * 应用服务和事件等代码会放在这一层目录里
 *
 *
 * 应用层是很薄的一层，理论上不应该有业务规则或逻辑，主要面向用例和流程相关的操作。
 *
 * 但应用层又位于领域层之上，因为领域层包含多个聚合，所以它可以协调多个聚合的服务和领域对象完成服务编排和组合，协作完成业务操作。
 *
 * {@mark 提供api, 调用其他应用层的api}
 * 此外，应用层也是微服务之间交互的通道，它可以调用其它微服务的应用服务，完成微服务之间的服务组合和编排。
 *
 * 这里我要提醒你一下：在设计和开发时，不要将本该放在领域层的业务逻辑放到应用层中实现。
 * 因为庞大的应用层会使领域模型失焦，时间一长你的微服务就会演化为传统的三层架构，业务逻辑会变得混乱。
 *
 * 另外，应用服务是在应用层的，它负责服务的组合、编排和转发，负责处理业务用例的执行顺序以及结果的拼装，
 * 以粗粒度的服务通过 API 网关向前端发布。
 *
 * 还有，应用服务还可以进行安全认证、权限校验、事务控制、发送或订阅领域事件等。
 */

/**
 * 为了避免对domain 内部的 实体的依赖，
 * 是否应该 有一层，将对领域内的实体，转化为自己的实体。
 *
 * 思考1 这样可以彻底隔离 domain 对 上层造成的依赖。 当domain抽离成独立的服务时，改动更少。
 * 思考2 实体是有具体的含义的 非抽象的， 强行分成不同层的实体对象，只为了跨层隔离，是否过分设计。
 *
 * 结论 实体的隔离 在事情发生时 需要做才做，更为合理。毕竟边界和耦合度已经在非常可控的范围内了。
 *
 */