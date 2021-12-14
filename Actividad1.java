package modulo3;

import java.util.Scanner;
import java.util.Arrays;

public class Actividad1 {

	public static void main(final String[] args) {
		int i;

		{

			System.out.println("Input the 5 numbers : ");

		}
		for (i = 0; i < 5; i++) {
			Scanner in = new Scanner(System.in);
			double n1 = in.nextDouble();
			double n2 = in.nextDouble();
			double n3 = in.nextDouble();
			double n4 = in.nextDouble();
			double n5 = in.nextDouble();

			System.out.println(n5 + " " + n4 + " " + n3 + " " + n2 + " " + n1);

			double[] arr = { n1, n2, n3, n4, n5 };

			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);

			double max = Double.max(n1, n2);
			max = Double.max(max, n3);
			max = Double.max(max, n4);
			max = Double.max(max, n5);

			double min = Double.min(n1, n2);
			min = Double.min(min, n3);
			min = Double.min(min, n4);
			min = Double.min(min, n5);

			double average = 0;
			for (double p : arr)
				average += p;
			average = average / arr.length;
			System.out.println(average + " " + max + " " + min);

		}

	}
}