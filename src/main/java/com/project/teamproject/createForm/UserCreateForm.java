package com.project.teamproject.createForm;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Getter
@Setter
public class UserCreateForm {
    @NotEmpty
    @Size(max = 10)
    private String id;

    @Size(max = 10)
    private String pw;

    @Size(max = 10)
    private String name;
}
