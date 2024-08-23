package com.certificate.trace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.certificate.trace.service.CertificadoService;
import com.certificate.trace.model.Certificado;

import java.util.Optional;

@RestController
@RequestMapping("/api/certificados")
public class CertificadoController {

    @Autowired
    private CertificadoService service;

    @PostMapping
    public Certificado registrar(@RequestParam String cpf) {
        return service.registrarCertificado(cpf);
    }

    @GetMapping("/validar")
    public Optional<Certificado> validarCertificado(
            @RequestParam(required = true) String codigo) {
            return service.validarCertificadoPorCodigo(codigo);
    }
}
