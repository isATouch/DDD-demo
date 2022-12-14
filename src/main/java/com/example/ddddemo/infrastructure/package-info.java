package com.example.ddddemo.infrastructure;

/**
 *
 * Infrastructure（基础层）：
 * 它主要存放基础资源服务相关的代码，为其它各层提供的通用技术能力、三方软件包、数据库服务、配置和基础资源服务的代码都会放在这一层目录里。
 *
 *  基础层是{@贯穿所有层}的，它的作用就是为其它各层提供通用的技术和基础服务，包括第三方工具、驱动、消息中间件、网关、文件、缓存以及数据库等。
 *
 *  比较常见的功能还是提供数据库持久化。基础层包含基础服务，它采用{@依赖倒置 即它实现了别人定的接口}设计，封装基础资源服务，
 *  实现应用层、领域层与基础层的解耦，降低外部资源变化对应用的影响。
 *
 *  比如说，在传统架构设计中，由于上层应用对数据库的强耦合，
 *  很多公司在架构演进中最担忧的可能就是换数据库了，因为一旦更换数据库，就可能需要重写大部分的代码，这对应用来说是致命的。
 *  那采用依赖倒置的设计以后，应用层就可以通过解耦来保持独立的核心业务逻辑。
 *  当数据库变更时，我们只需要更换数据库基础服务就可以了，这样就将资源变更对应用的影响降到了最低。
 *
 *
 *  思考：
 *  不是所有的依赖都一定要倒置， 如果非常具象不可替代的逻辑。 一般不会发生整体替换。
 */