package com.nisum.desafio.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResponseException {
    private String mensaje;

    public ResponseException(String detail) {
        this.mensaje = detail;
    }

}
