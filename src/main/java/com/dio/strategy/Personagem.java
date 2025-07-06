package com.dio.strategy;

// Personagem que usa estratégias
public class Personagem {
    private Ataque estrategia;

    public void setEstrategia(Ataque novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    public void atacar() {
        estrategia.executar();
    }
}