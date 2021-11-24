package org.serratec.backend.h2banco.domain;

import org.serratec.backend.h2banco.exception.EnumValidationException;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Combustivel {
	
	ALCOOL(1, "Álcool"),
	GASOLINA(2, "Gasolina"),
	DIESEL(3, "Diesel"),
	FLEX(4, "Flex");
	
	private Integer codigo;
	private String tipo;
	
	@JsonCreator
	public static Combustivel verifica(Integer value) throws EnumValidationException {
		for (Combustivel c : values()) if (value.equals(c.getCodigo())) return c;

		throw new EnumValidationException("Combustível preenchida incorretamente: " + value);
	}
}
