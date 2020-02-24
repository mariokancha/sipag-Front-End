package br.com.sipag.commerce.model;

import br.com.sipag.commerce.rest.CommerceRest;

public class Principal {
    public static void main(String[] args) {
        CommerceRest commerceRest = new CommerceRest();
        Commerce commerce = new Commerce();
        commerce.setIdCommerce(1);
        commerce.setNome("Sicoob Confederação de Ceilandia");
        commerce.setCnpj("18837992000171");
        commerce.setCep("72225194");
        commerce.setLogradouro("QNN 19 CONJUNTO G");
        commerce.setBairro("CEILANDIA NORTE");
        commerce.setCidade("CEILANDIA");
        commerce.setUf("DF");
        commerce.setComplemento("APARTAMENTO");
        commerce.setFoneCelular("6192925415");
        commerce.setEmail("mario.andrade2012@cabal.com.br");
        commerceRest.atualizarCommerce(commerce);
    }

}
