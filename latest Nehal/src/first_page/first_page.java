package first_page;


import ankh.morpork.AnkhMorpork;
import static first_page.first_page.playerObj;
import static first_page.gameBoard.bt;
import static first_page.second_page.one;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class first_page extends javax.swing.JFrame {
    int no_of_players;
    String cards = "";
    static int active_turn;
    AnkhMorpork obj = new AnkhMorpork();
   static second_page sp = new second_page();
   static gameBoard gb = new gameBoard();
    public static Player[] playerObj;
    public static gameArea[] area=new gameArea[12];
    public static Bank bank;    
    public static image image1;
    public static String color = "";
    /** 
   * Creates new form first_page
     */

public first_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     public void close(){
     
     WindowEvent winCloseEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseEvent);
     
     
     }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        radiogroup = new javax.swing.ButtonGroup();
        HVCgroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        new_game = new javax.swing.JButton();
        load_game = new javax.swing.JButton();
        filename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        go = new javax.swing.JButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        player = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        notify = new javax.swing.JLabel();
        radioComp1 = new javax.swing.JRadioButton();
        radioComp2 = new javax.swing.JRadioButton();
        radioComp3 = new javax.swing.JRadioButton();
        HVC = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Ankh Morpork");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        new_game.setText("New Game");
        new_game.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                new_gameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_gameActionPerformed(evt);
            }
        });

        load_game.setText("Load Game");
        load_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_gameActionPerformed(evt);
            }
        });

        filename.setEditable(false);
        filename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filenameActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/first_page/img.jpg"))); // NOI18N

        go.setText("Go");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        radiogroup.add(radio1);
        radio1.setSelected(true);
        radio1.setText("2");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        radiogroup.add(radio2);
        radio2.setText("3");

        radiogroup.add(radio3);
        radio3.setText("4");

        player.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        player.setForeground(new java.awt.Color(204, 0, 51));
        player.setText("How many players?");
        player.setBorder(new javax.swing.border.MatteBorder(null));

        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        notify.setText("Please select a file to load");

        HVCgroup.add(radioComp1);
        radioComp1.setSelected(true);
        radioComp1.setText("1 Computer Player");

        HVCgroup.add(radioComp2);
        radioComp2.setText("2 Computer Players");
        radioComp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioComp2ActionPerformed(evt);
            }
        });

        HVCgroup.add(radioComp3);
        radioComp3.setText("3 Computer Player");

        HVC.setText("Human Vs Computer");
        HVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HVCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(new_game)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(load_game)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filename, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(go)
                                .addGap(18, 18, 18)
                                .addComponent(notify))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(player)))
                .addGap(0, 194, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio2)
                            .addComponent(radio1)
                            .addComponent(radio3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(playButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HVC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioComp2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(radioComp1)
                                .addComponent(radioComp3)))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(new_game)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(load_game)
                        .addComponent(filename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(go)
                    .addComponent(notify))
                .addGap(18, 18, 18)
                .addComponent(player)
                .addGap(18, 18, 18)
                .addComponent(radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(HVC))
                .addGap(18, 18, 18)
                .addComponent(radioComp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioComp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioComp3)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
 * @param jfc object for file chooser
 * @param fname gets path of the chosen file
 * @param evt 
 */

    private void load_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_gameActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File f = jfc.getSelectedFile();
        String fname = f.getAbsolutePath();
        filename.setText(fname);
        go.setVisible(true);
        
    }//GEN-LAST:event_load_gameActionPerformed

    private void new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_gameActionPerformed
        // TODO add your handling code here:
       HVC.setVisible(true);
       new_game.setVisible(false);
       load_game.setVisible(false);
       filename.setVisible(false);
       go.setVisible(false);
       radio1.setVisible(true);
       radio2.setVisible(true);
       radio3.setVisible(true);
       player.setVisible(true);
       playButton.setVisible(true);
       sp.nameLabel.setVisible(false);
       sp.nameText.setVisible(false);
       
    }//GEN-LAST:event_new_gameActionPerformed

    private void filenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filenameActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio1ActionPerformed

    private void new_gameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_new_gameAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_new_gameAncestorAdded
/**
 * playButton to start the new game
 * @param no_of_players total number of players
 * @see shuffleCards() create deck of green and brown cards
 * @see turn(integer i) generate turns
 * @see next_turn(integer i) starts game with active player
 * @param evt 
 */
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        
        if(radio1.isSelected())
            no_of_players = 2;
        else if(radio2.isSelected())
            no_of_players = 3;
        else
            no_of_players = 4;
        
    gb.setVisible(true);        
    active_turn = 0;
    playerObj = new Player[no_of_players];  // creating objects for players
        
        //initializing minions & buildings to each player
        for(int i=0;i<no_of_players;i++)
        {
            playerObj[i] = new Player();
            playerObj[i].minionInHand = 9;
            playerObj[i].buildInHand = 6;
        }
        
        // assign type to each player
        for(int i=0;i<no_of_players;i++)
        {
            playerObj[i].isHuman = true;
        }   
        
        // assign minions to initial areas
        bank = new Bank();
        bank.cash = bank.cash - playerObj.length*10;
        
        obj.shuffleCards(no_of_players);
        obj.turn(no_of_players);
        playerObj[0].turn = true;
        obj.next_turn(active_turn);
        
        close();
        /*
        sp.setVisible(true);
        sp.Lplayer.setText("Player " + (active_turn+1));
        sp.Acolor.setText( playerObj[0].Color);
        sp.Apersonality.setText(playerObj[0].Personality);
        sp.Aminions.setText(String.valueOf(playerObj[0].minionInHand));
        sp.Abuildings.setText(String.valueOf(playerObj[0].buildInHand));
        sp.Aarea.setText("0");
        for(int j=0;j<5;j++)
            cards += playerObj[0].CardsInHand[j] + "  ";
        
        sp.Acards.setText(cards);
        sp.bankText.setText(String.valueOf(bank.cash));
        sp.trollsText.setText(String.valueOf(bank.Trolls_not_on_board));
        sp.tmText.setText(String.valueOf(bank.TroubleMarkers_not_on_board));
        sp.demonsText.setText(String.valueOf(bank.Demons_not_on_board));
        */
       
         for(int i=0;i<playerObj.length;i++)
        {
           color += playerObj[i].Color + " / ";
            
        }    
        
        gb.noplayerLabel.setText(String.valueOf(no_of_players));
        System.out.println("total players:" + no_of_players);
        gb.currentLabel.setText("Player " + (active_turn+1));
      
        
        gb.currentLabel.setForeground(Color.RED);
                //getColor(playerObj[active_turn].Color));
        
        System.out.println(" current Player:" +  playerObj[active_turn].Color);
        
        gb.colorLabel.setText(color);
        
        /*for(int i=0;i<playerObj.length;i++){
            for(int j=0;j<6;i++){
            
                if(playerObj[i].Property[j] != null)
                {    
                    playerObj[i].holdCount++;
                    System.out.println("count:" + playerObj[i].holdCount);
                    System.out.println("i:" + i);
                    System.out.println("j:" + j);
                }
                else
                    break;
            }        
        }*/
        gb.areaLabel.setText(String.valueOf(Bank.setAreaCount()));
        gb.fundsLabel.setText(String.valueOf(bank.cash));
        gb.playercardLabel.setText(String.valueOf(AnkhMorpork.stack.size()));
        for(int i=0;i<playerObj.length;i++){
            if("red".equals(playerObj[i].Color)){
               
            area[0].redMinion = 1;
            area[4].redMinion = 1;
            area[6].redMinion = 1;
            
        }
            else if("green".equals(playerObj[i].Color)){
            area[0].greenMinion = 1;
            area[4].greenMinion = 1;
            area[6].greenMinion = 1;
        }
                else if("blue".equals(playerObj[i].Color)){
            area[0].blueMinion = 1;
            area[4].blueMinion = 1;
            area[6].blueMinion = 1;
        }
                else if("yellow".equals(playerObj[i].Color)){
            area[0].yellowMinion = 1;
            area[4].yellowMinion = 1;
            area[6].yellowMinion = 1;
        }
            
        }
        for(int i=0;i<12;i++)
        { System.out.println("Red Minion : "+area[i].redMinion);
        System.out.println("green Minion : "+area[i].greenMinion);
        System.out.println("blue Minion  :"+area[i].blueMinion);
        System.out.println("yellow Minion : "+area[i].yellowMinion);
        }
        
        close();
        
    }//GEN-LAST:event_playButtonActionPerformed
/**
 * retrieve game state from serialized file
 * @param evt 
 */
    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed

     // TODO add your handling code here:

        if(filename.getText().equals("")){
            notify.setVisible(true);
            //notify.setText("Please select a file to load");
        }
        else{
            notify.setVisible(false);
            try {
            
        FileInputStream fi = new FileInputStream(filename.getText());
        
        ObjectInputStream oi = new ObjectInputStream(fi);
        playerObj = (Player[])oi.readObject();
        
        int num = oi.readInt();

        for(int j=0;j<num;j++){
             if(playerObj[j].turn)
                first_page.active_turn = j; 
                System.out.println("player: " + (j+1) + playerObj[j].turn);
            }
            System.out.println("active turn: "  + first_page.active_turn);
        
            
        bank.cash = bank.cash - playerObj.length*10;
        gb.setVisible(true);
        
         gb.currentLabel.setText("Player " + (first_page.active_turn + one));
        System.out.println("new turn:" + first_page.active_turn);
       
         for(int i=0;i<playerObj.length;i++)
        {
           color += playerObj[i].Color + " / ";
            
        }    
        gb.colorLabel.setText(color);
        //gb.noplayerLabel.setText(String.valueOf(no_of_players));
        System.out.println("total players:" + no_of_players);
        gb.areaLabel.setText(String.valueOf(Bank.setAreaCount()));
        gb.fundsLabel.setText(String.valueOf(bank.cash));
        gb.playercardLabel.setText(String.valueOf(AnkhMorpork.stack.size()));
        gb.noplayerLabel.setText(String.valueOf(playerObj.length));

        
        /*sp.Lplayer.setText("Player " + (active_turn+1));
        sp.Acolor.setText( playerObj[active_turn].Color);
        sp.Apersonality.setText(playerObj[active_turn].Personality);
        for(int j=0;j<5;j++)
            cards += playerObj[active_turn].CardsInHand[j] + "  ";
        sp.Acards.setText(cards);
        sp.bankText.setText(String.valueOf(bank.cash));
        sp.playerText.setText(String.valueOf(playerObj.length));
        sp.tmText.setText(String.valueOf(bank.TroubleMarkers_not_on_board));
        sp.demonsText.setText(String.valueOf(bank.Demons_not_on_board));
        sp.trollsText.setText(String.valueOf(bank.Trolls_not_on_board));
        */oi.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    close();  
    }//GEN-LAST:event_goActionPerformed
   }
    private void radioComp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioComp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioComp2ActionPerformed

    private void HVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HVCActionPerformed

        radio1.setVisible(false);
        radio2.setVisible(false);
        radio3.setVisible(false);
        HVC.setVisible(false);
        if(radio1.isSelected())
        //    no_of_players = 2;
            radioComp1.setVisible(true);
        else if(radio2.isSelected())
        {
        //    no_of_players = 3;
           radioComp1.setVisible(true);
           radioComp2.setVisible(true);
        }
        else
        {
            radioComp1.setVisible(true);
            radioComp2.setVisible(true);
            radioComp3.setVisible(true);
        
            //no_of_players = 4;
        }
    }//GEN-LAST:event_HVCActionPerformed
    
    /**
     * @param iamage1 object for image class 
     * @param area object for gameArea class
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
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    first_page fp = new first_page();
    image1 = new image();
   
         area = new gameArea[12];
         area[0] = new gameArea("Dolly Sisters",1,6,true,"",new ArrayList<Integer>(Arrays.asList(new Integer[]{3,2,12})));
         area[1] = new gameArea("Unreal Estate",2,6,true,"",new ArrayList<Integer>(Arrays.asList(new Integer[]{1,3,4,10,11,12})));
         area[2] = new gameArea("Dragon's Landing",3,6,false,"",new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,4})));
         area[3] = new gameArea("Small Gods",4,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{2,5,6,10})));
         area[4] = new gameArea("The Scours",5,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{4,6,7,8,10})));
         area[5] = new gameArea("The Hippo",6,6,false,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 5, 7})));
         area[6] = new gameArea("The Shades",7,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{5, 6, 8})));
         area[7] = new gameArea("Dimwell",8,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{5, 7, 9})));
         area[8] = new gameArea("Longwall",9,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{8, 10, 11})));
         area[9] = new gameArea("Isle of Gods",10,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 4, 5, 9, 11})));
         area[10] = new gameArea("Seven Sleepers",11,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 10, 9, 12})));
         area[11] = new gameArea("Nap Hill",12,6,true,"red",new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 11})));
        
        
        area[0].troubleMarker = true;
        area[4].troubleMarker = true;
        area[6].troubleMarker = true;
        
        
    fp.setVisible(true);
    fp.player.setVisible(false);
    fp.radio1.setVisible(false);
    fp.radio2.setVisible(false);
    fp.radio3.setVisible(false);
    fp.radioComp1.setVisible(false);
    fp.radioComp2.setVisible(false);
    fp.radioComp3.setVisible(false);
    fp.playButton.setVisible(false);
    fp.HVC.setVisible(false);
/*    sp.savegameButton.setVisible(false);
    sp.nameText.setVisible(false);
    sp.nameLabel.setVisible(false);
*/
    
    gb.nameLabel.setVisible(false);
    gb.nameText.setVisible(false);
    gb.savegameButton.setVisible(false);
    gb.cancel.setVisible(false);
    gb.notify.setVisible(false);
    image1.setVisible(false);
    image1.imageLabel.setVisible(false);
    image1.events.setVisible(false);
    image1.personality.setVisible(false);
    fp.go.setVisible(false);
    fp.notify.setVisible(false);
    
    
    cardDetails s;
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HVC;
    private javax.swing.ButtonGroup HVCgroup;
    public javax.swing.JTextField filename;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton load_game;
    private javax.swing.JButton new_game;
    private javax.swing.JLabel notify;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel player;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radioComp1;
    private javax.swing.JRadioButton radioComp2;
    private javax.swing.JRadioButton radioComp3;
    private javax.swing.ButtonGroup radiogroup;
    // End of variables declaration//GEN-END:variables
}
