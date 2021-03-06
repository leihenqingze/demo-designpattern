### OO 原则

为了交互对象之间的松耦合设计而努力。

当两个对象之间松耦合，它们依然可以交互，但是不太清楚彼此的细节。

松耦合的设计之所以能让我们建立有弹性的OO系统，能够应对变化，是因为对
象之间的相互依赖降到了最低。

### OO 模式
观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，
它的所有依赖者都会收到通知并自动更新。

利用观察者模式，主题是具有状态的对象，并且可以控制这些状态。也就是说，
有"一个"具有状态的主题。另一方面，观察者使用这些状态，虽然这些状态并
不属于他们。有许多的观察者，依赖主题来告诉他们状态合适改变了。这就产
生一个关系："一个"主题对"多个"观察者的关系。

因为主题是真正拥有数据的人，观察者是主题的依赖者，在数据变化时更新，
这样比起让许多对象控制同一份数据来，可以得到更干净的OO设计。

观察者模式提供了一种对象设计，让主题和观察者之间松耦合。

关于观察者的一切，主题只知道观察者实现了某个接口。主题不需要知道观察
者的具体类是谁，做了些什么或其他任何细节。

任何时候我们都可以增加新的观察者。因为主题唯一依赖的东西是一个实现
接口的对象列表，所以我们可以随时增加观察者。事实上，在运行时我们可
以用新的观察者取代现有的观察者，主题不会受到任何影响。同样的，也可
以在任何时候删除某些观察者。

有新类型的观察者出现时，主题的代码不需要修改。假如我们有个新的具体
类需要当观察者，我们不需要为了兼容新类型而修改主题的代码，所有要做
的就是在新的类里实现此观察者接口，然后注册为观察者即可。主题不在乎
别的，它只会发送通知给所有实现了观察者接口的对象。

我们可以独立地复用主题或观察者。如果我们在其他地方需要使用主题或观
察者，可以轻易地复用，因为二者并非紧耦合。

改变主题或观察者其中一方，并不会影响另一方。因为两者是松耦合的，所
以只要他们之间的接口仍被遵守，我们就可以自由地改变他们。

### Java内置的观察者模式

因为Observable是一个"类"，你必须设计一个类继承它。如果某些想同时具有
另一个超类的行为，就会陷入两难，这限制了Observable的复用潜力(而增加
复用潜力不正是我们使用模式最原始的动力吗?)

因为没有Observable接口，所以你无法建立自己的实现，和Java内置的Observer
API 搭配使用，也无法将java.util的实现转换成另一套做法的实现(比如说，
Observable将关键的方法保护起来)。这意味着：除非你继承自Observable，
法则你无法创建Observable实例并组合到你自己的对象中来。这个设计违反
了"多用组合，少用继承"的原则。

如果你能扩展Observable，那么Observable"可能"可以符合你的需求。否则，
你可能需要自己实现一整套观察者模式。

在观察者模式中，会改变的是主题的状态，以及观察者的数目和类型。用这个
模式，你可以改变依赖于主题状态的对象，却不必改变主题。这就叫提前规则。

主题与观察者都使用接口，观察者利用主题的接口向主题注册，而主题利用观
察者接口通知观察者。这样可以让两者之间运作正常，又同时具有松耦合的优
点。

观察者模式利用"组合"将许多观察者组合进主题中，对象之间的这种关系不是
通过继承产生的，而是在运行时利用组合的方式而产生的。

### 要点
* 观察者模式定义了对象之间的一对多的关系
* 主题用一个共同的接口来更新观察者
* 观察者和可观察者之间用松耦合方式结合，可观察者不知道观察者的细节，
只知道观察者实现了观察者接口
* 使用此模式时，你可从被观察者出推或拉数据
> 这两种模式各有优缺点：使用"拉"的方式，可能要调用很多次才能收集齐
想要的数据，这样很不方便。但是观察者中类这么多，主题对象不可能实现
知道每个观察者的需求，使用"拉"的方式可能更好一些。如果某些观察者只
需要一点点数据，就不会被迫收到一堆数据。这么做同事也可以在以后比较
容易修改。比如说，哪一天主题决定扩展功能，新增更多的状态，就不用修
改和更新对每位观察者的调用，只需改变自己来允许更多的getter()来取得
新增的状态。

* 有多个观察者时，不可以依赖特定的通知次序
> 如果我们的代码依赖通知次序，一旦观察者/可观察者的实现有所改变，通
知次序就会改变，很可能就会产生错误的结果。这绝对不是我们所认为的松
耦合。
* 如果有必要的话，可以实现自己的Observable