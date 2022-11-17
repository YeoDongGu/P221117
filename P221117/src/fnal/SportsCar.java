package fnal;

public class SportsCar extends Car {
	public void speedUp() {
		speed += 10;
	}

//	public void stop() { // Car 클래스에서 final 로 메서드를 선언해놓았기때문에 오류
//		System.out.println("SportsCar를 멈춤");
//		speed = 0;
//	}
}
