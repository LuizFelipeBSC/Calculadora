import  util.Keyboard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;
                do{
                    opcao = Keyboard.menu("Soma/Subtração/Multiplicação/Divisão/Sair");
                    switch (opcao) {
                        case 1:
                            Soma();
                            break;

                        case 2:
                            Subtracao();
                            break;

                        case 3:
                            Multiplicacao();
                            break;

                        case 4:
                            Divisao();
                            break;
                    }
                } while(opcao < 5);

        System.out.println("Fim do programa!");

    }
    public static void Soma()
    {
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro numero: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = ler.nextInt();
        System.out.print("Resultado:  ");
        System.out.print(a + b);
        System.out.println("            ");
    }
    public static void Subtracao()
    {
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro numero: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = ler.nextInt();
        System.out.print("Resultado:  ");
        System.out.print(a - b);
        System.out.println("            ");
    }

    public static void Divisao()
    {
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro numero: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = ler.nextInt();
        System.out.print("Resultado:  ");
        System.out.print(a / b);
        System.out.println("            ");
    }

    public static void Multiplicacao()
    {
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro numero: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = ler.nextInt();
        System.out.print("Resultado:  ");
        System.out.print(a * b);
        System.out.println("            ");
    }
}