/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

/**
 *
 * @author david
 */
public class MatrizADibujar {
    private final double[][] matrizInicio = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz1 = {
        {1, 0, 0, 100},
        {0, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz2 = {
        {1, 0, 0, 0},
        {0, 1, 0, 100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz3 = {
        {1, 0, 0, -100},
        {0, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz4 = {
        {1, 0, 0, 0},
        {0, 1, 0, -100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz5 = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, -100},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz6 = {
        {1, 0, 0, 100},
        {0, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz7 = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, 100},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz8 = {
        {1, 0, 0, 0},
        {0, 1, 0, 100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz100 = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, -100},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz10 = {
        {1, 0, 0, 0},
        {0, 1, 0, -100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz11 = {
        {1, 0, 0, 0},
        {0, 1, 0, 100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz12 = {
        {1, 0, 0, -100},
        {0, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz13 = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, 100},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz14 = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, -100},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz15 = {
        {1, 0, 0, 0},
        {0, 1, 0, -100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };
    
    private final double[][] matriz16 = {
        {1, 0, 0, 0},
        {0, 1, 0, 100},
        {0, 0, 1, 0},
        {0, 0, 0, 1}
    };

    public double[][] getMatrizInicio() {
        return matrizInicio;
    }

    public double[][] getMatriz1() {
        return matriz1;
    }

    public double[][] getMatriz2() {
        return matriz2;
    }

    public double[][] getMatriz3() {
        return matriz3;
    }

    public double[][] getMatriz4() {
        return matriz4;
    }

    public double[][] getMatriz5() {
        return matriz5;
    }

    public double[][] getMatriz6() {
        return matriz6;
    }

    public double[][] getMatriz7() {
        return matriz7;
    }

    public double[][] getMatriz8() {
        return matriz8;
    }

    public double[][] getMatriz9() {
        return matriz100;
    }

    public double[][] getMatriz10() {
        return matriz10;
    }

    public double[][] getMatriz11() {
        return matriz11;
    }

    public double[][] getMatriz12() {
        return matriz12;
    }

    public double[][] getMatriz13() {
        return matriz13;
    }

    public double[][] getMatriz14() {
        return matriz14;
    }

    public double[][] getMatriz15() {
        return matriz15;
    }

    public double[][] getMatriz16() {
        return matriz16;
    }
    
    public double[][] getMatriz(int i) {
        switch(i){
            case 0:
                return getMatrizInicio();
            case 1:
                return getMatriz1();
            case 2:
                return getMatriz2();
            case 3:
                return getMatriz3();
            case 4:
                return getMatriz4();
            case 5:
                return getMatriz5();
            case 6:
                return getMatriz6();
            case 7:
                return getMatriz7();
            case 8:
                return getMatriz8();
            case 9:
                return getMatriz9();
            case 10:
                return getMatriz10();
            case 11:
                return getMatriz11();
            case 12:
                return getMatriz12();
            case 13:
                return getMatriz13();
            case 14:
                return getMatriz14();
            case 15:
                return getMatriz15();
            case 16:
                return getMatriz16();
        }
        return getMatrizInicio();
    }
    
    public double[][] llenarMatrizTrasladar(double x, double y, double z) {
        double[][] matrizTrasladar = new double[4][4];
        
        // Inicializamos la matriz con los valores especificados
        matrizTrasladar[0][0] = 1;
        matrizTrasladar[0][1] = 0;
        matrizTrasladar[0][2] = 0;
        matrizTrasladar[0][3] = x;

        matrizTrasladar[1][0] = 0;
        matrizTrasladar[1][1] = 1;
        matrizTrasladar[1][2] = 0;
        matrizTrasladar[1][3] = y;

        matrizTrasladar[2][0] = 0;
        matrizTrasladar[2][1] = 0;
        matrizTrasladar[2][2] = 1;
        matrizTrasladar[2][3] = z;

        matrizTrasladar[3][0] = 0;
        matrizTrasladar[3][1] = 0;
        matrizTrasladar[3][2] = 0;
        matrizTrasladar[3][3] = 1;
        
        return matrizTrasladar;
    }
    
    public double[][] llenarMatrizZoom(double x, double y, double z) {
        double[][] matrizZoom = new double[4][4];
        
        // Inicializamos la matriz con los valores especificados
        matrizZoom[0][0] = x;
        matrizZoom[0][1] = 0;
        matrizZoom[0][2] = 0;
        matrizZoom[0][3] = 0;

        matrizZoom[1][0] = 0;
        matrizZoom[1][1] = y;
        matrizZoom[1][2] = 0;
        matrizZoom[1][3] = 0;

        matrizZoom[2][0] = 0;
        matrizZoom[2][1] = 0;
        matrizZoom[2][2] = z;
        matrizZoom[2][3] = 0;

        matrizZoom[3][0] = 0;
        matrizZoom[3][1] = 0;
        matrizZoom[3][2] = 0;
        matrizZoom[3][3] = 1;
        
        return matrizZoom;
    }
    
    public double[][] llenarMatrizGirarX(double x) {
        double[][] matrizZoom = new double[4][4];
        
        // Inicializamos la matriz con los valores especificados
        matrizZoom[0][0] = 1;
        matrizZoom[0][1] = 0;
        matrizZoom[0][2] = 0;
        matrizZoom[0][3] = 0;

        matrizZoom[1][0] = 0;
        matrizZoom[1][1] = Math.cos(Math.toRadians(x));
        matrizZoom[1][2] = -Math.sin(Math.toRadians(x));
        matrizZoom[1][3] = 0;

        matrizZoom[2][0] = 0;
        matrizZoom[2][1] = Math.sin(Math.toRadians(x));
        matrizZoom[2][2] = Math.cos(Math.toRadians(x));
        matrizZoom[2][3] = 0;

        matrizZoom[3][0] = 0;
        matrizZoom[3][1] = 0;
        matrizZoom[3][2] = 0;
        matrizZoom[3][3] = 1;
        
        return matrizZoom;
    }
    
    public double[][] llenarMatrizGirarY(double y) {
        double[][] matrizZoom = new double[4][4];
        
        // Inicializamos la matriz con los valores especificados
        matrizZoom[0][0] = Math.cos(Math.toRadians(y));
        matrizZoom[0][1] = 0;
        matrizZoom[0][2] = Math.cos(Math.toRadians(y));
        matrizZoom[0][3] = 0;

        matrizZoom[1][0] = 0;
        matrizZoom[1][1] = 1;
        matrizZoom[1][2] = 0;
        matrizZoom[1][3] = 0;

        matrizZoom[2][0] = -Math.sin(Math.toRadians(y));
        matrizZoom[2][1] = 0;
        matrizZoom[2][2] = Math.cos(Math.toRadians(y));
        matrizZoom[2][3] = 0;

        matrizZoom[3][0] = 0;
        matrizZoom[3][1] = 0;
        matrizZoom[3][2] = 0;
        matrizZoom[3][3] = 1;
        
        return matrizZoom;
    }

    public double[][] llenarMatrizGirarZ(double z) {
        double[][] matrizZoom = new double[4][4];
        
        // Inicializamos la matriz con los valores especificados
        matrizZoom[0][0] = Math.cos(Math.toRadians(z));
        matrizZoom[0][1] = -Math.sin(Math.toRadians(z));
        matrizZoom[0][2] = 0;
        matrizZoom[0][3] = 0;

        matrizZoom[1][0] = Math.sin(Math.toRadians(z));
        matrizZoom[1][1] = Math.cos(Math.toRadians(z));
        matrizZoom[1][2] = 0;
        matrizZoom[1][3] = 0;

        matrizZoom[2][0] = 0;
        matrizZoom[2][1] = 1;
        matrizZoom[2][2] = 0;
        matrizZoom[2][3] = 0;

        matrizZoom[3][0] = 0;
        matrizZoom[3][1] = 0;
        matrizZoom[3][2] = 0;
        matrizZoom[3][3] = 1;
        
        return matrizZoom;
    }
    
    public double[][] multiplicarMatrices(double[][] matrizA, double[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        // Verifica si las matrices pueden ser multiplicadas
        if (columnasA != filasB) {
            throw new IllegalArgumentException("El número de columnas de la matriz A debe ser igual al número de filas de la matriz B");
        }

        // Crear la matriz resultante
        double[][] resultado = new double[filasA][columnasB];

        // Realizar la multiplicación de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
    
    
}
