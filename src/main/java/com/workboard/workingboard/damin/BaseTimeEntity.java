package com.workboard.workingboard.damin;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    @Column(name = "created_date")
    @CreatedDate //생성 시 자동저장
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate//수정 시 자동저장
    private LocalDateTime modifiedDate;


}
