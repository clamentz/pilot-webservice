package com.sunys.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-07-21
 * Time: 오후 5:12
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
