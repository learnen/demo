import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		//冒泡排序
		int[] arr = {12,32,125,4,6,96,6,2,6,2,5,15,3,2}; //假如长度为14
			
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = i+1 ; j < arr.length ;j++) {
				
				if (arr[j] < arr[i]) {
					
//					arr[i] = arr[i] + arr[j];
//					
//					arr[j] = arr[i] - arr[j]; //arr[j] = arr[i]
//					
//					arr[i] = arr[i] - arr[j]; //arr[i] = arr[j]
					
					arr[i] = arr[i]^arr[j];
					
					arr[j] = arr[i]^arr[j]; //arr[j] = arr[i]
					
					arr[i] = arr[i]^arr[j]; //arr[i] = arr[j]
						
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
