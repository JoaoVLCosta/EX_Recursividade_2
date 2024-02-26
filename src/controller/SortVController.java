package controller;

public class SortVController {

	public SortVController() {
		
		super();
		
	}

	public int fnSortV(int[] vetor, int tamanho, int menor) {
		
		//A condição de parada se da ao tamanho observado do vetor alcançar 0. Assim o valot contido na posição 0 é retornado.
		
		if(tamanho == 0) {
			
			return vetor[0];
			
		} else {
			
			int repasse = tamanho - 1;
			
			int valor = fnSortV(vetor, repasse, vetor[repasse]);
			
			if(valor > menor) {
				
				return menor;
				
			} else {
			
				return valor;
				
			}
	//O retorno se da pela execução de um teste lógico que observa qual varável é a maior entre a retornada pela função e a observada atualmente no vetor.
		}	
	}
}