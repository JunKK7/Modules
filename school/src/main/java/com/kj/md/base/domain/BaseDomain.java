package com.kj.md.base.domain;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseDomain
{
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date regDt;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updDt;

    private Long regId;
    private Long updId;
}
