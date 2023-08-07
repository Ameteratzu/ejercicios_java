package Ejercicio4;
import javax.swing.JOptionPane;
public class ContadorNumerosPares extends javax.swing.JFrame {

    public ContadorNumerosPares() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IngPrimerNumero = new javax.swing.JLabel();
        jTextFieldNum1 = new javax.swing.JTextField();
        IngSegundoNumero = new javax.swing.JLabel();
        jTextFieldNum2 = new javax.swing.JTextField();
        ContdNumerosPares = new javax.swing.JLabel();
        BotonContador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        IngPrimerNumero.setBackground(new java.awt.Color(255, 255, 51));
        IngPrimerNumero.setText("Ingrese primer numero:");

        IngSegundoNumero.setText("Ingrese segundo numero:");

        ContdNumerosPares.setText("Contador de numeros pares");

        BotonContador.setBackground(new java.awt.Color(255, 0, 102));
        BotonContador.setText("Empezar a contar");
        BotonContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IngPrimerNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContdNumerosPares)
                            .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IngSegundoNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonContador)
                            .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContdNumerosPares)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngPrimerNumero)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngSegundoNumero)
                    .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonContador)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void BotonContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContadorActionPerformed
      int n1, n2, x, nm, cnp;
        
        try{
          n1 = Integer.parseInt(jTextFieldNum1.getText());
          if(n1<0){
          JOptionPane.showMessageDialog(rootPane," solo numeros positivos" );
          }else if(n1>0){
          n2 = Integer.parseInt(jTextFieldNum2.getText());
          if(n2<0){
          JOptionPane.showMessageDialog(rootPane," solo numeros positivos" );
          }else if(n2>0){
              JOptionPane.showMessageDialog(null,"\nNúmeros pares:");
        cnp = 0;
        for(x = n1; x <= n2; x++){
            if( x%2 == 0){
                cnp++;
                 JOptionPane.showMessageDialog(null,x);
            }else{
            }
        }
        
         JOptionPane.showMessageDialog(null,"Cantidad pares: " + cnp);
          
          }
          
          
          }
        }catch(Exception e){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane," no es un numero, es una cadena" );
        
        
        }
      
    
    
    }//GEN-LAST:event_BotonContadorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorNumerosPares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonContador;
    private javax.swing.JLabel ContdNumerosPares;
    private javax.swing.JLabel IngPrimerNumero;
    private javax.swing.JLabel IngSegundoNumero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNum1;
    private javax.swing.JTextField jTextFieldNum2;
    // End of variables declaration//GEN-END:variables
}
