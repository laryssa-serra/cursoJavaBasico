package cursoLoianeTraining;

import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		for(int i = 0; i <vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		for(int i = 0; i <vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}		
	}

}
