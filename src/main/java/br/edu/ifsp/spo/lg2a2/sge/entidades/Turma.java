package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Turma {
	
	private String codigoTurma;
	private Collection<Aluno> alunos;
	
	public String getCodigoTurma(){
		return codigoTurma;
	}
	
	public Collection<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public Turma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
}
