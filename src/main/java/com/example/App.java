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
   
   /* EJERCICIO 2. Recorrer el array de personas y calcular el salario promedio por genero.*/
   
   double sumatoriaSalariosHombre = 0.0;
   double sumatoriaSalariosMujer = 0.0;
   double sumatoriaSalariosOtro = 0.0;
   
   int totalGeneroHombre = 0;
   int totalGeneroMujer = 0;
   int totalGeneroOtro = 0;
   
   double salarioPromedioHombres = 0.0;
   double salarioPromedioMujeres = 0.0;
   double salarioPromedioOtros = 0.0;
   
   
   for(Persona p : personas) {
	   if(p.getGenero().equals(Genero.HOMBRE)) {
		   sumatoriaSalariosHombre += p.getSalario();
		   totalGeneroHombre++; 
	   } else if (p.getGenero().equals(Genero.MUJER)) {
		   sumatoriaSalariosMujer += p.getSalario();
		   totalGeneroMujer++;
	   } else {
		   sumatoriaSalariosOtro += p.getSalario();
		   totalGeneroOtro++;
	   }
	   
   }
   
   salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
   salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
   salarioPromedioOtros = sumatoriaSalariosOtro / totalGeneroOtro;
   
   System.out.println("Salario promedio de los Hombres: " + salarioPromedioHombres);
   System.out.println("Salario promedio de las Mujeres: " + salarioPromedioMujeres);
   System.out.println("Salario promedio de Otros Generos: " + salarioPromedioOtros);
   
   
   
  
   
   
   
   
   
   
   
   
   
    }
}
