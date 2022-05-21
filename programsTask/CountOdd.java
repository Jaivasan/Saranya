package programsTask;

public class CountOdd {
public static void main(String[] args) {
	
	// to find count odd number from 1 to 100
	int count =0;
	for (int i = 1; i <=100; i++) {
		if (i%2!=0) {
			count++;	
		}		
	}
	System.out.println(count);
	
	System.out.println(" ");
	
	// to find count even number from 1 to 300
	int count1 = 0;
	for (int i = 1; i <=300; i++) {
		if (i%2==0) {
			count1++;
		}
	}
	System.out.println(count1);
}
}
