package com.example.senac2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.senac2.entity.UsuarioAvaliacao;
import com.example.senac2.repository.UsuarioAvaliacaoRepository;
import java.util.List;
import java.util.Optional;


@Service
public class UsuarioAvaliacaoService {

    private final UsuarioAvaliacaoRepository repository;

    @Autowired
    public UsuarioAvaliacaoService(UsuarioAvaliacaoRepository repository) {
        this.repository = repository;
    }

    public List<UsuarioAvaliacao> findAll() {
        return repository.findAll();
    }

    public Optional<UsuarioAvaliacao> findById(Long id) {
        return repository.findById(id);
    }

    public UsuarioAvaliacao save(UsuarioAvaliacao usuarioAvaliacao) {
        return repository.save(usuarioAvaliacao);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    // Additional methods for business logic can be added here
}