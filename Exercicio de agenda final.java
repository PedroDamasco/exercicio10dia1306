package exe;
import java.util.Scanner;
import java.util.Arrays;
public class ExercicioAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
import java.util.Scanner;

public class Comentarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando scanner basico
		Scanner sc = new Scanner(System.in);
		// criando dados de entrada
		int n,qq;
		
		// criando matriz com tamanho ja definido
		String [][] Matriz = new String [11][5];
		
		// criando Looping 
		for (int b=0;b<10;b++) {		
			int x=0;
		// Criando dados para contar e mover.
		x=b+1;
		// definindo a primeira linha com a organizacao das informacoes adquiridas.
		Matriz [0][0] = "Nome";
		Matriz [0][1] = "Endereco";
		Matriz [0][2] = "Codigo postal";
		Matriz [0][3] = "Bairro";
		Matriz [0][4] = "Telefone";
		
		// interagindo com o usuario
		System.out.printf("Bom dia, favor preencher a tabela a seguir: ");
		// Solicitando informacoes para agenda.
		System.out.printf("\nInforme seu nome:");
		Matriz[x][0]=sc.nextLine();
		
		System.out.printf("\nInforme seu Endereço:");
		Matriz[x][1]=sc.nextLine();
		
		System.out.printf("\nInforme seu Codigo Postal:");
		Matriz[x][2]=sc.nextLine();
		
		System.out.printf("\nInforme seu Bairro:");
		Matriz[x][3]=sc.nextLine();
		
		System.out.printf("\nInforme seu Telefone:");
		Matriz[x][4]=sc.nextLine();
		
		}
		//imprimir a agenda com as informacoes organizada.
		qq=Matriz.length;
		for (int i=0; i<qq;i++) {
			System.out.printf("Linha :"+ (i));
			for(int g=0;g<5;g++)
				System.out.printf("  "+ Matriz[i][g]);
				System.out.println();
		}}}