package letters;

public class Letters {
    public void printSpaceInline(int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.print(" ");
        }
    }

    public void printSpaceBreak(int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println();
        }
    }

    public void printC() {
        for (int i = 1; i <= 4; i++) {
            if(i == 1 || i == 4){
                System.out.print("*");
            }
            for (int j = 1; j < 3; j++) {
                if (i > 1 && i < 4) {
                    if(i == 2 && j == 1){
                        System.out.println();
                    }
                    System.out.println("*");
                }
                for (int k = 1; k <= 4; k++) {
                    if ((i == 1 && j == 1) || (i == 4 && j == 1)) {
                        System.out.print(" ");
                        System.out.print("*");
                    }
                }
            }
        }
    }

    public void printL() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 6; j++) {
                if (i == 1) {
                    System.out.println("*");
                }
                for (int k = 1; k < 2; k++) {
                    if (i > 1 && j == 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("*");
        }
    }

    public void printU() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 6; j++) {
                if (i == 1) {
                    System.out.print("*");
                    printSpaceInline(7);
                    System.out.print("*");
                    printSpaceBreak(1);
                }
                for (int k = 1; k < 2; k++) {
                    if (i > 1 && j == 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("*");
        }
    }

}
