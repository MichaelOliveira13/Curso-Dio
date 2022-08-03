package com.api.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.example.model.Product;

/**
 * Endpoints da API REST para manipular a classe Product
 * 
 *  1 - POST: criar um novo produto
 *  2 - GET: buscar um produto
 *  3 - GET: listar produtos
 *  4 - PUT: atualizar um produto
 *  5 - DELETE: remover um produto
 */

@RestController
public class ProductServiceController {
    
    private static List<Product> products = new ArrayList<Product>();
    static {

        products.add(new Product(1, "Shampoo Canino", 35.00, "Shampoo para cachorro gourmet"));
        products.add(new Product(2, "Shampoo Felino", 38.00, "Shampoo para gato gourmet"));
        products.add(new Product(3, "Bolinha de borracha", 15.00, "Brinquedo para cachorro"));
        products.add(new Product(4, "Remédio Canino", 30.00, "Remédio para cachorro nutella"));
        products.add(new Product(5, "Roupinha de cachorro", 105.00, "Roupinha de cachorro friorento"));

    }

    

    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable("id") int id){

        return new ResponseEntity<>(products.get(id), HttpStatus.OK);

    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

}
