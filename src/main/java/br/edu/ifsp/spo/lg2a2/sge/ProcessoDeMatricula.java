package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import java.util.Random;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;

public class ProcessoDeMatricula {
	
	private Curso curso;
	
	public ProcessoDeMatricula(Curso curso) {
		this.curso = curso;
	}

	public boolean verificarExistenciaAluno(String cpf) {
		Aluno resultado = null;
		for(Curso turma: CursosRepository.cursos) {
			for(Aluno aluno: CursosRepository.turmas) {
				if(aluno.getCpf().equals(cpf)) {
					resultado = aluno;
				}
			}
		}
		return resultado == aluno;
	}
	
	public ComprovanteMatricula processarMatricula(String prontuario, String cpf, String nome, String email, SituacaoMatricula situacao) {
		
		Aluno aluno.prontuario = new gerarProntuario();
		return null;
	}
	
	private String gerarProntuario() {
		String prontuario = "SP";
		int i = 0;
		while(i < 7) {
			int num = random.nextInt(10) + 1;
			char caracter = (char) num;
			prontuario = prontuario + caracter;
		}
		return prontuario;
	}
	
}
