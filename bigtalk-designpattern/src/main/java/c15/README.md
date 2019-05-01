抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定
它们具体的类。

![抽象工厂模式](https://github.com/leihenqingze/fodder/blob/52b50517587d8a9d1bbf0962e160276621c9ea4f/demo-designpattern/bigtalk-designpattern/c15/abstractfactory.png?raw=true)

“AbstractProductA和AbstractProductB是两个抽象产品，之所以为抽象，是
因为它们都有可能有两种不同的实现，就刚才的例子来说就是User和Department，
而ProductA1、ProductA2和ProductB1、ProductB2就是对两个抽象产品的具体分
类的实现，比如ProductA1可以理解为是SqlServerUser，而ProductB1是AccessUser。”

“这么说，IFactory是一个抽象工厂接口，它里面应该包含所有的产品创建的
抽象方法。而ConcreteFactory1和ConcreteFacotry2就是具体的工厂了。就像
SqlServerFactory和AccessFactory一样。”

“通常是在运行时刻再创建**一个**ConcreteFactory类的实例，这个具体的
工厂再创建具有特定实现的产品对象，也就是说，为创建不同的产品对象，
客户端应该使用不同的具体工厂。”

好处在于易于交换产品系列，由于具体工厂类，在一个应用中只需要在初始化
的时候出现一次，这就使得改变一个应用的具体工厂变得非常容易，它只需要
改变具体工厂即可使用不同的产品配置。我们的设计不能去防止需求的更改，
那么我们的理想便是让改动变得最小，现在如果你要更改数据库访问，我们只
需要更改具体的工厂就可以做到了。第二大好处在于，它让具体的创建实例过
程与客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名也
被具体工厂的实现分离，不会出现在客户端代码中。

如果需求来自增加功能，需要增加很多类，以及修改相关的工厂类。

客户端程序类显然不会只有一个，而这样的设计，其实在每一个类的开始都需
要声明IFactory factory = new SqlServerFactory()，如果我有100个调用数
据库访问的类，就要更改100次IFactory factory = new AccessFactory()
这样的代码才行？这不能解决要更改数据库访问时，改动一处就完全更改的
要求！

编程是门艺术，大批量地改动，显然是非常丑陋地做法。

### 用反射 + 抽象工厂的数据访问程序
到底是创建那个类的对象是由类的字符串变量名称来决定的。所以就去除了
switch或if判断带来的麻烦。

### 用反射 + 配置文件实现数据访问程序
将类的字符串变量名称放置在配置文件中，就可以不用修改程序了。

所有在用简单工厂的地方，都可以考虑用反射技术消除if或switch，解除分
支判断带来的耦合。

switch或if是程序里面的好东西，但在应对变化上，却显得老态龙钟。反射
技术的确可以很好地解决它们难以应对的变化，难以维护和扩展的诟病。