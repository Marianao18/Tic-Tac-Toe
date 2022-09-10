package triki;

import java.awt.Color;
import javax.swing.JLabel;

public class vista extends javax.swing.JFrame {

    boolean estado = true;//si es true se puede escribir y si es false no
    String Juegosig = "O";
    String turno = "X";
    JLabel lbs[] = new JLabel[9];
    int Ganador[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {1, 5, 9},
        {3, 5, 7}
    };

    public vista() {
        initComponents();
        //System.out.println(Ganador[3][0]);

        lbs[0] = lbl1;
        lbs[1] = lbl2;
        lbs[2] = lbl3;
        lbs[3] = lbl4;
        lbs[4] = lbl5;
        lbs[5] = lbl6;
        lbs[6] = lbl7;
        lbs[7] = lbl8;
        lbs[8] = lbl9;

    }
    //metodo para ponerl X ó O en el juego

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        lblturno = new javax.swing.JLabel();
        lblpuntajeX = new javax.swing.JLabel();
        lblpuntakeO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triki");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setOpaque(true);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1MousePressed(evt);
            }
        });

        lbl3.setBackground(new java.awt.Color(255, 255, 255));
        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setOpaque(true);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl3MousePressed(evt);
            }
        });

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setOpaque(true);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl2MousePressed(evt);
            }
        });

        lbl4.setBackground(new java.awt.Color(255, 255, 255));
        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setOpaque(true);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl4MousePressed(evt);
            }
        });

        lbl5.setBackground(new java.awt.Color(255, 255, 255));
        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setOpaque(true);
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl5MousePressed(evt);
            }
        });

        lbl6.setBackground(new java.awt.Color(255, 255, 255));
        lbl6.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setOpaque(true);
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl6MousePressed(evt);
            }
        });

        lbl7.setBackground(new java.awt.Color(255, 255, 255));
        lbl7.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setOpaque(true);
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl7MousePressed(evt);
            }
        });

        lbl8.setBackground(new java.awt.Color(255, 255, 255));
        lbl8.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setOpaque(true);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl8MousePressed(evt);
            }
        });

        lbl9.setBackground(new java.awt.Color(255, 255, 255));
        lbl9.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setOpaque(true);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lblturno.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        lblturno.setText("Turno de X");

        lblpuntajeX.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lblpuntajeX.setText("0");

        lblpuntakeO.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lblpuntakeO.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel3.setText("X=");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel4.setText("O=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblturno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnReiniciar)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpuntajeX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblpuntakeO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(lblturno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblpuntajeX)
                    .addComponent(jLabel4)
                    .addComponent(lblpuntakeO))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed
        presionar(1);

    }//GEN-LAST:event_lbl1MousePressed

    private void lbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MousePressed
        presionar(2);

    }//GEN-LAST:event_lbl2MousePressed

    private void lbl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MousePressed
        presionar(3);

    }//GEN-LAST:event_lbl3MousePressed

    private void lbl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MousePressed
        presionar(4);

    }//GEN-LAST:event_lbl4MousePressed

    private void lbl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MousePressed
        presionar(5);

    }//GEN-LAST:event_lbl5MousePressed

    private void lbl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MousePressed
        presionar(6);

    }//GEN-LAST:event_lbl6MousePressed

    private void lbl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MousePressed
        presionar(7);

    }//GEN-LAST:event_lbl7MousePressed

    private void lbl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MousePressed
        presionar(8);

    }//GEN-LAST:event_lbl8MousePressed

    private void lbl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MousePressed
        presionar(9);

    }//GEN-LAST:event_lbl9MousePressed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setText("");
            lbs[i].setBackground(Color.white);

        }
        turno = Juegosig;
        if (Juegosig.equals("O")) {
            Juegosig = "X";
        } else {
            Juegosig = "O";
        }
        lblturno.setText("Turno de:" + turno);
        estado = true;
    }//GEN-LAST:event_btnReiniciarActionPerformed

    public void presionar(int casilla) {
        if (lbs[casilla - 1].getText().equals("") && estado) {
            lbs[casilla - 1].setText(turno);
            cambiarturno();
            comprobarGnanador();
        }
    }

    public void cambiarturno() {
        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }
        lblturno.setText("Turno de:" + turno);
    }

    public void comprobarGnanador() {
        for (int i = 0; i < Ganador.length; i++) {
            if (lbs[Ganador[i][0] - 1].getText().equals("X")
                    && lbs[Ganador[i][1] - 1].getText().equals("X")
                    && lbs[Ganador[i][2] - 1].getText().equals("X")) {

                lbs[Ganador[i][0] - 1].setBackground(Color.green);
                lbs[Ganador[i][1] - 1].setBackground(Color.green);
                lbs[Ganador[i][2] - 1].setBackground(Color.green);
                lblpuntajeX.setText(Integer.toString(Integer.parseInt(lblpuntajeX.getText()) + 1));
                lblturno.setText("¡Ha ganado X!");
                // System.out.println("gano x");
                estado = false;

            }
            if (lbs[Ganador[i][0] - 1].getText().equals("O")
                    && lbs[Ganador[i][1] - 1].getText().equals("O")
                    && lbs[Ganador[i][2] - 1].getText().equals("O")) {

                lbs[Ganador[i][0] - 1].setBackground(Color.green);
                lbs[Ganador[i][1] - 1].setBackground(Color.green);
                lbs[Ganador[i][2] - 1].setBackground(Color.green);
                lblpuntakeO.setText(Integer.toString(Integer.parseInt(lblpuntakeO.getText()) + 1));
                lblturno.setText("¡Ha ganado O!");
                //System.out.println("gano O");
                estado = false;
            }
            if (empate()) {
            lblturno.setText("¡Ha sido un empate!");
        }

        }
        
    }

    //metodo para comprobar un empate
    public boolean empate() {
        for (int[] Ganador : Ganador) {
            for (int i = 0; i < Ganador.length; i++) {
                if (Integer.toString(Ganador[i]) == "") {
                    return true;
                }

            }

        }
        return false;

    }

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblpuntajeX;
    private javax.swing.JLabel lblpuntakeO;
    private javax.swing.JLabel lblturno;
    // End of variables declaration//GEN-END:variables
}
