package programsTask;

public class Palindrome {
public static void main(String[] args) {
	
	// Palindrome or not
	int num = 12321;
	int rev = 0;
	int temp=num;
	
	while (num>0) {
		int n = num%10;
		rev = (rev*10)+n;
		num/=10;
	}
	
	if (rev==temp) {
		System.out.println("It is a Palindrome number");
	} else {
		System.out.println("It is not a Palindrome number");
	}
	
	
	// Armstrong or not
	int num1 = 153;
	int arm = 0;
	int temp1 = num;
	
	while (num>0) {
		int n = num%10;
		arm = arm+(n*n*n);
		num/=10;
	}
	if (arm==temp1) {
		System.out.println("It is a Armstrong number");
	} else {
		System.out.println("It is not a Armstrong number");
	}
}
}
