import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Call_var_inter {

	public static void main(String[] args) {
		while(true)
		{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		ArrayList<pojo>bl=new ArrayList<pojo>();
		
		System.out.println("Enter the userId : ");
		String uid = sc.nextLine();
		System.out.println("Enter the AppointmentId : ");
	    long aid = sc.nextLong();
	    System.out.println("Enter the Date : ");
		String date_ = sc.next();
		System.out.println("Enter the Time : ");
		String dt =sc.next();  //default format: hh:mm:ss
		LocalTime lt=LocalTime.parse(dt);
		//System.out.println(lt);
	   
		pojo obj=new pojo();
		 obj.setUserId(uid);
		 obj.setAppointmentId(aid);
		 obj.setDate(date_);
		 obj.setTime(dt);
		// Testcondition.Validation(Testcondition.list, uid);
		 Intdao d1 = new  Intdao();
		
		 d1.Display(obj);
		new Appointment().main(null);
		}
		
	/*	System.out.println("-----------DETAILS----------");
		bl.add(obj);
		
		Iterator<pojo> it = bl.iterator();
		while(it.hasNext())
		{
		pojo s=it.next();
			System.out.println("                     ");
        	System.out.println("User id is : "+s.getUserId());
        	System.out.println("Appointment id is : "+s.getAppointmentId());
        	System.out.println("Date is : "+s.getDate());
        	System.out.println("Date and time is : "+s.getTime());
        	
        }*/
	}}

	