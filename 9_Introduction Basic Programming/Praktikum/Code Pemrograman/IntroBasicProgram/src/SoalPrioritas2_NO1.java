public class SoalPrioritas2_NO1 {
    public static void drawXYZ(int height) {
        int n = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                n++;
                if (n % 2 == 1) {
                    if (n % 3 == 0) {
                        System.out.print("X ");
                    } else {
                        System.out.print("Y ");
                    }
                } else if (n % 2 == 0) {
                    if (n % 3 == 0) {
                        System.out.print("X ");
                    } else {
                        System.out.print("Z ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        drawXYZ(5);
    }
}
