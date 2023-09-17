package programa_filmes;

import java.util.Scanner;

public class Testa_programa {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		Filmes_infos filme = new Filmes_infos(null, 0);
		int opçao;
		
		System.out.println("\u001B[34m---Minha lista de filmes assistidos---\n\u001B[0m");
		System.out.println("1 - Adicionar\n2 - Excluir\n3 - Listar todos os filmes\n4 - Listar os melhores filmes\n0 - Sair\n");
		
		do {
			System.out.println("Digite sua opção: \n");
			opçao = leitor.nextInt();
			leitor.nextLine();
			
			switch (opçao) {
			case 1:
				try {
					System.out.println("Digite o filme: ");
					filme.setTitulo(leitor.nextLine().toLowerCase());
					System.out.println("Digite a nota do filme: ");
					filme.setNota(leitor.nextInt());
					if(filme.getNota() < 0) {
						throw new ArithmeticException("Não é possível dar uma nota menor que 0.");
					}
					filme.adicionar();
					System.out.println("Filme adicionado!");
				}catch (ArithmeticException e) {
					System.out.println("Erro: " + e.getMessage());
				}
				break;
			case 2:
				System.out.println("Filme a ser excluído: ");
				filme.setTitulo(leitor.nextLine().toLowerCase());
				filme.excluir();
				break;
			case 3:
				filme.listar();
				break;
			case 4:
				filme.listar_melhores();
			}
			
		}while (opçao != 0);
	
		System.out.println("Programa finalizado!");
		
		leitor.close();
	}

}
