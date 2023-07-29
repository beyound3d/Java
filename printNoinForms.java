import java.util.Scanner;
public class WrapperTest 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("Number is Octal is :"+Integer.toOctalString(num));
        System.out.println("Number is Binary is :"+Integer.toBinaryString(num));
        System.out.println("Number is Hex is :"+Integer.toHexString(num));
    }
}
