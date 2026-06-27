package br.com.treina.recife.sgcm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treina.recife.sgcm.api.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    
}
