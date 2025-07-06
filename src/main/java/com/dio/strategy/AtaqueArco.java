package com.dio.strategy;

// Estratégia: Ataque com arco
public class AtaqueArco implements Ataque {
    public void executar() {
        System.out.println("🏹 Atacando com arco!");
    }
}