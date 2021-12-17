package api.startspring.controller;


import api.startspring.data.vo.PessoaVO;
import api.startspring.services.IPesseoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private IPesseoaService pesseoaService;


    @PostMapping(value = "/registar", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PessoaVO registar(@RequestBody PessoaVO pessoa)
    {
       return pesseoaService.novo(pessoa);
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PessoaVO> listarTodos()
    {
       return pesseoaService.todos();
    }

    @GetMapping(value = "buscarPorId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PessoaVO buscarPorId(@PathVariable("id") Long id)
    {
       return pesseoaService.buscarPorId(id);
    }

    @PutMapping(value = "/actualizar", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PessoaVO actualizar(@RequestBody PessoaVO pessoa)
    {
        return pesseoaService.actualizar(pessoa);
    }

    @PostMapping(value = "/apagar/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <?> apagar(@PathVariable("id") Long id)
    {
         pesseoaService.apagar(id);
         return ResponseEntity.ok().build();
    }



}
