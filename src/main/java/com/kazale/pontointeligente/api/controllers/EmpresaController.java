package com.kazale.pontointeligente.api.controllers;

import com.kazale.pontointeligente.api.dtos.EmpresaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @PostMapping
    public ResponseEntity<EmpresaDto> cadastrar(@RequestBody EmpresaDto empresaDto) {
        empresaDto.setId(1L);
        return ResponseEntity.ok(empresaDto);
    }

}
