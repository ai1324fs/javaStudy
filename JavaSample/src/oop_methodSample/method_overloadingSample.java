package oop_methodSample;

/* method
 * 
 * 
 */


public class method_overloadingSample {

	
		
		
		public int hap(int startNumber, int EndNumber) { // class method
			int sum = 0;// 1 , 3 , 6, 10....
			
			do {
				sum+=startNumber;
				startNumber+=1; 
			}while (startNumber <= EndNumber); 
			return sum; 
		}

		
		public int hap() {
			int sum2 = 0;
			int startNumber = 1;
			int EndNumber = 100;
			
			do {
				sum2+=startNumber;
				startNumber+=2;		
			}while(startNumber <= EndNumber);
			return sum2;
		}
		
		
		public int hap(int EndNumber) {
			int sum3 = 0;
			int startNumber = 0;
			do { 
				sum3+=startNumber; 
				startNumber+=2; 
			}while(startNumber <= EndNumber);
			return sum3;
		}
		
	
		public static void main(String[] args) {	//1200
			
			method_overloadingSample mds = new method_overloadingSample();
			
			int startNumber = 1;
			int EndNumber = 100;
								
			int sum = mds.hap(startNumber, EndNumber);
			System.out.println("1~100: " + sum);
			System.out.println("========1~100사이의 합=========");

			int sum2 = mds.hap();
			System.out.println(sum2);
			System.out.println("==========홀수의 합===========");
			
			int sum3 = mds.hap(EndNumber);
			System.out.println(sum3);
		}
	}
