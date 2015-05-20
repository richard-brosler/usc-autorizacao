package br.usc.segusc.autorizacao.entity;

public class Perfil {
	private String nome;
	private Permissao permissoes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Permissao getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(Permissao permissoes) {
		this.permissoes = permissoes;
	}
}
