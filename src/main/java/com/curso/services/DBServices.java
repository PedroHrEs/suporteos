package com.curso.services;

import com.curso.domains.GrupoProduto;
import com.curso.domains.Produto;
import com.curso.repositories.GrupoProdutoRepository;
import com.curso.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.domains.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;


@Service
public class DBServices {
    @Autowired
    private GrupoProdutoRepository grupoProdutoRepo;

    @Autowired
    private ProdutoRepository produtoRepo;

    public void initDB(){

        GrupoProduto grupo01 = new GrupoProduto(0, Status.ATIVO,"Limpeza" );
        GrupoProduto grupo02 = new GrupoProduto(0, Status.ATIVO, "Alimentício");

        Produto produto01 = new Produto(0, "Coca Cola", new BigDecimal("100"), new BigDecimal("3.5"),
            LocalDate.now(),grupo02,Status.ATIVO);
        Produto produto02 = new Produto(0, "Guarana Antartica", new BigDecimal("200"), new BigDecimal("3.0"),
                LocalDate.now(),grupo02,Status.ATIVO);
        Produto produto03 = new Produto(0, "Detergente Limpol", new BigDecimal("300"), new BigDecimal("4.0"),
                LocalDate.now(),grupo02,Status.ATIVO);
        Produto produto04 = new Produto(0, "Sabão em Pó OMO", new BigDecimal("400"), new BigDecimal("15.5"),
                LocalDate.now(),grupo02,Status.ATIVO);

    }
}
