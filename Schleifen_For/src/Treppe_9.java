import java.util.Scanner;

public class Treppe_9 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int h, i, j, m;
	    do
	    {
	    	System.out.print("Wie hoch soll die Treppe sein?: ");
	        h = myScanner.nextInt();
	        System.out.print("Wie breit soll die Stufe sein?: ");
	        m = myScanner.nextInt();
	    }
	    while (h < 1);
	    for (i = 0; i < h; i++)
	    {
	        //Create space before #
	        for (j = 0; j < h - i - 1; j++)
	        {
	        	System.out.print(" ".repeat(m));
	        }    
	        //Create # before spaces
	        for (j = 0; j < i + 1; j++)
	        {
	        	System.out.print("*".repeat(m));
	        }    
	        //Make new line 
	        System.out.print("\n");
	    }
	}

}
