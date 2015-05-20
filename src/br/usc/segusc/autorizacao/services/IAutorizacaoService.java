package br.usc.segusc.autorizacao.services;

import br.usc.segusc.autorizacao.entity.Perfil;
import br.usc.segusc.autorizacao.entity.Permissao;
import br.usc.segusc.autorizacao.exception.LoginInvalidoException;

public interface IAutorizacaoService {
	public Perfil obterPerfis(String login) throws LoginInvalidoException;
	public Permissao obterPermissoes(String login) throws LoginInvalidoException;
}
