package com.asac.springtutorial.controller.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor //없으면 넘겨준 값을 dto에 저장해줄 수 없다.
@Getter
public class JobRequestDto {
    private String position;
    private Integer year;

    public String getPosition(){
        return "[" + this.position + "]";
    }
}

