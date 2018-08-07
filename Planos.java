package academia.ufpb.br;

public class Planos {

	private double plano;

	private final static double PLANO_FAMILIA = 130;
	private final static double PLANO_UNIVERSITARIO = 40;
	private final static double PLANO_PADRAO = 60;
	private final static double PLANO_NATACAO = 100;
	private final static double PLANO_LUTA = 80; 
	
	public double getPlano() {
		return plano;
	}

	public void setPlano(double plano) {
		if(plano == 1) {
			this.plano = PLANO_FAMILIA;
		}else if(plano == 2) {
			this.plano = PLANO_LUTA;
		}else if(plano == 3) {
			this.plano = PLANO_NATACAO;
		}else if(plano == 4) {
			this.plano = PLANO_PADRAO;
		}else if(plano == 5) {
			this.plano = PLANO_UNIVERSITARIO;
		}else {
			this.plano = 0;
		}
	}
	
}