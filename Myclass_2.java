
public class Myclass_2 {
	int x,y;
Myclass_2(){
	System.out.println("MyClass Without Arguments");
	
}
Myclass_2(int x){
	this.x=x;
	System.out.println("MyClass With one Argument x= "+x);
	
}
Myclass_2(int x,int y){
	this.x=x;
	this.y=y;
	System.out.println("MyClass With Two Arguments x="+x+", y="+y);
	
}
	public static void main(String[] args) {
		Myclass_2 m1=new Myclass_2();
		Myclass_2 m2=new Myclass_2(11);
		Myclass_2 m3=new Myclass_2(11,21);
		
		// TODO Auto-generated method stub

	}

}
