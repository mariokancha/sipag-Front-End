package br.com.sipag.commerce.managedbean;

import br.com.sipag.commerce.model.Commerce;
import br.com.sipag.commerce.rest.CommerceRest;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class CommerceBean {
    private Long id;
    private List<Commerce> commerces;
    private  Commerce commerce;
    private CommerceRest commerceRest = new CommerceRest();

    public void initDetalhes() {
        if (this.id != null){
            this.commerce = commerceRest.obter(id);
        }else {
            this.commerce = new Commerce();
        }

    }

    public String editar() {
        if (this.id !=null){
            commerceRest.atualizarCommerce(this.commerce);
        }else {
            commerceRest.cadastrarCommerce(this.commerce);
        }
        this.commerces = commerceRest.listarCommerce();
        return "index";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commerce getCommerce() {
        return commerce;
    }

    public void setCommerce(Commerce commerce) {
        this.commerce = commerce;
    }

    public List<Commerce> getCommerces() {
        return commerces;
    }


        @PostConstruct
        public void init(){
            commerces = commerceRest.listarCommerce();
        }

    public String exibir(Commerce commerce) {
        this.commerce = commerce;
        return "detalhes";
    }

}

