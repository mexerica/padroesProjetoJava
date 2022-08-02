package strategy;

public class ComportamentoDefensivo implements Comportamento {
	@Override
	public void mover() {
		System.out.println("Tá defensivo hoje ...");
	}
}