package exemplos_arrays;

import java.util.Scanner;

public class Exemplo1_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = 5;
		int A[] = new int[n];
		int B[] = new int[n];

		System.out.println("Alterado via github")
	
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com um valor da posiçao: ");
			A[i] = scan.nextInt();
			B[i] = A[i];

		}

		System.out.println("VetorA ");
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + " ");
		}
		System.out.println("VetorB ");
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i] + " ");

		}
	}

}
