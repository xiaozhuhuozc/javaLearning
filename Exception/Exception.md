	1.初始异常
	异常若没处理，java就会启用默认处理机制，打印异常堆栈并退出程序。
	异常处理机制会从当前函数开始查找谁捕获了此异常，没有就查看上一层指导主函数，如果主函数没处理就只用默认机制
    
	--异常相对于return的一种退出机制，可以由系统触发，也可以由程序通过throw语句触发。可以通过try/catch捕获处理

	2.异常类 Throwable
	构造函数：
	public Throwable()
	public Throwable(String message)
	public Throwable(String message, Throwable cause)
	public Throwable(Throwable cause) 
	message，表示异常消息，另一个是cause，表示触发该异常的其他异常
	
	构造方法都有调用函数fillInStackTrace() 将异常堆栈信息保存。void printStackTrace()获取异常信息
	
	3.异常类体系
    AThrowable
	A.1Error 
    A.1.1VirtualMachineError
	A.1.2OutOfMemeroryError
	A.1.3StackOverflowError
	A.2Exception
	A.2.1IOException
	A.2.2RuntimeException
	A.2.2.1IlLegalStateException
	A.2.2.2NullPotionException
	A.2.2.3ClassCastException
	A.2.2.4IndexOutOfBoundsException
	A.2.3SQLException
	
	RuntimeException/Error及其子类都是 未受检异常
	其他子类的Exception为受检异常
	区别受检异常：对于受检异常，Java强制要求程序员处理，否则编译错误，而非受检异常则无此要求。
	
	
	4.异常处理
	4.1catch匹配
	
	try{
	    //可能触发异常的代码
	}catch(NumberFormatException e){
	    System.out.println("not valid number");
	}catch(RuntimeException e){
	    System.out.println("runtime exception "+e.getMessage());
	}catch(Exception e){
	    e.printStackTrace();
	}
	异常处理机制根据抛出的异常类型找到第一个匹配的catch块，执行catch内的代码，其他catch块不执行，如果没找到则会继续到上层方法查找。
	[抛出的类型是catch中声明异常的子类也算匹配，所以需要将具体的子类放在前面，如果Exception放在前面，则其他更具体的catch将得不到执行]
	4.2重新throw
	在catch块内处理完后，可以重新抛出异常，异常可以是原来的，也可以是新建的.

	重新抛出异常，就会把当前Exception作为cause传递给新建的异常，形成异常链，捕获到新的异常的代码可以通过getCause()获取到原始异常。
	4.3finally
	try{
    //可能抛出异常
	}catch(Exception e){
	    //捕获异常
	}finally{
	    //不管有无异常都执行
	}
	
	finally内的代码不管有无异常发生，都会执行。具体来说：
	*如果没有异常发生，在try内的代码执行结束后执行。
	*如果有异常发生且被catch捕获，在catch内的代码执行结束后执行
	*如果有异常发生但没被捕获，则在异常被抛给上层之前执行。
	一般用户释放资源(数据库连接 文件流等)
	
	--如果在try或者catch语句内有return语句，则return语句在finally语句执行结束后才执行，但finally并不能改变返回值
	--如果在finally中也有return语句，try和catch内的return会丢失，实际会返回finally中的返回值
	--为避免混淆，应该避免在finally中使用return语句或者抛出异常
	4.4throws
	关键字throws，用于声明一个方法可能抛出的异常
	public void test() throws AppException,SQLException {
	    //....
	}
	

	checked exception必须出现在throws语句中，调用者必须处理，Java编译器会强制这一点，而RuntimeException则没有这个要求.
	RuntimeException(unchecked)表示编程的逻辑错误，编程时应该检查以避免这些错误;Checked exception表示程序本身没问题，但由于I/O、网络、数据库等其他不可预测的错误导致的异常，调用者应该进行适当处理。

	在有了异常机制后，程序的正常逻辑与异常逻辑可以相分离，异常情况可以集中进行处理，异常还可以自动向上传递，不再需要每层方法都进行处理，异常也不再可能被自动忽略，从而，处理异常情况的代码可以大大减少，代码的可读性、可靠性、可维护性也都可以得到提高。