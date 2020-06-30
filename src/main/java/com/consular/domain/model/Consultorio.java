package com.consular.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Consultorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codConsultorio;
	
	@NotBlank
	private String nomeConsultorio;
	
	@NotNull
	private Integer cep;

	public Long getCodConsultorio() {
		return codConsultorio;
	}

	public void setCodConsultorio(Long codConsultorio) {
		this.codConsultorio = codConsultorio;
	}

	public String getNomeConsultorio() {
		return nomeConsultorio;
	}

	public void setNomeConsultorio(String nomeConsultorio) {
		this.nomeConsultorio = nomeConsultorio;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codConsultorio == null) ? 0 : codConsultorio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultorio other = (Consultorio) obj;
		if (codConsultorio == null) {
			if (other.codConsultorio != null)
				return false;
		} else if (!codConsultorio.equals(other.codConsultorio))
			return false;
		return true;
	}
	
}
