import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos para registrar cuenta Bancaria");
        System.out.print("Numero de cuenta: ");
        var numberAccount = sc.nextInt();
        System.out.print("Saldo: ");
        var balance = sc.nextDouble();
        System.out.print("Tipo de cuenta: ");
        var typeAccount = sc.next();
        sc.nextLine();

        // Primera instancia de "cuentaBancaria" con constructor de tres parametros
        BankAccount account = new BankAccount(numberAccount, balance, typeAccount);  
        System.out.println("Cuenta registrada con exito: " + account);

        // Segunda instancia de "cuentaBancaria" con constructor de dos parametros
        BankAccount account2 = new BankAccount(123456789, "Checking");

        // Tercera instancia de "cuentaBancaria" sin constructor
        BankAccount account3 = new BankAccount();


        System.out.println("Ingrese los datos para registrar Estudiante"); 
        System.out.print("Nombre: ");
        var name = sc.nextLine();
        System.out.print("Edad: ");
        var age = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso: ");
        String course = sc.nextLine();

        // Primera instancia de "estudiante" con constructor de tres parametros
        Student student = new Student(name, age, course); 
        System.out.println("Estudiante registrado con exito: " + student);

        // Segunda instancia de "estudiante" con constructor de dos parametros
        Student student2 = new Student("John", 20);

        // Tercera instancia de "estudiante" sin constructor
        Student student3 = new Student();

        System.out.println("Ingrese los datos para registrar Libro"); 
        System.out.print("Titulo: ");
        var title = sc.nextLine();
        System.out.print("Numero de paginas: ");
        var numPages = sc.nextInt();
        sc.nextLine();
        System.out.print("Autor: ");
        var author = sc.nextLine();
        // Primera instancia de "libro" con constructor de tres parametros
        Book book = new Book(title, numPages, author);
        System.out.println("Libro registrado con exito: " + book);

        // Segunda instancia de "libro" sin constructor
        Book book2 = new Book();


        System.out.println("\nObjetos Registrados:\n");
        System.out.println("Cuenta bancaria con tres parametros: " + account);
        System.out.println("Cuenta bancaria con dos parametros: " + account2);
        System.out.println("Cuenta bancaria sin constructor: " + account3);
        System.out.println("Estudiante con tres parametros: " + student);
        System.out.println("Estudiante con dos parametros: " + student2);
        System.out.println("Estudiante sin constructor: " + student3);
        System.out.println("Libro con tres parametros: " + book);
        System.out.println("Libro sin constructor: " + book2);

        sc.close();

    }
}
