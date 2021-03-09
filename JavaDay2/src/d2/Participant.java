package d2;

public class Participant {
	private String name;
	private String role;
	
	public void setDetails(String pname,String prole) {
		name =pname;
		role=prole;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Role:"+role);
	}
	public void camON() {
		System.out.println("Camera on....");
	}
	public void camOff() {
		System.out.println("Camera Off....");
	}
	public void micON() {
		System.out.println("mic on....");
	}
	public void micOff() {
		System.out.println("Mic Off....");
	}
	public void shareScreen() {
		System.out.println("Sharing Screen....");
	}
	public void shareScreenoff() {
		System.out.println("Sharing Screen turned off....");
	}
	public void Risehand() {
		System.out.println("rised hand....");
	}
	public void Lowerhand() {
		System.out.println("Lower hand....");
	}
	public void chatStart() {
		System.out.println("Message.....");
	}
	public void stopChat() {
		System.out.println("End Chatting ....");
	}
}
