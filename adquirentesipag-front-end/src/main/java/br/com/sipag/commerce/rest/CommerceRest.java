package br.com.sipag.commerce.rest;
import br.com.sipag.commerce.model.Commerce;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;

import java.util.List;

public class CommerceRest {

    private Client client;
    private WebResource webResource;

    public CommerceRest() {
        ClientConfig clientConfig = new DefaultClientConfig();
        client = Client.create(clientConfig);
        client.addFilter(new LoggingFilter(System.out));
        webResource = client.resource("http://localhost:8080/");
    }

    public List<Commerce> listarCommerce(){
        return webResource.path("commerce").get(new GenericType<List <Commerce>>(){});
    }

    public Commerce obter(Long idCommerce) {
        return webResource.path("commerce").path(idCommerce.toString()).get(new GenericType<Commerce>(){});
    }

    public void atualizarCommerce(Commerce commerce){
        webResource.path("commerce").path(String.valueOf(commerce.getIdCommerce())).put(ClientResponse.class, commerce );
    }

    public void cadastrarCommerce(Commerce commerce){
        webResource.path("commerce").post(new GenericType<Commerce>(){}, commerce);
    }

}
