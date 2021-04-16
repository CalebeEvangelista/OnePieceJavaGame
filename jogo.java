import java.util.Scanner;

public class jogo {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Personagem ruffy = new Personagem();
		ruffy.setNome("Ruffy");
		ruffy.setDefesa(300);
		ruffy.setForcaAtaque(110);
		ruffy.setVida(50);
		ruffy.setVivo(true);
		
		Personagem zoro = new Personagem();
		zoro.setNome("Zoro");
		zoro.setDefesa(250);
		zoro.setForcaAtaque(90);
		zoro.setVida(40);
		zoro.setVivo(true);
		
		Personagem usopp = new Personagem();
		usopp.setNome("Usopp");
		usopp.setDefesa(150);
		usopp.setForcaAtaque(50);
		usopp.setVida(20);
		usopp.setVivo(true);

		Personagem nami = new Personagem();
		nami.setNome("Nami");
		nami.setDefesa(140);
		nami.setForcaAtaque(40);
		nami.setVida(15);
		nami.setVivo(true);
		
		while (true) {
			System.out.println("###############################");
			System.out.println("# ONE PIECE BATTLE GAME v1.00 #");
			System.out.println("###############################");
			System.out.println("########## ATACANTES ##########");
			System.out.println("# 1. RUFFY                    #");
			System.out.println("# 2. ZORO                     #");
			System.out.println("# 3. USOPP                    #");
			System.out.println("# 4. NAMI                     #");
			System.out.println("###############################");
			System.out.print("Digite o número do atacante:  ");
			int atacante = sc.nextInt();
			System.out.println("###############################");
			
			Personagem Atacante = null;
			Personagem Defensor = null;
			
			switch (atacante) {
			case 1 :
				Atacante = ruffy;
				break;
			case 2:
				Atacante = zoro;
				break;
			case 3:
				Atacante = usopp;
				break;
			case 4:
				Atacante = nami;
				break;
			default:
				System.out.println("Não tem personagem com esse número veja se digitou certo!");
				break;
			}
			
			if (Atacante != null) {
				System.out.println("########## DEFESORES ##########");
				System.out.println("# 1. RUFFY                    #");
				System.out.println("# 2. ZORO                     #");
				System.out.println("# 3. USOPP                    #");
				System.out.println("# 4. NAMI                     #");
				System.out.println("###############################");
				System.out.print("Digite o número do defensor:  ");
				int defensor = sc.nextInt();
				System.out.println("###############################");
				
				switch (defensor) {
				case 1 :
					Defensor = ruffy;
					break;
				case 2:
					Defensor = zoro;
					break;
				case 3:
					Defensor = usopp;
					break;
				case 4:
					Defensor = nami;
					break;
				default:
					System.out.println("Não tem personagem com esse número veja se digitou certo!");
					break;
				}
				
				if (Defensor != null);
					Atacante.ataques(Atacante);
					Atacante.atacar(Defensor);
					
			}
			
		
		}
	}
}		

