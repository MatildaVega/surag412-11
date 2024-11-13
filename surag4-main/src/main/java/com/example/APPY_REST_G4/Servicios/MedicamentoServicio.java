package com.example.APPY_REST_G4.Servicios;

import com.example.APPY_REST_G4.Repositorio.IRepositorioMedicamento;
import com.example.APPY_REST_G4.modelos.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServicio {

    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    public Medicamento registrarMedicamento(Medicamento datosMedicamento) throws Exception{
        try {
            return iRepositorioMedicamento.save(datosMedicamento);
        }catch (Exception error){

            throw new Exception(error.getMessage());

        }
    }
}
