package com.sunys.book.springboot.web.dto;

import com.sunys.book.springboot.domain.posts.Posts;
import lombok.Getter;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-08-18
 * Time: 오후 6:00
 */
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
