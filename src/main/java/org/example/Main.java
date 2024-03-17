package org.example;
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        exercicio1();

        exercicio2();

        exercicio5();

        System.out.println("\n\nCreated By: Wanderson Franca Gonçalves\nLinkedin: https://www.linkedin.com/in/wandersonfg/");

    }

    private static void exercicio5() {
        System.out.println("\n===================================== EXERCICIO 05 =====================================");
        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = sc.next();
        String invertedString = invertString(stringOriginal);

        System.out.println("String invertida: " + invertedString);
    }


    private static void exercicio2() {
        System.out.println("\n===================================== EXERCICIO 02 =====================================");
        System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
        int num = sc.nextInt();

        int anterior = 0;
        int atual = 1;
        int proximo = anterior + atual;

        while (proximo <= num) {
            if (proximo == num) {
                System.out.println("O " + num + " pertence à sequência de Fibonacci.");
                return;
            }
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }

        System.out.println("O " + num + " não pertence à sequência de Fibonacci.");
    }

    private static void exercicio1() {
        System.out.println("===================================== EXERCICIO 01 =====================================");
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k<indice){
            k+=1;
            soma += k;
        }

        System.out.println("Resposta do Exercico 01: "+ soma);
    }


    public static String invertString(String str) {
        char[] strArray = str.toCharArray();
        int left = 0;
        int right = strArray.length - 1;
        while (left < right) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left++;
            right--;
        }
        return new String(strArray);
    }
}