package api.startspring.data.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tb_pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    @Column(name ="nome", nullable=false, length=120)
    private String nome;

    @Getter @Setter
    @Column(name ="sobre_nome", nullable=false, length=80)
    private String sobreNome;


    @Getter @Setter
    @Column(name ="endereco", nullable=false, length=100)
    private String endereco;

    @Getter @Setter
    @Column(name ="genero", nullable=false, length=12)
    private String genero;

    public Pessoa() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (getId() != null ? !getId().equals(pessoa.getId()) : pessoa.getId() != null) return false;
        if (getNome() != null ? !getNome().equals(pessoa.getNome()) : pessoa.getNome() != null) return false;
        if (getSobreNome() != null ? !getSobreNome().equals(pessoa.getSobreNome()) : pessoa.getSobreNome() != null)
            return false;
        if (getEndereco() != null ? !getEndereco().equals(pessoa.getEndereco()) : pessoa.getEndereco() != null)
            return false;
        return getGenero() != null ? getGenero().equals(pessoa.getGenero()) : pessoa.getGenero() == null;
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
