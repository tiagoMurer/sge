package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	private String codigoCurso;
	private Collection<Turma> turmas;
	
	
	public String getCodigoCurso(){
		return codigoCurso;
	}
	
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}
	
	public Curso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
}
