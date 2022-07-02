package uninter;

import java.util.Scanner;

public class Jogador {
	Tabuleiro tab;
	String nome;
	
	public Jogador(Tabuleiro tab, String nome) {
		super();
		this.tab = tab;
		this.nome = nome;
	}



	public void jogada() {
		String marcar = " ";
				System.out.println();
				System.out.println("Sua vez! Escolha a posição da jogada. Use uma letra + um número (ex: a1) ");
				Scanner teclado = new Scanner(System.in);
				marcar = teclado.next();
				
				while (!"a1".equals(marcar) && !"a2".equals(marcar) && !"a3".equals(marcar) && !"b1".equals(marcar) && !"b2".equals(marcar)
						 && !"b3".equals(marcar) && !"c1".equals(marcar) && !"c2".equals(marcar) && !"c3".equals(marcar)) {
					
					System.out.println("Sua vez! Escolha a posição da jogada. Use uma letra e um número (ex: a1): ");
					marcar = teclado.next();
				}

					if (marcar.equals("a1") && !tab.a1.equals("X") && !tab.a1.equals("O")) { // Verifica se a posição já não foi marcada
						tab.a1 = "X";
					} 
					else if (marcar.equals("a2") && !tab.a2.equals("X") && !tab.a2.equals("O")){
						tab.a2 = "X";	
					}
					else if (marcar.equals("a3") && !tab.a3.equals("X") && !tab.a3.equals("O")){
						tab.a3 = "X";	
					}
					else if (marcar.equals("b1") && !tab.b1.equals("X") && !tab.b1.equals("O")){
						tab.b1 = "X";	
					}
					else if (marcar.equals("b2") && !tab.b2.equals("X") && !tab.b2.equals("O")){
						tab.b2 = "X";	
					}
					else if (marcar.equals("b3") && !tab.b3.equals("X") && !tab.b3.equals("O")){
						tab.b3 = "X";	
					}
					else if (marcar.equals("c1") && !tab.c1.equals("X") && !tab.c1.equals("O")){
						tab.c1 = "X";	
					}
					else if (marcar.equals("c2") && !tab.c2.equals("X") && !tab.c2.equals("O")){
						tab.c2 = "X";	
					}
					else if (marcar.equals("c3") && !tab.c3.equals("X") && !tab.c3.equals("O")){
						tab.c3 = "X";	
					}
					
			}
	}
