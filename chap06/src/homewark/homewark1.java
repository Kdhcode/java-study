package homewark;

public class homewark1 {

	public static void main(String[] args) {
		int[] heights = {152, 180, 165, 158, 171};

		for (int i = 0; i < heights.length - 1; i++) { // 최대 n-1회전이 필요
			// i를 빼주는 이유? 1회전 돌때마다 마지막 정렬된 요소는 비교하지 않아도 됨
			for (int j = 0; j < heights.length - 1 - i; j++) {  
				if (heights[j] > heights[j + 1]) {
					// 두 값을 교환
					int temp = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < heights.length; i++) {
			if (i > 0) System.out.print(", "); 
			System.out.print(heights[i]);
		}
	}
}