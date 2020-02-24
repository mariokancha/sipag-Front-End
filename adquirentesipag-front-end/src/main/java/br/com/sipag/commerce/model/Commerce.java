package br.com.sipag.commerce.model;

import com.owlike.genson.annotation.JsonIgnore;
import com.owlike.genson.annotation.JsonProperty;

public class Commerce {

    @JsonProperty("idCommerce")
    private long idCommerce;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("foneResidencial")
    private String foneResidencial;
    @JsonProperty("foneComercial")
    private String foneComercial;
    @JsonProperty("foneCelular")
    private String foneCelular;
    @JsonProperty("email")
    private String email;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("cidade")
    private String cidade;
    @JsonProperty("uf")
    private String uf;

    @JsonProperty("complemento")
    private String complemento;

    @JsonIgnore
    public long getIdCommerce() {
        return idCommerce;
    }

    public void setIdCommerce(long idCommerce) {
        this.idCommerce = idCommerce;
    }
    @JsonIgnore
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @JsonIgnore
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @JsonIgnore
    public String getFoneResidencial() {
        return foneResidencial;
    }

    public void setFoneResidencial(String foneResidencial) {
        this.foneResidencial = foneResidencial;
    }
    @JsonIgnore
    public String getFoneComercial() {
        return foneComercial;
    }

    public void setFoneComercial(String foneComercial) {
        this.foneComercial = foneComercial;
    }
    @JsonIgnore
    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }
    @JsonIgnore
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonIgnore
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    @JsonIgnore
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    @JsonIgnore
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    @JsonIgnore
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @JsonIgnore
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    @JsonIgnore
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
