package com.rafael.crud.dto;

import java.time.LocalDate;

import com.rafael.crud.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {

	private Long id;
	
	@NotBlank(message = "Campo obrigatório!")
	private String name;
	private String cpf;
	private Double income;
	
	@PastOrPresent(message = "Digite uma data de nascimento valida!")
	private LocalDate birthdate;
	private Integer children;

	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthdate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthdate = birthdate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthdate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public Integer getChildren() {
		return children;
	}
}