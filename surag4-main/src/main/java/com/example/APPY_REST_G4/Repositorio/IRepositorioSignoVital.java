package com.example.APPY_REST_G4.Repositorio;

import com.example.APPY_REST_G4.modelos.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioSignoVital extends JpaRepository<SignoVital,Long> {
}
