package WeekSix;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LinkedListDemo 
{

	public static void main(String[] args) throws IOException

	{
		LinkedList ll = new LinkedList();
		String dataFile = "C:\\\\Users\\\\tyler\\\\Desktop\\\\TestData3.csv";
		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		int numLines = 0;
		BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

	
	    
	    
        // Count the number of lines in the data file
        System.out.println(formatter.format(currentDate));
        System.out.print("Counting lines in the data file ... ");
		while (reader.readLine() != null) numLines++;
		reader.close();
		System.out.println(numLines);
		int[] accounts = new int[numLines];
    	// Get data set from file and load array with values
    	System.out.println("Building array from the data file ...");
        br = new BufferedReader(new FileReader(dataFile));
        
       
        
        try {
        	
        	

        
        
    	for (int i = 0; i < numLines; i++) {
    		line = br.readLine();
			String[] account = line.split(csvSplitBy);
    		accounts[i] = Integer.valueOf(account[0]);
    		ll.append(accounts[i]);
 
    		
    	}

    	
    	
    	long startTime = System.nanoTime();
    	ll.printList();
        long endTime = System.nanoTime();
        
        long answer = ((endTime - startTime)/1000000);
        
        
        
        System.out.println("That took " + (answer) + " milliseconds!");
        
        }catch (IOException e) {
        	
        	e.printStackTrace();
        	
        }
       

	}
		

	
}
