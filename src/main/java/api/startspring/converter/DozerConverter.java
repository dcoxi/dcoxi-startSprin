package api.startspring.converter;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

public class DozerConverter {

    private DozerConverter(){}

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D toObject(O origem, Class<D> destino){
        return mapper.map(origem, destino);
    }

    public static <O, D> List<D> toListObject(List<O> origem, Class<D> destino){

        List<D> destinoObjectos = new ArrayList<>();
        for(Object o : origem){
            destinoObjectos.add(mapper.map(o, destino));
        }

        return destinoObjectos;
    }

}
