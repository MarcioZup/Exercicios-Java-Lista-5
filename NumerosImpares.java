import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {

        System.out.println("Este programa calcula a quantidade de números ímpares digitados pelo usuário. ");
        Scanner teclado = new Scanner(System.in);
        int numerosImparesDesejados = 0;
        int contador = 1;

        System.out.println("Digite a quantidade de números que deseja saber: ");
        double totalDeNumeros = teclado.nextDouble();

        while (contador <= totalDeNumeros){
            System.out.println("Digite o " + contador + "º número :");
            double valorDigitadoPeloUsuario = teclado.nextDouble();

            if (valorDigitadoPeloUsuario % 2 == 1){
                numerosImparesDesejados = numerosImparesDesejados + 1;
            }
            contador ++;
        }
        System.out.println("A quantidade de números ímpares é: " + numerosImparesDesejados);
    }
}
