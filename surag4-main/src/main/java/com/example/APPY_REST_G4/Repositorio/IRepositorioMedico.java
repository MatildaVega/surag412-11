package com.example.APPY_REST_G4.Repositorio;

import com.example.APPY_REST_G4.modelos.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedico extends JpaRepository<Medico,Long> {
}
