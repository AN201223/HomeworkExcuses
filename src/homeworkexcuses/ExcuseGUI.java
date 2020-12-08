package homeworkexcuses;

public class ExcuseGUI extends javax.swing.JFrame {

    String finalexcuse = "";
    String teachername;
    String studentname;
    int namechecker = 0;
    int keepcount = 0;

    public ExcuseGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userinputarea = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        responseone = new javax.swing.JButton();
        responsetwo = new javax.swing.JButton();
        responsethree = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 450));
        setResizable(false);

        userinputarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinputareaActionPerformed(evt);
            }
        });

        Confirm.setText("Confirm names");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        responseone.setVisible(false);
        responseone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responseoneActionPerformed(evt);
            }
        });

        responsetwo.setVisible(false);
        responsetwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsetwoActionPerformed(evt);
            }
        });

        responsethree.setVisible(false);
        responsethree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsethreeActionPerformed(evt);
            }
        });

        display.setText("Enter your teachers name");
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(userinputarea, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62)
                            .addComponent(Confirm))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(responsetwo, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                            .addComponent(responseone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(responsethree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userinputarea))
                .addGap(38, 38, 38)
                .addComponent(responseone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(responsetwo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(responsethree, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        if (namechecker == 0) {
            teachername = userinputarea.getText();
            namechecker++;
            display.setText("Enter your name");
            userinputarea.setText("");
        } else if (namechecker == 1) {
            studentname = userinputarea.getText();
            namechecker++;
            display.setText(HomeworkExcuses.inputareatext[keepcount]);
            Confirm.setVisible(false);
            responseone.setVisible(true);
            responsetwo.setVisible(true);
            responsethree.setVisible(true);
            responseone.setText(HomeworkExcuses.buttononeoptions[keepcount]);
            responsetwo.setText(HomeworkExcuses.buttontwooptions[keepcount]);
            responsethree.setText(HomeworkExcuses.buttonthreeoptions[keepcount]);
            userinputarea.setText("");
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void responseoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responseoneActionPerformed
        if (keepcount > 4) {
            outputresult();
        } else {
            finalexcuse = finalexcuse + (((HomeworkExcuses.excusesOne[keepcount]).replace("!", teachername)).replace("/", userinputarea.getText())).replace("#", studentname);
            keepcount++;
            if(keepcount > 4){
                outputresult();
            }
            try{
            display.setText(HomeworkExcuses.responses[keepcount]);
            responseone.setText(HomeworkExcuses.buttononeoptions[keepcount]);
            responsetwo.setText(HomeworkExcuses.buttontwooptions[keepcount]);
            responsethree.setText(HomeworkExcuses.buttonthreeoptions[keepcount]);
            userinputarea.setText("");
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_responseoneActionPerformed

    private void responsetwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsetwoActionPerformed
        if (keepcount > 4) {
            outputresult();
        } else {
            finalexcuse = finalexcuse + (((HomeworkExcuses.excusesTwo[keepcount]).replace("!", teachername)).replace("/", userinputarea.getText())).replace("#", studentname);
            keepcount++;
            if(keepcount > 4){
                outputresult();
            }
            try{
            display.setText(HomeworkExcuses.responses[keepcount]);
            responseone.setText(HomeworkExcuses.buttononeoptions[keepcount]);
            responsetwo.setText(HomeworkExcuses.buttontwooptions[keepcount]);
            responsethree.setText(HomeworkExcuses.buttonthreeoptions[keepcount]);
            userinputarea.setText("");
            }catch (Exception e){
                
            }
        }
    }//GEN-LAST:event_responsetwoActionPerformed

    private void responsethreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsethreeActionPerformed
        if (keepcount > 4) {
            outputresult();
        } else {
            finalexcuse = finalexcuse + (((HomeworkExcuses.excusesThree[keepcount]).replace("!", teachername)).replace("/", userinputarea.getText())).replace("#", studentname);
            keepcount++;
            if(keepcount > 4){
                outputresult();
            }
            try{
            display.setText(HomeworkExcuses.responses[keepcount]);
            responseone.setText(HomeworkExcuses.buttononeoptions[keepcount]);
            responsetwo.setText(HomeworkExcuses.buttontwooptions[keepcount]);
            responsethree.setText(HomeworkExcuses.buttonthreeoptions[keepcount]);
            userinputarea.setText("");
            }catch (Exception e){
                
            }
        }
    }//GEN-LAST:event_responsethreeActionPerformed

    private void userinputareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinputareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userinputareaActionPerformed

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
            java.util.logging.Logger.getLogger(ExcuseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcuseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcuseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcuseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcuseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JTextPane display;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton responseone;
    private javax.swing.JButton responsethree;
    private javax.swing.JButton responsetwo;
    private javax.swing.JTextField userinputarea;
    // End of variables declaration//GEN-END:variables

    public void outputresult(){
        display.setText("Your final excuse is: "+ finalexcuse);
        responseone.setEnabled(false);
        responsetwo.setEnabled(false);
        responsethree.setEnabled(false);
    }
}
