### 1.4 面向对象编程

所有编程初学者都会有这样的问题，就是碰到问题就直觉地用计算机能够理解
的逻辑来描述和表达待解决的问题及具体的求解过程。这其实是用计算机的方
式去思考。这本身没有错，但这样的思维却使得我们的程序只为满足实现当前
的需求，程序不容易维护，不容易扩展，更不容易复用，从而达不到高质量的
代码的要求。

### 1.5 活字印刷，面向对象
1. 要改，只需要改要改之字，此为 可维护
2. 每个字可以在后来的印刷中重复使用，此乃可复用
3. 内容如要加字，只需另刻字加入即可，这是可扩展
4. 字的排列可以是横排也可是竖排，只需移动活字就可满足排列需求，此是灵活性好

### 1.6 面向对象的好处

通过封装、继承、多态把程序的耦合度降低。传统印刷术的问题就在于所有的
字都在一个刻板上，耦合度太高。使用设计模式可以使程序更加的灵活，容易
修改，并且易于复用。

> 其实客观地说，客户的要求也并不过分，不就是改几个字吗，但面对已完成
的程序代码，却是需要几乎重头来过的尴尬，这实在是痛苦不堪。说白了，原
因就是因为我们原先所写的程序，不容易维护，灵活性差，不容易扩展，更谈
不上复用，因此面对需求变化，加班加点，对程序动大手术的那种无奈也就成
了非常正常的事了。

### 1.7 复制 VS 复用

复制粘贴是一种很不好的编程习惯，因为当你的代码冲重复的代码多到一定程
度，维护的时候，可能就是一场灾难，越大的系统，这种方式带来的问题越严
重，编程有一原则，就是用尽可能的办法去避免重复。

> 也就是说当程序中出现重复代码时就需要注意了。代码的重复很好察觉，而
逻辑上或设计上的重复则不太容易察觉。

### 1.8 业务的封装

在本书中，将计算的业务逻辑与界面逻辑分开，让它们的耦合度下降，只有分离
开，才可以达到容易维护或扩展、复用。

> 这里使用了面向对象的封装，设计原则中的职责分离。

### 1.9 紧耦合 VS 松耦合

如果将所有的运算逻辑放在同一个类中，如果修改或增加新的运算逻辑，却需
要让所有的运算都来参与编译很容易修改错误。如果将不同运算逻辑分离，修
改或增加其中一个不影响另外的几个。

> 在本书的示例中，要增加一个平方根运算，却需要让加减乘除的运算都的来
参与编译，如果不小心，把其他运算修改错了，这岂不是大大的糟糕。
本来是加一个功能，却使得原有的运行良好的功能代码产生了变化，这个风险
太大了。所以将加减乘除等运算分离，修改其中一个不影响另外的几个，增加
运算算法也不影响其他代码。

### 1.10 简单工厂模式

到底要实例化谁，将来会不会增加实例化的对象，这是很容易变化的地方，
应该考虑用一个单独的类来做这个初始化实例的过程，这就是工厂。

简单工厂：通过增加不同的实现类扩展现有的程序，不需要对现有的实现进行
修改。在一定程度上实现了开闭原则。

简单工厂属于创建型模式，封装了对象的创建过程。

![简单工厂](https://github.com/leihenqingze/fodder/blob/8f3bb3bde898cabf12211d92867f4e25c4e50f0c/demo-designpattern/bigtalk-designpattern/c01/singlefactory.jpg?raw=true)

### 1.11 UML 类图
当一个类'知道'另一个类时，可以用关联。

聚合表示一种弱的'拥有'关系，体现的是A对象可以包含B对象，但B对象不是
A对象的一部分。

组合是一种强的'拥有'关系，体现了严格的部分和整体的关系，部分和整体的
生命周期一样。

### 总结
编程时，除了完成功能的实现，还需要注意编码规范、消除重复代码、进行异常
处理、关注程序性能、打印日志、系统运维、容灾、备份、可用性、安全性、
数据一致性、可扩展、可维护、可复用等。

不能只满足于写完代码运行结果正确就完事，时常考虑如何让代码更加简练，
更加容易维护，容易扩展和复用，只有这样才可以真正得到提高，写出优雅的
代码真的是一种很爽的事情。