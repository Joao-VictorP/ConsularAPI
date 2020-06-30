package com.consular.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numSala;
	
	@NotBlank
	@ManyToOne
	private Consultorio codConsultorio;
	
	@NotBlank
	private String descricaoSala;

	public Long getNumSala() {
		return numSala;
	}

	public void setNumSala(Long numSala) {
		this.numSala = numSala;
	}

	public Consultorio getCodConsultorio() {
		return codConsultorio;
	}

	public void setCodConsultorio(Consultorio codConsultorio) {
		this.codConsultorio = codConsultorio;
	}

	public String getDescricaoSala() {
		return descricaoSala;
	}

	public void setDescricaoSala(String descricaoSala) {
		this.descricaoSala = descricaoSala;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numSala == null) ? 0 : numSala.hashCode());
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
		Sala other = (Sala) obj;
		if (numSala == null) {
			if (other.numSala != null)
				return false;
		} else if (!numSala.equals(other.numSala))
			return false;
		return true;
	}
	
}
