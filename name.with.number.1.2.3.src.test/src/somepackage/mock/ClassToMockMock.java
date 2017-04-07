package somepackage.mock;

import javax.annotation.Generated;

import org.junit.tools.configuration.base.MethodRef;

import mockit.Invocation;
import mockit.Mock;
import mockit.MockUp;
import somepackage.ClassToMock;

/** Mock for { @link ClassToMock } */
@Generated(value = "org.junit-tools-1.0.5")
public class ClassToMockMock extends MockUp<ClassToMock> {

	private boolean doSomethingMocked = false;
	private int doSomethingExecutions = 0;

	public static ClassToMockMock create() {
		return new ClassToMockMock();
	}

	@MethodRef(name = "doSomething", signature = "()V")
	@Mock
	void doSomething(Invocation inv) {
		doSomethingExecutions++;
		if (doSomethingMocked) {
			return;
		}
		inv.proceed();
	}

	public void setUpMockDoSomething() {
		doSomethingMocked = true;
		doSomethingExecutions = 0;
	}

	public int getDoSomethingExecutions() {
		return doSomethingExecutions;
	}

	public boolean isDoSomethingExecuted() {
		return doSomethingExecutions > 0;
	}

	public void resetMockDoSomething() {
		doSomethingMocked = false;
		doSomethingExecutions = 0;
	}

	public void resetAllMocks() {
		resetMockDoSomething();
	}
}