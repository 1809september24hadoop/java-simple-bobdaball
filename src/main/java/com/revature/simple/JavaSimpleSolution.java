package com.revature.simple;

public class JavaSimpleSolution implements JavaSimple {

	@Override
	public int castToInt(double n) {
		// TODO Auto-generated method stub
		
		int intVer = (int) Math.round(n);
		return intVer;
	}

	@Override
	public byte castToByte(short n) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public double divide(double operandOne, double operandTwo) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		return operandOne / operandTwo;
	}

	@Override
	public boolean isEven(int n) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean isAllEven(int[] array) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double average(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		double total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return total / array.length;
	}

	@Override
	public int max(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		int maxNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
		}
		return maxNum;
	}

	@Override
	public int fibonacci(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		}
		int newNum = 1;
		int oldNum = 1;
		int latest = 2;
		
		for (int counter = 3; counter < n; counter++) {
			latest = newNum + oldNum;
			oldNum = newNum;
			newNum = latest;
		}
		return latest;
	}

	@Override
	public int[] sort(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int factorial(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] rotateLeft(int[] array, int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String isPrime(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

}
