package br.com.infosolo.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infosolo.teste.model.dto.LanguageDTO;
import br.com.infosolo.teste.service.impl.LanguageServiceImpl;

@RestController
@RequestMapping(name="/language")
public class LanguageController {
			
	@Autowired
	private LanguageServiceImpl languageServiceImpl;
	
	@RequestMapping(name="/cadastrar/{languageDTO}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LanguageDTO> cadastrar(LanguageDTO languageDTO){
		
		LanguageDTO languageDTOSalvo = languageServiceImpl.cadastrar(languageDTO);
		
		return new ResponseEntity<LanguageDTO>(languageDTOSalvo, HttpStatus.OK); 
	}	

}
