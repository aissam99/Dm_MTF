/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.awt.*;
import java.awt.event.MouseAdapter;

//import java.awt.Graphics;
//import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author satou_000
 */
public class Plateau extends javax.swing.JFrame {

    /**
     * Creates new form Domino
     */
    ResultSet res;
    DefaultTableModel tb;
    String query;
    private int[][] J=new int[14][2];
    private int[][] O=new int[14][2];
    private int[][] table=new int[28][3];
    private String ch,chemin;


    
    public void affiche_tt_pioche(int[][] p) {
		for(int k=0;k<28;k++) {
			System.out.println(p[k][0]+" | "+p[k][1]);
		}
	}

   
    public Plateau() {
        initComponents();
            tb =new DefaultTableModel();
            tb.addColumn("ID");
            tb.addColumn("Pseudo");
            tb.addColumn("score");
            
            
/*            query="SELECT `ID`,`Pseudo`,`score` FROM `joueur`"; //WHERE `ID` = (select MAX(`ID`) from joueur ) ";
              Connecter c= new Connecter();
            Connection conn= c.obtenirconnexion();
             Statement stm;
                try {
                    stm = conn.createStatement();
                    res= stm.executeQuery(query);
                    while(res.next()){
                        tb.addRow(new Object[]{  res.getInt("ID"),res.getString("Pseudo"),res.getInt("score")});
                      
                    }
                }
                catch (Exception ex){
                    
                }
*/                
                  Table1.setModel(tb);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        player = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        setOrdi(new javax.swing.JPanel());
        pioche = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout playerLayout = new javax.swing.GroupLayout(player);
        player.setLayout(playerLayout);
        playerLayout.setHorizontalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        playerLayout.setVerticalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jButton1.setText("Jouer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ordiLayout = new javax.swing.GroupLayout(getOrdi());
        getOrdi().setLayout(ordiLayout);
        ordiLayout.setHorizontalGroup(
            ordiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ordiLayout.setVerticalGroup(
            ordiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout piocheLayout = new javax.swing.GroupLayout(pioche);
        pioche.setLayout(piocheLayout);
        piocheLayout.setHorizontalGroup(
            piocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        piocheLayout.setVerticalGroup(
            piocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jButton2.setText("Quitter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Table1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Pseudo", "Score"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pioche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getOrdi(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pioche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getOrdi(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
            //Player 7 piéces jouable
                Graphics g = player.getGraphics();
                int i;
                int x = 100;
                int y=90;
                for(i=0;i<7;i++)
                {
                    ch= String.valueOf(J[i][0])+ String.valueOf(J[i][1]);
                    chemin="/home/aissami/NetBeansProjects/Run/src/run/XY/"+ch+"-ConvertImage.png";
                    ImageIcon pict = new ImageIcon(chemin);
                    pict.paintIcon(null,g,x,y);
                    x=x+30;
                }
            //player 7 piéces à pioché
                int x0= 320;
                int y0=90;
                for(i=0;i<7;i++)
                {
                ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/vert.png");
                pict.paintIcon(null,g,x0,y0);
                x0=x0+30;
                 }
            //Ordi
                Graphics k = getOrdi().getGraphics();
               
                int x1 = 100;
                int y1=5;
                for(i=0;i<7;i++)
                {
                    ch= String.valueOf(J[i][0])+ String.valueOf(J[i][1]);
                    chemin="/home/aissami/NetBeansProjects/Run/src/run/XY/"+ch+"-ConvertImage.png";
                    ImageIcon pict = new ImageIcon(chemin);
                    pict.paintIcon(null,k,x1,y1);
                    x1=x1+30;
                }
            //ordi pioche 
                int x11 = 320;
                int y11=5;
                for(i=0;i<7;i++)
                {
                ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/vert.png");
                pict.paintIcon(null,k,x11,y11);
                x11=x11+30;
                 }
            //14 pioches qui reste
                Graphics q = pioche.getGraphics();
                int x2 = 40;
                int y2=60;
                
                for(i=0;i<14;i++)
                {
                    ch= String.valueOf(table[i+14][0])+ String.valueOf(table[i+14][1]);
                    chemin="/home/aissami/NetBeansProjects/Run/src/run/YX/"+ch+"-ConvertImage.png";                    //ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/hori.png");
                    ImageIcon pict = new ImageIcon(chemin);
                    pict.paintIcon(null,q,x2,y2);
                
                    y2=y2+30;
                 }
                //plateau du jeu
                Graphics r = jPanel2.getGraphics();
                
                int x3 =10;
                int y3=10;
                for(i=0;i<10;i++)
                {
                ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/hori.png");
                pict.paintIcon(null,r,x3,y3);
                x3=x3+45;
                }
                int x4=10;
                int y4=40;
                
                for(int j=0;j<3;j++){
                    ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/vert.png");
                    pict.paintIcon(null,r,x4,y4);
                    y4+=45;
                }
                int x5=10;
                int y5=175;
                for (int l=0;l<10;l++){
                    ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/hori.png");
                    pict.paintIcon(null,r,x5,y5); 
                    x5+=45;
                }
               int x6=432;
               int y6=130;
               for(i=0;i<1;i++)
               {
                ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/vert.png");
                pict.paintIcon(null,r,x6,y6);
                y4+=45;
               }
               int x7=325;
               int y7=100;
               for (int l=0;l<3;l++){
                ImageIcon pict = new ImageIcon("/home/aissami/NetBeansProjects/Run/src/run/hori.png");
                pict.paintIcon(null,r,x7,y7); 
                x7+=45;
                }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    

    private void playerMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        //int x=evt.getX();
        //int y=evt.getY();
        //System.out.println(x+","+y);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Plateau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel ordi;
    private javax.swing.JPanel pioche;
    private javax.swing.JPanel player;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the J
     */
    public int[][] getJ() {
        return J;
    }

    /**
     * @param J the J to set
     */
    public void setJ(int[][] J) {
        this.J = J;
    }

    /**
     * @return the ordi
     */
    public javax.swing.JPanel getOrdi() {
        return ordi;
    }

    /**
     * @param ordi the ordi to set
     */
    public void setOrdi(javax.swing.JPanel ordi) {
        this.ordi = ordi;
    }

    /**
     * @return the O
     */
    public int[][] getO() {
        return O;
    }

    /**
     * @param O the O to set
     */
    public void setO(int[][] O) {
        this.O = O;
    }

    /**
     * @return the table
     */
    public int[][] getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(int[][] table) {
        this.table = table;
    }
}
