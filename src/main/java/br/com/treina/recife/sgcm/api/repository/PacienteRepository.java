package br.com.treina.recife.sgcm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treina.recife.sgcm.api.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    
}
