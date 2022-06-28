package com.JANA60.poligoni.controller.main;

import java.util.Scanner;

import com.JANA60.poligoni.model.entities.Hexagon;
import com.JANA60.poligoni.model.entities.Triangle;

public class Main {

	public static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) {
		
		String cmd;
		
		boolean end=false;
		
		System.out.println("Calcolo aree e perimetri poligoni");

		
		do
		{
			
			System.out.println("Di quale poligono vuoi calcolare area e perimetro?");
			cmd= keyboard.nextLine();
			
			switch (cmd.toLowerCase())
			{
				case "triangolo":
					_newTriangle();
				break;
				case "esagono":
					_newHexa();
				break;
				default:
					end=true;
			}
			
		}while(!end);
		
		System.out.println("Grazie e arrivederci");

	}

	private static void _newHexa() {
		
		try
		{
			System.out.println("Inserire valore del lato:");
			double side = Double.parseDouble(keyboard.nextLine());
			
			Hexagon hex = new Hexagon(side);
			System.out.println(hex.toString());

		}
		
		catch (Exception e)
		{
			System.out.println("Errore imprevisto: " + e.getMessage());
		}
	}

	private static void _newTriangle() {
		
		try
		{
			System.out.println("Inserire valore della base:");
			double base = Double.parseDouble(keyboard.nextLine());
			System.out.println("Inserire valore dell'altezza:");
			double height = Double.parseDouble(keyboard.nextLine());
			
			Triangle tri = new Triangle(base, height);
			System.out.println(tri.toString());

		}
		
		catch (Exception e)
		{
			System.out.println("Errore imprevisto: " + e.getMessage());
		}
	}

}
