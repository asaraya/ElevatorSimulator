package itcr.elevatorsimulator;

public class NavegationSystem extends javax.swing.JFrame {

    //Esto no va aqui pero es para probar
    Elevator elevador = new Elevator();
    String texto = "¡Bienvenidos al sistema de navegación!\nPor favor pulse el boton del piso al cual quieran viajar.\nPiso actual: " 
                    + String.valueOf(elevador.PisoActual);
    
    public NavegationSystem() {
        initComponents();
        jTextArea1.setText(texto);   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Piso 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Piso 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Piso 3");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Piso 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Piso 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Abrir Puerta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Cerrar Puerta");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 11, 12));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("¡EMERGENCIA!");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton9.setText("Salir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jButton9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7)
                                .addComponent(jButton8)))))
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton para ir al primer piso
        /*Entradas: Evento de presionar el botón
        Salidas: Agregar el piso a la cola del elevador*/
       texto = "Puertas Cerradas. Viajando...";
       jTextArea1.setText(texto);
       elevador.PuertasAbiertas = false;
       jButton1.setEnabled(false);
       try {
           if (elevador.PisoActual > 1)
            Thread.sleep((elevador.PisoActual - 1)*10000);
           if (elevador.PisoActual < 1)
            Thread.sleep((1 - elevador.PisoActual)*10000);
           if (elevador.PisoActual == 1)
            Thread.sleep(0);          
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       elevador.viajar(1);
       
        texto = "¡Bienvenidos al sistema de navegación!\nPor favor pulse el boton del piso al cual quieran viajar.\nPiso actual: " 
                    + String.valueOf(elevador.PisoActual);
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Boton para ir al segundo piso
        /*Entradas: Evento de presionar el botón
        Salidas: Agregar el piso a la cola del elevador*/
       texto = "Puertas Cerradas. Viajando...";
       jTextArea1.setText(texto);
       elevador.PuertasAbiertas = false;
       jButton2.setEnabled(false);
       try {
           if (elevador.PisoActual > 2)
            Thread.sleep((elevador.PisoActual - 2)*10000);
           if (elevador.PisoActual < 2)
            Thread.sleep((2 - elevador.PisoActual)*10000);
           if (elevador.PisoActual == 2)
            Thread.sleep(0);          
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       elevador.viajar(2);
       
       texto = "¡Bienvenidos al sistema de navegación!\nPor favor pulse el boton del piso al cual quieran viajar.\nPiso actual: " 
                    + String.valueOf(elevador.PisoActual);
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Boton para ir al tercer piso
        /*Entradas: Evento de presionar el botón
        Salidas: Agregar el piso a la cola del elevador*/
       texto = "Puertas Cerradas. Viajando...";
       jTextArea1.setText(texto);
       elevador.PuertasAbiertas = false;
       jButton3.setEnabled(false);
       try {
           if (elevador.PisoActual > 3)
            Thread.sleep((elevador.PisoActual - 3)*10000);
           if (elevador.PisoActual < 3)
            Thread.sleep((3 - elevador.PisoActual)*10000);
           if (elevador.PisoActual == 3)
            Thread.sleep(0);          
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       elevador.viajar(3);
       
        texto = "¡Bienvenidos al sistema de navegación!\nPor favor pulse el boton del piso al cual quieran viajar.\nPiso actual: " 
                    + String.valueOf(elevador.PisoActual);
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Boton para ir al cuarto piso
        /*Entradas: Evento de presionar el botón
        Salidas: Agregar el piso a la cola del elevador*/
       texto = "Puertas Cerradas. Viajando...";
       jTextArea1.setText(texto);
       elevador.PuertasAbiertas = false;
       jButton4.setEnabled(false);
       try {
           if (elevador.PisoActual > 4)
            Thread.sleep((elevador.PisoActual - 4)*10000);
           if (elevador.PisoActual < 4)
            Thread.sleep((4 - elevador.PisoActual)*10000);
           if (elevador.PisoActual == 4)
            Thread.sleep(0);          
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       elevador.viajar(4);
       
       texto = "¡Bienvenidos al sistema de navegación!\nPor favor pulse el boton del piso al cual quieran viajar.\nPiso actual: " 
                    + String.valueOf(elevador.PisoActual);
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Boton para ir al quinto piso
        /*Entradas: Evento de presionar el botón
        Salidas: Agregar el piso a la cola del elevador*/
       texto = "Puertas Cerradas. Viajando...";
       jTextArea1.setText(texto);
       elevador.PuertasAbiertas = false;
       jButton5.setEnabled(false);
       try {
           if (elevador.PisoActual > 5)
            Thread.sleep((elevador.PisoActual - 5)*10000);
           if (elevador.PisoActual < 5)
            Thread.sleep((5 - elevador.PisoActual)*10000);
           if (elevador.PisoActual == 5)
            Thread.sleep(0);          
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       elevador.viajar(5);
       
       texto = "¡Bienvenidos al sistema de navegación!\nPor favor pulse el boton del piso al cual quieran viajar.\nPiso actual: " 
                    + String.valueOf(elevador.PisoActual);
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Boton para abrir las puertas
        elevador.PuertasAbiertas = true;
        texto = texto + "\nPuertas Abiertas.";
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Boton para cerrar las puertas
        elevador.PuertasAbiertas = false;
        texto = texto + "\nPuertas Cerradas.";
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        texto = "¡EMERGENCIA!¡EMERGENCIA!¡EMERGENCIA!\nActivando frenos...\nAlarma activada";
        jTextArea1.setText(texto);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NavegationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavegationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavegationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavegationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavegationSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
