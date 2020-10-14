## 行为型

### 模板方法模式

多态的应用  
模版方法模式定义了一个操作中的算法骨架，将某些步骤延迟到子类中实现

何时使用：实现一个算法时，整体步骤很固定，但是某些部分易变

应用：  
- Junit单元测试
- servlet中关于doGet()/doPost()方法的调用

### 策略模式

策略模式对应于解决某一个问题的算法族，允许用户从该算法族中任选一个算法解决某一问题，同时可以方便地更换算法或者新增算法。并且可以由客户端决定调用哪个方法

本质：分离算法，选择实现

应用：
- JavaSE的GUI编程中，布局管理
- Spring框架中，Resource接口，资源访问策略
- javax.servlet.http.HttpServlet#service()


```
设计原则

开闭原则（Open Closed Principle，OCP）
依赖倒转原则（Dependency Inversion Principle，DIP）
迪米特法则（Law of Demeter，LoD）
```