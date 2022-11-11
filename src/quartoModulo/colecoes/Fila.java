package quartoModulo.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
	//offer e add adicionam elementos na fila.
	//A diferença é o comportamento quando a fila está cheia,
	//onde o add retorna False e o offer retornará uma exceção.
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

	//peek e element pegam o conteúdo da fila (sem remover).
	//A diferença ocorre quando a fila está vazia,
	//onde peek irá retornar null e o element retornará uma exceção.
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
    
	//remove e poll removem o próximo elemento da fila.
	//A diferença ocorre quando a fila está vazia,
	//onde poll irá retornar null e remove retornará uma exceção.	
		
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.remove()); 
		
	//fila.size();
	//fila.clear(); Limpa a fila.
	//fila.isEmpty(); Se a fila está ou não vazia.	
	//fila.contains(...);	
		
		
	}

}
