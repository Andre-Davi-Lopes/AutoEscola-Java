package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UM NOVO ALUNO**	
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno("kyro" ,"000.052.399-41" , "AB");
		
				if (alunoBO.inserir(aluno))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				aluno = new Aluno("Luis", "288.771.321-11" , "A");
				
				if (alunoBO.inserir(aluno))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				aluno = new Aluno("Murilo" , "280.888.861-09" , "ABCD");
				
				if (alunoBO.inserir(aluno))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
