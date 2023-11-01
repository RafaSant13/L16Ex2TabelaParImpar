package view;

import controller.ParImparControle;

public class Principal {

	public static void main(String[] args) {
		ParImparControle pi = new ParImparControle();
		int tamanho = (int)((Math.random()*100)+1);
		int vet [] = new int [tamanho];
		System.out.println("Tamanho do Vetor: "+tamanho);
		for (int i = 0;i<tamanho;i++) {
			vet[i] = (int)(Math.random()*1001);
			try {
				pi.add(vet[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			pi.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
