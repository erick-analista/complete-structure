package br.com.infosolo.teste.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infosolo.teste.model.Language;
import br.com.infosolo.teste.model.dto.LanguageDTO;
import br.com.infosolo.teste.model.mapper.LanguageMapper;
import br.com.infosolo.teste.repository.LanguageRepository;
import br.com.infosolo.teste.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService{
			
	public LanguageServiceImpl() {
		super();
	}

	public LanguageServiceImpl(LanguageRepository languageRepository, LanguageMapper languageMapper) {
		super();
		this.languageRepository = languageRepository;
		this.languageMapper = languageMapper;
	}
	

	@Autowired
	private LanguageRepository languageRepository;
	
	//Converte para Entity ou Dto usando a anotação @Mapper e o plugin no pom.xml
	@Autowired
	private LanguageMapper languageMapper;
	

	@Override
	public LanguageDTO cadastrar(LanguageDTO languageDTO) {
				
		Language language = languageMapper.toEntity(languageDTO);
		Language languageSaved = languageRepository.save(language);
		LanguageDTO languageDTORecovered = languageMapper.toDto(languageSaved);
		
		return languageDTORecovered;
	}
}
