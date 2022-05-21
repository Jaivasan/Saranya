package programsTask;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Patterns {
	public static void main(String[] args) {
		
		/*input: demo
		 output:d
		 		ee
		 		mmm
		 		oooo
		 */
		/*String s = "demo";
		String op = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j =0; j <=i; j++) {
				char c = s.charAt(i);
				
				System.out.print(c);
				
			}
			System.out.println();
		} */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
