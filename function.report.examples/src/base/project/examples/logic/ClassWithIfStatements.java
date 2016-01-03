package base.project.examples.logic;

/**
 * Class to test the report for different methods with different if-statements.
 */
public class ClassWithIfStatements {

	public double twoIfSt(String funktion, double num1, double num2) {
		if ("mulitply".equals(funktion) || "m".equals(funktion)) {
			return num1 * num2;
		} else if (funktion != null && funktion.equals("add")) {
			return num1 + num2;
		} else {
			
		}

		return 0;
	}

	public String oneIfSt(String var1, String var2, String var3) {
		if (var1 != null && var2 != null) {
			return var1.concat(var2);
		}

		return null;
	}
	
	private void noIfSt(String val1) {
		
	}
	
	public void oneIfOnlyNullCheck1(String string) {
		if (string == null) {
			noIfSt(string);
		}
	}
	
	public void oneIfOnlyNullCheck2(String string) {
		if (string != null) {
			noIfSt(string);
		}
	}
	
	public void oneIfOnlyNullCheck3(String string, String string2) {
		if (string != null && string2 == null) {
			noIfSt(string);
		}
	}
}
