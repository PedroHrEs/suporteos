package com.curso.resources;

import com.curso.domains.dtos.ProdutoDTO;
import com.curso.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
