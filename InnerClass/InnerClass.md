	1.内部类
	一个类放在另一个类的内部称为内部类，包含它的类称为外部类。
	
	内部类一般与包含它的外部类关系密切，而与其他类关系不大，定义在类内部可以实现对外部类的隐藏，有更好的封装性。
	[内部类只是java编译器的概念，java虚拟机也会把内部类编译为独立的类，生成独立的字节码文件]
	
	内部类可以方便访问外部类的私有变量，可以声明为private从而实现对外完全隐藏。
	
	内部类分为四种：静态内部类/成员内部类/方法内部类/匿名内部类
	
	2.静态内部类
	2.1语法
	public class Outer {
	    private static int shared = 100;
	    
	    public static class StaticInner {
	        public void innerMethod(){
	            System.out.println("inner " + shared);
	        }
	    }
	}
	创建对象方式：
	Outer.StaticInner si = new Outer.StaticInner();
	si.innerMethod();

	可以访问外部类的静态变量和静态方法，不可访问实例变量和方法
	public的静态外部类可以被外部使用，通过外部类.静态内部类 的方式使用
	
	--静态内部类与外部类关系密切，且不依赖于外部类实例
	3.成员内部类
	public class Outer {
	    private int a = 100;
	    
	    public class Inner {
	        public void innerMethod(){
	            System.out.println("outer a " +a);
	            Outer.this.action();
	        }
	    }
	    
	    private void action(){
	        System.out.println("action");
	    }
	}

    创建对象方式：
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner();
	inner.innerMethod();

	除了静态变量和方法，成员内部类还可以访问外部类的实例变量和方法。[如果方法和外部类有重名，可以外部类.this.func()]
	
	与静态内部类不同，成员内部类中不可以定义静态变量和方法 (final变量例外，它等同于常量），下面介绍的方法内部类和匿名
	内部类也都不可以[内部类是与外部类关联的，不应独立使用，而静态变量/方法是属于类的一般独立使用]
	--内部类与外部类关系密切，且操作或依赖外部类实例变量和方法
	
	4.方法内部类
	public class MemberInnerClassTest {
	    private int a = 100;
	    public void test(final int param){
	        final String str = "hello";
	        final int a = 200;
	        class Inner{
	            public void innerMethod(){
	                System.out.println("Outer a = "+a);
	                System.out.println("param = "+param);
	                System.out.println("local var = "+str);
	            }
	        }
	        Inner inner = new Inner();
	        inner.innerMethod();
	    }
	}
	方法内部类只能在方法内被使用
	1)如果方法是实例方法，除了静态变量和方法，还可以方法外部类的实例变量和方法
	2)方法内部类还可以方法方法的参数和方法中的局部变量，不过必须声明为final
	如果的确需要修改外部的变量，可以将变量改为只含该变量的数组，修改数组中的值
	--类只在方法内被使用，方法内部类可以实现更好的封装
     
	4.匿名内部类
	匿名内部类是与new相关联的
	Button bt = new Button();
	bt.addActionListener(new ActionListener(){
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //处理事件
	    }
	});

	匿名内部类只能被使用一次，用来创建一个对象，没有名字和构造函数，可以定义实例变量和方法，可以有初始化代码块。
	没有构造方法，自己无法接受参数。
	与方法内部类一样，匿名内部类也可以访问外部类的所有变量和方法，可以访问方法中的final参数和局部变量
	--如果对象只会创建一次，且不需要构造方法来接受参数