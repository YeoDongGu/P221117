package cellphone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dc = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("model : " + dc.model);
		System.out.println("color : " + dc.color);
		System.out.println("channel : " + dc.channel);

		dc.powerOn();
		dc.bell();
		dc.sendVoice("여보세요?");
		dc.receiveVoice("안녕하세요 홍길동 입니다");
		dc.sendVoice("네 반갑습니다");
		dc.hangUp();

		dc.turnOnDmb();
		dc.changeChannelDmb(12);
		dc.turnOffDmb();

	}

}
