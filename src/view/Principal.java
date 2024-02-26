package view;
import controller.SortVController;
public class Principal {

	public static void main(String[] args) {
		
		SortVController svc = new SortVController();
		
		int[] vetor = {12, 3, 4, 2, 6, 11, 7, 5, 20, 15};
		int tamanho = (vetor.length) - 1;
		int menor = vetor[tamanho];
		
		int resultado = svc.fnSortV(vetor, tamanho, menor);
		
		System.out.println(resultado);
		
	}
	
}
