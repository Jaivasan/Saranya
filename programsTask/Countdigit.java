package programsTask;

public class Countdigit {
public static void main(String[] args) {
	
	// count number of digit
	int num = 1234567;
	int count = 0;
	while (num>0) {
		count ++;
		num/=10;
	}
	System.out.println("Number of digit in given string " + count);	
	
	
	//sum of given digit
		int num1 = 12345;
		int sum = 0;
		while (num1>0) {
			int n = num1%10;
			sum = sum+n;
			num1/=10;
		}
		System.out.println("sum of digit " + sum);
}	
}
