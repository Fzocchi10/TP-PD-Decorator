package panchObrero_decorator.entity;

public class PanchoSimple implements Pancho{

	
	@Override
	public Integer costoTotal(){
		return 500;
	}

	@Override
	public Integer poderDiarreico() {
		return 0;
	}

	@Override
	public void aderezoVencido() {
		// TODO Auto-generated method stub
		
	}
}
