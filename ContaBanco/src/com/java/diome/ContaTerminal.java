package com.java.diome;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 1021;
    	String agencia = "067-8";
    	String nome = "MARIO";
    	String sobreNome = "ANDRADE";
    	double saldo  = 237.48;
    	
    	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Por favor, digite o número da Agência !");
    	agencia = scanner.next();
    	
    	System.out.println("Por favor, digite o nome do cliente!");
    	nome = scanner.next();
    	
    	System.out.println("Por favor, digite o sobrenome do cliente!");
    	sobreNome = scanner.next();
    	
    	System.out.println("Por favor, digite o valor que gostaria de sacar!");
    	saldo = scanner.nextDouble();
    	
    	String nomeCliente = nome + " " + sobreNome;
    	
    	System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque!");
    	
    }
}