package com.example.projectcurrencyconverterapi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface ExchangeRateService {

    @GET("/v6/{apiKey}/latest/{baseCurrency}")
    Call<ExchangeRatesResponse> getExchangeRates(
        @Path("apiKey") String apiKey,
        @Path("baseCurrency") String baseCurrency
    );
}
