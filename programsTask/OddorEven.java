package programsTask;

public class OddorEven {
public static void main(String[] args) {
	//1) to check odd or even number
	/*int a =10;
	if (a%2!=0) {
		System.out.println("A is Odd number" +a);
	} else {
		System.out.println("A is even number"+a);
	}
	
	//2) to print odd number from 1 to 10
	for (int i = 0; i <=10; i++) {
		if (i%2!=0) {
			
			System.out.println(i);
		}
		
	//3) to print even numbers from 1 to 50		
	for (int i = 1; i <=50; i++) {
		if (i%2==0) {
			System.out.println(i);
		}
	}
	
	//4) count odd number from 1 to 100
	
	int count =0;
	for (int i = 0; i <=100; i++) {
		
		if (i%2!=0) {
			count++;
		}	
	}
	System.out.println(count);*/
	
	//5) count even number from 1 to 100
	int count =0;
	for (int i = 1; i <=100; i++) {
		
		if (i%2==0) {
			count++;
		}
		
	}	
	System.out.println(count);
}
}
