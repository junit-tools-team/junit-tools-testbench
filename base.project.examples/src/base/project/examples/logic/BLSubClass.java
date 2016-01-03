package base.project.examples.logic;

public class BLSubClass {
	public BLSubClass() {
		
	}
	
	public BLSubClass(ValueObject vo) {
		
	}
	
	public boolean doSmth2(String test, String test2, String test3, boolean test4) {
		if (test.equals(test2)) {
			return true;
		}
		return false;
	}
}
