package br.edu.utfpr.td.tsi.trabalho1.service;

import java.util.List;

import br.edu.utfpr.td.tsi.trabalho1.modelo.Paciente;

public interface PacienteService {

	public void cadastrar(Paciente paciente);
	public void deletar(String id);
	public void editar(Paciente paciente);
	public List<Paciente> listarTodos();
	public Paciente encontrarPeloId(String id);
	public Paciente listarPeloCpf(String cpf);

}
