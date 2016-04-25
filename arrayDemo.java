import java.util.Scanner;
public class arrayDemo {
	
	static int[] sort(int[] a) {
		int val;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					val = a[i];
					a[i] = a[j];
					a[j] = val;
				}
			}
		}
		return a;	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of value for array: ");
		int n = input.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value for index " + i + ": ");
			a[i] = input.nextInt();
		}
		
		a = sort(a);
		
		System.out.print("Sorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
