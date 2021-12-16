package api.startspring.services.impl;

import api.startspring.data.model.entity.Pessoa;
import api.startspring.exceptions.ResourceNotFoundException;
import api.startspring.repository.PessoaRepository;
import api.startspring.services.IPesseoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements IPesseoaService {

    @Autowired
    private PessoaRepository repositorio;

    @Override
    public Pessoa novo(Pessoa pessoa) {
        return repositorio.save(pessoa);
    }

    @Override
    public List<Pessoa> todos() {
        return repositorio.findAll();
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        return repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registo encontrado! para este Id"));
    }

    @Override
    public Pessoa actualizar(Pessoa pessoa) {
        Pessoa entidade = repositorio.findById(pessoa.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Nenhum registo encontrado! para este Id"));
        entidade.setNome(pessoa.getNome());
        entidade.setSobreNome(pessoa.getSobreNome());
        entidade.setEndereco(pessoa.getEndereco());
        entidade.setGenero(pessoa.getGenero());

        return repositorio.save(entidade);
    }

    @Override
    public void apagar(Long id) {
        Pessoa entidade = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Nenhum registo encontrado! para este Id"));
         repositorio.delete(entidade);

    }
}
