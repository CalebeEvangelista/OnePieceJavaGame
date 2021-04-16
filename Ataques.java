import java.util.Scanner;

public class Ataques {
	Scanner sc = new Scanner(System.in);
	
	private String nomeGolpe;
	private int forcaGolpe;
	private double danoGolpe;
	
	public String getnomeGolpe() {
		return nomeGolpe;
	}
	public void setnomeGolpe(String nomeGolpe) {
		this.nomeGolpe = nomeGolpe;
	}
	public int  getForcaGolpe() {
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
