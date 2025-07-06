package com.dio.factory;

// Classe principal
public class Main {
    public static void main(String[] args) {
        Carro carro1 = FabricaDeCarros.criarCarro("popular");
        Carro carro2 = FabricaDeCarros.criarCarro("esportivo");

        carro1.exibirModelo();  // 🚗 Carro Popular
        carro2.exibirModelo();  // 🏎️ Carro Esportivo
    }
}