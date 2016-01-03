package base.project.examples.logic;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

import testbase.TestBase;

@Generated(value = "org.unit.testmgmt-1.0.0")
@Testprio
public class AnyClassTest extends TestBase {

	private AnyClass createTestSubject() {
		return new AnyClass();
	}

	@MethodRef(name = "anyMethod", signature = "()V")
	@Test
	public void testAnyMethod() throws Exception {
		AnyClass testSubject;

		// test 1
		testSubject = createTestSubject();
		testSubject.anyMethod();
	}
}