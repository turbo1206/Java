
public class CarculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		System.out.println(myCalc.plus(5, 6));
		System.out.println(myCalc.divide(10, 4));
		myCalc.powerOff();
	}

}
