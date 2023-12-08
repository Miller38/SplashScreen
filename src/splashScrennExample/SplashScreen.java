
package splashScrennExample;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Miller
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        
         // 30% de opacidad del jframe
        //setOpacity(0.7f);
        
         // Redondear las esquinas del jframe 
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 20,20));
        
        
        
         // Cerramos procesos en segundo plano cuando esta interfaz es cerrada
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        LoadingValue = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        BackgroundPanel.setBackground(new java.awt.Color(0, 204, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingValue.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(0, 0, 0));
        LoadingValue.setText("0 %");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoadingLabel.setText("Loading....");
        BackgroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 30));

        LoadingBar.setForeground(new java.awt.Color(51, 204, 0));
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 770, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Skyland Hospital");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/robot.png"))); // NOI18N
        BackgroundPanel.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 450, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
         FrmLogin login = new FrmLogin();
                   login.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        try {
            
            for(int  i = 0; i <= 100; i++){
                    Thread.sleep(100);
                    sp.LoadingValue.setText(i  + "%");                    
                    
                    if(i == 10){
                        sp.LoadingLabel.setText("Turning On Modules...");
                    }
                    if(i == 20){
                        sp.LoadingLabel.setText("Loading Modules...");
                    }
                    if(i == 50){
                        sp.LoadingLabel.setText("Connecting to Database...");
                    }
                    if(i == 70){
                        sp.LoadingLabel.setText("Connecting Successful...");
                    }
                    if(i == 80 ){
                        sp.LoadingLabel.setText("Launching Application...");
                    }
                    sp.LoadingBar.setValue(i);                   
                   
            }                   
                   
                   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
