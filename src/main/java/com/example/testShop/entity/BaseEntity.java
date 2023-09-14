package com.example.testShop.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
public abstract class BaseEntity {
    @CreatedDate

    // 생성된 시간을 감지
    @Column(updatable = false)
    private LocalDateTime regdate;

    // 마지막으로 수정된 시간을 감지
    @Column(updatable = false)
    private LocalDateTime modDate;
}
