package panchObrero_decorator.entity;

public class SalsaCriolla extends PanchoBase{
	public Boolean vencido = false;
	
	public SalsaCriolla(Pancho pancho) {
		super(pancho);
	}

	@Override
	public Integer costoTotal() {
		return super.costoTotal()+this.extra();
	}
	private Integer extra() {
		return 100;
	}
	
	
	@Override 
	public Integer poderDiarreico() {
		if(vencido) {
			return (super.poderDiarreico()+ 1);
		}
		return super.poderDiarreico();
	}

	
	public void aderezoVencido() {
		this.vencido = true;
	}
}


