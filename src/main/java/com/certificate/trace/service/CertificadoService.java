package com.certificate.trace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.certificate.trace.repository.CertificadoRepository;
import com.certificate.trace.model.Certificado;

import java.util.Optional;

@Service
public class CertificadoService {

    @Autowired
    private CertificadoRepository repository;

    public Certificado registrarCertificado(String cpf) {
        Certificado certificado = new Certificado();
        certificado.setCpf(cpf);
        return repository.save(certificado);
    }

    public Optional<Certificado> validarCertificadoPorCodigo(String codigo) {
        return repository.findByCodigo(codigo);
    }

}
