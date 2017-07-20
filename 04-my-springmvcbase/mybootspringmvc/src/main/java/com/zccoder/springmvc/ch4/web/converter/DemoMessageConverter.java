package com.zccoder.springmvc.ch4.web.converter;

import com.zccoder.springmvc.ch4.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 自定义HttpMessageConverter
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
// 继承 AbstractHttpMessageConverter 接口来实现自定义的 HttpMessageConverter。
public class DemoMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public DemoMessageConverter(){
        // 新建一个我们自定义的媒体类型 application/x-zccoder。
        super(new MediaType("application","x-zccoder", Charset.forName("UTF-8")));
    }

    // 重写 readInternal 方法，处理请求的数据。代码表明我们处理由“-”隔开的数据，并转成DemoObj对象。
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(inputMessage.getBody(),Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        System.out.println(tempArr[0]);
        return new DemoObj(new Integer(tempArr[0]),tempArr[1]);
    }

    // 表明本 HttpMessageConverter 只处理DemoObj这个类。
    @Override
    protected boolean supports(Class clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    // 重写 writeInternal，处理如何输出数据到response。在此例中，我们在原样输出前面加上“hello:”。
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:"+obj.getId() + "-"+obj.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}
