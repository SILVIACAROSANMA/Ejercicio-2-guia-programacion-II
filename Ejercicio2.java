

package com.mycompany.ejercicio2;


public class Ejercicio2 {

    public static void main(String[] args) {
      }
        System.out.println("Hello World!");
        final int sobrepeso=1;
        final int pesoideal=0;
        final int infrapeso=-1;
        
        Entrada entrada = new Entrada();
        String nombre;
        int edad;
	String sexo;
        float peso;
	float altura;
        nombre = entrada.obtenerString("Obtencion de datos");
        edad = entrada.obtenerEntero("Dame la edad de " + nombre);
	sexo = entrada.obtenerString("Dime el sexo de " + nombre);
	peso = entrada.obtenerFloat("Dime el peso de " + nombre);
	altura = entrada.obtenerFloat("Dame la altura para " + nombre);
        System.out.println("\nCreando las personas");
	System.out.println("--------------------");
	 Persona p1 = new Persona();
	System.out.println("Persona 1 creada");
	 Persona p2 = new Persona(nombre, edad, sexo);
	System.out.println("Persona 2 creada");
	 Persona p3 = new Persona(nombre, edad, sexo, peso, altura);
	System.out.println("Persona 3 creada");
        System.out.println("\nMostrando relacion de pesos");
	System.out.println("---------------------------");
	System.out.print("El peso de la persona 1 es: ");

		switch (p1.calcularIMC()) {
		
			case sobrepeso:
				System.out.println("sobrepeso");
				break;
			case pesoideal:
				System.out.println("pesoideal");
				break;
			case infrapeso:
				System.out.println("infrapeso");
				break;				
		}
		
		System.out.print("El peso de la persona 2 es: ");

		switch (p2.calcularIMC()) {
		
			case sobrepeso:
				System.out.println("SOBREPESO");
				break;
			case pesoideal:
				System.out.println("pesoideal");
				break;
			case infrapeso:
				System.out.println("infrapeso");
				break;
				
		}
		
		System.out.print("El peso de la persona 3 es: ");

		switch (p3.calcularIMC()) {
		
			case sobrepeso:
				System.out.println("sobrepeso");
				break;
			case pesoideal:
				System.out.println("pesoideal");
				break;
			case infrapeso:
				System.out.println("infrapeso");
				break;
                		
		}
		
		// Mostramos la mayoria de edad
		System.out.println("\nMostrando mayorias de edad");
		System.out.println("--------------------------");
		System.out.println("La persona 1 es: " + (p1.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
		System.out.println("La persona 2 es: " + (p2.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
		System.out.println("La persona 3 es: " + (p3.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
		
		// Mostramos todos los datos con el metodo toString() que ha sido Override
		System.out.println("\nMostrando todos los datos");
		System.out.println("-------------------------");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
    }

    