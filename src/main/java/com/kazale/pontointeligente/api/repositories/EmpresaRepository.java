package com.kazale.pontointeligente.api.repositories;

import com.kazale.pontointeligente.api.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Empresa findByCnpj(String cnpj);

}
