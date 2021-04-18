import java.util.Scanner;

public class Personagem {
	Scanner sc = new Scanner(System.in);

	private String nome, ataque, golpe;
	private double vida;
	private double forcaAtaque;
	private double defesa;
	private boolean vivo;
	private String atacante, atacado;
	private String nomeGolpe;
	private int forcaGolpe;
	private double danoGolpe;

	public void ataques(Personagem atacante) {

		if (this.getNome() == "Ruffy") {
			System.out.println("########### ATAQUES ###########");
			System.out.println("# 1. PISTOL                   #");
			System.out.println("# 2. BAZOOKA                  #");
			System.out.println("# 3. ROCKET                   #");
			System.out.println("# 4. RIFLE                    #");
			System.out.println("###############################");
			System.out.print("Digite o número do ataque:  ");
			int ataque = sc.nextInt();
			System.out.println("###############################");

			switch (ataque) {
			case 1:
				this.setnomeGolpe("Pistol");
				this.setForcaGolpe(110);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 2:
				this.setnomeGolpe("Bazooka");
				this.setForcaGolpe(100);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 3:
				this.setnomeGolpe("Rocket");
				this.setForcaGolpe(150);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 4:
				this.setnomeGolpe("Rifle");
				this.setForcaGolpe(90);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			default:
				System.out.println("Esse ataque não existe!");
				break;
			}

		} else if (this.getNome() == "Zoro") {
			System.out.println("########### ATAQUES ###########");
			System.out.println("# 1. SANJUROKU                #");
			System.out.println("# 2. TAKA NAMI                #");
			System.out.println("# 3. ONE GIRI                 #");
			System.out.println("# 4. RENGOKU                  #");
			System.out.println("###############################");
			System.out.print("Digite o número do ataque:  ");
			int ataque2 = sc.nextInt();
			System.out.println("###############################");

			switch (ataque2) {
			case 1:
				this.setnomeGolpe("Sanjuroku");
				this.setForcaGolpe(110);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 2:
				this.setnomeGolpe("Taka Nami");
				this.setForcaGolpe(100);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 3:
				this.setnomeGolpe("One Giri");
				this.setForcaGolpe(150);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 4:
				this.setnomeGolpe("Rengoku");
				this.setForcaGolpe(90);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			default:
				System.out.println("Esse ataque não existe!");
				break;
			}
		} else if (this.getNome() == "Usopp") {
			System.out.println("########### ATAQUES ###########");
			System.out.println("# 1. KABUTO                   #");
			System.out.println("# 2. POP GREEN                #");
			System.out.println("# 3. ESTILINGADA              #");
			System.out.println("# 4. MENTIRA                  #");
			System.out.println("###############################");
			System.out.print("Digite o número do ataque:  ");
			int ataque2 = sc.nextInt();
			System.out.println("###############################");

			switch (ataque2) {
			case 1:
				this.setnomeGolpe("Kabuto");
				this.setForcaGolpe(110);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 2:
				this.setnomeGolpe("Pop Green");
				this.setForcaGolpe(100);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 3:
				this.setnomeGolpe("Estilingada");
				this.setForcaGolpe(150);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			case 4:
				this.setnomeGolpe("Mentira");
				this.setForcaGolpe(90);
				this.setdanoGolpe(0);
				System.out.println(this.getNome() + " está atacando com o ataque " + this.getnomeGolpe());
				break;
			default:
				System.out.println("Esse ataque não existe!");
				break;
			}
		} else if (this.getNome() == "Nami") {
			System.out.println("########### ATAQUES ###########");
			System.out.println("# 1. PAULADA                  #");
			System.out.println("# 2. CASETADA                 #");
			System.out.println("# 3. PORRADA                  #");
			System.out.println("# 4. LAPADA                   #");
			System.out.println("###############################");
			System.out.print("Digite o número do ataque:  ");
			int ataque2 = sc.nextInt();
			System.out.println("###############################");

			switch (ataque2) {
			case 1:
				this.setnomeGolpe("Paulada");
				this.setForcaGolpe(110);
				this.setdanoGolpe(0);
				System.out.println("A " + this.getNome() + " está dando uma " + this.getnomeGolpe());
				break;
			case 2:
				this.setnomeGolpe("Casetada");
				this.setForcaGolpe(100);
				this.setdanoGolpe(0);
				System.out.println("A " + this.getNome() + " está dando uma " + this.getnomeGolpe());
				break;
			case 3:
				this.setnomeGolpe("Porrada");
				this.setForcaGolpe(150);
				this.setdanoGolpe(0);
				System.out.println("A " + this.getNome() + " está dando uma " + this.getnomeGolpe());
				break;
			case 4:
				this.setnomeGolpe("Lapada");
				this.setForcaGolpe(90);
				this.setdanoGolpe(0);
				System.out.println("A " + this.getNome() + " está dando uma " + this.getnomeGolpe());
				break;
			default:
				System.out.println("Esse ataque não existe!");
				break;
			}
		}
	}

	public void atacar(Personagem inimigo) {
		
		// AVISO DE COMBATE
		System.out.println(this.getNome() + " Está atacando " + inimigo.getNome());

		// RETIRAR DA VIDA E DA DEFESA
		if (inimigo.getDefesa() < this.getForcaGolpe()) {
			
			// GERA UM NUMERO ENTRE 0 E 10
			int max = 10;
	        int min = 0;
	        int range = max - min + 1;
	        int rand = 0;
	        
	        for (int i = 0; i < 1; i++) {
	            rand = (int)(Math.random() * range) + min; 
	            }
	        
	        // FAZ O CALCULO DO DANO
	        if (rand <= 5) {
	        	this.setdanoGolpe(this.getForcaGolpe() / 2);
	        	System.out.println("Acertou mas deu um dano baixo!");
	        } else if (rand > 5 && rand < 8) {
	        	this.setdanoGolpe(0);
	        	System.out.println("Errou o golpe!");
	        } else {
	        	this.setdanoGolpe(this.getForcaGolpe());
	        	System.out.println("Dano critico");
	        }
	        
	        if (this.getdanoGolpe() != 0) {
	        	if (this.getdanoGolpe() < inimigo.defesa) {
	        		double ataque = inimigo.getDefesa() - this.getdanoGolpe();
	    			System.out.println(ataque);
	    			inimigo.setVida(inimigo.getVida() - ataque);
	    			System.out.println("Chegou no if 2 com " + inimigo.getVida() + " de vida!");
	        	} else {
	        		double ataque = this.getdanoGolpe() - inimigo.getDefesa();
	    			System.out.println(ataque);
	    			inimigo.setVida(inimigo.getVida() - ataque);
	    			System.out.println("Chegou no if com " + inimigo.getVida() + " de vida!");
	        	}
	        
	        } else {
				System.out.println("Chegou no else com " + inimigo.getVida() + " de vida!");
	        }
	        	
			
	     } else { // AVISAR QUE NÃO TOMOU DANO NA VIDA CASO FOR MENOR E IGUAL A DEFESA
	    	// VAI GERAR UM NUMERO ALEATORIO ENTRE 0 E 10
			int max = 10;
	        int min = 0;
	        int range = max - min + 1;
	        int rand = 0;
	  
	        for (int i = 0; i < 1; i++) {
	            rand = (int)(Math.random() * range) + min;          
	        }
	        
	        //CALCULA O DANO    
	        if (rand <= 5) {
	        	this.setdanoGolpe(this.getForcaGolpe() / 2);
	        	System.out.println("Acertou mas deu um dano baixo!");
	        } else if (rand > 5 && rand < 8) {
	        	this.setdanoGolpe(0);
	        	System.out.println("Errou o golpe!");
	        }else {
	        	this.setdanoGolpe(this.getForcaGolpe());
	        	System.out.println("Dano critico");
	        }
	        
			double ataque = inimigo.getDefesa() - this.getdanoGolpe();
			inimigo.setDefesa(ataque);
			System.out.println(inimigo.getNome() + " Não tomou dano na vida, porém ficou com " + inimigo.getDefesa()
					+ " de defesa!");
			System.out.println(inimigo.getVida());
		}

		if (inimigo.getVida() <= 0) {
			inimigo.setVivo(false);

			System.out.println(inimigo.getNome() + " morreu" + " F " + inimigo.getNome());
		}
		System.out.println();
		System.out.println();
	}

	public void setGolpe(String golpe) {
		this.golpe = golpe;

	}

	public String getGolpe() {
		return golpe;
	}

	public String getAtacante() {
		return atacante;
	}

	public String getAtacado() {
		return atacado;
	}

	public void setAtacante(String atacante) {
		this.atacante = atacante;
	}

	public void setAtacado(String atacado) {
		this.atacado = atacado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtaque() {
		return ataque;
	}

	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getForcaAtaque() {
		return forcaAtaque;
	}

	public void setForcaAtaque(double forcaAtaque) {
		this.forcaAtaque = forcaAtaque;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getnomeGolpe() {
		return nomeGolpe;
	}

	public void setnomeGolpe(String nomeGolpe) {
		this.nomeGolpe = nomeGolpe;
	}

	public int getForcaGolpe() {
		return forcaGolpe;
	}

	public void setForcaGolpe(int forcaGolpe) {
		this.forcaGolpe = forcaGolpe;
	}

	public double getdanoGolpe() {
		return danoGolpe;
	}

	public void setdanoGolpe(double danoGolpe) {
		this.danoGolpe = danoGolpe;
	}
}
