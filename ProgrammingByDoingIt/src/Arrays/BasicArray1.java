package Arrays;

public class BasicArray1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i = 0;i<array.length;i++) {
			array[i]=-113;
		}
		for(int j = 0;j<array.length;j++) {
			System.out.println("Slot "+j+" contains a "+array[j]);
		}
	}

}
