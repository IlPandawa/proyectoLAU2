package com.mycompany.proyectocompilador;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.io.BufferedReader;
import com.mycompany.proyectocompilador.antlrG00.aSintactico_V4Lexer;
import com.mycompany.proyectocompilador.antlrG00.aSintactico_V4Parser;
import java.awt.Image;
import java.awt.Toolkit;
import raven.glasspanepopup.GlassPanePopup;
import raven.toast.Notifications;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import raven.toast.Notifications;
import raven.glasspanepopup.*;
import jnafilechooser.api.JnaFileChooser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        super("Compilador");
        initComponents();
        setLocationRelativeTo(null);
        Notifications.getInstance().setJFrame(this);
        GlassPanePopup.install(this);
        
        Image icono = Toolkit.getDefaultToolkit().getImage("src\\main\\java\\icons\\antlrLogo.jpg");
        setIconImage(icono);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAreaCasoPrueba = new javax.swing.JTextArea();
        toggleTheme = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnAbrirArchivo = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Compilador");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Compilar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        tAreaCasoPrueba.setColumns(20);
        tAreaCasoPrueba.setRows(5);
        jScrollPane1.setViewportView(tAreaCasoPrueba);

        toggleTheme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        toggleTheme.setText("Dia");
        toggleTheme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggleThemeMouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Vaciar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jMenu2.setText("Archivo");

        btnAbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        btnAbrirArchivo.setText("Abrir Archivo");
        btnAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArchivoActionPerformed(evt);
            }
        });
        jMenu2.add(btnAbrirArchivo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160)
                .addComponent(toggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jButton2)
                        .addGap(231, 231, 231)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggleTheme)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //Info info = new Info();
        //GlassPanePopup.showPopup(new Info("Aqui voy a enviar los errores o aprobaciones"));
        
        // Crear el panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(460, 375)); // Establecer el tamaño del panel
        //panel.setLayout(new BorderLayout()); // Usamos BorderLayout para organizar los componentes
        
        // Crear el título
        JLabel titulo = new JLabel("Resultados", SwingConstants.CENTER); // Texto centrado
        titulo.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 48)); // Establecer fuente Bold Italic tamaño 48
        
        // Crear el área de texto
        JTextArea textArea = new JTextArea();   
        textArea.setPreferredSize(new Dimension(350, 200));
        
        textArea.setRows(15); // Establecer 10 filas visibles para el área de texto
        textArea.setLineWrap(true); // Ajuste de línea
        textArea.setEditable(false);
        textArea.setWrapStyleWord(true); // Ajuste por palabras
        JScrollPane scrollPane = new JScrollPane(textArea); // Agregar scroll al TextArea
        
        // Agregar el título y el área de texto al panel
        panel.add(titulo, BorderLayout.NORTH); // Título arriba (NORTH)
        panel.add(scrollPane, BorderLayout.CENTER); // Área de texto en el centro (CENTER)
        
        add(panel);
        
        
        //taSalida.setText("");
        ANTLRInputStream input = null;
        String s = "";
        s = tAreaCasoPrueba.getText();
        StringBufferInputStream str = new StringBufferInputStream(s);
        try {
            input = new ANTLRInputStream(str);
        } catch (IOException ex) {
            //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        aSintactico_V4Lexer lexer = new aSintactico_V4Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        aSintactico_V4Parser parser = new aSintactico_V4Parser(tokens);
        parser.setSalida(textArea);
        
        
        Notifications.getInstance().setJFrame(this);


    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, 3000, "Compilado.");
GlassPanePopup.showPopup(panel);
        
        
        try {
            parser.start();
        } catch (RecognitionException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArchivoActionPerformed
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(this);

        if (action) {
            File selectedFile = ch.getSelectedFile();
            StringBuilder content = new StringBuilder();

            try ( BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    content.append(line).append("\n");
                }
                // Asigna el texto leído al JTextArea
                tAreaCasoPrueba.setText(content.toString());
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, 1000, "Archivo cargado.");
            } catch (IOException e) {
                e.printStackTrace();
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 1000, "Error al cargar el archivo.");
            }
        }
    }//GEN-LAST:event_btnAbrirArchivoActionPerformed

    private void toggleThemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggleThemeMouseClicked
        try {
            if (toggleTheme.isSelected()) {
                // Cambiar a tema claro
                toggleTheme.setText("Noche");
                UIManager.setLookAndFeel(new FlatMacLightLaf());
            } else {

                // Cambiar a tema oscuro
                toggleTheme.setText("Dia");
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
            }
            // Actualizar el UI de toda la interfaz
            FlatLaf.updateUI();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ProyectoCompilador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_toggleThemeMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        tAreaCasoPrueba.setText("");
    }//GEN-LAST:event_jButton4MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAbrirArchivo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tAreaCasoPrueba;
    private javax.swing.JToggleButton toggleTheme;
    // End of variables declaration//GEN-END:variables
}
