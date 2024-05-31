package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int SIZE;
    public static void main( String[] args )
    {
    if (args.length != 0)
    	SIZE = Integer.parseInt(args[0]);
    
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
    
    /* OTRA VARIANTE (NO RECOMENDADA) para crear objetos.
     * Aunque no es recomendada, si que permite agregar nuevos elementos, en este caso personas, al array*/
    
    Persona[] arrayPersonasNoRecomendado = new Persona[10];
    
    arrayPersonasNoRecomendado[0] = new Persona();
    arrayPersonasNoRecomendado[0].setNombre("Jessica");
    
    /* ¿Que podemos hacer con los array de objetos?*/
    /* 1. Recorrerlos y mostrar los elementos por consola*/
    /* ¿Como podemos recorrer el array de personas?
     * Respuesta: Con un for mejorado */
    
    System.out.println("Recorriendo el array de personas ===============");
    for(Persona persona : personas)
    	System.out.println(persona);
    
    /* Agregar una nueva persona al array de personas NO ES POSIBLE*/
    
    //personas[4] = Persona.builder()
    		//.nombre("Marly")
    		//.build();
    
    // Para agregar un elemento a un array, por ejemplo, si fuese de enteros
    
    int[] arrayDeNumeros = {
    	1, 2, 3, 4		
    		
    };
    
    // arrayDeNumeros.push(5);
    
    // arrayDeNumeros[4] = 5;
    
    /* Recorrer el array de personas y almacenar las personas del genero MUJER en un nuevo array que
     * podemos llamar arrayDeMujeres*/
    
    
    Persona[] arrayDeMujeres = new Persona[10];
    
    int indice = 0;
    for(Persona p : personas) {
    	if(p.getGenero().equals(Genero.MUJER))
    		arrayDeMujeres[indice++] = p;
    	
    }
    
   System.out.println("Personas del genero mujer...."); 
   for(Persona mujer : arrayDeMujeres) {
	   if (mujer != null)
		   System.out.println(mujer);
	   else
		   break;
   }
    
  /* EJERCICIO 1. Crear una rama nueva , recorrer el array de personas y recuperar el salario promedio de todas las personas.
   */  
    
    }
}
