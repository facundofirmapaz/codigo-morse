package com.codigomorse.codigomorse.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class CodigoMorse
{
    private ArrayList<String> codigo;
    private ArrayList<String> resultado;

}
