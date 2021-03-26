package com.codigomorse.codigomorse.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorTraduccion
{
    private String codigo;
    private String mensajeError;
}
