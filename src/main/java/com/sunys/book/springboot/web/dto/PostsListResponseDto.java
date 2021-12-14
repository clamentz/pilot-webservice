package com.sunys.book.springboot.web.dto;

import com.sunys.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-12-10
 * Time: 오전 10:45
 */
@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
