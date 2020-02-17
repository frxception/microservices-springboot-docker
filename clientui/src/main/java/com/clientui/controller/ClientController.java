package com.clientui.controller;

import com.clientui.beans.CommandBean;
import com.clientui.beans.ProductBean;

import com.clientui.proxies.MicroserviceCommandeProxy;
import com.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class ClientController {

    @Autowired
    private MicroserviceProduitsProxy ProduitsProxy;

    @Autowired
    private MicroserviceCommandeProxy CommandeProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> produits =  ProduitsProxy.listeDesProduits();

        model.addAttribute("produits", produits);

        return "Accueil";
    }

    @RequestMapping("/details-produit/{id}")
    public String ficheProduit(@PathVariable int id, Model model){

        ProductBean produit = ProduitsProxy.recupererUnProduit(id);

        model.addAttribute("produit", produit);

        return "FicheProduit";
    }

    @RequestMapping("/details-produit/commander-produit")
    public String commander(Model model){

        Integer productId=0;

        Date dateCommande=new Date("20/11/1996");

        Integer quantite=5;

        Boolean commandePayee=false;

        CommandBean commande = new CommandBean(productId,dateCommande,quantite,commandePayee);

        CommandeProxy.addCommand(commande);

        model.addAttribute("commande", commande);

        return "FicheProduit";
    }

    @RequestMapping("/details-produit/commander-produit/{id}")
    public String getcommande(@PathVariable int id, Model model){

        ProductBean produit = ProduitsProxy.recupererUnProduit(id);

        model.addAttribute("produit", produit);

        return "FicheProduit";
    }

}