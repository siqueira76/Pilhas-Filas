package com.jose;

import java.util.LinkedList;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<Integer> pilha = new Stack<Integer>();

		pilha.push(22);
		pilha.push(17);
		pilha.push(33);
		pilha.push(57);
		pilha.push(42);
		pilha.push(17);
		pilha.push(9);

		System.out.println("Pilha de inteiros" + pilha);

		pilha.pop();

		System.out.println("Ultimo item removido" + pilha);

		int var = Integer.MAX_VALUE;

		int menor = -1;
		for (int elemento : pilha) {
			if (elemento < var) {
				menor = elemento;
				var = elemento;
			}

		}

		System.out.println("Menor numero da Pilha: [" + var + "]");
	}
}
