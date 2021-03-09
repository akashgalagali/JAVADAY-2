package d2;

public class PartMain {

	public static void main(String[] args) {
Participant obj = new Participant();
obj.setDetails("Ram","Guest");
obj.display();
obj.camON();
obj.camOff();
obj.micON();
obj.micOff();
obj.Risehand();
obj.Lowerhand();
obj.shareScreen();
obj.shareScreenoff();
obj.chatStart();
obj.stopChat();
System.out.println(obj);
	}

}
