package com.example.APPY_REST_G4.Servicios;

import com.example.APPY_REST_G4.Repositorio.IRepositorioEnfermedad;
import com.example.APPY_REST_G4.Repositorio.IRepositorioMedicamento;
import com.example.APPY_REST_G4.modelos.Enfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnfermedadServicio {

    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public Enfermedad registrarEnfermedad(Enfermedad datosEnfermedad) throws Exception{

        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);

        }catch (Exception error){

            throw new Exception(error.getMessage());
        }
    }
}
