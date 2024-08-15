package com.java.diome;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VerificarComboCompleto {

    public static void main(String[] args) {
        // Cria um scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);
        
     // Lendo a entrada com os serviços contratados
        String entrada = scanner.nextLine().trim();

        // Fecha o scanner
        scanner.close();
        
        
        // Converte a entrada para um conjunto de serviços únicos
        Set<String> servicosContratados = new HashSet<>();
        String[] serviçosArray = entrada.split(",");
        for (String serviço : serviçosArray) {
        	servicosContratados.add(serviço.trim());  // Usa trim() para remover espaços extras
        }
        
        // Define os serviços necessários para um combo completo
        Set<String> comboCompleto = new HashSet<>();
        comboCompleto.add("movel");
        comboCompleto.add("banda larga");
        comboCompleto.add("tv");
        
        // Verifica se todos os serviços necessários estão presentes
        if (servicosContratados.containsAll(comboCompleto)) {
            System.out.println("Combo Completo");
        } else {
            System.out.println("Combo Incompleto");
        }
    }
}