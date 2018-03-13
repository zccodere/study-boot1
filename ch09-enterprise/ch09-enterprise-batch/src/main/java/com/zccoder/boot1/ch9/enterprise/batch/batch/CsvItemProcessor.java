package com.zccoder.boot1.ch9.enterprise.batch.batch;

import com.zccoder.boot1.ch9.enterprise.batch.domain.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * @title 数据处理
 * @describe 数据处理
 * @author zc
 * @version 1.0 2017-09-26
 */
public class CsvItemProcessor extends ValidatingItemProcessor<Person>{

    public static final String TEST_NATION = "汉族";

    @Override
    public Person process(Person item) throws ValidationException {
        // 需执行super.process(item); 才会调用自定义校验器
        super.process(item);

        // 对数据做简单的处理，若民族为汉族，则数据转换成01，其余转换成02
        if(TEST_NATION.equals(item.getNation())){
            item.setNation("01");
        }else {
            item.setNation("02");
        }
        return item;
    }
}
