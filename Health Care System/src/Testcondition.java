import java.util.Iterator;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

	public class Testcondition {
		
	    public static void main(String[] args, HashMap<String, String> String, HashMap<String, String> HashMap) {
	       
	        Scanner in = new Scanner(System.in);
	 
	     HashMap<String, String> list = new HashMap<>();
	       
	        list.put("1010", "Blood Test");
	        list.put("1020", "Urine Test");
	        list.put("1030", "CT Scan");
	        list.put("1040", "MRI");
	 
	       
	        Set entrySet = list.entrySet();
	 
	        
	        Iterator it = entrySet.iterator();
	 
	        
	        System.out.println(" Test with corresponding User Id: ");
	        while (it.hasNext()) {
	            Map.Entry me = (Map.Entry) it.next();
	            System.out.println("Test Id : " + me.getKey()
	                    + " ==>> "
	                    + " Test : " + me.getValue());
	        }
	        //Add a new value into the hashmap.
	        System.out.println("Would you like to appoint for a new test?  Type YES or NO: ");
	        String a = in.next();
	 
	        if (a.equalsIgnoreCase("yes")) {
	            String b = in.nextLine();
	            System.out.println("Enter a new Test Id: ");
	            String tid = in.next();
	            System.out.println("Enter a Test: ");
	            String test = in.next();
	            list.put(tid, test);
	        } else if (a.equalsIgnoreCase("no")) {
	        }
	 
	        for (Map.Entry<String, String> me : list.entrySet()) {
	            System.out.println("Test Id : " + me.getKey()
	                    + " ==>> "
	                    + " Test : " + me.getValue());
	        }   
	    }
		}
	
	
	

	
	
	
	