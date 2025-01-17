/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author namal
 */
import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import java.io.*; 




public class mainJFrame extends javax.swing.JFrame {

    SerialPort serialPort1;
   // OutputStream outputSteam1;
    String dataBuffer = "";
    
    //-------------------------------
    private viewerJframe viewfeame;
    //-----------------------------
    
    /**
     * Creates new form mainJFrame
     */
    public mainJFrame() {
        initComponents();
        
        jComboBox_baudRate.setSelectedItem("9600");
        jComboBox_dataBits.setSelectedItem("8");
        jComboBox_stopBits.setSelectedItem("1");
        jComboBox_parityBits.setSelectedItem("NO_PARITY");
        
        
        jComboBox_comPort.setEnabled(true);
        jProgressBar_comStatus.setValue(0);
        jButton_open.setEnabled(true);
        jButton_close.setEnabled(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_comPort = new javax.swing.JComboBox<>();
        jComboBox_baudRate = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_dataBits = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_stopBits = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_parityBits = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar_comStatus = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_open = new javax.swing.JButton();
        jButton_close = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField_path = new javax.swing.JTextField();
        jButton_select = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton_upload = new javax.swing.JButton();
        jButton_view = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("javaserialcommunication");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("COM PORT SETTINGS"));

        jLabel1.setText("COM PORT");

        jComboBox_comPort.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_comPortPopupMenuWillBecomeVisible(evt);
            }
        });

        jComboBox_baudRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4800", "9600", "38400", "57600", "115200" }));
        jComboBox_baudRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_baudRateActionPerformed(evt);
            }
        });

        jLabel2.setText("BOUD RATE");

        jComboBox_dataBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8", " " }));
        jComboBox_dataBits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_dataBitsActionPerformed(evt);
            }
        });

        jLabel3.setText("DATA BITS");

        jComboBox_stopBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1.5", "2", " " }));

        jLabel4.setText("STOP BITS");

        jComboBox_parityBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PARITY", "EVEN_PARITY", "ODD_PARITY", "MARK_PARITY", "SPACE_PARITY" }));

        jLabel5.setText("PARITY BITS");

        jLabel6.setText("COM STATUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_open.setText("OPEN");
        jButton_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_openActionPerformed(evt);
            }
        });

        jButton_close.setText("CLOSE");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jButton_open)
                .addGap(18, 18, 18)
                .addComponent(jButton_close)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_open)
                    .addComponent(jButton_close))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("SPECIFIC SETINGS"));

        jLabel7.setText("SELECT PROGRAMER");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usbasp", "ttl232r" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("SELECT  MICROCONTROLER");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m328p", "m328" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setText("CHOOSE FILE PATH");

        jTextField_path.setText("file path");
        jTextField_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_pathActionPerformed(evt);
            }
        });

        jButton_select.setText("browse");
        jButton_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selectActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_upload.setText("upload");
        jButton_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_uploadActionPerformed(evt);
            }
        });

        jButton_view.setText("view");
        jButton_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton_upload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton_view)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_upload)
                    .addComponent(jButton_view))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_path, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_select)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_select))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_openActionPerformed
       
       
    // TODO add your handling code here:
        try{
            SerialPort []portLists = SerialPort.getCommPorts();
            serialPort1 = portLists[jComboBox_comPort.getSelectedIndex()];
            serialPort1.setBaudRate(Integer.parseInt(jComboBox_baudRate.getSelectedItem().toString()));
            serialPort1.setNumDataBits(Integer.parseInt(jComboBox_dataBits.getSelectedItem().toString()));
           // serialPort1.setNumStopBits(Integer.parseInt(jComboBox_stopBits.getSelectedItem().toString()));
           
            // Set stop bits using constants
    String stopBits = jComboBox_stopBits.getSelectedItem().toString();
    switch (stopBits) {
        case "1":
            serialPort1.setNumStopBits(SerialPort.ONE_STOP_BIT);
            break;
        case "1.5":
            serialPort1.setNumStopBits(SerialPort.ONE_POINT_FIVE_STOP_BITS);
            break;
        case "2":
            serialPort1.setNumStopBits(SerialPort.TWO_STOP_BITS);
            break;
        default:
            throw new IllegalArgumentException("Invalid stop bits value: " + stopBits);
    }
    
    //--------------------------------------------------
           
         
            serialPort1.setParity(jComboBox_parityBits.getSelectedIndex());
            serialPort1.openPort();
            
            if(serialPort1.isOpen()){
              JOptionPane.showMessageDialog(this,serialPort1.getDescriptivePortName()+"-- Success to OPEN!"); 
               jComboBox_comPort.setEnabled(false);
               jProgressBar_comStatus.setValue(100);
               jButton_open.setEnabled(false);
               jButton_close.setEnabled(true); 
               
               Serial_EventBasedReading(serialPort1);
              
            }
            else{
                JOptionPane.showMessageDialog(this,serialPort1.getDescriptivePortName()+"-- Failed to OPEN!"); 
                
            }
            
            
        }
        catch(ArrayIndexOutOfBoundsException a){
           JOptionPane.showMessageDialog(this,"please choose COM PORT!", "ERROR", ERROR_MESSAGE); 
                  
        }
        
        catch(Exception b){
            JOptionPane.showMessageDialog(this,b, "ERROR", ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_jButton_openActionPerformed

    private void jComboBox_baudRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_baudRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_baudRateActionPerformed

    private void jComboBox_comPortPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_comPortPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        jComboBox_comPort.removeAllItems();
        SerialPort []portLists = SerialPort.getCommPorts();
        for(SerialPort port : portLists){
            jComboBox_comPort.addItem(port.getSystemPortName());
        }
    }//GEN-LAST:event_jComboBox_comPortPopupMenuWillBecomeVisible

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        // TODO add your handling code here:
         if(serialPort1.isOpen()){
            serialPort1.closePort() ;
            jComboBox_comPort.setEnabled(true);
               jProgressBar_comStatus.setValue(0);
               jButton_open.setEnabled(true);
               jButton_close.setEnabled(false);
         }
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jTextField_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_pathActionPerformed

    private void jButton_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selectActionPerformed
        // TODO add your handling code here:
//        JFileChooser chooser = new JFileChooser("file path");
//        chooser.showOpenDialog(null);
//        File f = chooser.getSelectedFile();
//        String filename = f.getAbsolutePath();
//        jTextField_path.setText(filename);


        JFileChooser chooser = new JFileChooser("file path");
    int returnValue = chooser.showOpenDialog(null);
    
    // Check if a file was selected
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File f = chooser.getSelectedFile();
        
        // Check if the selected file is not null
        if (f != null) {
            String filename = f.getAbsolutePath();
            jTextField_path.setText(filename);
        } else {
            // Handle the case where the selected file is null
            JOptionPane.showMessageDialog(null, "No file selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Handle the case where no file was selected (dialog was cancelled)
        JOptionPane.showMessageDialog(null, "File selection cancelled.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_jButton_selectActionPerformed

    private void jButton_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_uploadActionPerformed
        // TODO add your handling code here:
        if(viewfeame==null){
               viewfeame=new viewerJframe();
           }
        viewfeame.setVisible(true);
        String hexfilepath = jTextField_path.getText();
String programmer = (String) jComboBox1.getSelectedItem();
String controller = (String) jComboBox2.getSelectedItem();
String command = "avrdude -c " + programmer + " -p " + controller + " -U flash:w:" + hexfilepath + ":i";
StringBuilder output = new StringBuilder();

try {
    ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
    processBuilder.redirectErrorStream(true);
    Process process = processBuilder.start();
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line;
    while ((line = reader.readLine()) != null) {
        output.append(line).append("\n");
    }

    int exitCode = process.waitFor();
    output.append("Exited with code: ").append(exitCode);
    } 
   catch (Exception ex) {
    output.append("Error: ").append(ex.getMessage());
    }

     viewfeame.setTextInTextArea(output.toString());

        
    }//GEN-LAST:event_jButton_uploadActionPerformed

    private void jButton_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewActionPerformed
           // TODO add your handling code here:
           if(viewfeame==null){
               viewfeame=new viewerJframe();
           }
           viewfeame.setVisible(true);
    }//GEN-LAST:event_jButton_viewActionPerformed

    private void jComboBox_dataBitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_dataBitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_dataBitsActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
   
    private void Serial_EventBasedReading(SerialPort activePort){
      activePort.addDataListener(new SerialPortDataListener(){
        
       @Override
       public int getListeningEvents() {return SerialPort.LISTENING_EVENT_DATA_RECEIVED;}
       @Override
       public void serialEvent(SerialPortEvent event){
           byte []newData = event.getReceivedData();
           if(viewfeame==null){
               viewfeame=new viewerJframe();
           }
           for(int i=0;i<newData.length; i++) {
               dataBuffer +=(char)newData[i];
               viewfeame.setTextInTextArea(dataBuffer);
               
           }
       }
     });
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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close;
    private javax.swing.JButton jButton_open;
    private javax.swing.JButton jButton_select;
    private javax.swing.JButton jButton_upload;
    private javax.swing.JButton jButton_view;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox_baudRate;
    private javax.swing.JComboBox<String> jComboBox_comPort;
    private javax.swing.JComboBox<String> jComboBox_dataBits;
    private javax.swing.JComboBox<String> jComboBox_parityBits;
    private javax.swing.JComboBox<String> jComboBox_stopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar_comStatus;
    private javax.swing.JTextField jTextField_path;
    // End of variables declaration//GEN-END:variables
}
