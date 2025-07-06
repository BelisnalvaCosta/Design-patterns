package com.dio;

import com.dio.strategy.AtaqueArco;
import com.dio.strategy.AtaqueEspada;
import com.dio.strategy.Personagem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Classe principal
public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem();

        guerreiro.setEstrategia(new AtaqueEspada());
        guerreiro.atacar(); // 🗡️ Atacando com espada!

        guerreiro.setEstrategia(new AtaqueArco());
        guerreiro.atacar(); // 🏹 Atacando com arco!
    }
}