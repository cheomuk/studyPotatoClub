package com.example.cloneboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String email;

    @Column()
    private String password;

    @Column()
    private String nickname;

    @Column()
    private String introduce;
}
