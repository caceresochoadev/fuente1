package com.usergio.retos.retoapp.modelo.repositorio;

import com.usergio.retos.retoapp.modelo.entidad.Car;
import com.usergio.retos.retoapp.modelo.entidad.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
