package api.startspring.data.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@JsonPropertyOrder({"id","nome","sobreNome","genero","endereco"})
public class PessoaVO implements Serializable {

    private static final long serialVersionUID = 1L;


    @Getter @Setter
    private Long id;
    @JsonProperty("primeiro_nome")
    @Getter @Setter
    private String nome;

    @JsonProperty("ulimo_nome")
    @Getter @Setter
    private String sobreNome;


    @Getter @Setter
    private String endereco;

    @JsonIgnore
    @Getter @Setter
    private String genero;

    public PessoaVO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaVO)) return false;

        PessoaVO pessoaVO = (PessoaVO) o;

        if (getId() != null ? !getId().equals(pessoaVO.getId()) : pessoaVO.getId() != null) return false;
        if (getNome() != null ? !getNome().equals(pessoaVO.getNome()) : pessoaVO.getNome() != null) return false;
        if (getSobreNome() != null ? !getSobreNome().equals(pessoaVO.getSobreNome()) : pessoaVO.getSobreNome() != null)
            return false;
        if (getEndereco() != null ? !getEndereco().equals(pessoaVO.getEndereco()) : pessoaVO.getEndereco() != null)
            return false;
        return getGenero() != null ? getGenero().equals(pessoaVO.getGenero()) : pessoaVO.getGenero() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
        result = 31 * result + (getSobreNome() != null ? getSobreNome().hashCode() : 0);
        result = 31 * result + (getEndereco() != null ? getEndereco().hashCode() : 0);
        result = 31 * result + (getGenero() != null ? getGenero().hashCode() : 0);
        return result;
    }

}
