package br.com.infosolo.teste.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infosolo.teste.model.Language;

@Transactional
public interface LanguageRepository extends JpaRepository<Language, Long>{
	

}
