
public class Forarr {

	public static void main(String[] args) {
		String[] arr = new String[10];
		int[] index = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int a = (int)((Math.random() * 10) + 1);
			index[i] = a;
			arr[i] = "random Number " + a;
			
		}
		
		for(String str : arr) {
			System.out.println(str);
		}

		System.out.println();
	}

}
