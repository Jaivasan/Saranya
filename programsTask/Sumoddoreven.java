package programsTask;

public class Sumoddoreven {
public static void main(String[] args) {
	
	// to find sum odd number from 1 to 50
	int sum = 0;
	
	for (int i = 1; i <=50; i++) {
		if (i%2!=0) {
			sum+=i;
		}
	}
	System.out.println("Sum of odd number is " +sum);
	
	// to find even between 1 to 100
	
	int sum1=0;
	for (int i = 1; i <=100; i++) {
		if (i%2==0) {
			sum1+=i;
		}
	}
	
	System.out.println("Sum of even number is " +sum1);
}
}
