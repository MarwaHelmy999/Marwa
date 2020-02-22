
import java.util.Scanner;


public class Task1 {

public static void main(String args []) {

Scanner num =new Scanner(System.in);

double firstn;
double secondn;
double result=0;
char operation;

System.out.println("first number ");
firstn = num.nextDouble();
System.out.println("second number ");
secondn=num.nextDouble();
System.out.println("operation ");
operation=num.next().charAt(0);
if(operation == '*')  {result=firstn*secondn;}
if(operation=='+')  {result=firstn+secondn;}
if(operation=='/'){result=firstn/secondn;}
if(operation=='%'){result=firstn%secondn;}
if(operation=='-'){result=firstn-secondn;}


System.out.print("the answer is "+result);

	}


}




