/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseño;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jdjua
 */
public class Home extends javax.swing.JFrame {


    MyConnection con = new MyConnection();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idk;
    
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
          
        
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
        jLabelC = new javax.swing.JLabel();
        jButtonCS = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_home = new javax.swing.JTable();
        jButton_AG = new javax.swing.JButton();
        jButton_ED = new javax.swing.JButton();
        jButton_EL = new javax.swing.JButton();
        jTextFieldA = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUss = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldemal = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(104, 195, 163));

        jLabelC.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelC.setText("Bienvenido usuario");

        jButtonCS.setText("Cerrar Sesion");
        jButtonCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jButtonCS)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCS)))
        );

        jPanel2.setBackground(new java.awt.Color(190, 220, 227));

        jTable_home.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Usuario", "Password", "Email", "Telefono"
            }
        ));
        jTable_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_homeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_home);

        jButton_AG.setText("Agregar");
        jButton_AG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AGActionPerformed(evt);
            }
        });

        jButton_ED.setText("Editar");
        jButton_ED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDActionPerformed(evt);
            }
        });

        jButton_EL.setText("Eliminar");
        jButton_EL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ELActionPerformed(evt);
            }
        });

        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });

        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Apellido");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de Usuario");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Telefono");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton_AG)
                .addGap(132, 132, 132)
                .addComponent(jButton_ED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jButton_EL)
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldemal, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                .addComponent(jTextFieldUss))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(153, 153, 153))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTextFieldA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUss, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextFieldPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldemal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jTextFieldTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_EL)
                    .addComponent(jButton_ED)
                    .addComponent(jButton_AG))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCSActionPerformed
        
        Log lgf = new Log();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jButtonCSActionPerformed

    private void jButton_EDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDActionPerformed
       
    Modificar();
         
        
        
    }//GEN-LAST:event_jButton_EDActionPerformed

   void Modificar(){
   
       try { 
           String pname = jTextFieldNom.getText();
        String aname = jTextFieldA.getText();
        String usname = jTextFieldUss.getText();
        String word = jTextFieldPass.getText();
        String tel = jTextFieldTel.getText();
        String email = jTextFieldemal.getText();
        
        if(usname.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Falta El nommbre de usuario");
            Limpiar();
            
        }
        else if(word.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta la Password");
            Limpiar();
        }
        else if(pname.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Falta el nombre");
            Limpiar();
        }
        else if(aname.equals(""))
       {
           JOptionPane.showMessageDialog(null, "Falta el apellido");
           Limpiar();
        }
        else if(tel.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Falta el numero telefonico");
            Limpiar();
        }
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta el Email");
            Limpiar();
       }
        
        else if(checkUsername(usname))
        {
            JOptionPane.showMessageDialog(null, "Este nombre de usuario ya existe");
            Limpiar();
        }
        
        else {
            
        PreparedStatement ps;
        String sql = "Update regist set Nombre";
        conet = con.getconnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);  
        JOptionPane.showMessageDialog(null, "Se a agregado un usuario");
        Limpiar();
       } 
      
        } catch (Exception ex){
        
        }
    }
       
   
    
    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    private void jButton_AGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AGActionPerformed

     

        
        
       Agregar();
        
        
            
        
        
        
    }//GEN-LAST:event_jButton_AGActionPerformed

    private void jButton_ELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ELActionPerformed
       
        

        
        
    }//GEN-LAST:event_jButton_ELActionPerformed

    private void jTable_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_homeMouseClicked
        
       int fila = jTable_home.getSelectedRow();
       if(fila == -1){
        JOptionPane.showMessageDialog(null, "No hay fila seleccionada");
        
       } else {
         idk = Integer.parseInt(jTable_home.getValueAt(fila,0).toString());
         String nom = (String) jTable_home.getValueAt(fila,1);
         String aname = (String) jTable_home.getValueAt(fila,2);
        String usname = (String) jTable_home.getValueAt(fila,3);
        String word = (String) jTable_home.getValueAt(fila,4);
        int tel = (int) jTable_home.getValueAt(fila,5);
        String email = (String) jTable_home.getValueAt(fila,6);
      
        jTextFieldNom.setText(nom);
        jTextFieldA.setText(aname);
        jTextFieldUss.setText(usname);
        jTextFieldPass.setText(word);
        jTextFieldTel.setText(String.valueOf(tel));
        jTextFieldemal.setText(email);
       
       }
        
        
        
    }//GEN-LAST:event_jTable_homeMouseClicked

    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `Regist` WHERE `Usuario` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            
        }
         return checkUser;
    }
    
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    void mostrar(){
        
        String sql = "INSERT INTO `regist`(`Nombre`, `Apellido`, `Usuario`, `Pass`, `Telefono`, `Email`) VALUES (?,?,?,?,?,?)";
       
        try {
        conet = con.getconnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        Object[] regist = new Object[6];
        modelo = (DefaultTableModel) jTable_home.getModel();
        while (rs.next()){
            regist [0] = rs.getString("Nombre");
            regist [1] = rs.getString("Apellido");
            regist [2] = rs.getString("Usuario");
            regist [3] = rs.getString("Pass");
            regist [4] = rs.getInt("Telefono");
            regist [5] = rs.getString("Email");
            
            modelo.addRow(regist);
        }
        jTable_home.setModel(modelo);
        
        } catch (Exception ex){
          
        }
        
    
    }
    void Agregar(){
        
        
       try { 
           String pname = jTextFieldNom.getText();
        String aname = jTextFieldA.getText();
        String usname = jTextFieldUss.getText();
        String word = jTextFieldPass.getText();
        String tel = jTextFieldTel.getText();
        String email = jTextFieldemal.getText();
        
        if(usname.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Falta El nommbre de usuario");
            Limpiar();
            
        }
        else if(word.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta la Password");
            Limpiar();
        }
        else if(pname.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Falta el nombre");
            Limpiar();
        }
        else if(aname.equals(""))
       {
           JOptionPane.showMessageDialog(null, "Falta el apellido");
           Limpiar();
        }
        else if(tel.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Falta el numero telefonico");
            Limpiar();
        }
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta el Email");
            Limpiar();
       }
        
        else if(checkUsername(usname))
        {
            JOptionPane.showMessageDialog(null, "Este nombre de usuario ya existe");
            Limpiar();
        }
        
        else {
            
        PreparedStatement ps;
        String sql = "INSERT INTO `regist`(`Nombre`, `Apellido`, `Usuario`, `Pass`, `Telefono`, `Email`) VALUES ('"+pname+"','"+aname+"','"+usname+"','"+word+"','"+tel+"','"+email+"')";
        conet = con.getconnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);  
        JOptionPane.showMessageDialog(null, "Se a agregado un usuario");
        Limpiar();
       } 
      
        } catch (Exception ex){
        
        }
    }
    
    void Limpiar(){
    for (int i = 0; i<= jTable_home.getRowCount(); i++){
        modelo.removeRow(i);
        i = i-1;
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCS;
    private javax.swing.JButton jButton_AG;
    private javax.swing.JButton jButton_ED;
    private javax.swing.JButton jButton_EL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabelC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_home;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldUss;
    private javax.swing.JTextField jTextFieldemal;
    // End of variables declaration//GEN-END:variables
}
