import java.util.*;

public class Menu{

public static void main(String[] args){
int menu, a, b;
float respuesta;

do {
    Scanner sc = new Scanner(System.in); // Instanciación de la clase Scanner
    System.out.println("Menu: 1. Sumar 2. Restar 3. Multiplicar 4. dividir 5. Salir");
    menu = sc.nextInt();

    switch (menu) {
        case 1:
            System.out.println("Ingresar numero a: ");
    a = sc.nextInt();
    System.out.println("Ingresar numero b: ");
    b = sc.nextInt();
            respuesta = suma(a,b);
            System.out.println("Resultado de suma: " + respuesta);
          break;
       case 2:
        System.out.println("Ingresar numero a: ");
    a = sc.nextInt();
    System.out.println("Ingresar numero b: ");
    b = sc.nextInt();
         respuesta = restar(a,b);
           System.out.println("Resultado de resta: " + respuesta);
            break;
     case 3:
        System.out.println("Ingresar numero a: ");
    a = sc.nextInt();
    System.out.println("Ingresar numero b: ");
    b = sc.nextInt();
            respuesta = multiplicar(a,b);
            System.out.println("Resultado de multiplicar: " + respuesta);

           break;
     case 4:
        System.out.println("Ingresar numero a: ");
    a = sc.nextInt();
    System.out.println("Ingresar numero b: ");
    b = sc.nextInt();
         respuesta = dividir(a,b);
          System.out.println("Resultado de division: " + respuesta);
            break;
    case 5:
        menu = 5;
        break;
}
} while (menu!= 5);


}
public static float suma(int aNum, int bNum){
    return aNum+bNum;
}
public static float restar(int aNum, int bNum){
    return aNum-bNum;
}
public static float multiplicar(int aNum, int bNum){
    return aNum*bNum;
}
public static float dividir(int aNum, int bNum){
    return aNum/bNum;
}

}
