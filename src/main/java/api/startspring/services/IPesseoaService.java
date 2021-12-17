package api.startspring.services;

import api.startspring.data.vo.PessoaVO;

import java.util.List;

public interface IPesseoaService {

    PessoaVO novo(PessoaVO pessoa);

    List<PessoaVO> todos();

    PessoaVO buscarPorId(Long id);

    PessoaVO actualizar(PessoaVO pessoa);

    void apagar(Long id);

}
