package programa_filmes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filmes_infos extends Filmes implements Funcionalidades {
	
	int nota;
	
	Map<String, Integer> filmes;
	List<String> ordemInsercao;
	
	public Filmes_infos(String titulo, int nota) {
		super(titulo);
		this.nota = nota;
		filmes = new HashMap<>();
		ordemInsercao = new ArrayList<>();
		
	}
		
	
	public int getNota() {
		return nota;
	}



	public void setNota(int nota) {
		this.nota = nota;
	}


	@Override
	public void adicionar() {
		filmes.put(titulo, nota);
		ordemInsercao.add(titulo);
	}
	
	@Override
	public void excluir() {
		if (filmes.containsKey(titulo)) {
			filmes.remove(titulo);
			ordemInsercao.remove(titulo);
			System.out.println("Filme excluído com sucesso!");
		}else {
			System.out.println("Filme não encontrado!");
		}
		
	}
	
	@Override
	public void listar() {
		for (String titulo : ordemInsercao) {
			nota = filmes.get(titulo);
			System.out.println("Título do filme: " + titulo + " - Nota: " + nota);
		}
	}
	
	@Override
	public int listar_melhores() {
		System.out.println("Melhores filmes da sua lista: ");
		for (String titulo : ordemInsercao) {
			nota = filmes.get(titulo);
			if (nota == 10) {
				System.out.println("Filme: " + titulo);
			}
		}
		return 0;
	}
	
}
