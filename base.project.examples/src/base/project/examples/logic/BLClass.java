package base.project.examples.logic;

public class BLClass {

	
	
	public BLClass(ValueObject vo, BLSubClass subClass) {

	}

	public double calculate(String funktion, double num1, double num2) {
		if ("mulitply".equals(funktion) || "m".equals(funktion)) {
			return num1 * num2;
		} else if (funktion != null && funktion.equals("add")) {
			return num1 + num2;
		} else {
			ValidationResults.addInformation("not available");
		}

		return 0;
	}

	public String concat3(String var1, String var2, String var3) {
		if (var1 != null && var2 != null) {
			return var1.concat(var2);
		}

		return null;
	}

	public int calculateObjects2(ValueObject vo1, ValueObject vo2, String val1) {
		return (vo1.toString() + vo2.toString()).indexOf("a");
	}

	private void doSmthPrivate17(String val1, String val2) {
		
	}
	
	public int calculateNumber(int number1, int number2) {
		if (number1 < 0) {
			number1 *= -1;
		}
		return number1*number2;
	}
	
	public long calculateLongNumber(long number1, long number2) {
		if (number1 < 0) {
			number1 *= -1;
		}		
		return number1*number2;
	}

	public float calculateFloatNumber(float number1, float number2) {
		if (number1 < 0) {
			number1 *= -1;
		}		
		return number1*number2;
	}
	
	protected void doSmth3() {
		doSmthPrivate17("hallo", "world");
	}

	public int calculate(int num1, int num2) {
		return 0;
	}
}
