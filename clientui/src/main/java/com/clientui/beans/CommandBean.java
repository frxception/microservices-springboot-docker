package com.clientui.beans;

import java.util.Date;


import java.util.Date;

public class CommandBean {

    //private int id;

    private Integer productId;

    private Date dateCommande;

    private Integer quantite;

    private Boolean commandePayee;

    public CommandBean() {
    }


    public CommandBean(Integer productId, Date dateCommande, Integer quantite, Boolean commandePayee) {
        this.productId = productId;
        this.dateCommande = dateCommande;
        this.quantite = quantite;
        this.commandePayee = commandePayee;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Boolean getCommandePayee() {
        return commandePayee;
    }

    public void setCommandePayee(Boolean commandePayee) {
        this.commandePayee = commandePayee;
    }


    @Override
    public String toString() {
        return "CommandBean{" +
                "productId=" + productId +
                ", dateCommande=" + dateCommande +
                ", quantite=" + quantite +
                ", commandePayee=" + commandePayee +
                '}';
    }
}
