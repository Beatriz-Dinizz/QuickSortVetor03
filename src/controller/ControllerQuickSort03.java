package controller;

import br.edu.fateczl.QuickSort.OrdenacaoQuickSort;

public class ControllerQuickSort03 {

	public ControllerQuickSort03() {
		super();
	}
	
	public void ordenaVetorQuickSort03() {
		OrdenacaoQuickSort quickSortEx03 = new OrdenacaoQuickSort();
		
		int[] vetor = {31, 32, 33, 34, 99, 98, 97, 96};
		
		vetor = quickSortEx03.quickSort(vetor, 0, vetor.length - 1);
		
		for(int valor : vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}
	}
}
