import java.util.Scanner;

public class CountDigits{
	public static void main(String[] args){
		
		int count = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any digit: ");
		num = sc.nextInt();
		
		
		while(num>0){
			num = num/10;
			count++;
		}
			
		System.out.println("There are "+count+" digits in the number.");
		
	}
}