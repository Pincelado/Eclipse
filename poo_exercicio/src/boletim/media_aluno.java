//Julia Merencia 352
package boletim;

public class media_aluno {

	public static void main(String[] args){
		Aluno a1 = new Aluno();	
		a1.nome = "Julia";
		a1.n1 = 8.0f;
		a1.n2 = 7.0f;
		a1.n3 = 9.5f;
		a1.n4 = 10.0f;
		a1.media = (a1.n1 + a1.n2 + a1.n3 + a1.n4)/4;
		a1.disciplina = "Programacão de aplicativos";
		
		professor p1 = new professor();
		p1.nomeProf = "Alex";
		
		System.out.println("A média de "+ a1.nome + "é: " + a1.media + " na matéria de " + a1.disciplina + " do professor " +p1.nomeProf );
}
}