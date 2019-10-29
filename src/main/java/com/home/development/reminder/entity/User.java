package com.home.development.reminder.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@Table(name = "usr")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;

    }