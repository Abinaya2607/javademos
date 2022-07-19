package lesson1;
import java.util.Scanner;
final class Operation {
	float a, b;
	static float result=0;
	Operation(float c , float d)
	{
	this.a= c;
	this.b=d;
	}

	public float function(char operator)
	{
	switch(operator)
	{
	case '+':
		System.out.println("Addition of two numbers " );
		result= (a+b);
		break;
	case '-':
		System.out.println("subtraction of two numbers " );
		result= (a-b);
		break;
	case '*':
		System.out.println("Multiplication of two numbers " );
		result= (a*b);
		break;
	case '/':
	      System.out.println("Division of two numbers ");
	      result= (a/b);
	      break;
	default :
		System.out.println("You choose invalid operator " );
		break;
	}
	return result;
	
}
}

public class calculator {

	public static void main(String[] args) 
	{
		float num1,num2,n,i;
		float answer;
		char operator;
		Scanner scanner=new Scanner (System.in);
		System.out.println("How many times do you want to use calculator");
		n=scanner.nextInt();
		for(i=0;i<n;i++)
		{
		System.out.println("Enter the value of number1");
		num1= scanner.nextFloat();
		System.out.println("Enter the value of number2");
		num2= scanner.nextFloat();
		Operation obj=new Operation(num1,num2);
		System.out.println("Which operation do you want to perform");
		operator=scanner.next().charAt(0);
		answer= obj.function(operator);
		System.out.println(answer);
		System.out.println("your final roundoff answer " + (int)answer);
		}
	}
}
