package base.project.examples.generator;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

@Generated(value = "org.junit-tools-1.0.1")
@Testprio
public class TestcasesTest {

	private Testcases createTestSubject() {
		return new Testcases();
	}

	@MethodRef(name = "equalQueck", signature = "(I)Z")
	@Test
	public void testEqualQueck() throws Exception {
		Testcases testSubject;
		int param = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param = 0;
		result = testSubject.equalQueck(param);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param = 1;
		result = testSubject.equalQueck(param);
		Assert.assertEquals(true, result);
	}

	@MethodRef(name = "equalQueck2", signature = "(I)Z")
	@Test
	public void testEqualQueck2() throws Exception {
		Testcases testSubject;
		int param = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param = 0;
		result = testSubject.equalQueck2(param);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param = 1;
		result = testSubject.equalQueck2(param);
		Assert.assertEquals(false, result);
	}

	@MethodRef(name = "andCheck2", signature = "(QString;QString;)Z")
	@Test
	public void testAndCheck2() throws Exception {
		Testcases testSubject;
		String param1 = "";
		String param2 = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param1 = null;
		param2 = null;
		result = testSubject.andCheck2(param1, param2);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param1 = "";
		param2 = null;
		result = testSubject.andCheck2(param1, param2);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		param2 = null;
		param1 = null;
		result = testSubject.andCheck2(param1, param2);
		Assert.assertEquals(false, result);

		// test 4
		testSubject = createTestSubject();
		param2 = "";
		param1 = null;
		result = testSubject.andCheck2(param1, param2);
		Assert.assertEquals(false, result);
	}

	@MethodRef(name = "andCheck", signature = "(QString;QString;)Z")
	@Test
	public void testAndCheck() throws Exception {
		Testcases testSubject;
		String param1 = "";
		String param2 = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param1 = null;
		param2 = null;
		result = testSubject.andCheck(param1, param2);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param1 = "";
		param2 = null;
		result = testSubject.andCheck(param1, param2);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		param2 = null;
		param1 = null;
		result = testSubject.andCheck(param1, param2);
		Assert.assertEquals(false, result);

		// test 4
		testSubject = createTestSubject();
		param2 = "";
		param1 = null;
		result = testSubject.andCheck(param1, param2);
		Assert.assertEquals(false, result);
	}

	@MethodRef(name = "equalQueck3", signature = "(D)Z")
	@Test
	public void testEqualQueck3() throws Exception {
		Testcases testSubject;
		double param = 0.0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param = 0;
		result = testSubject.equalQueck3(param);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param = 0.0;
		result = testSubject.equalQueck3(param);
		Assert.assertEquals(false, result);
	}

	@MethodRef(name = "equalQueck4", signature = "(B)Z")
	@Test
	public void testEqualQueck4() throws Exception {
		Testcases testSubject;
		byte param = ' ';
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.equalQueck4(param);
	}

	@MethodRef(name = "nullCheckNeg2", signature = "(QString;)Z")
	@Test
	public void testNullCheckNeg2() throws Exception {
		Testcases testSubject;
		String param = "";
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param = null;
		result = testSubject.nullCheckNeg2(param);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param = "";
		result = testSubject.nullCheckNeg2(param);
		Assert.assertEquals(false, result);
	}

	@MethodRef(name = "equalQueck5", signature = "(C)Z")
	@Test
	public void testEqualQueck5() throws Exception {
		Testcases testSubject;
		char param = ' ';
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.equalQueck5(param);
	}

	@MethodRef(name = "lowerThanCheck3", signature = "(I)Z")
	@Test
	public void testLowerThanCheck3() throws Exception {
		Testcases testSubject;
		int param = 0;
		boolean result;

		// test 1
		testSubject = createTestSubject();
		param = 5;
		result = testSubject.lowerThanCheck3(param);
		Assert.assertEquals(false, result);

		// test 2
		testSubject = createTestSubject();
		param = 4;
		result = testSubject.lowerThanCheck3(param);
		Assert.assertEquals(false, result);

		// test 3
		testSubject = createTestSubject();
		param = 6;
		result = testSubject.lowerThanCheck3(param);
		Assert.assertEquals(false, result);
	}
}