package base.project.examples.generator;

import base.project.examples.logic.BLSubClass;
import base.project.examples.logic.ValidationResults;

public class Testcases {

	private String simpleType1;
	private int simpleType2;
	private TestParam testParam;

	public static class TestParam {
		private int num1;
		private String txt1;

		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public String getTxt1() {
			return txt1;
		}

		public void setTxt1(String txt1) {
			this.txt1 = txt1;
		}

	}

	public Testcases() {

	}

	public Testcases(String simpleType1, int simpleType2) {
		this.simpleType1 = simpleType1;
		this.simpleType2 = simpleType2;

	}

	public Testcases(TestParam testParam) {
		this.testParam = testParam;
	}

	/*
	 * Check variety
	 */
	public boolean nullCheck(String param) {
		if (param == null) {
			return true;
		}
		return false;
	}

	public boolean nullCheckNeg(String param) {
		if (param != null) {
			return true;
		}
		return false;
	}

	public boolean nullCheckNeg2(String param) {
		if (null != param) {
			return true;
		}
		return false;
	}

	public boolean nullCheck2(String param) {
		if (null == param) {
			return true;
		}
		return false;
	}

	public boolean equalQueck(int param) {
		if (param == 0) {
			return true;
		}
		return false;

	}

	public boolean equalQueck2(int param) {
		if (param != 0) {
			return true;
		}
		return false;
	}

	public boolean equalQueck3(double param) {
		if (param != 0) {
			return true;
		}
		return false;
	}

	public boolean equalQueck4(byte param) {
		if (param == 'A') {
			return true;
		}
		return false;
	}

	public boolean equalQueck5(char param) {
		if (param == 'A') {
			return true;
		}
		return false;
	}

	public boolean lowerThanCheck(int param1) {
		if (param1 < 5) {
			return true;
		}
		return false;
	}

	public boolean lowerThanCheck3(int param) {
		if (5 < param) {
			return true;
		}
		return false;
	}

	public boolean lowerThanCheck2(int param1, int param2) {
		if (param1 < param2) {
			return true;
		}
		return false;
	}

	public boolean lowerThanEqualCheck(int param1, int param2) {
		if (param1 <= param2) {
			return true;
		}
		return false;
	}

	public boolean greaterThanCheck(int param1, int param2) {
		if (param1 > param2) {
			return true;
		}
		return false;
	}

	public boolean greaterThanCheck2(int param1) {
		if (param1 > -5) {
			return true;
		}
		return false;
	}

	public boolean greaterThanEqualCheck(int param1, int param2) {
		if (param1 > param2) {
			return true;
		}
		return false;
	}

	public boolean greaterThanEqualCheck2(int param1) {
		if (param1 > 5) {
			return true;
		}
		return false;
	}

	public boolean greaterThanEqualCheck3(int param1) {
		if (--param1 > 10) {
			return true;
		}
		return false;
	}

	/*
	 * Chain-operators variety
	 */
	public boolean orCheck(String param1, String param2) {
		if (param1 == null || param2 == null) {
			return false;
		}
		return true;
	}

	public boolean orCheck2(String param1, String param2) {
		if (param1 == null | param2 == null) {
			return false;
		}
		return true;
	}

	public boolean andCheck(String param1, String param2) {
		if (param1 != null && param2 != null) {
			return true;
		}
		return false;
	}

	public boolean andCheck2(String param1, String param2) {
		if (param1 != null & param2 != null) {
			return true;
		}
		return false;
	}

	public boolean xorCheck(String param1, String param2) {
		if (param1 != null ^ param2 != null) {
			return true;
		}
		return false;
	}

	/*
	 * multi chains
	 */

	public boolean multiChainAnd1(String param1, String param2, String param3) {
		if (param1 != null && param2 != null & param3 != null) {
			return true;
		}
		return false;
	}

	public boolean multiChainAnd2(String param1, String param2, String param3,
			String param4) {
		if (param1 != null && param2 != null
				& (param3 != null && param4 != null)) {
			return true;
		}
		return false;
	}

	public boolean multiChainAnd3(int param1, int param2, int param3, int param4) {
		if (param1 != 0 && param2 != 0 & (param3 != 0 && param4 != 0)) {
			return true;
		}
		return false;
	}

	public boolean multiChainOr1(String param1, String param2, String param3) {
		if (param1 != null | param2 != null || param3 != null) {
			return true;
		}
		return false;
	}

	public boolean multiChainXor1(String param1, String param2, String param3) {
		if (param1 != null ^ param2 != null ^ param3 != null) {
			return true;
		}
		return false;
	}

	public boolean multiChainParenthesized(String param1, String param2,
			String param3) {
		if ((param1 != null && param2 != null) || param3 != null) {
			return true;
		}
		return false;
	}

	public boolean multiChainParenthesized2(String param1, String param2,
			String param3, String param4) {
		if ((param1 != null && param2 != null)
				|| (param3 != null && param4 != null)) {
			return true;
		}
		return false;
	}

	public boolean multiChainParenthesized3(String param1, String param2,
			String param3, String param4, String param5) {
		if ((param1 != null && param2 != null && (param3 != null && param4 != null))
				|| param5 != null) {
			return true;
		}
		return false;
	}

	public boolean multiChainMixed1(String param1, String param2, String param3) {
		if (param1 != null && param2 != null || param3 != null) {
			return true;
		}
		return false;
	}

	public boolean multiChainMixed2(String param1, String param2,
			String param3, String param4) {
		if (param1 != null && param2 != null
				|| (param3 != null && param4 != null)) {
			return true;
		}
		return false;
	}

	public boolean multiChainMixed3(String param1, int param2, boolean param3,
			double param4) {
		if ((param1.equals("") || param2 == 0) && (param3 && param4 > 5)) {
			return true;
		}
		return false;
	}

	public boolean multiChainMixed4(String param1, int param2, boolean param3,
			double param4, String param5) {
		if (param5.equals("TestValue") && (param1.equals("") || param2 == 0)
				&& (param3 && param4 > 5)) {
			return true;
		}
		return false;
	}

	public boolean multiChainNested1(String param1, String param2, String param3) {
		if (param1 != null && param2 != null) {
			if (param3 != null)
				return true;
		}
		return false;
	}

	public boolean multiChainNested2(String param1, String param2, String param3) {
		if (param1 != null && param2 != null) {
			if (param3 != null)
				return true;
			else if ("hallo".equals(param1)) {
				return true;
			}
		}
		return false;
	}

	public boolean multiChainNested3(String param1, String param2, String param3) {
		if (param1 != null && param2 != null) {
			if (param3 != null)
				return true;
			else if ("hallo".equals(param1)) {
				return true;
			}
		} else if ("hallo".equals(param3) && param2 != null) {
			return false;
		}

		return false;
	}

	public boolean multiChainSameParam(int param1) {
		if (param1 < 0 && param1 > 100) {
			return true;
		}
		return false;
	}

	public boolean multiChainSameParam2(int param1, int param2) {
		if (param1 < 0 && (param1 > 100 && param2 != 0)) {
			return true;
		}
		return false;
	}

	/*
	 * Other
	 */

	public String twoChecksWithReturn(String param) {
		if (param != null) {
			if (!"return".equals(param)) {
				param = "return";
			}
		} else {
			param = "";
		}

		return param;
	}

	public int intCompare(int num1, int num2) {
		if (num1 == num2) {
			return 0;
		} else if (num1 < num2) {
			return -1;
		}

		return 1;
	}

	private boolean privateMethod(int num1) {
		if (num1 < 0) {
			return false;
		}
		return true;
	}

	public void objectParam(TestParam param) {
		if (param == null) {
			return;
		}

		if (param.getNum1() < 0) {
			param.setNum1(param.getNum1() * -1);
		}

		if ("".equals(param.getTxt1())) {
			param.setTxt1("txt1");
		}

	}

	public TestParam objectParamAndReturn(TestParam param) {
		if (param == null) {
			return null;
		}

		if (param.getNum1() < 0) {
			param.setNum1(param.getNum1() * -1);
		}

		if ("".equals(param.getTxt1())) {
			param.setTxt1("txt1");
		}

		return param;

	}

	public TestParam objectParamAndReturn2(TestParam param) {
		if (param != null) {
		} else {
			return null;
		}

		if (0 > param.getNum1()) {
			param.setNum1(param.getNum1() * -1);
		}

		if (param.getTxt1().equals("")) {
			param.setTxt1("txt1");
		}

		return param;

	}

	public String instanceVariables() {
		if (this.simpleType1 == null) {
			simpleType1 = "simpleType1";
		}

		if (simpleType2 < 0) {
			simpleType2 = 0;
		}

		return simpleType1 + simpleType2;
	}

	public String instanceObjectVariables() {
		if (testParam != null) {
			if (testParam.getTxt1().length() > 0) {
				return ">0";
			} else {
				return "<0";
			}
		}

		return "";
	}

	public int externalFunction() {
		BLSubClass boSubClass = new BLSubClass();
		boolean doSmth2 = boSubClass.doSmth2("", "", "", true);

		if (doSmth2) {
			return 1;
		}

		return -1;
	}

	public double internalFunction(String funktion, double num1, double num2) {
		if ("mulitply".equals(funktion) || "m".equals(funktion)) {
			return num1 * num2;
		} else if (funktion != null && funktion.equals("add")) {
			return num1 + num2;
		} else {
			ValidationResults.addInformation("function not available");
			if (privateMethod(1)) {
				return -1;
			}
		}

		return 0;
	}

}
