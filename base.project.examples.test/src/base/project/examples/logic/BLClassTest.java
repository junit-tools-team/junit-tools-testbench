package base.project.examples.logic;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

import testbase.TestBase;
import base.project.examples.testbase.Deencapsulation;

@Generated(value = "org.junit-tools-1.0.1")
@Testprio
public class BLClassTest extends TestBase {

	private BLClass createTestSubject() {
		return new BLClass(new ValueObject(0, ""), new BLSubClass());
	}

	@MethodRef(name = "doSmthPrivate17", signature = "(QString;QString;)V")
	@Test
	public void testDoSmthPrivate17() throws Exception {
		BLClass testSubject;
		String val1 = "";
		String val2 = "";

		// default test
		testSubject = createTestSubject();
		Deencapsulation.invoke(testSubject, "doSmthPrivate17", new Object[] {
				val1, val2 });
	}
}