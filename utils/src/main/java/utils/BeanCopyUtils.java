package utils;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by peiyiqiang on 2020/6/29.
 * Description: 基于字节码的java bean拷贝工具
 */
public class BeanCopyUtils {

    private static final MapperFacade mapperFacade = new DefaultMapperFactory.Builder().useAutoMapping(true).mapNulls(true).build().getMapperFacade();

    public static <S, D> void copyProperties(S source, D target) {
        //Assert.notNull(source, "source cannot be null");
        //Assert.notNull(target, "target cannot be null");
        if(source == null || target == null) {
            return;
        }
        mapperFacade.map(source, target);
    }

    public static <S, D> D copyProperties(S source, Class<D> clazz) {
        if (source == null || clazz == null) {
            return null;
        }
        return mapperFacade.map(source, clazz);
    }

    public static <S, D> List<D> copyList(List<S> source, Class<D> clazz) {
        if (CollectionUtils.isEmpty(source) || clazz == null) {
            return Collections.emptyList();
        }
        //List<D> target = Lists.newArrayList();
        List<D> target = new ArrayList<>();
        for (S s : source) {
            target.add(copyProperties(s, clazz));
        }
        return target;
    }
}
