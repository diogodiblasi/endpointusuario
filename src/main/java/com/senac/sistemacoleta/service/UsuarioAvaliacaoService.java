package com.senac.sistemacoleta.service;

import com.senac.sistemacoleta.entity.UsuarioAvaliacao;
import com.senac.sistemacoleta.repository.UsuarioAvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioAvaliacaoService {

    private final UsuarioAvaliacaoRepository usuarioAvaliacaoRepository;

    @Autowired
    public UsuarioAvaliacaoService(UsuarioAvaliacaoRepository usuarioAvaliacaoRepository) {
        this.usuarioAvaliacaoRepository = usuarioAvaliacaoRepository;
    }

    public List<UsuarioAvaliacao> listarTodasAsAvaliacoes() {
        return usuarioAvaliacaoRepository.findAll();
    }

    public Optional<UsuarioAvaliacao> obterAvaliacaoPorId(Long id) {
        return usuarioAvaliacaoRepository.findById(id);
    }

    public UsuarioAvaliacao salvarAvaliacao(UsuarioAvaliacao usuarioAvaliacao) {
        return usuarioAvaliacaoRepository.save(usuarioAvaliacao);
    }
}
