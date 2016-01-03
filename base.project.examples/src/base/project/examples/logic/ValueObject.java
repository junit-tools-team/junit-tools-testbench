package base.project.examples.logic;

public class ValueObject {

	public ValueObject(int a, String b) {
		if (a > 0) {
			a++;
		}
	}
	
	public void doSmth(int a) {
		if (a > 0) {
			a++;
		}
	}
	
	public void doSmth(double a) {
		if (a > 0) {
			a++;
		}
	}
	
}
