package com.sunys.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-08-18
 * Time: 오후 5:52
 */
@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }

}
