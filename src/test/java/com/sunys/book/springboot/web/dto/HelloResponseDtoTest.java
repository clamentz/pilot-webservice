package com.sunys.book.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-07-21
 * Time: 오후 5:15
 */
public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        //given
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
