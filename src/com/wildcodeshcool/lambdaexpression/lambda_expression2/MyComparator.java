package com.wildcodeshcool.lambdaexpression.lambda_expression2;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}

}
