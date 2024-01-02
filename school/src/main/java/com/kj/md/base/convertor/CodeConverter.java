package com.kj.md.base.convertor;

import com.kj.md.base.code.CommonCode;
import com.kj.md.base.code.StudentCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Converter
public class CodeConverter<T extends Enum<T> & CommonCode> implements AttributeConverter<T, Integer> {

    private final Class<T> tClass;

    @SuppressWarnings("unchecked")
    public CodeConverter() {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) type;
        this.tClass = (Class<T>) paramType.getActualTypeArguments()[0];
    }

    @Override
    public Integer convertToDatabaseColumn(T attribute) {
        return attribute.getCode();
    }

    @Override
    public T convertToEntityAttribute(Integer dbData) {
        return StudentCode.enumByCode(tClass, dbData);
    }
}
