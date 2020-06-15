import java.util.Scanner;
public class BasicCalculator{

float num1,num2;

BasicCalculator(float num1,float num2){

	this.num1=num1;
	this.num2=num2;

	}

void sum(float num1,float num2){
	//float a=num1;
	//float b=num2;
	float ans=num1+num2;
	System.out.println("Addition of two numbers:"+ ans);

	}

void sub(float num1,float num2){
	
	float ans=num1-num2;
	System.out.println("Substraction of two numbers:"+ ans);
	
}

void multi(float num1,float num2){

	float ans=num1*num2;
	System.out.println("Mutliple of two numbers:"+ ans);

}
void div(float num1,float num2){

	float ans=num1/num2;
	System.out.println("Division of two numbers"+ ans);

}

public static void main(String args[]){

float num1,num2=0;
//BasicCalculator bc= new BasicCalculator(num1,num2);

Scanner sc= new Scanner(System.in);
System.out.println("Welcome to the Basic Calculator Program");
System.out.println("Enter the First number");
num1=sc.nextFloat();
System.out.println("Enter the Second number");
num2=sc.nextFloat();
BasicCalculator bc= new BasicCalculator(num1,num2);
System.out.println("Please enter your choice of operations");
System.out.println("1. Addition 2.Substraction 3.Multiplication 4.Division 5.Exit");
int ch=sc.nextInt();
switch(ch){
		case 1:
				bc.sum(num1,num2);
				break;

		case 2:
				bc.sub(num1,num2);
				break;

		case 3:
				bc.multi(num1,num2);
				break;

		case 4:
				bc.div(num1,num2);
				break;

		case 5:
				System.exit(0);
				break;
default:
			System.out.println("Invalid Entry");
		}

	}

}

