package controller;

import model.Lista;

public class ParImparControle {
	
	Lista<Integer>[] pi = new Lista [2]; 

	public ParImparControle() {
		int tamanho = pi.length;
		for (int i = 0; i< tamanho; i++) {
			pi[i] = new Lista<Integer>();
		}
	}
	
	private int hash(int valor){
		int hash = valor % 2;
		return hash;
	}
	
	public void add(int valor) throws Exception {
		int hash = hash(valor);
		Lista<Integer> l = pi[hash];
		if (l.isEmpty()) {
			l.addFirst(valor);
		}
		else {
			l.addLast(valor);
		}
		
	}
	
	public void list() throws Exception {
		int tamanhoL = pi.length;
		for (int i = 0; i < tamanhoL; i++) {
			Lista<Integer> l = pi[i];
			int tamanho = l.size();
			System.out.print("Linha " + i + ": ");
			for (int j = 0;j<tamanho;j++) {
				System.out.print(l.get(j)+" -> ");
			}
			System.out.print("NULL\n");
			
		}
	}
}
