import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long euros, billetes100,billetes20, billetes5,moedas1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el dinero:");
        euros = sc.nextLong();
        billetes100=euros/100;
        euros%=100;
        System.out.println("billetes100="+billetes100);
        billetes20=euros/20;
        euros%=20;
        System.out.println("billetes20="+billetes20);
        billetes5=euros/5;
        euros%=5;
        System.out.println("billetes5="+billetes5);
        moedas1=euros/1;
        System.out.println("moedas1="+moedas1);
        //cambio
        //cambio para tarjeta tardía
        //hola vbcasca
        }
    }