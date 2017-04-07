
import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;

@Generated(value = "org.junit-tools-1.0.4")
public class SomeClassDefaultPackageTest {

	private SomeClassDefaultPackage createTestSubject() {
		return new SomeClassDefaultPackage();
	}

	@MethodRef(name = "someMethod", signature = "()V")
	@Test
	public void testSomeMethod() throws Exception {
		SomeClassDefaultPackage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.someMethod();
	}

	@MethodRef(name = "newMethod", signature = "()V")
	@Test
	public void testNewMethod() throws Exception {
		SomeClassDefaultPackage testSubject;

		// default test
		testSubject = createTestSubject();
		Deencapsulation.invoke(testSubject, "newMethod");
	}
}