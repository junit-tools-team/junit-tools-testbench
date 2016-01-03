package base.project.examples.logic;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

import testbase.TestBase;

@Generated(value = "org.unit.testmgmt-1.0.0")
@Testprio
public class BLSubClassTest extends TestBase {

	private BLSubClass createTestSubject() {
		return new BLSubClass(new ValueObject(0, ""));
	}

	@MethodRef(name = "doSmth2", signature = "(QString;QString;QString;Z)Z")
	@Test
	public void testDoSmth2() throws Exception {
		BLSubClass testSubject;
		String test = "";
		String test2 = "";
		String test3 = "";
		boolean test4 = false;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.doSmth2(test, test2, test3, test4);
	}

}