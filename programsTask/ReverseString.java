package programsTask;

public class ReverseString {
public static void main(String[] args) {
	// how to reverse the number
	
	int num =12345678;
	int rev = 0;
	
	while (num>0) {
		int n = num%10;
		rev = (rev*10)+n;
		num/=10;
	}
	System.out.println(rev);		
}
}
