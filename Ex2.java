package controller;

import java.util.ArrayList;
import aluno.Aluno;

public class Ex2 
{
	ArrayList misc;
	ArrayList<Aluno> alunos;
	
	public Ex2()
	{
		misc = new ArrayList<>();
		alunos = new ArrayList<>();
	
		loadMockupData();
	}
	
	public void loadMockupData()
	{
		misc.add('1');
		misc.add("Miguel Cigano");
		misc.add("26");
		misc.add("914455783");
		
		
		Aluno Andre = new Aluno("André Santos", 19, 932814828);
		misc.add(Andre);
		alunos.add(Andre);
	}
	
	
	public void visualizarData()
	{
		for(int i=0; i<misc.size(); i++)
		{
			System.out.println(misc.get(i));
		}
		
		int num = (int) misc.get(0);
		String nome = (String) misc.get(1);
		
		
		
		Aluno armando = (Aluno) misc.get(4);
		Aluno julio = alunos.get(0);
		
		
	}
	
}
