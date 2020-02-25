import java.time.LocalDateTime;

public class pojo {

	private String  userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	/*public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}*/
	public String getDate() {
		return date;
	}
	public void setDate(String date_) {
		this.date = date_;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String dt) {
		this.time = dt;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	/*public String getCenter() {
		return center;
	}
	public void setCenter(String center) {
		this.center = center;
	}*/
	private long appointmentId;
	//private String test;
	private String date;
	private String time;
	
	private boolean approved;
	//private String center;
	
	private String test;
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
