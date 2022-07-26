package Collection;
/* Generic : 5.X 이전에 소스파일과 그 이후에 파일의 자리를 말합니다.
 * - 잘못된 타입이 사용되는 것을 방지 하기 위해서 ...
 * - 타입 파라메터를 이용하여 코드 작성싱 구체적인 타입으로 코드를 작성 하도록 합니다.
 * - 데이터 처리 능력을 향상 시키기 위하여 만들어진 틀
 * - 장점 : 하나의 코드를 여러 타입에 대하여 사용할 수 있는 기술 입니다.
 *   - 클래스에 사용할 타입을 클래스 디자인시에 지정하는 것이 아니라 
 *     클래스를 사용하는 시점에서 지정한 후에 사용하는 기술 입니다.
 *   - 컴파일시에 강한 타입 체크를 합니다. => 사전에 오류 방지
 *   - 제네릭은 클래스 형이 아니라 캐스팅을 위한 표시 입니다.
 *   
 *   Vector v = new Vector();
 *   Vector<String> v = new Vector<String>();
 *   Vector<Integer> v= new Vector<Integer>();
 *   Vector<Integer> v = new Vector();
 *   
 */
public class Sample1 {
	/*
	public static void pringArray(Integer[] intArray) {
		//가변 for문
		for(Integer element : intArray) {
			System.out.println("intArray: " + element);
		}
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("intArray: " + intArray[i]);
		}
	}
	
	private static void pringArray(double[] doubleArray) {
		for(Double element : doubleArray) {
			System.out.println("doubleArray: " + element);
		}
	}
	
	private static void printArray(String[] strArray) {
		for(String element : strArray) {
			System.out.println("strArray: " + element);
		}
	}
	
	
	//Object type
	@SuppressWarnings("unused")
	private static void printArray(Object[] OArray) {
		for(Object element : OArray) {
			System.out.println("OArray: " + element);
		}
	}*/
	
	//Generic을 적용: 프로그램의 처리 속도가 아주 좋아집니다.
	private static <T> void printArray(T[] TArray) {
		for(T element : TArray) {
			System.out.println("T Array: " + element);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {	
		
		//제네릭의 경우, 메소드 오버로딩(적용됨)
		Integer[] intArray = {10, 20, 30, 40, 50};
		printArray(intArray);
		
		Double[] doubleArray = {10.1, 20.2, 30.3, 40.4, 50.5};
		printArray(doubleArray);
		
		String[] strArray = {"white", "blue", "red", "black", "green"};
		printArray(strArray);
		
	}





	

}
