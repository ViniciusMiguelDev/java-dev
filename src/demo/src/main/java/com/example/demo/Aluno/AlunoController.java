package com.example.demo.Aluno;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @Operation(summary = "Cria um novo aluno")
    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid Aluno aluno, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> erros_return = new ArrayList<>();
            for (ObjectError erro : bindingResult.getAllErrors()) {
                erros_return.add(erro.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(erros_return);
        }
        Aluno createdAluno = service.create(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).body(createdAluno);
    }

    @Operation(summary = "Lista todos os alunos")
    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<AlunoDTO> listObjDto = service.findAll().stream().map((aluno) -> new AlunoDTO(aluno)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listObjDto);
    }

    @Operation(summary = "Chama um aluno por id")
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(new AlunoDTO(service.findById(id)));
    }

    @Operation(summary = "Atualiza os dados de um aluno")
    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Aluno aluno) {
        return ResponseEntity.ok().body(new AlunoDTO(service.update(id, aluno)));
    }

    @Operation(summary = "Apaga um aluno")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.delete(id));
    }

    @Operation(summary = "Pega a média de um aluno pelo id dele")
    @GetMapping(value = "/{id}/media")
    public ResponseEntity<?> getMediaByAlunoId(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getMedia(id));
    }
}
