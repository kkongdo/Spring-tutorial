package com.asac.springtutorial.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String name;
    private Integer age;
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String job;

}
