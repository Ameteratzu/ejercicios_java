package Ejercicio2;
import java.util.Random;
import javax.swing.JOptionPane;

public class LanzamientoMoneda extends javax.swing.JFrame {


    public LanzamientoMoneda() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LanzamientodeMoneda = new javax.swing.JLabel();
        ICantidadLanzaMoneda = new javax.swing.JLabel();
        jTextFieldVecesLanzadaMonedad = new javax.swing.JTextField();
        BotonMoneda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        LanzamientodeMoneda.setText("Lanzamiento de Moneda");

        ICantidadLanzaMoneda.setText("Ingrese la cantidad de veces que sera lanzada la moneda:");

        BotonMoneda.setText("Lanzar Moneda");
        BotonMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ICantidadLanzaMoneda)
                .addGap(12, 12, 12)
                .addComponent(jTextFieldVecesLanzadaMonedad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(LanzamientodeMoneda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(BotonMoneda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LanzamientodeMoneda)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICantidadLanzaMoneda)
                    .addComponent(jTextFieldVecesLanzadaMonedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(BotonMoneda)
                .addContainerGap(31, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMonedaActionPerformed
        
        Random rand = new Random();
        String C ="C", S="S",CS ="";
        int n, cc = 0, cs = 0;
        
        try{
            n = Integer.parseInt(jTextFieldVecesLanzadaMonedad.getText());
             if(n<0){
            JOptionPane.showMessageDialog(rootPane," solo numeros positivos" );
             }else if(n>0){
             for(int x=1; x<=n; x++){
            JOptionPane.showMessageDialog(null, "Lanzamiento " + x);
            int Moneda = Math.abs(rand.nextInt()) % 2;
            //cara
            if (Moneda == 0){
                cc++;
                JOptionPane.showMessageDialog(null,"Salio " + C);
            }else{
                cs++;
                 JOptionPane.showMessageDialog(null,"Salio " + S);
            //sello
            }
            
        }
         JOptionPane.showMessageDialog(null,"NUMEROS DE VECES DE CARAS: " + cc + "\nNUMEROS DE VECES DE SELLOS: " + cs);

             }
             
         
        }
        catch(Exception e){
             getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane," no es un numero, es una cadena" );
        }
       
    
    
    }//GEN-LAST:event_BotonMonedaActionPerformed

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
            java.util.logging.Logger.getLogger(LanzamientoMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanzamientoMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanzamientoMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanzamientoMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanzamientoMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMoneda;
    private javax.swing.JLabel ICantidadLanzaMoneda;
    private javax.swing.JLabel LanzamientodeMoneda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldVecesLanzadaMonedad;
    // End of variables declaration//GEN-END:variables
}
