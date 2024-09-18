package com.curso.services;

import com.curso.domains.dtos.GrupoProdutoDTO;
import com.curso.repositories.GrupoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GrupoProdutoService {

    @Autowired
    private GrupoProdutoRepository grupoProdutoRepo;

    public List<GrupoProdutoDTO> findAll(){
        //retorna uma lista de ProdutoDTO
        return grupoProdutoRepo.findAll().stream()
                .map(obj -> new GrupoProdutoDTO(obj))
                .collect(Collectors.toList());
    }
}
