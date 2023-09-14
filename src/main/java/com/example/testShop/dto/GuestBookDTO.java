package com.example.testShop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuestBookDTO {
    private Long geulNum;
    private String geulTitle;
    private String geulContext;
    private String geulWriter;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
