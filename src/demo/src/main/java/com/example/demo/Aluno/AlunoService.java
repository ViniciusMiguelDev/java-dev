package com.example.demo.Aluno;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno create(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Aluno findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id, "Aluno não encontrado"));
    }

    public Aluno update(Long id, Aluno aluno) {
        Aluno aluno2 = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, "Aluno não encontrado"));
        aluno2.setName(aluno.getName());
        aluno2.setNotas(aluno.getNotas());
        repository.save(aluno2);
        return aluno2;
    }

    public String delete(Long id) {
        repository.deleteById(id);
        return "Aluno deletado do sistema";
    }

    public AlunoDTO getMedia(Long id) {
        Aluno aluno = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, "Aluno não encontrado"));
        return new AlunoDTO(aluno);
    }

}
