import java.util.Scanner;

public class MenorEMaiorValor {
    public static void main(String[] args) {
        System.out.println("Entre com a quantidade de números desejada: ");
        Scanner teclado = new Scanner(System.in);
        int quantidadeDesejada = teclado.nextInt();
        int contador = 0;
        int menorValor = 0;
        int maiorValor = 0;
        int numeroDigitado = 0;

        while (contador < quantidadeDesejada){
            System.out.println("Digite um número: ");
            numeroDigitado = teclado.nextInt();
            contador++;
            if (contador == 1){
                menorValor = numeroDigitado;
                maiorValor = numeroDigitado;
            }
            if (numeroDigitado <= menorValor ){
                menorValor = numeroDigitado;
            }
            if (numeroDigitado >= maiorValor){
                maiorValor = numeroDigitado;
            }
        }
        System.out.println("O menor número digitado é " + menorValor + " , o maior valor digitado é " + maiorValor + " e a soma deles é " + (menorValor + maiorValor));

    }
}
