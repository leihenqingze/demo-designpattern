本章通过手机和手机软件的例子展示了桥接模式的演变过程，其演变过程如下图所示：

![按品牌分类](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c22/Handset1.png?raw=true)

![按软件分类](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c22/Handset2.png?raw=true)

![桥接方式](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c22/Handset3.png?raw=true)

很多情况用继承会带来麻烦，比如：对象的继承关系是在编译时就定义好了，
所以无法在运行时改变从父类继承的实现。子类的实现与它的父类有非常紧密
的依赖关系，以至于父类实现中的任何变化必然会导致子类发生变化。
当你需要复用子类时，如果继承下来的实现不适合解决新的问题，则父类必须
重写或被其他更适合的类替换。这种依赖关系限制了灵活性并最终限制了复用性。

合成/聚合复用原则：尽量使用合成/聚合，尽量不要使用类继承。

合成/聚合复用原则的好处是：优先使用对象的合成/聚合将有助于保持每个类
被封装，并被集中在单个任务上。这样类和类继承层次会保持较小规模，并且
不太可能增长为不可控制的庞然大物。

要学会用对象的职责，而不是结构来考虑问题。

继承是一种强耦合的结构。父类变，子类就必须要变。
所以我们在用继承时，一定要在是'is-a'的关系时再考虑使用，
而不是任何时候都去使用。

桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立地变化。

什么叫抽象与它的实现分离，这并不是说，让抽象类与其派生类分离，
因为这没有任何意义。实现指的是抽象部分和它的实现部分相分离，
可以独立的变化。如例子中，就是让'手机'既可以按照品牌来分类，
也可以按照功能来分类。

由于实现的方式有多种，桥接模式的核心意图就是把这些实现独立出来，
让它们各自地变化。这就使得每种实现的变化不会影响其他实现，从而
达到应对变化的目的。

实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度
分离出来让它们独立变化，减少它们之间的耦合。

在发现需要多角度去分类实现对象，而只用继承会造成大量的类增加，
不能满足开闭原则时，就应该考虑用桥接模式了。

![桥接模式](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c22/bridgepattern.png?raw=true)

> 只要正正深入地理解了设计原则，很多设计模式其实就是原则的应用而已，
或许在不知不觉中就在使用设计模式了。

> 有了深厚的功底，学习那些具体的新技术又有何难！