package com.kj.md.base.domain.subject;

import com.kj.md.base.domain.BaseDomain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Subject extends BaseDomain
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @Column(nullable = false)
    private String subjectName;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date applyStDate;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date applyEdDate;
}
