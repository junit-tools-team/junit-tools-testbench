package base.project.examples.logic;

public class NewClass {
	public String methodWithLogic(int i) {
		if (i < 0) {
			return "minus";
		}
		else if (i == 0) {
			return "null";
		}
		else {
			return "plus";
		}
	}
}
