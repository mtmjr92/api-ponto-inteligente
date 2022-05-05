package com.kazale.pontointeligente.api.controllers;

import com.kazale.pontointeligente.api.dtos.EmpresaDto;
import com.kazale.pontointeligente.api.responses.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @PostMapping
    public ResponseEntity<Response<EmpresaDto>> cadastrar(@RequestBody EmpresaDto empresaDto) {
        Response<EmpresaDto> response = new Response<EmpresaDto>();

        empresaDto.setId(1L);
        response.setData(empresaDto);

        return ResponseEntity.ok(response);
    }

}
