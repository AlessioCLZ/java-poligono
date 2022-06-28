package com.JANA60.poligoni.model.entities;

public class Triangle implements Poligon { //per velocizzare al momento lavoro solo con i triangoli rettangoli
	
	private double base, height;
	String eMessage= "I dati inseriti non sono validi.";
	boolean validParameters=true;

	public Triangle(double base, double height) throws Exception, NullPointerException, IllegalArgumentException{
		super();
		try
		{
			hasValidSides(base,height);
		}
		catch (NullPointerException npe)
		{
			validParameters=false;
			eMessage+= "\n" + npe.getMessage();
		}
		
		if(validParameters=true)
		{
			this.base = base;
			this.height = height;
		}
		else
		{
			throw new Exception(eMessage);
		}
	}
	
	public double getHypo()
	{
		return Math.sqrt((base*base)+(height*height));
	}
	

	private void hasValidSides(double base, double height) throws NullPointerException, IllegalArgumentException
	{
		if(base==0 || height ==0)
			throw new NullPointerException("Non esistono poligoni con valori pari a zero");
		
		if(base<0 || height <0)
			throw new IllegalArgumentException("Non esistono poligoni con valori negativi");
		
	}

	@Override
	public double getPerimeter() {
		
		return base+height+getHypo();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base*height)/2;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		hasValidSides(base, this.height);
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		hasValidSides(this.base, height);
		this.height = height;
	}
}
