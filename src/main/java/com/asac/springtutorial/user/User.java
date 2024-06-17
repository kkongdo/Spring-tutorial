package com.asac.springtutorial.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String name;
    private Integer age;
    private String job;
}
