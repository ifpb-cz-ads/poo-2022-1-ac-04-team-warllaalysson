import enums.DiaDaSemana;
import java.util.Scanner;

class BMExercicio06 {
    public static void main(String[] args) {
        final String INFORME_UM_NUMERO = "Informe um número: ";
        final String NUMERO_INVALIDO = "Número inválido.";

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print(INFORME_UM_NUMERO);
            numero = scanner.nextInt() - 1;

            if (numero < 0) {
                continue;
            }

            if (numero > 6) {
                System.out.println(NUMERO_INVALIDO);
                continue;
            }

            DiaDaSemana diaDaSemana = DiaDaSemana.values()[numero];

            switch (diaDaSemana) {
                case DOMINGO: {
                    System.out.println("Domingo.");
                    break;
                }
                case SEGUNDA: {
                    System.out.println("Segunda-feira.");
                    break;
                }
                case TERCA: {
                    System.out.println("Terça-feira.");
                    break;
                }
                case QUARTA: {
                    System.out.println("Quarta-feira.");
                    break;
                }
                case QUINTA: {
                    System.out.println("Quinta-feira.");
                    break;
                }
                case SEXTA: {
                    System.out.println("Sexta-feira.");
                    break;
                }
                case SABADO: {
                    System.out.println("Sábado.");
                    break;
                }
            }
        } while (numero != -1);

        scanner.close();
    }
}