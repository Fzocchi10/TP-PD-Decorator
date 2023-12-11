package panchObrero_decorator.entity;

public class ObreroDesclasado extends PanchoBase{
	public Boolean vencido = false;
	
	public ObreroDesclasado(Pancho pancho) {
		super(pancho);
	}

	@Override
	public Integer costoTotal() {
		return super.costoTotal()+this.extra();
	}
	private Integer extra() {
		return 300;
	}
	
	@Override 
	public Integer poderDiarreico() {
		if(vencido) {
			return (super.poderDiarreico()+ 3);
		}
		return super.poderDiarreico();
	}

	
	public void aderezoVencido() {
		this.vencido = true;
	}
}
