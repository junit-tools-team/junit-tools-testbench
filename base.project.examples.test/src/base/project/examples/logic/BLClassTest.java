package base.project.examples.logic;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

@Generated(value = "org.junit-tools-1.0.1")
@Testprio
public class BLClassTest {

	private BLClass createTestSubject() {
		return new BLClass(new ValueObject(0, ""), new BLSubClass());
	}

	@MethodRef(name = "calculateLongNumber", signature = "(JJ)J")
	@Test
	public void testCalculateLongNumber() throws Exception {
		BLClass testSubject;
		long number1 = 0L;
		long number2 = 0L;
		long result;

		// test 1
		testSubject = createTestSubject();
		number1 = 0;
		result = testSubject.calculateLongNumber(number1, number2);
		Assert.assertEquals(0L, result, 0);

		// test 2
		testSubject = createTestSubject();
		number1 = -1;
		result = testSubject.calculateLongNumber(number1, number2);
		Assert.assertEquals(0L, result, 0);

		// test 3
		testSubject = createTestSubject();
		number1 = 1;
		result = testSubject.calculateLongNumber(number1, number2);
		Assert.assertEquals(0L, result, 0);
	}

	@MethodRef(name = "calculateFloatNumber", signature = "(FF)F")
	@Test
	public void testCalculateFloatNumber() throws Exception {
		BLClass testSubject;
		float number1 = 0.0f;
		float number2 = 0.0f;
		float result;

		// test 1
		testSubject = createTestSubject();
		number1 = 0;
		result = testSubject.calculateFloatNumber(number1, number2);
		Assert.assertEquals(0.0f, result, 0);

		// test 2
		testSubject = createTestSubject();
		number1 = -1;
		result = testSubject.calculateFloatNumber(number1, number2);
		Assert.assertEquals(0.0f, result, 0);

		// test 3
		testSubject = createTestSubject();
		number1 = 1;
		result = testSubject.calculateFloatNumber(number1, number2);
		Assert.assertEquals(0.0f, result, 0);
	}

	@MethodRef(name = "calculateNumber", signature = "(II)I")
	@Test
	public void testCalculateNumber() throws Exception {
		BLClass testSubject;
		int number1 = 0;
		int number2 = 0;
		int result;

		// test 1
		testSubject = createTestSubject();
		number1 = 0;
		result = testSubject.calculateNumber(number1, number2);
		Assert.assertEquals(0, result, 0);

		// test 2
		testSubject = createTestSubject();
		number1 = -1;
		result = testSubject.calculateNumber(number1, number2);
		Assert.assertEquals(0, result, 0);

		// test 3
		testSubject = createTestSubject();
		number1 = 1;
		result = testSubject.calculateNumber(number1, number2);
		Assert.assertEquals(0, result, 0);
	}

	@MethodRef(name = "calculate", signature = "(II)I")
	@Test
	public void testCalculate() throws Exception {
		BLClass testSubject;
		int num1 = 0;
		int num2 = 0;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.calculate(num1, num2);
	}
}