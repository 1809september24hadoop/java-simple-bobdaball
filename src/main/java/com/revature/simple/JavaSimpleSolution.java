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
		double doubleNum = n;
		
		double flooredNum = Math.floor(doubleNum);
		
		return doubleNum - flooredNum == 0 ? true : false;
	}

	@Override
	public boolean isAllEven(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (!isEven(num)) {
				return false;
			}
		}
		return true;
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
		
		int answer = 1;
		
		for (int counter = n; counter > 0; counter--) {
			answer *= counter;
		}
		
		return answer;
	}

	@Override
	public int[] rotateLeft(int[] array, int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		int actualSpin = n % array.length;
		int restSize = array.length - actualSpin;
		int[] partOne = new int[actualSpin];
		int[] partTwo = new int[restSize];
		
		for (int i = 0; i < actualSpin; i++) {
			partOne[i] = array[i];
		}
		
		for (int i = 0; i < restSize; i++) {
			partTwo[i] = array[restSize + i];
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i < actualSpin) {
				array[i] = partOne[i];
			} else {
				array[i] = partTwo[i - actualSpin];
			}
		}
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
