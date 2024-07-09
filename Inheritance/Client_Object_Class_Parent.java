package Inheritance;
public class Client_Object_Class_Parent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Case First (1)
//        Parent obj=new Parent();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

		// Case Second (2)
		//Parent obj = new Child();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((Child) (obj)).d2);
//		System.out.println(((Child)(obj)).d);
		
//		obj.fun();
//		obj.fun1();
//		((Child)(obj)).fun2();
		
		// Case Third (3)
		// This Method is not Allow
		//Child obj=new Parent();
		
		// Fourth Method(4)
		Child obj=new Child();
		System.out.println(obj.d);
		System.out.println(((Parent)(obj)).d);
		System.out.println(obj.d1);  //10
		System.out.println(obj.d2);  // 20
		obj.fun();
		obj.fun2();
		obj.fun1();
	}
}
