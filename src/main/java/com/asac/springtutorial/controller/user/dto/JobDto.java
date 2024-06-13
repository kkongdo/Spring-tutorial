package com.asac.springtutorial.controller.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter //Getter가 필요한 이유 직렬화를 위해서 데이터를 가지고 와야 하기 떄문이다.
public class JobDto {
    private String name, job, specialty;
}
