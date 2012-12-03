package mde;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


/**
 *
 * @author vicente
 * @version 1.0
 * @since   2012-12-03
 */
public class MultimediaSharerGUI extends javax.swing.JFrame {
  
  /**
   * Creates new form MultimediaSharerGUI
   */
  public MultimediaSharerGUI() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jDialog1 = new javax.swing.JDialog();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    MultimediaPath = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    jList1 = new javax.swing.JList();
    Share = new javax.swing.JButton();
    Remove = new javax.swing.JButton();
    Add = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    MultimediaName = new javax.swing.JTextField();
    Search = new javax.swing.JButton();
    Header = new javax.swing.JLabel();

    javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
    jDialog1.getContentPane().setLayout(jDialog1Layout);
    jDialog1Layout.setHorizontalGroup(
      jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    jDialog1Layout.setVerticalGroup(
      jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Catalogue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andale Mono", 1, 14))); // NOI18N

    jLabel1.setText("Multimedia Path:");

    jList1.setModel(new DefaultListModel());
    jScrollPane2.setViewportView(jList1);

    Share.setText("Share");
    Share.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        ShareMouseClicked(evt);
      }
    });

    Remove.setText("Remove");
    Remove.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        RemoveMouseClicked(evt);
      }
    });

    Add.setText("Add");
    Add.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        AddMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(MultimediaPath)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(Share, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(Remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(MultimediaPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Share)
          .addComponent(Add))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(Remove)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Multimedia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andale Mono", 1, 14))); // NOI18N

    jLabel2.setText("Multimedia Name:");

    Search.setText("Search");
    Search.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SearchMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addComponent(jLabel2)
        .addGap(3, 3, 3)
        .addComponent(MultimediaName))
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addComponent(Search)
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(MultimediaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(Search))
    );

    Header.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
    Header.setForeground(new java.awt.Color(26, 186, 56));
    Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    Header.setText("Multimedia Digital Ecosystem");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void ShareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShareMouseClicked
    // TODO add your handling code here:
    if(!"".equals(MultimediaPath.getText())) {
      DefaultListModel model = (DefaultListModel)jList1.getModel();
      File file = new File(MultimediaPath.getText());
      if(file.exists()) {
        if(myAgent.addFileCatalogue(file)) {
          System.out.println("Share File: " + file.getName());
          model.addElement(file.getName());
        }
      }
    }   
  }//GEN-LAST:event_ShareMouseClicked

  private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
    // TODO add your handling code here:
    if(!"".equals(MultimediaName.getText())) {
      System.out.println("Search");
      MultimediaRequestGUI.main(this);
      this.setVisible(false);
      myAgent.setTargetMultimedia(MultimediaName.getText());
    }
  }//GEN-LAST:event_SearchMouseClicked

  private void RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveMouseClicked
    // TODO add your handling code here:
    int index [] = jList1.getSelectedIndices();
    DefaultListModel model = (DefaultListModel)jList1.getModel();
    for(int i = 0; i < index.length; ++i) {
      myAgent.getCatalogue().remove(model.get(index[i]));
    }
    for(int i = 0; i <index.length; ++i) {
      model.remove(index[i] - i);
    }
  }//GEN-LAST:event_RemoveMouseClicked

  private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
    // TODO add your handling code here:
    FileChooser.main(this);
  }//GEN-LAST:event_AddMouseClicked

  /**
   * @param args the command line arguments
   */
  public static void main(final MultimediaSharerAgent multimediaSharerAgent) {
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
      java.util.logging.Logger.getLogger(MultimediaSharerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MultimediaSharerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MultimediaSharerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MultimediaSharerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        MultimediaSharerGUI multimediaSharerGUI = new MultimediaSharerGUI();
        multimediaSharerGUI.setVisible(true);
        multimediaSharerGUI.setMyAgent(multimediaSharerAgent);
        multimediaSharerAgent.setMyGUI(multimediaSharerGUI);
        multimediaSharerGUI.getHeader().setText(multimediaSharerGUI.getHeader().getText() + ":" + multimediaSharerAgent.getLocalName());
      }
    });
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Add;
  private javax.swing.JLabel Header;
  private javax.swing.JTextField MultimediaName;
  private javax.swing.JTextField MultimediaPath;
  private javax.swing.JButton Remove;
  private javax.swing.JButton Search;
  private javax.swing.JButton Share;
  private javax.swing.JDialog jDialog1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JList jList1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane2;
  // End of variables declaration//GEN-END:variables
  
  private MultimediaSharerAgent myAgent;
  
  // Getters and Setters

  public JButton getAdd() {
    return Add;
  }

  public void setAdd(JButton Add) {
    this.Add = Add;
  }

  public JLabel getHeader() {
    return Header;
  }

  public void setHeader(JLabel Header) {
    this.Header = Header;
  }

  public JTextField getMultimediaName() {
    return MultimediaName;
  }

  public void setMultimediaName(JTextField MultimediaName) {
    this.MultimediaName = MultimediaName;
  }

  public JTextField getMultimediaPath() {
    return MultimediaPath;
  }

  public void setMultimediaPath(JTextField MultimediaPath) {
    this.MultimediaPath = MultimediaPath;
  }

  public JButton getRemove() {
    return Remove;
  }

  public void setRemove(JButton Remove) {
    this.Remove = Remove;
  }

  public JButton getSearch() {
    return Search;
  }

  public void setSearch(JButton Search) {
    this.Search = Search;
  }

  public JButton getShare() {
    return Share;
  }

  public void setShare(JButton Share) {
    this.Share = Share;
  }

  public JDialog getjDialog1() {
    return jDialog1;
  }

  public void setjDialog1(JDialog jDialog1) {
    this.jDialog1 = jDialog1;
  }

  public JLabel getjLabel1() {
    return jLabel1;
  }

  public void setjLabel1(JLabel jLabel1) {
    this.jLabel1 = jLabel1;
  }

  public JLabel getjLabel2() {
    return jLabel2;
  }

  public void setjLabel2(JLabel jLabel2) {
    this.jLabel2 = jLabel2;
  }

  public JList getjList1() {
    return jList1;
  }

  public void setjList1(JList jList1) {
    this.jList1 = jList1;
  }

  public JPanel getjPanel3() {
    return jPanel3;
  }

  public void setjPanel3(JPanel jPanel3) {
    this.jPanel3 = jPanel3;
  }

  public JPanel getjPanel4() {
    return jPanel4;
  }

  public void setjPanel4(JPanel jPanel4) {
    this.jPanel4 = jPanel4;
  }

  public JScrollPane getjScrollPane2() {
    return jScrollPane2;
  }

  public void setjScrollPane2(JScrollPane jScrollPane2) {
    this.jScrollPane2 = jScrollPane2;
  }

  public MultimediaSharerAgent getMyAgent() {
    return myAgent;
  }

  public void setMyAgent(MultimediaSharerAgent myAgent) {
    this.myAgent = myAgent;
  }

}
