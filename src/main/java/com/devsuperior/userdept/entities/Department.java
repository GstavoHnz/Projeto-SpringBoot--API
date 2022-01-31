package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_department") //Criando o nome Table do banco de Dados
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Definindo o ID do Banco de Dados
	private Long id;
	private String name;
	
	public Department() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
