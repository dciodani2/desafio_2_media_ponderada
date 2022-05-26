package bin.br.com.deciodani.git;
import java.util.Scanner;
public class desafio_2_media_ponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner input = new Scanner(System.in);
		    System.out.println("Nota 1 =");
		    double nota1 = input.nextDouble();
		    System.out.println("Nota 2 =");
		    double nota2 = input.nextDouble();
		    System.out.println("Nota 3 =");
		    double nota3 = input.nextDouble();
		//TODO: Complete os espaços em branco com uma possível solução para o desafio
		    double media = ((nota1 *  2  ) + (nota2 * 3   ) + (nota3 * 5   )) / (2+3+5);
		    System.out.printf("MEDIA = %.1f", media);
		    input.close();
	}

}
