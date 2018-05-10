
package Challanges;


public class chunkArray {
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5};

		int[][] result = chunk(inputArray, 2);

		for (int[] indexArray : result) {
			System.out.println(Arrays.toString(indexArray));
		}

	}

	public static int[][] chunk(int[] inputArray, int size) {
		int[] outputArray[] = {};
		int[] subArray = new int[5];
		
		for(int index = 0; index < inputArray.length; index++) {
			int x = subArray.length;
			System.out.println("Loop: " + index);
			
			if(subArray.length == size) {
				outputArray[outputArray.length] = subArray;
				subArray = new int[] {};
				subArray[subArray.length] = inputArray[index];
				System.out.println("success: 1");
				
			} else if(index == inputArray.length - 1) {
				outputArray[outputArray.length] = subArray;
				System.out.println("success: 2");
				
			} else {
				
				
				
				public stst {
				    void printType(byte x) {
				        System.out.println(x + " is an byte");
				    }
				    void printType(int x) {
				        System.out.println(x + " is an int");
				    }
				    void printType(float x) {
				        System.out.println(x + " is an float");
				    }
				    void printType(double x) {
				        System.out.println(x + " is an double");
				    }
				    void printType(char x) {
				        System.out.println(x + " is an char");
				    }
				}
				
				
				
				
				
				
				
				System.out.println(subLength);
				System.out.println(inputArray[index]);
				subArray[subArray.length] = inputArray[index];
				System.out.println("success: 3");
				
			}
		}
		
		for (int[] indexArray : outputArray) {
			System.out.println(Arrays.toString(indexArray));
		}

		
		return outputArray;
	}
}