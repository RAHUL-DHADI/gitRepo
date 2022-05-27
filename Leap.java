import java.util.*;
class Leap
{
	public static void main(String args[])
	{
		Scanner Lp= new Scanner(System.in);
		System.out.println("enter the year");
		int Y= Lp.nextInt();
		
		if((Y%400==0)||(Y%4==0)&&(Y%100!=0))
		{
			System.out.println("The year is a leap year");
		}
		else
		{
			System.out.println("The year is not a leap year");
		}
	}
}
