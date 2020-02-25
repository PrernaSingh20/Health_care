import java.util.Scanner;

public class Appointment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n;
		do
		{   
			System.out.println(" Select the diagnostic centre ");
			System.out.println(" 1 : Kidwai Nagar ");
			System.out.println(" 2 : KANPUR ");
			System.out.println(" 3 : Delhi ");
			System.out.println(" Enter Your Choice : ");
			n = sc.nextInt();
			String cn;
			switch(n)
			{
			case 1: {cn = "Kidwai Nagar";
				new Test().dcentre(cn);
				new Call_var_inter().main(null);
		        break;}
			
		    case 2:{cn = "KANPUR";
		    	new Test().dcentre(cn);
			break;}
			
			case 3:{cn = "Delhi";
				new Test().dcentre(cn);
			break;}
		    default :
		    	{System.out.println(" Invalid Choice ");}
			}
		} while(n<=4);
	
		}
	

}
