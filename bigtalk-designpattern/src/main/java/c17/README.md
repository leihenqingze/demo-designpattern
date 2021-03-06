适配器模式：将一个类的接口转换成客户希望的另外一个接口。Adapter模式
使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

![适配器模式](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c17/adapter.png?raw=true)

在软件开发中，也就是系统的数据和行为都正确，但接口不符合时，我们应该
考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。适配
器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致
的情况，比如在需要对早期代码复用一些功能等应用上很有实际价值。

在想使用一个已经存在的类，但如果它的接口，也就是它的方法和你的要求不
相同时，就应该考虑用适配器模式。两个类所做的事情相同或相似，但是具有
不同的接口时要使用它。而且由于类都共享同一个接口，使得客户代码可以统
一调用同一接口就行了，这样应该可以更简单、更直接、更紧凑。

其实用适配器模式也是无奈之举，很有点亡羊补牢的感觉，没办法啊，是软件
就有维护的一天，维护就有可能会因不同的开发人员、不同的产品、不同的厂
家而造成功能类似而接口不同的情况，此时就是适配器模式大展拳脚的时候了。

通常是在软件开发后期或维护期再考虑使用它。

如果是在设计阶段，你有必要把类似的功能类的接口设计的不同吗？

在公司内部，类和方法的命名应该有规范，最好前期就设计好，然后如果真的
如你所说，接口不相同时，首先不应该考虑用适配器，而是应该考虑通过重构
统一接口。

就是要在双方都不太容易修改的时候再使用适配器模式适配，而不是一有不同
时就使用它。

比如公司设计一系统时考虑使用第三方开发组件，而这个组件的接口与我们自
己的系统接口是不相同的，而我们也完全没有必要为了迎合它而改动自己的接
口，此时尽管是在开发的设计阶段，也是可以考虑用适配器模式来解决接口不
同的问题。

如果能事先预防接口不同的问题，不匹配问题就不会发生；在有小的接口不统
一问题发生时，及时重构，问题不至于扩大；只有碰到无法改变原有设计和代
码的情况时，才考虑适配。事后控制不如事中控制，事中控制不如事前控制。

适配器模式当然是好模式，但如果无视它的应用场合而盲目使用，其实就是本
末倒置了。

比如在.NET中有一个类库已经实现的、非常重要的适配器，那就是DataAdaptero 
DataAdapter用作DataSet和数据源之间的适配器以便检索和保存数据。
DataAdapter通过映射Fill(这更改了DataSet中的数据以便与数据源中的数据相匹
配)和Update(这更改了数据源中的数据以便与DataSet中的数据相匹配)来提供这
一适配器[MSDN]。由于数据源可能是来自SQL Server，可能来自Oracle，也可能
来自Access、DB2，这些数据在组织上可能有不同之处，但我们希望得到统一的
DataSet(实质是XML数据)，此时用DataAdagter就是非常好的手段，我们不必关
注不同数据库的数据细节，就可以灵活的使用数据。