package uninter;

import java.util.Scanner;

public class Jogo {
	
	public static void main(String[] args) {
		 Tabuleiro tab = new Tabuleiro(" "," ", " ", " ", " ", " ", " ", " ", " ");
		 Jogador j1 = new Jogador(tab, " ");
		 Computador e = (new Easy(tab));
		 Computador n = (new Normal(tab));
		 Computador h = (new Hardcore(tab));
		
		Scanner nomejogador = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		j1.nome = nomejogador.next();
		
		int opcao = 0;
		while (opcao != 1 && opcao != 2 && opcao != 3) {  // Cria um loop de verificação para selecionar o nível
			
			Scanner teclado = new Scanner(System.in);
			System.out.println();
			System.out.println("O jogo da velha está começando, " + j1.nome +  "! Escolha uma dificuldade: ");
			System.out.println();
			System.out.println("1 - easy");
			System.out.println("2 - normal");
			System.out.println("3 - hardcore");
			opcao = teclado.nextInt();
		}
		
		if (opcao == 1){ // Aqui o computador nível easy é selecionado

			System.out.println();
			tab.criaTabuleiro();
			System.out.println();
			
			while (tab.a1.equals(" ") || tab.a2.equals(" ") || tab.a3.equals(" ") || tab.b1.equals(" ") || tab.b2.equals(" ")
					 || tab.b3.equals(" ") || tab.c1.equals(" ") || tab.c2.equals(" ") || tab.c3.equals(" ")) {
				
				
				j1.jogada(); // Chama função jogada() da classe Jogador
				
				System.out.println();
				tab.criaTabuleiro();
				System.out.println();
				
				if ((tab.a1.equals("X") && tab.a2.equals("X") && tab.a3.equals("X")) || (tab.b1.equals("X") && tab.b2.equals("X") && tab.b3.equals("X")) ||
				(tab.c1.equals("X") && tab.c2.equals("X") && tab.c3.equals("X")) || (tab.a1.equals("X") && tab.b1.equals("X") && tab.c1.equals("X")) ||
				(tab.a2.equals("X") && tab.b2.equals("X") && tab.c2.equals("X")) || (tab.a3.equals("X") && tab.b3.equals("X") && tab.c3.equals("X")) ||
				(tab.a1.equals("X") && tab.b2.equals("X") && tab.c3.equals("X")) || (tab.c1.equals("X") && tab.b2.equals("X") && tab.a3.equals("X"))){
					System.out.println();
					System.out.println("VOCÊ VENCEU A MÁQUINA! PARABÉNS!");
					break;
				}
				
				boolean empate; // Verifica se deu empate
				
				if (!tab.a1.equals(" ") && !tab.a2.equals(" ") && !tab.a3.equals(" ") && !tab.b1.equals(" ") && !tab.b2.equals(" ") && !tab.b3.equals(" ") && 
				!tab.c1.equals(" ") &&!tab.c2.equals(" ") &&!tab.c3.equals(" ")) {
						empate = true;
						System.out.println("EMPATE!");
						break;
				}
			
				System.out.println("Vez da máquina...");
				System.out.println();
				e.jogaEasy(); // Chama função jogaEasy() da classe Easy
				tab.criaTabuleiro();
				
				if ((tab.a1.equals("O") && tab.a2.equals("O") && tab.a3.equals("O")) || (tab.b1.equals("O") && tab.b2.equals("O") && tab.b3.equals("O")) ||
				(tab.c1.equals("O") && tab.c2.equals("O") && tab.c3.equals("O")) || (tab.a1.equals("O") && tab.b1.equals("O") && tab.c1.equals("O")) ||
				(tab.a2.equals("O") && tab.b2.equals("O") && tab.c2.equals("O")) || (tab.a3.equals("O") && tab.b3.equals("O") && tab.c3.equals("O")) ||
				(tab.a1.equals("O") && tab.b2.equals("O") && tab.c3.equals("O")) || (tab.c1.equals("O") && tab.b2.equals("O") && tab.a3.equals("O"))){
					System.out.println();
					System.out.println("VOCÊ PERDEU! A era das máquinas começou...");
					break;
				}
				
			}	
			
		}
		
		else if(opcao == 2) { // Aqui o computador nível normal é selecionado
			
			System.out.println();
			tab.criaTabuleiro();
			System.out.println();
			
			while (tab.a1.equals(" ") || tab.a2.equals(" ") || tab.a3.equals(" ") || tab.b1.equals(" ") || tab.b2.equals(" ")
					 || tab.b3.equals(" ") || tab.c1.equals(" ") || tab.c2.equals(" ") || tab.c3.equals(" ")) {
				
				j1.jogada(); // Chama função jogada() da classe Jogador
				
				System.out.println();
				tab.criaTabuleiro();
				System.out.println();
				
				if ((tab.a1.equals("X") && tab.a2.equals("X") && tab.a3.equals("X")) || (tab.b1.equals("X") && tab.b2.equals("X") && tab.b3.equals("X")) ||
				(tab.c1.equals("X") && tab.c2.equals("X") && tab.c3.equals("X")) || (tab.a1.equals("X") && tab.b1.equals("X") && tab.c1.equals("X")) ||
				(tab.a2.equals("X") && tab.b2.equals("X") && tab.c2.equals("X")) || (tab.a3.equals("X") && tab.b3.equals("X") && tab.c3.equals("X")) ||
				(tab.a1.equals("X") && tab.b2.equals("X") && tab.c3.equals("X")) || (tab.c1.equals("X") && tab.b2.equals("X") && tab.a3.equals("X"))){
					System.out.println();
					System.out.println("VOCÊ VENCEU A MÁQUINA! PARABÉNS!");
					break;
				}
				
				boolean empate; // Verifica se deu empate
				
				if (!tab.a1.equals(" ") && !tab.a2.equals(" ") && !tab.a3.equals(" ") && !tab.b1.equals(" ") && !tab.b2.equals(" ") && !tab.b3.equals(" ") && 
				!tab.c1.equals(" ") &&!tab.c2.equals(" ") &&!tab.c3.equals(" ")) {
						empate = true;
						System.out.println("EMPATE!");
						break;
				}
			
				System.out.println("Vez da máquina...");
				System.out.println();
				n.jogaNormal(); 
				tab.criaTabuleiro();
				
				if ((tab.a1.equals("O") && tab.a2.equals("O") && tab.a3.equals("O")) || (tab.b1.equals("O") && tab.b2.equals("O") && tab.b3.equals("O")) ||
				(tab.c1.equals("O") && tab.c2.equals("O") && tab.c3.equals("O")) || (tab.a1.equals("O") && tab.b1.equals("O") && tab.c1.equals("O")) ||
				(tab.a2.equals("O") && tab.b2.equals("O") && tab.c2.equals("O")) || (tab.a3.equals("O") && tab.b3.equals("O") && tab.c3.equals("O")) ||
				(tab.a1.equals("O") && tab.b2.equals("O") && tab.c3.equals("O")) || (tab.c1.equals("O") && tab.b2.equals("O") && tab.a3.equals("O"))){
					System.out.println();
					System.out.println("VOCÊ PERDEU! A era das máquinas começou...");
					break;
				}
			}
	
		}
		
		else if(opcao == 3) { //// Aqui o computador nível hardcore é selecionado
				
			System.out.println();
			tab.criaTabuleiro();
			System.out.println();
				
			while (tab.a1.equals(" ") || tab.a2.equals(" ") || tab.a3.equals(" ") || tab.b1.equals(" ") || tab.b2.equals(" ")
					|| tab.b3.equals(" ") || tab.c1.equals(" ") || tab.c2.equals(" ") || tab.c3.equals(" ")) {
					
					
				
				System.out.println("Vez da máquina...");
				System.out.println();
				h.jogaHardcore(); 
				tab.criaTabuleiro();
					
					
				if ((tab.a1.equals("O") && tab.a2.equals("O") && tab.a3.equals("O")) || (tab.b1.equals("O") && tab.b2.equals("O") && tab.b3.equals("O")) ||
				(tab.c1.equals("O") && tab.c2.equals("O") && tab.c3.equals("O")) || (tab.a1.equals("O") && tab.b1.equals("O") && tab.c1.equals("O")) ||
				(tab.a2.equals("O") && tab.b2.equals("O") && tab.c2.equals("O")) || (tab.a3.equals("O") && tab.b3.equals("O") && tab.c3.equals("O")) ||
				(tab.a1.equals("O") && tab.b2.equals("O") && tab.c3.equals("O")) || (tab.c1.equals("O") && tab.b2.equals("O") && tab.a3.equals("O"))){
					System.out.println();
					System.out.println("VOCÊ PERDEU! A era das máquinas começou...");
					break;
					}
					
				j1.jogada(); // Chama função jogada() da classe Jogador
					
				System.out.println();
				tab.criaTabuleiro();
				System.out.println();
					
				if ((tab.a1.equals("X") && tab.a2.equals("X") && tab.a3.equals("X")) || (tab.b1.equals("X") && tab.b2.equals("X") && tab.b3.equals("X")) ||
				(tab.c1.equals("X") && tab.c2.equals("X") && tab.c3.equals("X")) || (tab.a1.equals("X") && tab.b1.equals("X") && tab.c1.equals("X")) ||
				(tab.a2.equals("X") && tab.b2.equals("X") && tab.c2.equals("X")) || (tab.a3.equals("X") && tab.b3.equals("X") && tab.c3.equals("X")) ||
				(tab.a1.equals("X") && tab.b2.equals("X") && tab.c3.equals("X")) || (tab.c1.equals("X") && tab.b2.equals("X") && tab.a3.equals("X"))){
					System.out.println();
					System.out.println("VOCÊ VENCEU A MÁQUINA! PARABÉNS!");
					break;
				}
				
			}
		}
		
	}
			
}

