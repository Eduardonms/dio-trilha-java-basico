package com.java.diome;

import java.util.*;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a primeira linha: serviço a ser verificado
        String servicoVerificar = scanner.nextLine().trim();

        // Lendo a segunda linha: cliente e serviços contratados
        String linhaCliente = scanner.nextLine().trim();

        // Processando a linha do cliente
        String[] partes = linhaCliente.split(",");
        if (partes.length < 2) {
            System.out.println("Entrada inválida. Certifique-se de incluir o nome do cliente e pelo menos um serviço.");
            return;
        }

        // Adicionando serviços contratados ao conjunto
        Set<String> servicosContratados = new HashSet<>();
        for (int i = 1; i < partes.length; i++) {
            servicosContratados.add(partes[i].trim());
        }

        // Verificando se o serviço solicitado está na lista de serviços contratados
        boolean servicoContratado = servicosContratados.contains(servicoVerificar);

        // Exibindo o resultado
        if (servicoContratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}
