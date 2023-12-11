package panchObrero_decorator.entity;

public class Mostaza extends PanchoBase{
	public Boolean vencido = false;
	
	public Mostaza(Pancho pancho) {
		super(pancho);
	}

	@Override
	public Integer costoTotal() {
		return super.costoTotal()+this.extra();
	}
	private Integer extra() {
		return 50;
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
