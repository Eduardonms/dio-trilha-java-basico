package com.java.diome;

import java.util.Scanner;

import com.java.diome.Exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			terminal.close();
			
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException e) {
            	System.out.print("Erro: " + e.getMessage());
		}
	}
		
		
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");			
		}
		else {
			
			int iteracoes = Math.min(parametroUm, parametroDois);

	        // Realiza a impressão dos números incrementados
	        for (int i = 1; i <= iteracoes; i++) {
	            System.out.print((parametroUm + i) + " ");
	            System.out.print((parametroDois + i) + " ");
	            System.out.println();  // Para imprimir cada par em uma nova linha
	        }

			//realizar o for para imprimir os números com base na variável contagem
		}
	}
}