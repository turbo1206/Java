
public class GasExample {

	public static void main(String[] args) {
		Gas myCar = new Gas();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("가스를 주입 할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하십시요.");
		}
	}

}
