package com.senac.sistemacoleta.repository;

import com.senac.sistemacoleta.entity.UsuarioAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioAvaliacaoRepository extends JpaRepository<UsuarioAvaliacao, Long> {
    // Se necessário, adicione métodos personalizados do repositório aqui
}