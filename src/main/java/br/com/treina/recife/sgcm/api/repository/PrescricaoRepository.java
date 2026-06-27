package br.com.treina.recife.sgcm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treina.recife.sgcm.api.model.Prescricao;

public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {

    
}
