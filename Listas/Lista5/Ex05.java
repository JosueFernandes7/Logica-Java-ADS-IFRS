package Listas.Lista5;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float N1 = in.nextFloat();
        float N2 = in.nextFloat();
        float N3 = in.nextFloat();
        float N4 = in.nextFloat();
        float MEDIA = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", MEDIA);
        if (MEDIA >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (MEDIA < 7 && MEDIA >= 5) {
            System.out.println("Aluno em exame.");
            float NExame = in.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", NExame);
            MEDIA = (MEDIA + NExame) / 2;
            if (MEDIA >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", MEDIA);
        } else {
            System.out.println("Aluno reprovado.");
        }

    }
}