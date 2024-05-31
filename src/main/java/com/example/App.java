package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
  
    // Para crear un array de Persona
    // Esta primera variante crea un array inmutable, es decir, que no se puede modificar una vez  que se 
    // ha creado. Si yo ya he creado 4 personas, no podria agregar mas.
    	
    Persona[] personas = {
    	Persona.builder()
    	.nombre("Ivan")
    	.primerApellido("Santiago")
    	.genero(Genero.HOMBRE)
    	.salario(3000.60)
    	.build(),
    	Persona.builder()
    	.nombre("Maria Jose")
    	.primerApellido("Rodriguez")
    	.salario(2500.50).genero(Genero.MUJER)
    	.build(),
    	Persona.builder()
    	.nombre("Tamara")
    	.primerApellido("Sanchez")
    	.genero(Genero.MUJER)
    	.salario(2800.90)
    	.build(),
    	Persona.builder()
    	.nombre("Adrian")
    	.primerApellido("Santos")
    	.segundoApellido("Santos")
    	.genero(Genero.HOMBRE)
    	.salario(3000.00)
    	.build()
    		
    };
   
    
  /* EJERCICIO 1. Crear una rama nueva , recorrer el array de personas y recuperar el salario promedio de todas las personas.
   */  
   
   double sumatoriaDeLosSalarios = 0.0;
   int totalDePersonas = personas.length;
   double salarioPromedio = 0.0;
   
   for(Persona persona : personas) {
	 // sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario(); 
	 
   }
    
   salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
   System.out.println("El salario promedio de todas las personas es: " + salarioPromedio);
    }
}
