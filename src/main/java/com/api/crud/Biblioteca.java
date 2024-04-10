package com.api.crud;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Biblioteca {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(nullable = false)
	String titulo;
	
	@Column(nullable = false)
	String autor_principal;
	
	@Column(nullable = false)
	String ano_publicacao;
	
	@Column(nullable = false)
	Integer edicao;
	
	@Column(nullable = false)
	Date data_criacao;
	
	@Column(nullable = false)
	Date data_alteracao;

	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorPrincipal() {
        return autor_principal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autor_principal = autorPrincipal;
    }
	
}
