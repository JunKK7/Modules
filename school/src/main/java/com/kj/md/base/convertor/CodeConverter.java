package com.kj.md.base.convertor;

import com.kj.md.base.code.CommonCode;
import com.kj.md.base.code.StudentCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Converter
public class CodeConverter<T extends Enum<T> & CommonCode> implements AttributeConverter<T, Integer> {
    @Override
    public Integer convertToDatabaseColumn(T attribute) {
        return attribute.getCode();
    }

    @Override
    public T convertToEntityAttribute(Integer dbData) {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) type;
        Class<T> clz = (Class<T>) paramType.getActualTypeArguments()[0];
        return StudentCode.enumByCode(clz, dbData);
    }
}
