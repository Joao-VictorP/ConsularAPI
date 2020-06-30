package com.consular.domain.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private Date dataConsulta;
	
	@NotNull
	@ManyToOne
	private Sala numSala;
	
	@NotNull
	@ManyToOne
	private Consultorio codConsultorio;
	
	@NotBlank
	@ManyToOne
	private Medico crmMedico;
	
	@NotNull
	@ManyToOne
	private Paciente cpfPaciente;
	
	@NotBlank
	private StatusConsulta status;
	
	@NotNull
	private HistoricoConsulta historicoConsulta;
	
	@NotNull
	private BigDecimal valorConsulta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Sala getNumSala() {
		return numSala;
	}

	public void setNumSala(Sala numSala) {
		this.numSala = numSala;
	}

	public Consultorio getCodConsultorio() {
		return codConsultorio;
	}

	public void setCodConsultorio(Consultorio codConsultorio) {
		this.codConsultorio = codConsultorio;
	}

	public Medico getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(Medico crmMedico) {
		this.crmMedico = crmMedico;
	}

	public Paciente getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(Paciente cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public StatusConsulta getStatus() {
		return status;
	}

	public void setStatus(StatusConsulta status) {
		this.status = status;
	}

	public HistoricoConsulta getHistoricoConsulta() {
		return historicoConsulta;
	}

	public void setHistoricoConsulta(HistoricoConsulta historicoConsulta) {
		this.historicoConsulta = historicoConsulta;
	}

	public BigDecimal getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(BigDecimal valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Consulta other = (Consulta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
