package com.example.testShop.service;

import com.example.testShop.dto.GuestBookDTO;
import com.example.testShop.entity.GuestBook;

public interface GuestBookService {
    Long register(GuestBookDTO guestBookDTO);
    default GuestBook dtoToEntity(GuestBookDTO guestBookDTO){
        GuestBook guestBook = GuestBook.builder()
                .geulNum(guestBookDTO.getGeulNum())
                .geulTitle(guestBookDTO.getGeulTitle())
                .geulContent(guestBookDTO.getGeulContext())
                .geulWriter(guestBookDTO.getGeulWriter())
                .geulWriter(guestBookDTO.getGeulWriter())
                .build();
        return guestBook;
    }
}
