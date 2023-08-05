package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de elementos que deseja inserir: ");
		int quantidade = sc.nextInt();

		double[] vetor = new double[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("\nValores digitados: ");
		double media = 0, soma = 0, cont = 0;
		for(double x: vetor) {
			System.out.printf("%.2f ", x);
			soma += x;
			cont++;
		}
		System.out.printf("\n\nSoma dos números digitados: %.2f%nMédia dos números digitados: %.2f%n", soma, soma / cont);
		sc.close();
	}

}
