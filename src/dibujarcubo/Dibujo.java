/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujarcubo;

import vistas.DibujarPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import matriz.MatrizADibujar;

/**
 *
 * @author david
 */
public class Dibujo extends JApplet {
    
    private JTextField zoomX, zoomY, zoomZ;
    private JTextField translateX, translateY, translateZ;
    private JTextField rotateX, rotateY, rotateZ;
    private DibujarPanel dibujarPanel;
    private JButton applyButton;
    private JButton resetButton;
    
    public Dibujo(){
        super();
       
        initApplet();
    }
    
    private void initApplet(){
        //setTitle("Dibujar cubo");
        setSize(800, 600);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        GroupLayout layout = new GroupLayout(mainPanel);
        mainPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Inicialización de los campos de texto
        zoomX = new JTextField(5);
        zoomY = new JTextField(5);
        zoomZ = new JTextField(5);
        translateX = new JTextField(5);
        translateY = new JTextField(5);
        translateZ = new JTextField(5);
        rotateX = new JTextField(5);
        rotateY = new JTextField(5);
        rotateZ = new JTextField(5);
        
        // Valores predeterminados
        zoomX.setText("1");
        zoomY.setText("1");
        zoomZ.setText("1");
        translateX.setText("0");
        translateY.setText("0");
        translateZ.setText("0");

        // Panel izquierdo con las opciones
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setMaximumSize(new Dimension(200, Integer.MAX_VALUE));
        leftPanel.setPreferredSize(new Dimension(150, 600));

        // Sección de Zoom
        JPanel zoomPanel = createSectionPanel("Zoom", zoomX, zoomY, zoomZ);

        // Sección de Trasladar
        JPanel translatePanel = createSectionPanel("Trasladar", translateX, translateY, translateZ);

        // Sección de Girar
        JPanel rotatePanel = createSectionPanel("Girar", rotateX, rotateY, rotateZ);
        
        // Botón de Aplicar
        applyButton = new JButton("Aplicar");
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyTransformations();
            }
        });
        
        // Botón de Resetear
        resetButton = new JButton("Resetear");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyReset();
            }
        });
        
        leftPanel.add(zoomPanel);
        leftPanel.add(translatePanel);
        leftPanel.add(rotatePanel);
        leftPanel.add(applyButton);
        leftPanel.add(resetButton);

        MatrizADibujar matrizADibujar = new MatrizADibujar();

        // Panel de dibujo
        dibujarPanel = new DibujarPanel(matrizADibujar.getMatrizInicio());

        // Layout para el mainPanel
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(leftPanel)
                .addComponent(dibujarPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(leftPanel)
                .addComponent(dibujarPanel)
        );

        add(mainPanel);
    }

    private JPanel createSectionPanel(String title, JTextField fieldX, JTextField fieldY, JTextField fieldZ) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(title));
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel labelX = new JLabel("X:");
        JLabel labelY = new JLabel("Y:");
        JLabel labelZ = new JLabel("Z:");

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(labelX)
                    .addComponent(labelY)
                    .addComponent(labelZ))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(fieldX)
                    .addComponent(fieldY)
                    .addComponent(fieldZ))
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelX)
                    .addComponent(fieldX))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelY)
                    .addComponent(fieldY))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelZ)
                    .addComponent(fieldZ))
        );
        return panel;
    }
    
    private void applyTransformations() {
        // Obtener los valores de los campos de texto
        try {
            MatrizADibujar matrizADibujar = new MatrizADibujar();
            
            double zoomXValue = Double.parseDouble(zoomX.getText());
            double zoomYValue = Double.parseDouble(zoomY.getText());
            double zoomZValue = Double.parseDouble(zoomZ.getText());
            double[][] matrizZoom = matrizADibujar.llenarMatrizZoom(zoomXValue, zoomYValue, zoomZValue);

            double translateXValue = Double.parseDouble(translateX.getText());
            double translateYValue = Double.parseDouble(translateY.getText());
            double translateZValue = Double.parseDouble(translateZ.getText());
            double[][] matrizTrasladar = matrizADibujar.llenarMatrizTrasladar(translateXValue, translateYValue, translateZValue);

            double rotateXValue = 0.0;
            double rotateYValue = 0.0;
            double rotateZValue = 0.0;
            
            double[][] resultado = matrizADibujar.multiplicarMatrices(matrizTrasladar, matrizZoom);
            
            if(!rotateX.getText().isEmpty()){
                rotateXValue = Double.parseDouble(rotateX.getText());
                
                double[][] matrizGirarX = matrizADibujar.llenarMatrizGirarX(rotateXValue);
                
                resultado = matrizADibujar.multiplicarMatrices(resultado, matrizGirarX);
                
            }
            
            if(!rotateY.getText().isEmpty()){
                rotateYValue = Double.parseDouble(rotateY.getText());
                
                double[][] matrizGirarY = matrizADibujar.llenarMatrizGirarY(rotateYValue);
                
                resultado = matrizADibujar.multiplicarMatrices(resultado, matrizGirarY);
            }
            
            if(!rotateZ.getText().isEmpty()){
                rotateZValue = Double.parseDouble(rotateZ.getText());
                
                double[][] matrizGirarZ = matrizADibujar.llenarMatrizGirarZ(rotateZValue);
                
                resultado = matrizADibujar.multiplicarMatrices(resultado, matrizGirarZ);
            }
            // Aquí puedes agregar el código para aplicar las transformaciones
            System.out.println("Zoom: " + zoomXValue + ", " + zoomYValue + ", " + zoomZValue);
            System.out.println("Trasladar: " + translateXValue + ", " + translateYValue + ", " + translateZValue);
            System.out.println("Girar: " + rotateXValue + ", " + rotateYValue + ", " + rotateZValue);
            
            resultado = matrizADibujar.multiplicarMatrices(resultado, matrizADibujar.getMatrizInicio());
            
            // Puedes actualizar el panel de dibujo con las nuevas transformaciones
            dibujarPanel.setDibujarMatriz(resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void applyReset() {
        // Obtener los valores de los campos de texto
        try {
            MatrizADibujar matrizADibujar = new MatrizADibujar();
            
            dibujarPanel.setDibujarMatriz(matrizADibujar.getMatrizInicio());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}
