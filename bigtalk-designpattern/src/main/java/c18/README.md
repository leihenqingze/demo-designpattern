备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对
象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。

![备忘录模式](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c18/memento.png?raw=true)

Originator（发起人）：负责创建一个备忘录Memento，用以记录当前时刻它
的内部状态，并可使用备忘录恢复内部状态。Originator可根据需要决定
Memento存储Originator的哪些内部状态。

Memento（备忘录）：负责存储Originator对象的内部状态，并可防止
Originator以外的其他对象访问备忘录Menmento。备忘录有两个接口，
Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。
Originator能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据。

Caretaker(管理者)：负责保存号备忘录Memento，不能对备忘录的内容进行
操作或检查。

就刚才的例子，‘游戏角色’类其实就是一个Originator，而使用了同样的
‘游戏角色’实例‘备份’来做备忘录，这在当需要保存全部信息时，是可以
考虑的，而用clone的方式来实现Memento的状态保存可能是更好的办法，但是
如果是这样的话，使得我们相当于对上层应用开放了Originator的全部
（public）接口，这对于保存备份有时候是不合适的。

如果我们不需要保存全部的信息而只是部分以备使用，那么就应该有一个独立
的备忘录类Memento，它只拥有需要保存的信息的属性。

把要保存的细节给封装在了Memento中了，哪一天要更改保存的细节也不用影响
客户端了。

备忘录模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类，或
者需要保存的属性只是众多属性中的一小部分时，Originator可以根据保存的
Memento信息还原到前一状态。

如果在某个系统中使用命令模式时，需要实现命令的撤销功能，那么命令模式
可以使用备忘录模式来存储可撤销操作的状态。有时一些对象的内部信息必须
保存在对象以外的地方，但是必须要由对象自己读取，这时，使用备忘录可以
把复杂的对象内部信息对其他的对象屏蔽起来，从而可以恰当地保持封装的边界。

当角色的状态改变的时候，有可能这个状态无效，这时候就可以使用暂时存储
起来的备忘录将状态复原。

备忘录模式也是有缺点的，角色状态需要完整存储到备忘录对象中，如果状态
数据很大很多，那么在资源消耗上，备忘录对象会非常耗内存。

玩单机的PC游戏的时候，通常都是在打Boss之前，保存一个进度，然后如果通
关失败了，可以再返回刚才那个进度来恢复原来的状态，从头来过。这其中的
原理就是把当前的游戏状态的各种参数存储，以便恢复时读取。通常这种保存
都是存在磁盘上了，以便日后读取。但对于一些更为常规的应用，比如下棋时
需要悔棋、编写文档时需要撤销、查看网页时需要后退，这些相对频繁而简单
的恢复并不需要存在磁盘中，只要将保存在内存中的状态恢复一下即可。