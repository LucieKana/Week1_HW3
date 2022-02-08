package week1Hw3;
import java.util.Scanner;
public class Operations {
    
	 static double add(double x, double y){
		  return x+y;
		}
	 static double subtract(double x, double y){
		  return x-y;
		}
	 static double multiplication(double x, double y){
		  return x*y;
		}
	 static double divide(double x, double y){
		  return x/y;
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		
		Double num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an operator:+,-,*,or / ");
		operator = input.next().charAt(0);

		System.out.println("Enter a first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Enter a second number: ");
		num2 = input.nextDouble();
			 
			 switch (operator) {
				case '+':					
					System.out.println(add(num1,num2));
					break;
					
				case '-':
					System.out.println(subtract(num1,num2));
					break;
				case '*':
					System.out.println(multiplication(num1,num2));
					break;
				case '/':
					
					System.out.println(divide(num1,num2));
					break;
					
				default:
					System.out.println("Invalid opeartor!");
					System.exit(0);
		 
			 }
	    
	  }

}
	
