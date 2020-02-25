import java.util.HashMap;
import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	String cn ;
	public void dcentre(String cn) 
	{
if(cn.equals("Kidwai Nagar"))
{
	System.out.println(" Select the test in Kidwai Nagar ");
	
	System.out.println(" 1 : Blood Test");
	System.out.println(" 2 : Urine Test");
	System.out.println(" 3 : CT Scan");
	System.out.println(" 4 : MRI");
	System.out.println(" ENTER FOR THE TESTS");
	int n1=sc.nextInt();
	
	switch(n1)
	{
	case 1:
		{
			System.out.println(" Appointmnet for Blood Test has been done !!\n"); 
	        break;

		}
	
    case 2:
    	{
    		System.out.println(" Appointmnet for Urine Test has been done !!\n");
    		break;

    	}
	
	case 3:
		{
			System.out.println(" Appointmnet for CT Scan Test has been done !!\n");
		
	break;
		}
	case 4:
		{
			System.out.println(" Appointmnet for MRI Test has been done !!\n");
		
	break;
		}
    default :
    {
    	System.out.println(" Invalid Choice \n");
	}
	}
}
else if(cn.equals("KANPUR"))
{
	System.out.println(" Select the test in Kanpur ");
	System.out.println(" 1 : Blood Test");
	System.out.println(" 2 : Urine Test");
	System.out.println(" 3 : CT Scan");
	System.out.println(" 4 : MRI");
	System.out.println(" ENTER FOR THE TESTS");
	
	int n2=sc.nextInt();
	
	switch(n2)
	{
	case 1:
	
			System.out.println(" Appointmnet for Blood Test has been done !!\n"); 
        break;
	
    case 2:System.out.println(" Appointmnet for Urine Test has been done !!\n");
	break;
	
	case 3:System.out.println(" Appointmnet for CT Scan Test has been done !!\n");
	break;
	
	case 4:System.out.println(" Appointmnet for MRI Test has been done !!\n");
	break;
	
    default :
    	System.out.println(" Invalid Choice \n");
	}
}

else if(cn.equals("Delhi"))
	{
	boolean flag = false;
		 {
			    System.out.println(" Select the test in Delhi");
				System.out.println(" 1 : Blood Test");
				System.out.println(" 2 : Urine Test");
				System.out.println(" 3 : CT Scan");
				System.out.println(" 4 : MRI");
				System.out.println(" ENTER FOR THE TESTS");
				
				int n3=sc.nextInt();
				switch(n3)
				{
				case 1:
					{
						System.out.println(" Appointmnet for Blood Test has been done !!\n");
				flag=true;
			        break;
					}
			    case 2:
			    	{
			    		System.out.println(" Appointmnet for Urine Test has been done !!\n");
			    flag = true;
				break;
			    	}
				case 3:
					{System.out.println(" Appointmnet for CT Scan Test has been done !!\n");
				 flag = true;
				break;
					}
				
				case 4:
					{System.out.println(" Appointmnet for MRI Test has been done !!\n");
				 flag = true;
				break;
					}
			    default :
			    	System.out.println(" Invalid Choice \n");
				}
			}
	}
	
	
else
{
	System.out.println("Invalid Choice");
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the centre : ");
		Scanner sc = new Scanner(System.in);

		String cn = sc.nextLine();
		Test t1 = new Test();
		t1.dcentre(cn);
	//System.out.println(cn);	
	
	
	}
}

	
