package comm.always.matrix;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items[] = new int[10];
		for(int i = 0; i < items.length; i++) {
			items[i] = (int)(Math.random()*(10000-1000 + 1));
		}
		System.out.println(Arrays.toString(items));
	}

}
