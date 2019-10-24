package br.com.infosolo.teste.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.infosolo.teste.model.Language;
import br.com.infosolo.teste.model.dto.LanguageDTO;

@Mapper
public interface LanguageMapper {
	
	LanguageDTO toDto(Language language);
	Language toEntity(LanguageDTO languageDTO);
	
	List<LanguageDTO> toDtos(List<Language> languages);
	List<Language> toEntities(List<LanguageDTO> languageDTOs);

}
