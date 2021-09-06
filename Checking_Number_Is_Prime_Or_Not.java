import java.util.Scanner;

public class Checking_Number_Is_Prime_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner e=new Scanner(System.in);
System.out.print("Enter any number=  ");
a=e.nextInt();
if(a%2==0)
{
System.out.println("The Entered Number Is Not Prime");
	}
else if (a%a==0&a%1==0) {
	System.out.println("The Entered Number Is Prime");
	
}

}
}