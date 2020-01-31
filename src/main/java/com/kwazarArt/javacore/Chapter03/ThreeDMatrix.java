package main.java.com.kwazarArt.javacore.Chapter03;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int [3][4][5];
        int k = 0;
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int l = 0; l < threeD[i][j].length; l++) {
                    threeD[i][j][l] = i * j * l;
                }
            }
        }

        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int l = 0; l < threeD[i][j].length; l++) {
                    System.out.print(threeD[i][j][l] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
