import java.util.Scanner; 
class calculator{
	public static void main(String args[]){
	
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first num");
	a=sc.nextInt();
	
	System.out.println("enter second num");
	b=sc.nextInt();
	
	int c = a+b;
	System.out.println("sum of the num " + c);
	
	int d = a-b;
	System.out.println("sub of the num " + d);
	
	int e = a*b;
	System.out.println("product of the num " + e);
	
	int f = a/b;
	System.out.println("division of the num " + f);
	
	int avg = (a+b)/2;
	System.out.println("avg of the num " + avg);
	
	
	
	}
}