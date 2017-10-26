package com.jose;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {
	
	public static void main(String[] args) {

		Queue<Integer> pilha = new LinkedList<Integer>();

		pilha.add(22);
		pilha.add(17);
		pilha.add(33);
		pilha.add(57);
		pilha.add(42);
		pilha.add(17);
		pilha.add(9);

		System.out.println("Pilha de inteiros" + pilha);

		pilha.poll();

		System.out.println("Primeiro item removido" + pilha);

		int min = Integer.MAX_VALUE;

		
		for (int elemento : pilha) {
			if (elemento < min) {
				int menor = -1;
				menor = elemento;
				min = elemento;
			}

		}

		System.out.println("Menor numero da Pilha: [" + min + "]");
	}

}
