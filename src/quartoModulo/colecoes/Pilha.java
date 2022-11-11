package quartoModulo.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop()); // Se a pilha estiver vazia
										  // irá gerar uma exceção.	
		
		//fila.size();
		//fila.clear(); Limpa a fila.
		//fila.isEmpty(); Se a fila está ou não vazia.	
		//fila.contains(...);
		
		
		
	}

}
