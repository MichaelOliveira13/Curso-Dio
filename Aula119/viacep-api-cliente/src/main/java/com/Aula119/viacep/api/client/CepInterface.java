package com.Aula119.viacep.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface CepInterface {

    @GetMapping("{cep}/json")
    Address getAddressByCep(@PathVariable("cep") String cep);

    @GetMapping("{uf}/{cidade}/{logradouro}/json")
    List<Address> getAddressByDescription(
        @PathVariable("uf") String uf, 
        @PathVariable("cidade") String cidade, 
        @PathVariable("logradouro") String logradouro
    );
    
}
