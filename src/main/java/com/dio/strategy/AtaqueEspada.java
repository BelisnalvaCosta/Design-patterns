package com.dio.strategy;

// Estratégia: Ataque com espada
public class AtaqueEspada implements Ataque {
    public void executar() {
        System.out.println("🗡️ Atacando com espada!");
    }
}