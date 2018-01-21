

import java.util.Scanner;

public class KangarooApp {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
    	String message = "";
    	int k1Total = x1 + v1;
    	int k2Total = x2 + v2;
    	int hopCount = 1;
    	while(message.equals("")) {
    		System.out.println("k1 total = "+ k1Total+ ", k2 Total = "+k2Total + "k total difference =" + (k2Total-k1Total));
    		if((k2Total-k1Total == 0)) {
    			message = "YES";
    		}
    		else if (x1 != x2 && v1 == v2) {
    			message = "NO";
    		}
    		else if (Math.abs((k1Total + v1)-(k2Total + v2)) > Math.abs(k1Total - k2Total)) {
    			message = "NO";
    		}
    		else if ((k1Total-k2Total>0 && ((k1Total+v1)-(k2Total+v2) <0)) || (k2Total-k1Total>0 && ((k2Total+v2)-(k1Total+v1) <0))){
    			message ="NO";	
    		}
    		else {
    			message = "";
    			k1Total += v1;
    			k2Total += v2;
    			hopCount++;
        		System.out.println("New k1 total = "+ k1Total+ ", New k2 Total = "+k2Total + ", hop count = "+ hopCount);
    		} 		
    	}    	
    	return message;   	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter K1 starting point (integer 1 - 10000): ");        
        int x1 = in.nextInt();
        System.out.print("Enter K1 hop rate (integer 1 - 10000): ");          
        int v1 = in.nextInt();
        System.out.print("Enter K2 starting point (integer 1 - 10000): ");          
        int x2 = in.nextInt();
        System.out.print("Enter K2 hop rate (integer 1 - 10000): ");             
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        in.close();
    }
}
