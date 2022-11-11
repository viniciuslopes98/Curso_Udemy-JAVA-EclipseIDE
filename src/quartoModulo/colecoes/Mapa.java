package quartoModulo.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		//put além de adicionar também atualiza o conteúdo quando contém
		//o mesmo valor de chave indicado, conforme o exemplo abaixo:	
		
		usuarios.put(1, "Roberto");
		
		usuarios.put(1, "Ricardo");
		
		usuarios.put(1, "Vinicius");
		
	   //Indicando diferentes valores de chave ele apenas adiciona,
	   //conforme o exemplo abaixo:
	//	           -- v --
	//				  V
		
		usuarios.put( 1 , "Roberto");
		usuarios.put( 20 , "Ricardolo");
		usuarios.put( 3 , "Rafael");
		usuarios.put( 4 , "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		//Pra retornar o conjunto das chaves.(Não ordenado.)
		System.out.println(usuarios.keySet()); 
		
		//Pra retornar o conjunto dos valores.(Não ordenado.)
		System.out.println(usuarios.values()); 
		
		//Pra retornar ambos os valores.(Não ordenado.)
		System.out.println(usuarios.entrySet());
		
		//Pra buscar por valor ou chave.
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		//Pra buscar o valor utilizando a chave do iten.
		System.out.println(usuarios.get(1));
		
		//Pra remover iten pela chave.(retorna o valor removido.)
		System.out.println(usuarios.remove(1));
		
		//Pra uma remoção mais precisa, utilizando chave e valor do
		//iten, onde irá retornar um valor booleano indicando se o 
		//iten foi removido ou não. Sendo:
		//        true = iten removido.
		//        false = iten não removido.                 
		System.out.println(usuarios.remove(20, "Ricardolo"));
		
		
		//Retorna todas as chaves do conjunto. 
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		//Retorna todos os valores do conjunto. 
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		//Retorna chave e valor de todos os itens.
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println("\n"+ registro.getKey());
			System.out.println(registro.getValue());
		
		}
		
		
		
		
		
		
		
		
		
	}

}
