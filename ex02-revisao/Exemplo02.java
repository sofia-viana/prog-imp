public class Exemplo02 {
    public static void main (String [] args) {
        System.out.println("Olá, Turma!");

        for (int i= 1; i <=100; i++) {
         System.out.println(i);
        }
        for (int i1= 1; i1 <= 99; i1++ ){
            if (i1 % 2 != 0) {
             System.out.println(i1);
        }
    }
        for (int i2= 1; i2 <= 100; i2++) {
            if (i2 % 2 == 0) {
                System.out.println(i2);
            }
        }

        for (int i3 = 3; i3 <= 99; i3++) {
            if (i3 % 3 == 0) {
                System.out.println(i3);
            }
        }
        
        for (int i4 = 3; i4 <= 99; i4++) {
            if (i4 % 3 == 0 || i4 % 10 == 3) {
                System.out.println(i4);


            }
    }
}
}