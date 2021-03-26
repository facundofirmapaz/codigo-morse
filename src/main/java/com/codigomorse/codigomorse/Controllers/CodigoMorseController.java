package com.codigomorse.codigomorse.Controllers;

import com.codigomorse.codigomorse.Entities.CodigoMorse;
import com.codigomorse.codigomorse.Entities.ErrorTraduccion;
import com.codigomorse.codigomorse.Services.TraductorCodigoMorseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/codigo-morse")
public class CodigoMorseController
{
    @GetMapping("/traducir/{codigo}")
    public ResponseEntity<?> traducir(@PathVariable() String codigo)
    {
        try
        {
            CodigoMorse resultado = TraductorCodigoMorseService.traducirCodigoMorse(codigo);
            return ResponseEntity.ok(resultado);

        }
        catch (Exception e)
        {
            ErrorTraduccion errorTraduccion = new ErrorTraduccion(codigo, "Codigo mal conformado");
            return ResponseEntity.badRequest().body(errorTraduccion);
        }
    }
}
