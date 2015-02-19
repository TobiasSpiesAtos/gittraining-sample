package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * @author a149605
 *
 */
public class Divide extends AbstractOperation implements BinaryOperation{

	/* (non-Javadoc)
	 * @see org.eclipse.example.calc.Operation#getName()
	 */
	@Override
	public String getName() {
		return "/";
	}

	@Override
	public float perform(float arg1, float arg2) {
		return arg1/arg2;
	}

}
