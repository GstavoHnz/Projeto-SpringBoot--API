package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user") //Criando o nome da Table do Banco de Dados.
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Definindo o ID do Banco de Dados
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "department_id") //Definindo o nome da Chave Estrangeira do Banco
	private Department department;
	
	public User() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
