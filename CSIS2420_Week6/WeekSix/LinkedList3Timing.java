package WeekSix;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3Timing {

	public static void main(String[] args) throws IOException {
		
		String dataFile = "C:\\\\Users\\\\tyler\\\\Desktop\\\\TestData5.csv";
		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		int numLines = 0;
		BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date startDate = Calendar.getInstance().getTime();
        long d_startTime = new Date().getTime();
	    LinkedList<Integer> intList = new LinkedList<Integer>();
	
	    
	    
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
    		intList.add(accounts[i]);
    		
    	}

    	long startTime = System.nanoTime();
        printList(intList); 
        long endTime = System.nanoTime();
        
        long answer = ((endTime - startTime)/1000000);
        
        
        
        System.out.println("That took " + (answer) + " milliseconds!");
        
        }catch (IOException e) {
        	
        	e.printStackTrace();
        	
        }
       

	}

	
	private static void printList(LinkedList<Integer> intList) 
	{
	    Iterator<Integer> it = intList.iterator();
	    System.out.print("List: ");
	    while (it.hasNext())
	    {
	    	System.out.print(it.next() + " -> ");
	    }
	    System.out.println("null");
	}

}
