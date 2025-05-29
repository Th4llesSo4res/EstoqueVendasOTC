package com.OTC.EstoqueVendas.service;

import com.OTC.EstoqueVendas.model.Categoria;
import com.OTC.EstoqueVendas.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    // Criar ou Atualizar
    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    // Listar todas
    public List<Categoria> listarTodas() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Categoria> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
