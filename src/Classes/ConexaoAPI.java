package Classes;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConexaoAPI {
    public Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private CodigoInternacional codigoInternacional;

    public CodigoInternacional getCodigoInternacional() {
        return codigoInternacional;
    }

    private final String endereco = "https://v6.exchangerate-api.com/v6/" + "COLOQUE_SUA_CHAVE_API" + "/latest/";

    public String Endereco(String valor) {
        return endereco + valor;
    }

    public CodigoInternacional BuscarJson(String valor) {

        try {
            String endereco = "https://v6.exchangerate-api.com/v6/" + "COLOQUE_SUA_CHAVE_API" + "/latest/" + valor;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            CodigoInternacional codigoInternacional = gson.fromJson(json, CodigoInternacional.class);

            return this.codigoInternacional = codigoInternacional;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Falha ao chamar a API: " + e.getMessage(), e);
        }
    }
}