package base.project.examples.logic;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.junit.tools.configuration.base.Testprio;

@Generated(value = "org.unit.testmgmt-1.0.0")
@Testprio
public class SwitchClassNavigationTest {

	private SwitchClassNavigation createTestSubject() {
		return new SwitchClassNavigation();
	}

	@MethodRef(name = "methode6", signature = "()V")
	@Test
	public void testMethode6() throws Exception {
		SwitchClassNavigation testSubject;

		// test 1
		testSubject = createTestSubject();
		testSubject.methode6();
	}

	@MethodRef(name = "methode5", signature = "()V")
	@Test
	public void testMethode5() throws Exception {
		SwitchClassNavigation testSubject;

		// test 1
		testSubject = createTestSubject();
		testSubject.methode5();
	}

	@MethodRef(name = "methode4", signature = "()V")
	@Test
	public void testMethode4() throws Exception {
		SwitchClassNavigation testSubject;

		// test 1
		testSubject = createTestSubject();
		testSubject.methode4();
	}

	@MethodRef(name = "methode1", signature = "(I)V")
	@Test
	public void testMethode1() throws Exception {
		SwitchClassNavigation testSubject;

		// test 1
		testSubject = createTestSubject();
		testSubject.methode1(5);
	}

	@MethodRef(name = "methode3_1", signature = "()V")
	@Test
	public void testMethode3_1() throws Exception {
		SwitchClassNavigation testSubject;

		// test 1
		testSubject = createTestSubject();
		testSubject.methode3_1();
	}

}