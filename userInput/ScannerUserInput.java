package userInput;
import java.util.Scanner;


public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
//		Scanner sc = new Scanner (System.in);
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
		
//		String hello =sc.nextLine();
//		
//		System.out.println(hello);
		Scanner sc = new Scanner (System.in);
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate * time /100;
		System.out.println("the simple interest is " + simpleInterest);
		
		
		
		
	}

}
