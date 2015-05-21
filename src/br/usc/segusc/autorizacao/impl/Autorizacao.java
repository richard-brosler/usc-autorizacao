package br.usc.segusc.autorizacao.impl;

import br.usc.segusc.autorizacao.entity.Perfil;
import br.usc.segusc.autorizacao.entity.Permissao;
import br.usc.segusc.autorizacao.exception.LoginInvalidoException;
import br.usc.segusc.autorizacao.services.IAutorizacaoService;

public class Autorizacao implements IAutorizacaoService {
	private Perfil perfil;
	private Permissao permissao;
	public Autorizacao() {
		perfil = new Perfil();
		permissao = new Permissao();
		perfil.setPermissoes(permissao);
		permissao.setDescricao("teste de permissao");
	}
	@Override
	public Perfil obterPerfis(String login) throws LoginInvalidoException {
		perfil.setNome(login);
		return perfil;
	}

	@Override
	public Permissao obterPermissoes(String login)
			throws LoginInvalidoException {
		return permissao;
	}

}
