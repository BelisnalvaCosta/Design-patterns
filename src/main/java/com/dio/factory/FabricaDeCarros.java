package com.dio.factory;

// Fábrica que cria o tipo de carro
public class FabricaDeCarros {
    public static Carro criarCarro(String tipo) {
        if (tipo.equalsIgnoreCase("popular")) {
            return new CarroPopular();
        } else if (tipo.equalsIgnoreCase("esportivo")) {
            return new CarroEsportivo();
        }
        return null;
    }
}