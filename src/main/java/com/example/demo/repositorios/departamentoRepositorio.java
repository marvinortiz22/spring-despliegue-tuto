package com.example.demo.repositorios;

import com.example.demo.modelos.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface departamentoRepositorio extends JpaRepository<Departamento, Integer> {
}
