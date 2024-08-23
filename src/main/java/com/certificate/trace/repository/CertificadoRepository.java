package com.certificate.trace.repository;

import com.certificate.trace.model.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificado, Long> {

    Optional<Certificado> findByCodigo(String codigo);

    List<Certificado> findByCpf(String cpf);
}
