package com.sunys.book.springboot.config.auth.dto;

import com.sunys.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-12-15
 * Time: 오후 2:27
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
