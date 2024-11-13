package com.example.APPY_REST_G4.controladores;

import com.example.APPY_REST_G4.Servicios.SignoVitalServicio;
import com.example.APPY_REST_G4.modelos.SignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signovital")
public class SignoVitalControlador {

    @Autowired
    SignoVitalServicio signoVitalServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(signoVitalServicio.registrarSignoVital(datos));

        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}
