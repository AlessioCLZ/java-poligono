package com.JANA60.poligoni.model.entities;

public class Hexagon implements Poligon {
	
	double side;

	String eMessage= "I dati inseriti non sono validi.";
	boolean validParameters=true;


	public Hexagon(double side) throws Exception, NullPointerException, IllegalArgumentException {
		super();
		try
		{
			hasValidSides(side);
		}
		catch(NullPointerException npe)
		{
			validParameters=false;
			eMessage+= "\n" + npe.getMessage();
		}
		if(validParameters=true)
		{
			this.side = side;
		}
		else
		{
			throw new Exception(eMessage);
		}
	}

	private void hasValidSides(double side) throws NullPointerException, IllegalArgumentException
	{
		if (side==0)
			throw new NullPointerException("I lati di un poligono non possono essere nulli o pari a 0");
		if (side<0)
			throw new IllegalArgumentException("Non esistono poligoni con valori negativi");

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		hasValidSides(side);
		this.side = side;
	}
	
	
	@Override
	public double getPerimeter() {
		return side*6;
	}

	@Override
	public double getArea() {
		//Area = (3√3 s2) / 2
		return ( ((3* Math.sqrt(3))*(side*side)) /2);
	}

}
