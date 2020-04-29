	1.包装类
	基本类型都有对应的包装类
	boolean -> Boolean | byte ->Byte
	short -> Short | int ->Integer
	long -> Long | float -> Float
	double -> Double | char -> Character
	
	集合类只能操作对象，为了操作基本类型需要使用对应的包装类。
	
	每个包装类都有一个静态方法valueOf()接受基本类型返回引用类型，也都有一个实例方法xxValue()返回对应的基本类型
	int i1 = 12345;
    Integer iObj = Integer.valueOf(i1);
    int i2 = iObj.intValue();
	
	自动装箱/拆箱是Java编译器提供的能力，背后，它会替换为调用对应的valueOf()/xxxValue()
	2.重写object方法
	1）equals用于判断当前对象和参数传入的对象是否相同，Object类的默认实现是比较地址
	2）hashCode和equals方法联系密切，对两个对象，如果equals方法返回true，则hashCode也必须一样。反之不要求。子类重写equals时，也必须重写hashCode
	3.不可变性
	包装类都是不可变类：
	所有包装类都声明为了final，不能被继承/
	内部基本类型值是私有的，且声明为final
	没有定义setter方法
	4.Integer类
	Integer的valueOf()方法使用了IntegerCache静态内部类，表示Integer缓存，其中cache变量是一个静态数组，默认保存了从-128~127共256个整数对应的Integer对象。
	在valueOf代码中，如果数值位于被缓存的范围，即默认-128到127，则直接从IntegerCache中获取已预先创建的Integer对象，只有不在缓存范围时，才通过new创建对象。
	Integer e1 = new Integer(16);
    Integer e2 = new Integer(16);
    System.out.println(e1 == e2);//false

    Integer f1 = Integer.valueOf(16);
    Integer f2 = Integer.valueOf(16);
    System.out.println(f1 == f2);//true
	
	