package com.project.teamproject.controller;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Getter
public class UserCreateForm {
    @Size(max=10)
    @NotEmpty(message="ID를 입력하세요.")
    private String id;

    private String pw;

    private String name;

    private boolean location;
}
