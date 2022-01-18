package com.sunys.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-12-14
 * Time: 오후 5:39
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
