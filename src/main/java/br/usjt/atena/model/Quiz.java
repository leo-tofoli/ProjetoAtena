package br.usjt.atena.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Quiz {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String pergunta;
	private String a;
	private String b;
	private String c;
	private String d;
	private String resposta;


}
