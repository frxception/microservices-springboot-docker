package com.clientui.proxies;

import com.clientui.beans.CommandBean;
import com.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "microservice-commande", url = "mcommandes:9002")

public interface MicroserviceCommandeProxy {

    @PostMapping(value = "/Commande")
    List<CommandBean> addCommand(CommandBean c);

    @GetMapping( value = "/Commandes/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);

}