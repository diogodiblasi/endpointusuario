package com.example.senac2.repository;
import com.example.senac2.entity.UsuarioAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioAvaliacaoRepository extends JpaRepository<UsuarioAvaliacao, Long> {
    // Custom query methods can be added here
}
