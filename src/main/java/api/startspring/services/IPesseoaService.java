package api.startspring.services;

import api.startspring.data.model.entity.Pessoa;

import java.util.List;

public interface IPesseoaService {

    Pessoa novo(Pessoa pessoa);

    List<Pessoa> todos();

    Pessoa buscarPorId(Long id);

    Pessoa actualizar(Pessoa pessoa);

    void apagar(Long id);

}
