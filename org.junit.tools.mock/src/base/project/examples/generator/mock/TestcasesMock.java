package base.project.examples.generator.mock;

import javax.annotation.Generated;

import mockit.Invocation;
import mockit.Mock;
import mockit.MockUp;

import org.junit.tools.configuration.base.MethodRef;

import base.project.examples.generator.Testcases;

/** Mock for { @link Testcases } */
@Generated(value = "org.junit-tools-1.0.1")
public class TestcasesMock extends MockUp<Testcases> {

	private boolean equalQueck2Mocked = false;
	private int equalQueck2Executions = 0;
	private boolean equalQueck2ReturnValue = false;
	private boolean equalQueckMocked = false;
	private int equalQueckExecutions = 0;
	private boolean equalQueckReturnValue = false;

	public static TestcasesMock create() {
		return new TestcasesMock();
	}

	@MethodRef(name = "equalQueck2", signature = "(I)Z")
	@Mock
	boolean equalQueck2(Invocation inv, int param) {
		equalQueck2Executions++;
		if (equalQueck2Mocked) {
			return equalQueck2ReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockEqualQueck2(boolean returnValue) {
		equalQueck2ReturnValue = returnValue;
		equalQueck2Mocked = true;
		equalQueck2Executions = 0;
	}

	public int getEqualQueck2Executions() {
		return equalQueck2Executions;
	}

	public boolean isEqualQueck2Executed() {
		return equalQueck2Executions > 0;
	}

	public void resetMockEqualQueck2() {
		equalQueck2Mocked = false;
		equalQueck2Executions = 0;
	}

	@MethodRef(name = "equalQueck", signature = "(I)Z")
	@Mock
	boolean equalQueck(Invocation inv, int param) {
		equalQueckExecutions++;
		if (equalQueckMocked) {
			return equalQueckReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockEqualQueck(boolean returnValue) {
		equalQueckReturnValue = returnValue;
		equalQueckMocked = true;
		equalQueckExecutions = 0;
	}

	public int getEqualQueckExecutions() {
		return equalQueckExecutions;
	}

	public boolean isEqualQueckExecuted() {
		return equalQueckExecutions > 0;
	}

	public void resetMockEqualQueck() {
		equalQueckMocked = false;
		equalQueckExecutions = 0;
	}

	public void resetAllMocks() {
		resetMockEqualQueck2();
		resetMockEqualQueck();
	}
}