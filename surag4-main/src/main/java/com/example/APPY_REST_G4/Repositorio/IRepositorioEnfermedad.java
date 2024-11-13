package com.example.APPY_REST_G4.Repositorio;

import com.example.APPY_REST_G4.modelos.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioEnfermedad extends JpaRepository<Enfermedad,Long> {
}
