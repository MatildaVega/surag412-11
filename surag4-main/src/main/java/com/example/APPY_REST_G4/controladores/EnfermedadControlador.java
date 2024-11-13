package com.example.APPY_REST_G4.controladores;

import com.example.APPY_REST_G4.Servicios.EnfermedadServicio;
import com.example.APPY_REST_G4.modelos.Enfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enfermedad")
public class EnfermedadControlador {
    @Autowired
    EnfermedadServicio enfermedadServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Enfermedad datos){

        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(enfermedadServicio.registrarEnfermedad(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
