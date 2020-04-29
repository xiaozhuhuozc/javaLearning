	1.String
	String可以直接用+和+=运算符
	String方法：
	判断字符串是否为空 - public boolean isEmpty()
	获取字符串长度 -  public int length()
	取子字符串 ：
	public String substring(int beginIndex)
	public String substring(int beginIndex, int endIndex) 
	在字符串中查找字符或子字符串，返回第一个找到的索引位置，没找到返回-1 ：
	public int indexOf(int ch)
	public int indexOf(String str)
	判断字符串是否以给定子字符串开头 - public boolean startsWith(String prefix)
	判断字符串是否以给定子字符串结尾 - public boolean endsWith(String suffix)
	所有字符转换为大写字符，返回新字符串，原字符串不变 - public String toUpperCase()
	所有字符转换为小写字符，返回新字符串，原字符串不变 - public String toLowerCase()
	字符串连接，返回当前字符串和参数字符串合并后的字符串，原字符串不变 ：
    public String concat(String str)
    字符串替换，替换单个字符，返回新字符串，原字符串不变：
	public String replace(char oldChar, char newChar)
	字符串替换，替换字符序列，返回新字符串，原字符串不变：
	public String replace(CharSequence target, CharSequence replacement) 
	删掉开头和结尾的空格，返回新字符串，原字符串不变 - public String trim() 
	分隔字符串，返回分隔后的子字符串数组，原字符串不变 - public String[] split(String regex)
	2.String不可变性
	与包装类类似，String类也是不可变类，即对象一旦创建，就没有办法修改了。String类也声明为了final，不能被继承，内部char数组value也是final的，初始化后就不能再变了
	3.StringBuild