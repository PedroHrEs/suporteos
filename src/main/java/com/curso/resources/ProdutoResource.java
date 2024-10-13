package com.curso.resources;

import com.curso.domains.Produto;
import com.curso.domains.dtos.ProdutoDTO;
import com.curso.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping //exemplo http://localhost:8080/produto
    public ResponseEntity<List<ProdutoDTO>> findAll(){
        return ResponseEntity.ok().body(produtoService.findAll());
    }

    @GetMapping(value = "/{id}") //exemplo http://localhost:8080/produto/1
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id){
        Produto obj = this.produtoService.findbyId(id);
        return ResponseEntity.ok().body(new ProdutoDTO(obj));

    }
}

