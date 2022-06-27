package uninter;

public class Tabuleiro {

	public String a1;
	public String a2;
	public String a3;
	public String b1;
	public String b2;
	public String b3;
	public String c1;
	public String c2;
	public String c3;
	
	public Tabuleiro(String a1, String a2, String a3, String b1, String b2, String b3, String c1, String c2,
			String c3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	public void criaTabuleiro(){
		
		System.out.println(" JOGO DA VELHA ");
		System.out.println();
		System.out.println("          1         2         3");
		System.out.println();
		System.out.println("a     |    " +a1+ "   |    " +a2+ "   |    "  +a3+ "   |   ");
		System.out.println("b     |    " +b1+ "   |    " +b2+ "   |    "  +b3+ "   |   ");
		System.out.println("c     |    " +c1+ "   |    " +c2+ "   |    "  +c3+ "   |   ");
		
	}	
			
}
	

