#观察者模式
1) 定义对象间的一种一对多的依赖关系，当一个对象的状态发生变化时，所有依赖它的对象都得到通知并自动更新。  
2) 从程序设计的角度来看，事件驱动模型的核心构件通常包含以下几个：  
事件源：负责产生事件的对象。比如我们常见的按钮，按钮就是一个事件源，能够产生“点击”这个事件，Subject被观察者  ApplicationEvent
事件监听器（事件处理器）：负责处理事件的对象，Observer观察者 ApplicationListener  
事件：或者称为事件对象，是事件源和事件监听器之间的信息桥梁。是整个事件模型驱动的核心 ApplicationEventPublisher.publishEvent()  