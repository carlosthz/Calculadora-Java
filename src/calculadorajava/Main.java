package calculadorajava;

import java.util.Scanner;


public class Main {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;

        do {
            System.out.println("=== Calculadora Interativa ===");
            System.out.println("1 = Soma");
            System.out.println("2 = Subtração");
            System.out.println("3 = Multiplicação");
            System.out.println("4 = Divisão");
            System.out.println("0 = Sair");
            
            opt = Entrada.lerInt(input, "\nEscolha uma opção:\n");

            if (opt > 0 && opt <= 4) {

                double b = Entrada.lerDouble(input, "Insira o primeiro valor: ");
                double c = Entrada.lerDouble(input, "Insira o segundo valor: ");

                System.out.println("\nResultado:");	

                switch (opt) {
                    case 1:
                        System.out.println(b + " + " + c + " = " + Calculadora.soma(b, c));
                        break;
                    case 2:
                        System.out.println(b + " - " + c + " = " + Calculadora.sub(b, c));
                        break;
                    case 3:
                        System.out.println(b + " * " + c + " = " + Calculadora.mult(b, c));
                        break;
                    case 4:
                        try {
                           System.out.println(b + " / " + c + " = " + Calculadora.div(b, c));
                        } catch (ArithmeticException e) {
                        	System.out.println(e.getMessage());
                        }
                        break;
                }

                System.out.println("-------------------");

            } else if (opt != 0) {
                System.out.println("Opção inválida, tente novamente.\n");
            }

        } while (opt != 0);

        System.out.println("Até a próxima!");
        input.close();
    }
}
