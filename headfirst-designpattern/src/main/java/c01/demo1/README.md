如果想让鸭子具有飞行的能力。可以在Duck类中增加的fly()，但是在超类中加
上fly()，就会导致所有子类都具备fly()，连那些不该具备fly()的子类也无法
免除。

可以在不需要fly()的子类中覆盖掉fly()，使其什么都不做。这样会导致代码
在多个类中重复，如果子类很多，在修改时也容易出错。而且在每增加一种子
类型，就需要检查覆盖掉它不需要的方法，这就是无穷无尽的噩梦。

### 继承的问题
当涉及"维护"时，为了"复用"目的而使用继承，结局并不完美。

对代码所做的局部修改，影响层面可不只是局部。

使用继承的缺点：
1. 代码在多个子类中重复；
2. 运行时的行为不容易改变；
3. 很难知道所有子类的全部行为；
4. 改变会牵一发动全身，造成其他子类不想要的改变；

> 父类中的行为不一定是每个子类都需要的。