组合模式：将对象组合成树形结构以表示'部分-整体'的层次结构。组合模式
使得用户对单个对象和组合对象的使用具有一致性。

![组合模式](https://github.com/leihenqingze/fodder/blob/master/demo-designpattern/bigtalk-designpattern/c19/component.jpg?raw=true)

透明方式：也就是说在Component中声明所有用来管理子对象的方法，其中包
括add、remove等。这样实现Component接口的所有子类都具备了add和remove。
这样做的好处就是叶子节点和枝节点对外界没有区别，它们具备完全一致的行
为接口。但问题也很明显，因为Leaf类本身不具备add、remove方法的功能，
所以实现它是没有意义的。

安全方式：也就是在Component接口中不去声明add和remove方法，那么子类
的Leaf也就不需要去实现它，而是在Component声明所有用来管理子类对象的
方法，不过由于不够透明，所以树叶和树枝类将不具有相同的接口，客户端
的调用需要做相应的判断，带来了不便。

当发现需求中是体现部分与整体层次的结构时，以及你希望用户可以忽略组
合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考
虑用组合模式了。

组合模式定义了包含基本对象和组合对象的类层次结构。基本对象可以被组合
成更复杂的组合对象，而这个组合对象又可以被组合，这样不断地递归下去，
客户代码中，任何用到基本对象的地方都可以使用组合对象了。

用户是不用关心到底是处理一个叶子节点还是处理一个组合组件，也就用不着
为定义组合而写一些选择判断语句了。

组合模式让客户可以一致地使用组合结构和单个对象。

应用： 树形控件、页面组件、DOM树等