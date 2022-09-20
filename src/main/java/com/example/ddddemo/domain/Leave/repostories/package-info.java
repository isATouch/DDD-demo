package com.example.ddddemo.domain.Leave.repostories;

/**
 *
 * Repository（仓储）：它存放所在聚合的查询或持久化领域对象的代码，为了方便聚合的拆分和组合，我们设定了一个原则：一个聚合对应一个仓储。
 *
 * 根据依赖倒置原理，依赖接口，而非实现。 依赖抽象，而非细节。
 * 所以可以在这里存放接口。 实现放在基础层
 * 类似的基础层提供的其他能力也应该用这种方式完成于其他层的结偶
 */