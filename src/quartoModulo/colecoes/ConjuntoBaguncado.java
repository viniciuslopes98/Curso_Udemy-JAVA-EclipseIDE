package quartoModulo.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	 HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		conjunto.add("Teste");//Não é possivel duplicar valor. Tamanho do conjunto ainda será 5.
		conjunto.add('x');//Não é possivel duplicar valor. Tamanho do conjunto ainda será 5.
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));//Retorno falso, não será feita a remoção pois o valor digitado não existe no conjunto.
		System.out.println(conjunto.remove("Teste"));//Retorno verdadeiro, valor removido do conjunto.
		System.out.println(conjunto.remove('x'));//Retorno verdadeiro, valor removido do conjunto.
	
		System.out.println("Tamanho é " + conjunto.size()); //Tamanho 3, pois foram removidos validamente 2 valores.
		
		System.out.println(conjunto.contains('x'));//Retorno falso, pois o valor 'x' foi removido logo acima.
		System.out.println(conjunto.contains(1)); //Retorno verdadeiro, contém o valor 1 no conjunto.
		System.out.println(conjunto.contains(true));//Retorno verdadeiro, contém o valor true no conjunto.
	
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//União entre dois conjuntos
		conjunto.retainAll(nums);//Reter os valores do conjunto informado entre os parenteses, fazendo a interseção dos valores de ambos os conjuntos.
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
}
}
