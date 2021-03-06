工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一
个类。工厂方法使一个类的实例化延迟到其子类。

![工厂方法](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c08/factorymethod.png?raw=true)

简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客
户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体
产品的依赖。但问题也出现在这里，我们不但对扩展开放了，对修改也
开放了。

工厂方法模式在增加新的产品类时，只需要增加相应的工厂类就可以了。

工厂方法模式实现时，客户端需要决定实例化哪一个工厂类实现运算类，
选择判断的问题还是存在的，也就是说，工厂方法把简单的工厂的内部
逻辑判断移到了客户端代码来进行。你想要加功能，本来是改工厂类的，
而现在是修改客户端。

简单工厂和工厂方法都是集中封装了对象的创建，使得要更换对象时，
不需要做大的改动就可实现，降低了客户端程序与产品对象的耦合。
工厂方法模式是简单工厂模式的进一步抽象和推广。由于使用了多态性，
工厂方法模式保持了简单工厂模式的优点，而且克服了它的缺点。但
缺点是由于增加每增加一个类，就需要加一个产品工厂的类，增加了
额外的开发量。