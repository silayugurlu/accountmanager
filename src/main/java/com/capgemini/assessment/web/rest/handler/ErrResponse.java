package com.capgemini.assessment.web.rest.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by silayugurlu on 5/26/18.
 */
@AllArgsConstructor
@Getter
public class ErrResponse {
    private long traceID;

    private String message;
}
