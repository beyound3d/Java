import java.util.Scanner;
public class Voter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.next();
		System.out.print("Enter your Age : ");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("Dear "+name+" you can vote");
		else
			System.out.printf("Dear %s you cannot vote",name);
	
	}
}
