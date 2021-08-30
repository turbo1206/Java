
public class Gas {
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("Gas가 없습니다.");
			return false;
		} else {
			System.out.println("Gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다."+"잔량:("+gas+")");
				gas--;
			} else {
				System.out.println("멈춥니다."+"잔량:("+gas+")");
				return;
			}
		}
	}
}
