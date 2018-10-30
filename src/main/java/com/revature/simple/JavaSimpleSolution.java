package com.revature.simple;

import java.util.ArrayDeque;
import java.util.Deque;

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
		byte byteNum = (byte) n;
		
		
		return byteNum;
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
		double averageNum = array.length;
		
		return total / averageNum;
	}

	@Override
	public int max(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		int maxNum = array[0];
		
		for (int i = 1; i < array.length; i++) {
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
		
		for (int index = array.length - 1; index > 1; index--) {
			
			int maxNum = findMaxInt(array, index); 
			int tempNum = array[maxNum];
	
			array[maxNum] = array[index];
			array[index] = tempNum;
		}	
		return null;
	}

	public int findMaxInt(int[] arr, int maxInt) {
		if (maxInt < 1) {
			return 0;
		}
		int max = 0;
		
		
		for (int i = 0; i <= maxInt; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}

		return max;
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
		String yes = "Is Prime";
		String no = "Not Prime";
		String answer = yes;
		
		
		answer =  isEven(n) ? no : yes;
		
		answer = n % 3 == 0 || answer == no ? no : yes;
		
		for (int i = 5; i * i <= n; i += 6) {
			answer = (n % i == 0 || (i + 2) == 0 ) ? no : yes;
		}

		return answer;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		int strSize = brackets.length();
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (int i = 0; i < strSize; i++) {
			char cha = brackets.charAt(i);
			
			if (cha == ")".charAt(0)) {
				if (stack.poll()!="(".charAt(0)) {
					return false;
				}
			} else if (cha == "]".charAt(0)) {
				if (stack.poll()!="[".charAt(0)) {
					return false;
				}
			} else if (cha == "}".charAt(0)) {
				if (stack.poll()!="{".charAt(0)) {
					return false;
				}
			} else {				
				stack.push(cha);
			}
		}
		return stack.size() == 0 ? true : false;
	}

}
