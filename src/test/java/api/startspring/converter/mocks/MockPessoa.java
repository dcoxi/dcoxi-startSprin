package api.startspring.converter.mocks;

import api.startspring.data.model.entity.Pessoa;
import api.startspring.data.vo.PessoaVO;

import java.util.ArrayList;
import java.util.List;

public class MockPessoa {


    public Pessoa mockEntity() {
        return mockEntity(0);
    }

    public PessoaVO mockVO() {
        return mockVO(0);
    }

    public List<Pessoa> mockEntityList() {
        List<Pessoa> persons = new ArrayList<Pessoa>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public List<PessoaVO> mockVOList() {
        List<PessoaVO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockVO(i));
        }
        return persons;
    }

    private Pessoa mockEntity(Integer number) {
        Pessoa person = new Pessoa();
        person.setEndereco("Test Endereço" + number);
        person.setNome("Test Nome" + number);
        person.setGenero(((number % 2)==0) ? "Masculino" : "Feminino");
        person.setId(number.longValue());
        person.setSobreNome("Test Último Nome" + number);
        return person;
    }

    private PessoaVO mockVO(Integer number) {
        PessoaVO person = new PessoaVO();
        person.setEndereco("Test Endereço" + number);
        person.setNome("Test Nome" + number);
        person.setGenero(((number % 2)==0) ? "Masculino" : "Feminino");
        person.setId(number.longValue());
        person.setSobreNome("Test Último Nome" + number);
        return person;
    }
    
}
