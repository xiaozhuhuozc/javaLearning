	接口声明一种能力
	1.定义接口
	Java使用interface关键字声明接口，修饰符一般为public
	接口中的方法默认修饰符为public，不实现方法
	2.实现接口
	Java使用implements关键字实现接口
	实现接口必须实现接口中的方法

	一个类可以实现多个接口，表示类具备多种能力，各个接口用逗号分开	
	3.使用接口
	接口不能直接创建对象，但可以声明接口类型的变量
	
	4.接口的细节
	1)接口中的变量默认是publib static final，可以通过接口名.变量名使用
	2)接口也可以继承别的接口
  	类的继承和接口可共存， extends要放在implements之前
  	与类一样,接口也可以使用instanceof来判断一个对象是否实现某接口