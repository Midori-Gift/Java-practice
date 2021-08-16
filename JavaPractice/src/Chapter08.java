
public class Chapter08 {
//	課題 01
//	public static void main(String[] args) {
//		int number01 = 1;
//		while(number01 <= 5 ){
//			number01*=number01;
//			System.out.println(number01);
//		}
//	}

//	課題 02
//	public static void main(String[] args) {
//		int[] array = {1, 2, 3, 4};
//
//		for (int number02 : array) {
//			System.out.println("For =" + number02);
//		}
//	}
	
//	課題 03
//	public static void main(String[] args) {
//		int[] array = {1, 2, 3, 4};
//		
//		for(int number02 = array) {
//			System.out.println();
//		}
//	}
	
	
	 public static void main(String[] args) {
	        // 1.「while」文
	        int num = 1;
	        while (num < 5) {
	            System.out.println(num * num);
	            num++;
	        }
	        // 2. 通常「for」文
	        int array[] = { 1, 4, 14, 25 };
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	        // 3. 拡張「for」文
	        for (int val : array) {
	            if (val % 2 == 0) {
	                continue;
	            }
	            System.out.println(val);
	        }
	    }
	}


	
