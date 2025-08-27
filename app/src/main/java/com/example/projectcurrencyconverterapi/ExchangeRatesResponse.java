//Modelo de dados (DTO - Data Transfer Object) que representa a resposta JSON da API
package com.example.projectcurrencyconverterapi;
//importa a classe Map da bibilioteca Java, usada para armazenar pares de chave-valor
import java.util.HashMap;
import java.util.Map;
public class ExchangeRatesResponse {
//declara um mapa que armazena taxas de conversão em moedas
//a chave (string) representa o código  da moeda ex: ("USD", "EUR")
//e o valor (Double) representa a taxa de conversão para essa moeda
private Map<String, Double> conversion_rates = new HashMap<>();
//Metodo publico para acessar as taxas de conversão
//Retorna o mapa contendo as taxas de conversão armazenadas
    public Map<String, Double> getConversionRates(){
        return conversion_rates;
    }
}
