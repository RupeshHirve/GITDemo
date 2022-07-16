package arrays_and_strings;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{10,20},{30,40},{50,60}};
		
		for (int i[] : a) {
			for(int j:i) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
