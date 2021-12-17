package api.startspring.converter;

import api.startspring.converter.mocks.MockPessoa;
import api.startspring.data.model.entity.Pessoa;
import api.startspring.data.vo.PessoaVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class DozerConverterTest {

    MockPessoa inputObject;

    @Before
    public void setUp() {
        inputObject = new MockPessoa();
    }

    @Test
    public void parseEntityToVOTest() {
        PessoaVO output = DozerConverter.toObject(inputObject.mockEntity(), PessoaVO.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Primeiro Nome Test0", output.getNome());
        Assert.assertEquals("Último Nome Test0", output.getSobreNome());
        Assert.assertEquals("Endereço Test0", output.getEndereco());
        Assert.assertEquals("Masculino", output.getGenero());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<PessoaVO> outputList = DozerConverter.toListObject(inputObject.mockEntityList(), PessoaVO.class);
        PessoaVO outputZero = outputList.get(0);

        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
        Assert.assertEquals("Test0 Nome", outputZero.getNome());
        Assert.assertEquals("Test0 Sobre nome", outputZero.getSobreNome());
        Assert.assertEquals("Test0 Endereço", outputZero.getEndereco());
        Assert.assertEquals("Masculino", outputZero.getGenero());

        PessoaVO outputSeven = outputList.get(7);

        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
        Assert.assertEquals("Test7 Nome", outputSeven.getNome());
        Assert.assertEquals("Test7 Sobre nome", outputSeven.getSobreNome());
        Assert.assertEquals("Test7 Endereço", outputSeven.getEndereco());
        Assert.assertEquals("Feminino", outputSeven.getGenero());

        PessoaVO outputTwelve = outputList.get(12);

        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals("Test12 Nome", outputTwelve.getNome());
        Assert.assertEquals("Test12 Sobre nome", outputTwelve.getSobreNome());
        Assert.assertEquals("Test12 Endereço", outputTwelve.getEndereco());
        Assert.assertEquals("Masculino", outputTwelve.getGenero());
    }

    @Test
    public void parseVOToEntityTest() {
        Pessoa output = DozerConverter.toObject(inputObject.mockVO(), Pessoa.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Test0 Nome", output.getNome());
        Assert.assertEquals("Test0 Sobre nome", output.getSobreNome());
        Assert.assertEquals("Test0 Endereço", output.getEndereco());
        Assert.assertEquals("Masculino", output.getGenero());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Pessoa> outputList = DozerConverter.toListObject(inputObject.mockVOList(), Pessoa.class);
        Pessoa outputZero = outputList.get(0);

        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
        Assert.assertEquals("Test0 Nome", outputZero.getNome());
        Assert.assertEquals("Test0 Sobre nome", outputZero.getSobreNome());
        Assert.assertEquals("Test0 Endereço", outputZero.getEndereco());
        Assert.assertEquals("Masculino", outputZero.getGenero());

        Pessoa outputSeven = outputList.get(7);

        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
        Assert.assertEquals("Test7 Nome", outputSeven.getNome());
        Assert.assertEquals("Test7 Sobre nome", outputSeven.getSobreNome());
        Assert.assertEquals("Test7 Endereço", outputSeven.getEndereco());
        Assert.assertEquals("Feminino", outputSeven.getGenero());

        Pessoa outputTwelve = outputList.get(12);

        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals("Test12 Nome", outputTwelve.getNome());
        Assert.assertEquals("Test12 Sobre nome", outputTwelve.getSobreNome());
        Assert.assertEquals("Test12 Endereço", outputTwelve.getEndereco());
        Assert.assertEquals("Masculino", outputTwelve.getGenero());
    }

}
