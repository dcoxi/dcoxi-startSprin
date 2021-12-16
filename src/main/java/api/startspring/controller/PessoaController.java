package api.startspring.controller;


import api.startspring.data.model.entity.Pessoa;
import api.startspring.services.IPesseoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private IPesseoaService pesseoaService;


    @PostMapping(value = "/registar", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa registar(@RequestBody Pessoa pessoa){
       return pesseoaService.novo(pessoa);
    }




}
