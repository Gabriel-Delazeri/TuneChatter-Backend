package com.delazeri.music.users.repositories;

import com.delazeri.music.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query("SELECT u FROM User as u WHERE u.userName =:userName")
    User findByUsername(@Param("userName") String userName);
}