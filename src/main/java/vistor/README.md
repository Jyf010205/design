#访问者模式
1)	访问者模式（Visitor Pattern），封装一些作用于某种数据结构的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
2)	主要将数据结构与数据操作分离，解决 数据结构和操作耦合性问题 (员工属性（数据结构）和CEO、CTO访问者（数据操作）的解耦。)
3)	访问者模式的基本工作原理是：在被访问的类里面加一个对外提供接待访问者的接口
4)	访问者模式主要应用场景是：需要对一个对象结构中的对象进行很多不同操作(这些操作彼此没有关联)，同时需要避免让这些操作"污染"这些对象的类，可以选用访问者模式解决  
5)	访问者模式最大的优点就是增加访问者非常容易，我们从代码中可以看到，如果要增加一个访问者，只要新实现一个 Visitor 接口的类，从而达到数据对象与数据操作相分离的效果。如果不实用访问者模式，而又不想对不同的元素进行不同的操作，那么必定需要使用 if-else 和类型转换，这使得代码难以升级维护。  
