package sec04.exam05.quiz;

import java.util.Iterator;

public class Calculator {
	int sum;
	
	
	
	int getEvenTotal(int begin, int end) {
		for (int i = begin; i <= end; i++) {
			if(i%2==0) {
				sum += i;	
			}
		}return sum;
	}
}
