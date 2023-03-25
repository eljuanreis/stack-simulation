package controller;

import stack.*;

public class SimulacaoController {

	public SimulacaoController() {
		super();
	}

	public void simulationOne() throws Exception {
		StackInt pilha = new StackInt();

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				pilha.push(i * i);
			} else {
				if (i <= 5) {
					pilha.push(i);
				} else {
					pilha.pop();
				}
			}
		}

		System.err.println("!!! Simulação 1 !!!");
		System.out.println("========================");
		System.out.println("Top >" + pilha.top());
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("Valores na memória: ");
		pilha.killAndShow();
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("Tamanho da pilha: " + pilha.size());
		System.out.println("========================");
		System.err.println("!!! Fim Simulação 1 !!!");
	}

	public void simulationTwo() throws Exception {
		StackInt pilha = new StackInt();

		for (int i = 100; i < 115; i++) {
			if (pilha.isEmpty()) {
				pilha.push(i + 100);
			} else {
				if (pilha.size() <= 4) {
					pilha.push(i + 50);
				} else {
					pilha.pop();
				}
			}
		}

		System.err.println("!!! Simulação 2 !!!");
		System.out.println("========================");
		System.out.println("Top >" + pilha.top());
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("Valores na memória: ");
		pilha.killAndShow();
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("Tamanho da pilha: " + pilha.size());
		System.out.println("========================");
		System.err.println("!!! Fim Simulação 2 !!!");
	}
}
