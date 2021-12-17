package api.startspring.services.impl;

import api.startspring.converter.DozerConverter;
import api.startspring.data.model.entity.Pessoa;
import api.startspring.data.vo.PessoaVO;
import api.startspring.exceptions.ResourceNotFoundException;
import api.startspring.repository.PessoaRepository;
import api.startspring.services.IPesseoaService;
import lombok.experimental.var;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements IPesseoaService {

    private static final String MSG = "Nenhum registo encontrado! para este Id";
    
    @Autowired
    private PessoaRepository repositorio;

    @Override
    public PessoaVO novo(PessoaVO pessoa)
    {
        val entidade = DozerConverter.toObject(pessoa, Pessoa.class);
        return DozerConverter.toObject(repositorio.save(entidade), PessoaVO.class);
    }

    @Override
    public List<PessoaVO> todos() {

        return DozerConverter.toListObject(repositorio.findAll(), PessoaVO.class);
    }

    @Override
    public PessoaVO buscarPorId(Long id) {
        val pessoa = repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException(MSG));
        return DozerConverter.toObject(pessoa, PessoaVO.class);
    }

    @Override
    public PessoaVO actualizar(PessoaVO pessoa) {
        Pessoa entidade = repositorio.findById(pessoa.getId())
                .orElseThrow(() -> new ResourceNotFoundException(MSG));

        entidade = DozerConverter.toObject(pessoa, Pessoa.class);

        return  DozerConverter.toObject(repositorio.save(entidade), PessoaVO.class);
    }

    @Override
    public void apagar(Long id) {
        Pessoa entidade = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(MSG));
         repositorio.delete(entidade);
    }
}
