### 13.1 炒面没放盐
依赖倒转原则，抽象不应该依赖细节，细节应该依赖子抽象，由于我们要吃的
菜都依赖于厨师这样的细节，所以我们就很被动。

老麦老肯他们的产品，味道是由他们的工作流程决定的，由于他们制定了非常
规范的工作流程，原料放多少，加热几分钟。都有严格规定，估计放多少盐都
是用克来计量的。而这个工作流程是在所有的门店都必须要遵照执行的，所以
我们吃到的东西不管在哪在什么时候味道都一样。这里我们要吃的食物都依赖
工作流程。不过工作流程好像还是细节呀。

工作流程也是细节，我们去快餐店消费，我们用不用关心他们的工作流程？当
然是不用，我们更关心的是是否好吃。你想如果老肯发现鸡翅烤得有些焦，他
们会调整具体的工作流程中的烧烤时间，如果新加一种汉堡，做法都相同，只
是配料不相同，工作流程是不变的，只是加了一种具体产品而已，这里工作流
程怎么样?

这里工作流程可以是一种抽象的流程，具体放什么配料、烤多长时间等细节依
赖于这个抽象。

### 13.2建造小人一 
“是啊，画人的时候，头身手脚是必不可少的，不管什么人物，开发时是不能
少的。”

“你现在的代码全写在窗体里面，我要是需要在别的地方用这些画小人的程序
怎么办？”

### 13.3建造小人二

“嘿，你的意思是分离，这不难办，我建两个类，一个瘦人的类，一个是胖人
的类，不管是谁都可以调用它了。”

“你这样写确实达到了可以复用这两个画小人程序的目的。但炒面忘记放盐的
问题依然没有解决啊。比如我现在需要你加一个高个小人，你会不会因为编程
不注意，又让他缺胳膊少腿呢？”

“啊啊，最好的办法是**规定**，凡是建造小人，都必须要有头和身体，以及
两手两脚”

### 13.4建造者模式
“你仔细分析就会发现，这里建造小人的**过程是稳定**的，都需要头身手脚，
而具体**建造的细节**是不同的，有胖有瘦有高有低，但对于用户而言，我才
不需要管这些，我只想告诉你，我需要一个胖小人来游戏，于是你就建造了一
个给我就行了。如果你需要**将一个复杂对象的构建与它的表示分离，使得同
样的构建过程可以创建不同的表示的意图时**，我们需要应用一个设计模式，
建造者模式（Builder），又叫生成器模式。建造者模式可以将一个产品的内部
表象与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同内部
表象的产品对象。如果我们用了建造者模式，那么用户就只需要指定需要建造
的类型就可以得到它们，而具体建造的过程和细节就不需要知道了。”

建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可
以创建不同的表示。

![建造者模式](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c13/builder.png?raw=true)

如果某些细节是每个具体的产品都需要构建的，那就应该要加进去，反之，
就没必要。其实建造者模式是逐步建造产品的，所以建造者的Builder类里
的那些建造方法必须要足够普通，以便为各种类型的具体建造者构造。

建造者模式是对建造产品过程的抽象，这里建造的过程是稳定的(产品的每个
部分都是必须的)，而具体建造的细节是不同的。

胖人或高个子其实都是用类似的代码去实现这个类就可以了，在客户端调用时，
还是需要知道头身手脚这些方法，所以还缺少建造者模式中一个很重要的类，
指挥者（Director），用它来控制建造过程，也用它来隔离用户与建造过程
的关联。

PersonDirector类的目的就是根据用户的选择一步一步地建造小人了，而建造
的过程是在指挥者里已经提前制定好了的，用户就不需要知道了，而且，由于
这个过程每一步都是一定要做的，那就不会让少画了一只手，少画了一条腿的
问题出现了。  ·

### 13.5 建造者模式解析
主要用于创建一些复杂对象，这些对象内部构建间的建造顺序通常是稳定的，
但对象内部的构建通常面临着复杂的变化。

建造者模式的好处就是使得建造代码与表示代码分离，由于建造者隐藏了该产
品是如何组装的，所以若需要改变一个产品的内部表示，只需要再定义一个具
体的建造者就可以了。

建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它们
的装配方式时适用的模式。