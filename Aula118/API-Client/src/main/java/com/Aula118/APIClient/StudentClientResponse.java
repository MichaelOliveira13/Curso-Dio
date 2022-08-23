package com.Aula118.APIClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentClientResponse {

    private Integer id;
    private String name;
    private Integer age;
}