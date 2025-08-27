//classe responsavel por fornecer e configurar uma classe retrofit
package com.example.projectcurrencyconverterapi;

import  retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.projectcurrencyconverterapi.ExchangeRatesResponse;
public class RetrofitClient {
    // url base da API que fornece taxas de câmbio
    private static  final String BASE_URL = "https://v6.exchangerate-api.com/";
    //instacia do retrofit que sera usasda para fazer as requisições
    private static  Retrofit retrofit = null;
    /*Método estatico que retorna uma instancia do serviço de taxa de câmbio
    @return uma instancia de ExchangeRateService para realizar chamadas da API     
     */
    public static ExchangeRateService getInstance(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ExchangeRateService.class);
    }
}
