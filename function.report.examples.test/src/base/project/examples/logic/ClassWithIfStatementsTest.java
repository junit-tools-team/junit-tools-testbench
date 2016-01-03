package base.project.examples.logic;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

import testbase.TestBase;

@Generated(value = "org.unit.testmgmt-1.0.0")
@Testprio
public class ClassWithIfStatementsTest extends TestBase {

	public void testOneIfSt() throws Exception {
		ClassWithIfStatements testSubject;
		String var1;
		String var2;
		String var3;
		String result;

		// test 1
		testSubject = createTestSubject();
		var1 = "";
		var2 = "";
		var3 = "";
		result = testSubject.oneIfSt(var1, var2, var3);
		Assert.assertEquals("", result);
	}

	private ClassWithIfStatements createTestSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	@MethodRef(name = "twoIfSt", signature = "(QString;DD)D")
	@Test
	public void testTwoIfSt() throws Exception {
		ClassWithIfStatements testSubject;
		String funktion;
		double num1;
		double num2;
		double result;

		// test 1
		testSubject = createTestSubject();
		funktion = "";
		num1 = 0.0;
		num2 = 0.0;
		result = testSubject.twoIfSt(funktion, num1, num2);
		Assert.assertEquals(0.0, result, 0);

		// test 2
		testSubject = createTestSubject();
		funktion = "mulitply";
		result = testSubject.twoIfSt(funktion, num1, num2);
		Assert.assertEquals(0.0, result, 0);

		// test 3
		testSubject = createTestSubject();
		funktion = "m";
		result = testSubject.twoIfSt(funktion, num1, num2);
		Assert.assertEquals(0.0, result, 0);

		// test 4
		testSubject = createTestSubject();
		funktion = "add";
		result = testSubject.twoIfSt(funktion, num1, num2);
		Assert.assertEquals(0.0, result, 0);
	}

	@MethodRef(name = "oneIfOnlyNullCheck3", signature = "(QString;QString;)V")
	@Test
	public void testOneIfOnlyNullCheck3() throws Exception {
		ClassWithIfStatements testSubject;
		String string;
		String string2;

		// test 1
		testSubject = createTestSubject();
		string = "";
		string2 = "";
		testSubject.oneIfOnlyNullCheck3(string, string2);
	}
}