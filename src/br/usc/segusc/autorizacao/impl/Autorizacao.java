package br.usc.segusc.autorizacao.impl;

import br.usc.segusc.autorizacao.entity.Perfil;
import br.usc.segusc.autorizacao.entity.Permissao;
import br.usc.segusc.autorizacao.exception.LoginInvalidoException;
import br.usc.segusc.autorizacao.services.IAutorizacaoService;

public class Autorizacao implements IAutorizacaoService {

	@Override
	public Perfil obterPerfis(String login) throws LoginInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permissao obterPermissoes(String login)
			throws LoginInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

}
