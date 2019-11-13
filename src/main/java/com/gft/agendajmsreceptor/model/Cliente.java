package com.gft.agendajmsreceptor.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import org.hibernate.validator.constraints.Length;

@Entity
public class Cliente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull @NotEmpty @Length(min = 5)
	private String nome;
	@NotNull @NotEmpty
	private String endereco;
	@NotNull @NotEmpty @Length(min = 5)
	private String email;
	@NotNull @NotEmpty
	private String sexo;
	@NotNull @NotEmpty
	private String telefone;
	@NotNull @NotEmpty
	private String celular;
	
	public Cliente() {
	}

	public Cliente(Long id, String nome, String endereco,
			String email, String sexo, String telefone, String celular) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.telefone = telefone;
		this.celular = celular;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente noticia = (Cliente) o;
        return Objects.equals(id, noticia.id) &&
                Objects.equals(nome, noticia.nome) &&
                Objects.equals(endereco, noticia.endereco) &&
                Objects.equals(email, noticia.email) &&
                Objects.equals(sexo, noticia.sexo) &&
                Objects.equals(telefone, noticia.telefone) &&
                Objects.equals(celular, noticia.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, email, sexo, telefone, celular);
    }

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", sexo=" + sexo
				+ ", telefone=" + telefone + ", celular=" + celular + "]";
	}
	
}
