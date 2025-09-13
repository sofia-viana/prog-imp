import java.util.Scanner;
public class vetores {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int[] A = {1, 0, 5, -2, -5, 7};
        System.out.println("Valores armazenados: ");
        for (int i = 0; i < A.length; i += 1) {
        System.out.print(" A[" + i + "]= " +  A[i]);
    }

    int soma = A[0] + A[1] + A[5];
    System.out.println("\nSoma das posiçoes 0, 1 e 5 = "+soma);

    A[4] = 100;
    for (int i = 0; i < A.length; i +=1) {
        System.out.println(A[i]);
    }

    int[] v = new int[6];
    for (int i = 0; i < v.length; i += 6) {
        System.out.print("Digite o valor para v[" + i + "]: ");
    }
        System.out.println("\nValores do vetor: ");
        for (int i = 0; i < v.length; i += 6) {
        System.out.print("Digite o valor para v[" + i + "]: "+ v[i]);

    }
    input.close();
    }
}