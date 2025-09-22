import java.util.Scanner;

public class ExercicioConjuntos {

    public static int inserirElemento(int[] v, int tam, int x) {
        if (tam == v.length) {
            System.out.println("Conjunto cheio!");
            return tam;
        }
        if (buscaSequencial(v, tam, x) != -1) {
            System.out.println("Valor já existe no conjunto!");
            return tam;
        }
        v[tam] = x;
        return tam + 1;
    }

    public static int buscaSequencial (int[] v, int tam, int x) {
        for (int i = 0; i < tam; i ++) {
            if (v[i] == x) 
            return i;
        }
        return -1;
    }

    public static void imprimir (int[] v, int tam) {
        System.out.print("{ ");
        for (int i = 0; i < tam; i++) {
            System.out.print(v[i]);
            if (i < tam -1) 
            System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static void uniao(int[] a, int tamA, int[] b, int tamB) {
        int[] uniao = new int[60];
        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            uniao[tamU++] = a[i];
        }
        for (int i = 0; i < tamB; i++) {
            if(buscaSequencial(uniao, tamU, b[i]) == -1) {
                uniao[tamU++] = b[i];
            }
        }

        System.out.print("Uniao: ");
        imprimir(uniao, tamU);

    }

    public static void intersecao(int[] a, int tamA, int[] b, int tamB) {
        int[] inter = new int[30];
        int tamI = 0;

        for(int i = 0; i < tamA; i++) {
            if (buscaSequencial(b, tamB, a[i]) != -1) {
                inter[tamI++] = a[i];

            }
        }
        System.out.print("Interseção: ");
        imprimir(inter, tamI);
    }

    public static void diferenca(int[] a, int tamA, int[] b, int tamB) {
            int[] dif = new int[30];
            int tamD = 0;

            for (int i =0; i < tamA; i++) {
                if(buscaSequencial(b, tamB, a[i]) == -1) {
                    dif[tamD++] = a[i];
                }
            }
            imprimir(dif, tamD);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[30];
        int[] B = new int[30];
        int tamA = 0;
        int tamB = 0;

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1) Inserir 1 elemento no Conjunto A");
            System.out.println("2) Inserir 1 elemento no Conjunto B");
            System.out.println("3) Imprimir os Conjuntos A e B");
            System.out.println("4) Gerar e Imprimir a união de A e B");
            System.out.println("5) Gerar e Imprimir a interseção entre A e B");
            System.out.println("6) Gerar e Imprimir a diferença entre A e B");
            System.out.println("7) Gerar e Imprimir a diferença entre B e A");
            System.out.println("0) Sair");
            System.out.println("Escolha uma opção:");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o elemento: ");
                    int x = input.nextInt();
                    tamA = inserirElemento(A, tamA, x);
                    break;
                }
                case 2: {
                    System.out.print("Digite o elemento: ");
                    int x = input.nextInt();
                    tamB = inserirElemento(B, tamB, x);
                    break;
                }
                case 3: {
                    System.out.print("Conjunto A: ");
                    imprimir(A, tamA);
                    System.out.print("Conjunto B: ");
                    imprimir(B, tamB);
                    break;
                }
                case 4: {
                    uniao(A, tamA, B, tamB);
                    break;
                }
                case 5: {
                    intersecao(A, tamA, B, tamB);
                    break;
                }
                case 6: {
                    System.out.print("A - B: ");
                    diferenca(A, tamA, B, tamB);
                    break;
                }
                case 7: {
                    System.out.print("B - A: ");
                    diferenca(B, tamB, A, tamA);
                    break;
                }
                case 0: {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                } 
            }
        }  while (opcao != 0);
        input.close();
    } 
}