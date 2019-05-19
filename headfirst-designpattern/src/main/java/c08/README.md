### OO 原则
好莱坞原则：别调用我们，我们会调用你。

它可以给我们一种防止"依赖腐败"的方法。当高层组件依赖底层组件，而底
层组件又依赖高层组件，而高层组件又依赖边侧组件，而边侧组件又依赖底
层组件时，依赖腐败就发生了。在这种情况下，没有人可以轻易地搞懂系统
是如何设计的。

在此原则下，我们允许底层组件将自己挂钩到系统上，但是高层组件会决定
什么时候和怎样使用这些底层组件。

依赖倒置原则教我们尽量避免使用具体类，而多使用抽象。而好莱坞原则是
用在创建框架或组件上的一种技巧，好让底层组件能够被挂钩进计算中，而
且又不会让高层组件依赖底层组件。两者的目标都是在于解耦，但是依赖倒
置原则更加注重如何在设计中避免依赖。好莱坞原则教我们一个技巧，创建
一个有弹性的设计，允许底层结构能够互相操作，而又防止其他类太过依赖
它们。事实行，底层组件在结束时，常常会调用从超类中继承来的方法。我
们所要的是，避免让高层和底层组件之间有明显的环状依赖。

### OO 模式
模板方法模式：在一个**方法**中定义了一个算法的骨架，而将一些步骤延迟
到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法
中的某些步骤。

模板就是一个方法，这个方法将算法定义成一组步骤，其中的任何步骤都可
以是抽象的，由子类负责实现。这可以确保算法的结构(框架)保持不变，同
时由子类提供部分实现。它拥有算法，而且保护这个算法。由于算法只存在
于一个地方，所以很容易修改。超类专注在算法本身，而由子类提供完整的
实现。

当你的子类"必须"提供算法中某个方法或步骤的实现时，就使用抽象方法。
如果算法的这个部分是可选的，就用钩子。如果是钩子的话，子类可以选
择实现这个钩子但并不强制这么做。

钩子有几种用法。钩子可以让子类实现算法中可选的部分，或者在钩子对于
子类的实现并不重要的时候，子类可以对此钩子置之不理，钩子的另一个用
法，是让子类能够有机会对模板方法中某些即将发生的步骤作出反应。钩子
也可以让子类有能力为其抽象类做一些决定。

在设计时尽量减少抽象方法的数目，否则，在子类中实现这些方法将会很麻
烦。想要做到这一点，可以让算法内的步骤不要切割的太细，但是如果步骤
太小的话，会比较没有弹性，所以要看情况折中。某些步骤是可选的，所以
可以将这些步骤实现成钩子，而不是实现成抽象方法，这样就可以让抽象类
的子类的负荷减轻。

### 应用
* 数组、集合排序
* 窗体程序
* Spring template

在排序中，是通过接口来实现的。虽然如此但它的实现仍然符合模板方法模
式的精神。再者，由于不需要继承数组就可以使用这个算法，这样使得排序
变得更有弹性、更有用。

### 要点
* 模板方法定义了算法的步骤，把这些步骤的实现延迟到子类。
* 模板方法模式为我们提供了一种代码复用的重要技巧。
* 模板方法的抽象类可以定义具体方法，抽象方法和钩子。
* 抽象方法有子类实现。
* 钩子是一种方法，它在抽象类中不做事，或者只做默认的事情，子类可以
选择要不要去覆盖它。
* 为了防止子类改变模板方法中的算法，可以将模板方法声明为final。
* 好莱坞原则告诉我们，将决策权放在高层模块中，以便决定如何以及何时
调用底层模块。
* 你将在真实世界代码中看到模板方法模式的许多变体，不要期待它们全都
是一眼就可以被你认出的。
* 策略模式和模板方法模式都封装算法，一个用组合，一个用继承。
策略是定义一个算法家族，并让这些算法可以互换。正因为每一个算法都被
封装起来了，所以客户可以轻易地使用不同的算法。
而模板方法是定义一个算法的大纲，由子类定义其中某些步骤的内容。算
法中的个别步骤可以有不同的实现细节，但是算法的结构依然维持不变。对
算法有更多的控制权，而且不会重复代码。事实上，除了极少的一部分之外，
算法的每一个部分都是相同的，会重复使用到的代码，都被放进了超类中，
好让所有的子类共享。这一点在创建框架时是非常棒的。模板方法的依赖程
度比策略高，因为子类必须依赖超类中的方法的实现。
* 策略主要关注同一算法不同实现的可替换性，而模板方法主要专注于提供
一个同一个算法实现的框架。
* 工厂方法是模板方法的一种特殊版本。