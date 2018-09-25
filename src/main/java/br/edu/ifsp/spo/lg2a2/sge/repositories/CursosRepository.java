package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.Collection;


import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepository {
	
	private static Collection<Aluno> alunos = new ArrayList<Aluno>();
	private static Collection<Turma> turmas = new ArrayList<Turma>();
	private static Collection<Curso> cursos = new ArrayList<Curso>();
	
	
	public Curso buscarPorCodigo(String codigo) {
		Curso resultado = null;
		
		for(Curso curso : CursosRepository.cursos) {
			if(curso.getCodigoCurso().equals(codigo)) {
				resultado = curso;
				break;
			}
			
		return curso;
	}
	
	public Turma buscarTurmas(String codigoCurso){
		Turma resultado = null;
		for(Turma turma : cursosRepository.turma){
			if(turma.getCodigoTurma().equals(codigoTurma) ) {
				resultado = turma;
				break;
			}
		}
		return resultado;
	}
		
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		Turma resultado = null;
		for(Turma turma : cursosRepository.turma) {
			for(Aluno aluno: AlunosRepository.aluno) {
				if(aluno.getProntuario().equals(codigoTurma) ) {
				resultado = aluno;
				break;
				}
			}
		}
		return resultado;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		Aluno resultado = null;
		for(Aluno aluno: AlunosRepository.alunos) {
			if(aluno.getCpf().equals(cpf)) {
				resultado = aluno;
			}
		}
		return resultado;
	}
	
	public void adicionarAluno(Aluno aluno) {
		AlunosRepository.alunos.add(aluno);
	}
}
