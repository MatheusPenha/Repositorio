package Questões_Capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questão_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		//* Aqui você irá entrar com a quantidade desejada para fazer o desenho da escada. *//

		System.out.print("Digite a quantidade de vezes: ");
		int qtdDegraus = entrada.nextInt();

		 
		//* aqui por meio dessa estrutura que vai do zero até quantidade desejada pelo usuario.*//
		for (int i = 0;  i <= qtdDegraus; ++i) {
		degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i));
		}

		 //* aqui ele fará a fila até o topo. *// 

		for (String d : degraus ) {
		System.out.println(d);
		}
	}

}