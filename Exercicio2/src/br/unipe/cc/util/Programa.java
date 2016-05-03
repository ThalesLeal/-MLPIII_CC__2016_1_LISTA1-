package br.unipe.cc.util;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import br.unipe.cc.modelo.*;

public class Programa {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;
		
		Professor professor = new Professor(1,"Jefferson","Java avançado");
		Set<Aluno> listaDeAlunos = new TreeSet<Aluno>();
		Iterator<Aluno> iterator = null;

		Curso curso = new Curso(professor, listaDeAlunos,"Ciências da Computação",1);
		
		while(opcao != 0){
			for(int i = 0; i < 100; i++) System.out.println("");
			
			iterator = listaDeAlunos.iterator();

			System.out.println("Curso de capacitação");
			System.out.println("Curso: " + curso.getNome());
			System.out.println("Professor: " + professor + "\n");
			
			System.out.println("1.Incluir Aluno");
			System.out.println("2.Remover Aluno");
			System.out.println("3.Verificar se o Aluno já está matriculado");
			System.out.println("4.Listar aprovados");
			System.out.println("5.Listar reprovados por falta");
			System.out.println("6.Listar por ordem alfabetica");
			System.out.println("0.Sair");

			System.out.println("\nInforme a opção desejada:");
			
			opcao = scan.nextInt();
			
			switch (opcao) {
				case 1:
					listaDeAlunos.add(new Aluno(2,"Larissa Targino",10,0));

					if (listaDeAlunos.contains(new Aluno(1,"Arthur Silvestre",6,16)))
						System.out.println("Aluno já está matriculado neste curso.");
					else 
						listaDeAlunos.add(new Aluno(1,"Arthur Silvestre",6,16));
					
					break;
				case 2:
					if (listaDeAlunos.contains(new Aluno(1,"Arthur Silvestre",6,16)))
						listaDeAlunos.remove(new Aluno(1,"Arthur Silvestre",6,16));
					else 
						System.out.println("Aluno não encontrado.");

					break;
				case 3:
					if (listaDeAlunos.contains(new Aluno(1,"Arthur Silvestre",6,16)))
						System.out.println("Aluno encontrado.");
					else 
						System.out.println("Aluno não encontrado.");
					
					break;
				case 4:
					while (iterator.hasNext()){
						Aluno alunoAtual = iterator.next(); 
						if (alunoAtual.getMedia() > 7.0){
							System.out.println(alunoAtual);
						}
					}

					break;
				case 5:
					while (iterator.hasNext()){
						Aluno alunoAtual = iterator.next(); 
						if (alunoAtual.getFaltas() > 15){
							System.out.println(alunoAtual);
						}
					}
					
					break;
				case 6:
					System.out.println(listaDeAlunos);
					break;
				default:
					if(opcao != 0) System.out.println("Opção inválida.");
					break;
			}
		}
	}
}