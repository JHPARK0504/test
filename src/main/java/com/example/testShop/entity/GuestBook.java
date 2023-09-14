package com.example.testShop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

public class GuestBook extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long geulNum;

    @Column(length = 100, nullable = false)
    private String geulTitle;
    @Column(length = 1000, nullable = false)
    private String geulContent;
    @Column(length = 30, nullable = false)
    private String geulWriter;
}
