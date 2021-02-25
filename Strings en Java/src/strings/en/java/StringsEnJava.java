package strings.en.java;

public class StringsEnJava {

    public static void main(String[] args) {
    
    String mensaje= "Hola soy un string";
    String mensaje2= new String("Otra forma de generar un String");
    System.out.println(mensaje);
    System.out.println(mensaje2);
    // un String NO es un objeto sino una clase 
    //y al crear variables de tipo string estamos creando objetos, los cuales pueden utilizar metodos
    
    // length
    int cantidad= mensaje.length();
    System.out.println(cantidad);
    // LENGTH nos permite saber la cantidad de caracteres que tiene un string o arreglo (los espacios cuentan)
    
    // contains
    boolean contiene= mensaje.contains("Hola");
    System.out.println(contiene);
    // se utliza para saber si nuestro string contiene algun caracter o sub string, devuelve un booleano
    
    // startswith y endswith
    boolean comienzaCon= mensaje2.startsWith("Otra");
    boolean terminaCon= mensaje2.endsWith("string"); // si la letra es minuscula nos dara falso
    System.out.println(comienzaCon);
    System.out.println(terminaCon);
    // se utlizan para saber si nuestro string empieza o termina con cierto sub string o caracter
    //tambien retornara valores booleanos
    
    // concat
    String mensaje3= mensaje.concat(" y soy una clase");
    System.out.println(mensaje3);
    // se utiliza para unir un string con otro
    
    
    // METODOS DE FORMATO
    
    System.out.println(mensaje.toUpperCase()); // imprime todas las letras en mayusculas
    System.out.println(mensaje2.toLowerCase()); // imprime todas las letras en minusculas
    System.out.println(mensaje3.trim()); // quita todos los espacios
    // tambien podemos concatenar metodos
    System.out.println(mensaje.toUpperCase().trim());
    
    String bienvenido= "";
    String curso= "Java";
    bienvenido= String.format("Bienvenido al curso de %s", curso); //donde %s sera reemplazado por un string (por eso la s)
    System.out.println(bienvenido);
    // utilizaremos format cuando necesitemos generar nuevos string cuyo contenido nos es desconocido
    
    // otro ejemplo de format
    float decimal= 335.45378f;
    String precio="";
    precio= String.format("%.2f",decimal); // donde "%.nf" determina la cantidad de numeros que queremos ver despues del punto
    System.out.println(precio);
    
    // asi creariamos un string con formato si solo quisieramos imprimirlo
    float precio2= 589.50f;
    System.out.printf("El total de %d articulos es %.2f %s", 3, precio2, "pesos"); //usaremos %d para numeros enteros y %s para strings
    
    // comparar cadenas
    String cadena1= "Hola";
    String cadena2= "Hola";
    boolean comparacion= cadena2.equals(cadena1); // el metodo equals nos permite comprobar que dos strings sean iguales y deberan ser EXACTAMENTE iguales
    System.out.println(comparacion);
   boolean comparacion2= cadena2.toUpperCase().equals(cadena1.toUpperCase()); // volvemos todas las letras mayusculas para comprobar si el texto es igual 
    boolean comparacion3= cadena1.equalsIgnoreCase(cadena2); // con equalsIgnoreCase comprobara si los string son iguales ignorando mayusculas y minusculas
    System.out.println(comparacion3);
    
    // concatenar mas de dos strings (el metodo concat solo puede sumar DOS strings)
    String saludo= cadena1.concat(cadena2);
    System.out.println(saludo);
    // si queremos sumar mas podemos hacerlo de la siguiente manera
    String nombre= "Pepe";
    String saludo2= "Muy buenas tardes";
    String finSaludo= "Espero que estes muy bien";
    String mensaje4= saludo2 +" " + nombre + " " + finSaludo ; // al sumar strings no se agregaran espacios
    System.out.println(mensaje4);
    
    }
    
}
