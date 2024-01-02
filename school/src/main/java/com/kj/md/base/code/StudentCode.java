package com.kj.md.base.code;

import jakarta.persistence.criteria.CriteriaBuilder.In;
import java.util.EnumSet;
import org.apache.commons.lang3.ObjectUtils;

public class StudentCode
{
    public static <T extends Enum<T> & CommonCode> T enumByCode(Class<T> clazz, Integer code)
    {
        if (code == null) {
            return null;
        }
        for (T t : clazz.getEnumConstants()) {
            if (t.getCode().equals(code)) {
                return t;
            }
        }
        return null;
    }

    public enum GENDER implements CommonCode{
        MAN(1001,"MAN"), WOMEN(1002, "WOMEN")
        ;

        private final Integer code;
        private final String value;

        GENDER(int code, String value)
        {
            this.code = code;
            this.value = value;
        }

        @Override
        public Integer getCode()
        {
            return code;
        }
        @Override
        public String getValue()
        {
            return value;
        }
    }
}
