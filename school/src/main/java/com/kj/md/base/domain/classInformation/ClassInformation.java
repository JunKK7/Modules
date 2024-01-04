package com.kj.md.base.domain.classInformation;

import com.kj.md.base.domain.BaseDomain;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ClassInformation extends BaseDomain
{
    @EmbeddedId
    private ClassInformationPK classInformationId;
}
