package com.asgard09.library.requestmodel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AdminQuestionRequest {

    private Long id;

    private String response;
}
