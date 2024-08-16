package com.exercicio.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

}
