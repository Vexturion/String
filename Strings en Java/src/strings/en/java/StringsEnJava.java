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
    
    
    }
    
}
