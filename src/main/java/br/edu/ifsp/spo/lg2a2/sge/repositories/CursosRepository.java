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
			if(curso.getCodigo().equals(codigo)) {
				resultado = curso;
				break;
			}
			
		return curso;
	}
	
	public Collection<Turma> buscarTurmas(String codigoCurso){
		return null;
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		return null;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		Aluno resultado = 0;
		for(Aluno aluno: AlunosRepository.alunos) {
			if(aluno.getCpf().equals(cpf)) {
				resultado++;
			}
		}
		return resultado > 0;
	}
	
	public void adicionarAluno(Aluno aluno) {
		AlunosRepository.alunos.add(aluno);
	}
}
