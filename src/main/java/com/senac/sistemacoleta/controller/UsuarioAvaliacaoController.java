package com.senac.sistemacoleta.controller;

import com.senac.sistemacoleta.entity.UsuarioAvaliacao;
import com.senac.sistemacoleta.service.UsuarioAvaliacaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.models.media.*;

import java.util.List;

@Api(tags = "Usuario Avaliacao")
@RestController
@RequestMapping("/usuario-avaliacao")
public class UsuarioAvaliacaoController {

    private final UsuarioAvaliacaoService usuarioAvaliacaoService;

    @Autowired
    public UsuarioAvaliacaoController(UsuarioAvaliacaoService usuarioAvaliacaoService) {
        this.usuarioAvaliacaoService = usuarioAvaliacaoService;
    }

    @ApiOperation("Listar todas as avaliações de usuários")
    @GetMapping
    public List<UsuarioAvaliacao> listarAvaliacoes() {
        return usuarioAvaliacaoService.listarTodasAsAvaliacoes();
    }

    @ApiOperation("Obter avaliação de usuário por ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Avaliação encontrada com sucesso"),
            @ApiResponse(code = 404, message = "Avaliação não encontrada")
    })
    @GetMapping("/{usuario_avaliacao_id}")
    public UsuarioAvaliacao obterAvaliacaoPorId(@PathVariable Long usuario_avaliacao_id) {
        return usuarioAvaliacaoService.obterAvaliacaoPorId(usuario_avaliacao_id).orElse(null);
    }

    @ApiOperation("Criar nova avaliação de usuário")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Avaliação criada com sucesso"),
            @ApiResponse(code = 400, message = "Requisição inválida")
    })
    @PostMapping
    public UsuarioAvaliacao criarAvaliacao(@RequestBody UsuarioAvaliacao usuarioAvaliacao) {
        return usuarioAvaliacaoService.salvarAvaliacao(usuarioAvaliacao);
    }
}
