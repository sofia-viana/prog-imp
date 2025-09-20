import java.util.Scanner;
public class exercicio1909 {
    public static void elementos (int[] a, int[] b, int tam) {
        Scanner input = new Scanner(System.in);
        tam = 30;
        a = new int[tam];
        b = new int[tam];

        for (int i = 0; i < a.length; i ++) {
        System.out.print("Digite o valor para A[" + i + "]: ");
        a = input.nextInt();
        }
        for (int i = 0; i < b.length; i ++) {
        System.out.print("Digite o valor para B[" + i + "]: ");
        b = input.nextInt();
        }


    }
     public static void imprimir(int[] v, int tam) {

        int opcao;
        do {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Inserir 1 elemento no Conjunto A");
        System.out.println("2. Inserir 1 elemento no Conjunto B");
        System.out.println("3. Imprimir os Conjuntos A e B");
        System.out.println("4. Gerar e Imprimir a união de A e B");
        System.out.println("5. Gerar e Imprimir a interseção entre A e B");
        System.out.println("6. Gerar e Imprimir a diferença entre A e B");
        System.out.println("7. Gerar e Imprimir a diferença entre B e A");

         switch (opcao) {
            case 1:
            for (int i = 0; i < a.length; i ++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            a = input.nextInt();
        }
            break;

            case 2:
            for (int i = 0; i < b.length; i ++) {
            System.out.print("Digite o valor para B[" + i + "]: ");
            b = input.nextInt();
        }
            break;

            case 3:
            System.out.println("Conjunto A:" + a+ "e Conjunto B:" + b);
            break;

            case 4:
            int[] uniao = a + b;
            System.out.println("União de A e B" + uniao);
            break;
            


        }
    }
}
}
