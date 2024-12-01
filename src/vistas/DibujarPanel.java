/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import matriz.MatrizADibujar;

/**
 *
 * @author david
 */
public class DibujarPanel extends JPanel {
    
    int[] x = new int[17];
    int[] y = new int[17];
    double[][] dibujarMatriz = new double[4][4];
    
    public DibujarPanel(double[][] dibujarMatriz) {
        this.dibujarMatriz = dibujarMatriz;
    }

    public void setDibujarMatriz(double[][] dibujarMatriz) {
        this.dibujarMatriz = dibujarMatriz;
        repaint();
    }
    
    

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        llenarCoordenadas();
        
        g.drawPolygon(x, y, x.length);
        
    }
    
    private int proyectarCoordenadaX(double coordenada, double profundidad){
        return (int)(coordenada - profundidad*Math.cos(Math.toRadians(30)));
    }
    
    private int proyectarCoordenadaY(double coordenada, double profundidad){
        return (int)(coordenada - profundidad*Math.sin(Math.toRadians(30)));
    }

    private void llenarCoordenadas() {
        MatrizADibujar matrizADibujar = new MatrizADibujar();
        
        for (int i = 0; i < x.length; i++) {
            x[i] = proyectarCoordenadaX(dibujarMatriz[0][3], dibujarMatriz[2][3]);
            y[i] = proyectarCoordenadaY(dibujarMatriz[1][3], dibujarMatriz[2][3]);
            
            System.out.println("Matriz "+i);
            for(int j = 0;j < 4; j++){
                for(int k = 0; k < 4; k++){
                    System.out.print(dibujarMatriz[j][k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
            dibujarMatriz = matrizADibujar.multiplicarMatrices(dibujarMatriz, matrizADibujar.getMatriz(i));
        }
    }
    
}
