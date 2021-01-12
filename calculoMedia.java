import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b1 = new Scanner(System.in);
		System.out.print("Digite a nota da prova - 1o bimestre: ");
		double notaProva1 = b1.nextDouble();

		System.out.print("Digite a nota  do projeto - 1o bimestre: ");
		double notaProjeto1 = b1.nextDouble();

		System.out.print("Digite a nota da Lista de exercícios - 1o bimestre: ");
		double notaEx1 = b1.nextDouble();

		System.out.print("Digite a nota do Projetos de software livre - 1o bimestre: ");
		double notaPs1 = b1.nextDouble();

		Scanner b2 = new Scanner(System.in);
		System.out.print("Digite a nota da prova - 2o bimestre: ");
		double notaProva2 = b2.nextDouble();

		System.out.print("Digite a nota do projeto - 2o bimestre: ");
		double notaProjeto2 = b2.nextDouble();

		System.out.print("Digite a nota da Lista de exercícios - 2o bimestre: ");
		double notaEx2 = b2.nextDouble();

		System.out.print("Digite a nota do Projetos de software livre - 2o bimestre: ");
		double notaPs2 = b2.nextDouble();

		double mediaPrimeiroBimestre = ((notaProva1 * 3) + (notaProjeto1 * 3) + (notaEx1 * 2) + (notaPs1 * 3)) / 11;
		double mediaSegundoBimestre = ((notaProva2 * 3) + (notaProjeto2 * 3) + (notaEx2 * 2) + (notaPs2 * 3)) / 11;

		System.out.println("MÉDIA DO PRIMEIRO BIMESTRE: " + mediaPrimeiroBimestre);
		System.out.println("MÉDIA DO SEGUNDO BIMESTRE: " + mediaSegundoBimestre);

		double mediaSemestral = (mediaPrimeiroBimestre + mediaSegundoBimestre)/2;

		if (mediaSemestral >= 8) {
			System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO APROVADO!");
		} else {
			System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO REPROVADO! NOTA NECESSÁRIA NA PROVA FINAL: " + (10 - mediaSemestral));
		}

	}

}