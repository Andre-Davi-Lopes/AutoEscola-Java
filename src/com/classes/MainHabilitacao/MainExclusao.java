package com.classes.MainHabilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR HABILITACAO**
		
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Habilitacao habilitacao = new Habilitacao(1);
		if (habilitacaoBO.excluir(habilitacao))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
