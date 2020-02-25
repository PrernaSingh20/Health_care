import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Intdao implements  Interface_dao1{
	ArrayList<pojo>b2=new ArrayList<pojo>();
	@Override
	public void Display(pojo obj) {
		// TODO Auto-generated method stub
		System.out.println("-----------DETAILS----------");
		b2.add(obj);
		
		Iterator<pojo> it = b2.iterator();
		while(it.hasNext())
		{
		pojo s=it.next();
			System.out.println("                     ");
        	System.out.println("User id is : "+s.getUserId());
        	System.out.println("Appointment id is : "+s.getAppointmentId());
        	System.out.println("Date is : "+s.getDate());
        	System.out.println("Date and time is : "+s.getTime());
        	System.out.println("\n\n");
        	System.out.println("===========================================================");
        	
        }
		
	}
	
	
	
}
	
