package br.usc.segusc.autorizacao.services;

import br.usc.segusc.autorizacao.impl.Autorizacao;

public class AutorizacaoFactory {
	
	private static AutorizacaoFactory inst;
	private Autorizacao aut;
	
	private AutorizacaoFactory(){
		aut = new Autorizacao();
	}
	public static AutorizacaoFactory getInstance(){
		if (inst==null)
			inst = new AutorizacaoFactory();
		return inst;
	}
	public static IAutorizacaoService getAutorizacaoServiceImpl(){
		return getInstance().aut;
	}
}
