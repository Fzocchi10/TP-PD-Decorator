package panchObrero_decorator.entity;



public class PanchoBase implements Pancho{
	private Pancho pancho;
	private Boolean vencido;
	
	
	public PanchoBase (Pancho pancho) {
		this.pancho = pancho;
	}

	@Override
	public Integer costoTotal() {
		return this.pancho.costoTotal();
	}
	
	@Override
	public Integer poderDiarreico() {
		return this.pancho.poderDiarreico();
	}

	@Override
	public void aderezoVencido() {
		this.vencido = false;
		
	}
	

	
}
