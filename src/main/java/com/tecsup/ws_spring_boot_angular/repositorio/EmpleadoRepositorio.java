package com.tecsup.ws_spring_boot_angular.repositorio;

import com.tecsup.ws_spring_boot_angular.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
