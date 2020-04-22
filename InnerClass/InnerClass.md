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
	
	可以访问外部类的静态变量和静态方法，不可访问实例变量和方法
	public的静态外部类可以被外部使用，通过外部类.静态内部类 的方式使用
	
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
	除了静态变量和方法，成员内部类还可以访问外部类的实例变量和方法。[如果方法和外部类有重名，可以外部类.this.func()]
	
	与静态内部类不同，成员内部类中不可以定义静态变量和方法 (final变量例外，它等同于常量），下面介绍的方法内部类和匿名
	内部类也都不可以
	