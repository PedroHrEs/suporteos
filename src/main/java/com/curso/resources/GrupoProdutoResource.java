package com.curso.resources;

import com.curso.domains.GrupoProduto;
import com.curso.domains.dtos.GrupoProdutoDTO;
import com.curso.services.GrupoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/grupoproduto")
public class GrupoProdutoResource {

    @Autowired
    private GrupoProdutoService grupoProdutoService;

    @GetMapping
    public ResponseEntity<List<GrupoProdutoDTO>> findAll(){
        return ResponseEntity.ok().body(grupoProdutoService.findAll());
    }
    @GetMapping(value = "/{id}") //exemplo http://localhost:8080/grupoproduto/1
    public ResponseEntity<GrupoProdutoDTO> findById(@PathVariable int id){
        GrupoProduto obj = this.grupoProdutoService.findbyId(id);
        return ResponseEntity.ok().body(new GrupoProdutoDTO(obj));

    }
}
