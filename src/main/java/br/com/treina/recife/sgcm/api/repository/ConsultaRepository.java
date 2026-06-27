package br.com.treina.recife.sgcm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treina.recife.sgcm.api.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    
}
