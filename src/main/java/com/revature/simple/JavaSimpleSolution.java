package com.revature.simple;

import java.util.ArrayDeque;
import java.util.Deque;
//import org.apache.log4j.Logger;
import com.revature.simple.JavaSimpleSolution;

public class JavaSimpleSolution implements JavaSimple {

//	private static final Logger LOGGER = Logger.getLogger(JavaSimpleSolution.class);	
	
	public static void main(String[] args) {
		JavaSimpleSolution jss = new JavaSimpleSolution();
		
		//		LOGGER.info(jss.fibonacci(4));
		//	System.out.println(jss.factorial(3));
		//	System.out.println(jss.isPrime(51));
//			System.out.println(jss.balancedBrackets("(}]("));
	}
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
		int latest;
		
		for (int counter = 3; counter < n; counter++) {
			latest = newNum + oldNum;
			oldNum = newNum;
			newNum = latest;
		}
		return newNum + oldNum;
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
	public String isPrime(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		if (n < 0) {
			throw new IllegalArgumentException("int must be larger than 0!");
		}
		String yes = "Is Prime";
		String no = "Not Prime";
		String answer = yes;
		
		answer = n == 1 || n == 0 ? no : answer;
		answer =  n % 2 == 0 && n != 2 ? no : answer;
		answer = n % 3 == 0 && n != 3 ? no : answer;
		
		for (int i = 5; i * i <= n; i += 2) {
			answer = (n % i == 0 || (i + 2) == 0 ) ? no : answer;
		}

		return answer;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		int strSize = brackets.length();
		
		Deque<Character> stack = new ArrayDeque<Character>();
		String opening = "({[";
		String closing = "})]";
		
		for (int i = 0; i < strSize; i++) {
			char cha = brackets.charAt(i);
			String str = "" + cha;
			
			if (opening.contains(str)) {
				stack.push(cha);
			} else if (stack.size() == 0 && closing.contains(str)) {
				return false;
			} else if (closing.contains(str)) {
				// stack size exists and it contains closing brackets
				Character firstChar = stack.pop();
				
				if (cha == ')' && firstChar != '(') {
					return false;
				} else if (cha == ']' && firstChar != '[') {
					return false;
				} else if (cha == '}' && firstChar != '{') {
					return false;
				}
			}		

		}
		return stack.size() == 0 ? true : false;
	}

}
