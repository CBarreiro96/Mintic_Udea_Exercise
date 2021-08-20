/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.Instant;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Cinema.ventas.Cliente;
import Cinema.ventas.Ventas;

/**
 *
 * @author userx
 */
public class frmCinema extends javax.swing.JFrame implements ActionListener{
    
//    private static ImageIcon imgSillaPreferencialReservada = new ImageIcon("/home/userx/cinema-imagenes/sillaPreferencial   Reservada.png");
//    private static ImageIcon imgSillaPreferencialOcupada = new ImageIcon("/home/userx/cinema-imagenes/sillaPreferencialOcupada.png");
//    private static ImageIcon imgSillaReservada = new ImageIcon("/home/userx/cinema-imagenes/sillaReservada.png");
//    private static ImageIcon imgSillaOcupada = new ImageIcon("/home/userx/cinema-imagenes/sillaOcupada.png");
//    
    private ArrayList<Ventas> ventas = new ArrayList<>();
    private HashMap<Integer, Sillas> sillas = new HashMap<>();
    private HashMap<String, Cliente> clientes = new HashMap<>();
    private Sillas sillaSeleccionada;
    private JButton botonSillaSeleccionada;
    private Cliente clienteSeleccionado;

    /**
     * Creates new form frmCinema
     */
    public frmCinema() {
        initComponents();
        this.btnS1.addActionListener(this);
        this.btnS2.addActionListener(this);
        this.btnS3.addActionListener(this);
        this.btnS4.addActionListener(this);
        this.btnS5.addActionListener(this);
        this.btnS6.addActionListener(this);
        this.btnS7.addActionListener(this);
        this.btnS8.addActionListener(this);
        this.btnS9.addActionListener(this); 
        
        crearDatos();
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
        btnS1 = new javax.swing.JButton();
        btnS2 = new javax.swing.JButton();
        btnS3 = new javax.swing.JButton();
        btnS4 = new javax.swing.JButton();
        btnS5 = new javax.swing.JButton();
        btnS6 = new javax.swing.JButton();
        btnS7 = new javax.swing.JButton();
        btnS8 = new javax.swing.JButton();
        btnS9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        completarVenta = new javax.swing.JButton();
        cancelarVenta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelSillaSeleccionada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnS1.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/sillaDeshabilitada.png")); // NOI18N
        btnS1.setActionCommand("1");
        btnS1.setBorderPainted(false);
        btnS1.setContentAreaFilled(false);
        btnS1.setFocusPainted(false);
        btnS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS1ActionPerformed(evt);
            }
        });

        btnS2.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/sillaDeshabilitada.png")); // NOI18N
        btnS2.setActionCommand("2");
        btnS2.setBorderPainted(false);
        btnS2.setContentAreaFilled(false);
        btnS2.setFocusPainted(false);
        btnS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS2ActionPerformed(evt);
            }
        });

        btnS3.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/sillaDeshabilitada.png")); // NOI18N
        btnS3.setActionCommand("3");
        btnS3.setBorderPainted(false);
        btnS3.setContentAreaFilled(false);
        btnS3.setFocusPainted(false);
        btnS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS3ActionPerformed(evt);
            }
        });

        btnS4.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/silla.png")); // NOI18N
        btnS4.setActionCommand("4");
        btnS4.setBorderPainted(false);
        btnS4.setContentAreaFilled(false);
        btnS4.setFocusPainted(false);
        btnS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS4ActionPerformed(evt);
            }
        });

        btnS5.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/silla.png")); // NOI18N
        btnS5.setActionCommand("5");
        btnS5.setBorderPainted(false);
        btnS5.setContentAreaFilled(false);
        btnS5.setFocusPainted(false);
        btnS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS5ActionPerformed(evt);
            }
        });

        btnS6.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/silla.png")); // NOI18N
        btnS6.setActionCommand("6");
        btnS6.setBorderPainted(false);
        btnS6.setContentAreaFilled(false);
        btnS6.setFocusPainted(false);
        btnS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS6ActionPerformed(evt);
            }
        });

        btnS7.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/sillaPreferencial.png")); // NOI18N
        btnS7.setActionCommand("7");
        btnS7.setBorderPainted(false);
        btnS7.setContentAreaFilled(false);
        btnS7.setFocusPainted(false);
        btnS7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS7ActionPerformed(evt);
            }
        });

        btnS8.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/sillaPreferencial.png")); // NOI18N
        btnS8.setActionCommand("8");
        btnS8.setBorderPainted(false);
        btnS8.setContentAreaFilled(false);
        btnS8.setFocusPainted(false);
        btnS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS8ActionPerformed(evt);
            }
        });

        btnS9.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/sillaPreferencial.png")); // NOI18N
        btnS9.setActionCommand("9");
        btnS9.setBorderPainted(false);
        btnS9.setContentAreaFilled(false);
        btnS9.setFocusPainted(false);
        btnS9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS9ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/userx/cinema-imagenes/pantalla.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnS7)
                            .addComponent(btnS4)
                            .addComponent(btnS1))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnS2)
                            .addComponent(btnS5)
                            .addComponent(btnS8))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnS6)
                            .addComponent(btnS3)
                            .addComponent(btnS9))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnS7)
                    .addComponent(btnS8)
                    .addComponent(btnS9))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnS4)
                    .addComponent(btnS5)
                    .addComponent(btnS6))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnS3)
                    .addComponent(btnS2)
                    .addComponent(btnS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Informacion de la Venta");

        jPanel3.setBackground(new java.awt.Color(175, 181, 185));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Documento");

        txtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDocumentoFocusLost(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Nombre)))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Informacion de la Cliente");

        completarVenta.setText("Completar Venta");
        completarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        completarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarVentaActionPerformed(evt);
            }
        });

        cancelarVenta.setText("Cancelar Venta");
        cancelarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVentaActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(135, 144, 149));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Silla seleccionada:");

        labelPrecio.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(21, 112, 13));
        labelPrecio.setText("Aqui precio");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio de la Silla:");

        labelSillaSeleccionada.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        labelSillaSeleccionada.setForeground(new java.awt.Color(21, 112, 13));
        labelSillaSeleccionada.setText("Aqui silla");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSillaSeleccionada))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(labelPrecio)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelSillaSeleccionada))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelPrecio))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(completarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS1ActionPerformed

    private void btnS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS2ActionPerformed

    private void btnS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS3ActionPerformed

    private void btnS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS4ActionPerformed

    private void btnS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS5ActionPerformed

    private void btnS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS6ActionPerformed

    private void btnS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS7ActionPerformed

    private void btnS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS8ActionPerformed

    private void btnS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnS9ActionPerformed

    private void cancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVentaActionPerformed
        if (this.sillaSeleccionada != null) {
            this.sillaSeleccionada.cambiarEstado(Estado.DISPONIBLE);           
            this.resolverImagenBoton(this.botonSillaSeleccionada,sillaSeleccionada);
            limpiarDatos();
        }
    }//GEN-LAST:event_cancelarVentaActionPerformed

    private void limpiarDatos() {
        this.sillaSeleccionada = null;
        this.botonSillaSeleccionada = null;
        this.clienteSeleccionado = null;
        this.labelSillaSeleccionada.setText("");
        this.labelPrecio.setText("");
        this.txtDocumento.setText(null);
        this.txtNombre.setText(null);
//            this.botonSillaSeleccionada.setIcon(imgSillaOcupada);
    }

    private void completarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarVentaActionPerformed
        if (this.sillaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una silla!");
            return;
        }
        if (txtDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el documento!");
            return;
        }
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre!");
            return;            
        }     
        
        if (clienteSeleccionado == null){
            Cliente cliente = new Cliente(txtNombre.getText(),txtDocumento.getText());
            clientes.put(txtDocumento.getText(),cliente);
            System.out.println("Esto es el cliente:"+clientes);
            this.clienteSeleccionado = cliente;
        }
        
        Ventas venta = new Ventas(new Date());
        venta.setCliente(clienteSeleccionado);
        venta.setSilla(sillaSeleccionada);
        venta.setValorVenta(Double.valueOf(this.labelPrecio.getText()));
        ventas.add(venta);
        System.out.println("Esta es la venta"+ ventas);
        
      
        this.sillaSeleccionada.cambiarEstado(Estado.OCUPADA);
        this.resolverImagenBoton(this.botonSillaSeleccionada, sillaSeleccionada);
        this.limpiarDatos();
        
    }//GEN-LAST:event_completarVentaActionPerformed

    private void txtDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocumentoFocusLost
        Cliente cliente = this.buscarCliente(txtDocumento.getText());
        if (cliente != null) {
            this.clienteSeleccionado = cliente;
            this.txtNombre.setText(cliente.getNombre());
        }
    }//GEN-LAST:event_txtDocumentoFocusLost

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
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCinema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton btnS1;
    private javax.swing.JButton btnS2;
    private javax.swing.JButton btnS3;
    private javax.swing.JButton btnS4;
    private javax.swing.JButton btnS5;
    private javax.swing.JButton btnS6;
    private javax.swing.JButton btnS7;
    private javax.swing.JButton btnS8;
    private javax.swing.JButton btnS9;
    private javax.swing.JButton cancelarVenta;
    private javax.swing.JButton completarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelSillaSeleccionada;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnSilla = (JButton) e.getSource();
        this.seleccionarSilla(btnSilla);
    }

    private void crearDatos() {
        Sillas silla1 = new SillaDeshabilitada(1,"sillaDeshabilitada",Estado.DISPONIBLE);
        Sillas silla2 = new SillaDeshabilitada(2,"sillaDeshabilitada",Estado.DISPONIBLE);
        Sillas silla3 = new SillaDeshabilitada(3,"sillaDeshabilitada",Estado.DISPONIBLE);
        Sillas silla4 = new Sillas(4,"silla",Estado.DISPONIBLE);
        Sillas silla5 = new Sillas(5,"silla",Estado.DISPONIBLE);
        Sillas silla6 = new Sillas(6,"silla",Estado.DISPONIBLE);
        Sillas silla7 = new SillaPreferencial(7,"sillaPreferencial",Estado.DISPONIBLE);
        Sillas silla8 = new SillaPreferencial(8,"sillaPreferencial",Estado.DISPONIBLE);
        Sillas silla9 = new SillaPreferencial(9,"sillaPreferencial",Estado.DISPONIBLE);
        
        this.sillas.put(1, silla1);
        this.sillas.put(2, silla2);
        this.sillas.put(3, silla3);
        this.sillas.put(4, silla4);
        this.sillas.put(5, silla5);
        this.sillas.put(6, silla6);
        this.sillas.put(7, silla7);
        this.sillas.put(8, silla8);
        this.sillas.put(9, silla9);
        
    }
    
    private void seleccionarSilla(JButton btnSilla){
        Integer noSilla = Integer.valueOf(btnSilla.getActionCommand());
        Sillas sillaSeleccionada = this.sillas.get(noSilla);
        
        switch (sillaSeleccionada.getEstado()){
            case DISPONIBLE:
                reservarSilla(btnSilla,sillaSeleccionada);
                break;
            case RESERVADA:
                JOptionPane.showMessageDialog(this, "Silla esta en proceso de venta");
                break;
            case OCUPADA:
                Ventas venta = buscarVenta(noSilla);
                JOptionPane.showMessageDialog(this, "Silla esta en ocupada por: " + venta.getCliente().getNombre());
                break;
            default:
        }
        
    }

    private void reservarSilla(JButton btnSilla, Sillas sillaSeleccionada) {
        int diaSemana = getDiaSemana();
        double precio = sillaSeleccionada.calcularPrecio(diaSemana);
        if (precio == -1) {
            JOptionPane.showMessageDialog(this, "Silla deshabilitada temporalmente");
            return;
        }
        
        this.sillaSeleccionada = sillaSeleccionada;
        this.botonSillaSeleccionada = btnSilla;
        sillaSeleccionada.cambiarEstado(Estado.RESERVADA);
        this.resolverImagenBoton(btnSilla, sillaSeleccionada);        
//        ImageIcon imgSillaReservada = new ImageIcon("/home/userx/cinema-imagenes/"+ sillaSeleccionada.getImagen()+"Reservada.png");
        this.labelSillaSeleccionada.setText(String.valueOf(sillaSeleccionada.getNumeroSillas()));
        this.labelPrecio.setText(String.valueOf(precio));
//        btnSilla.setIcon(imgSillaReservada);
        
//        this.labelPrecio.setText(precio + "");
        
    }

    private int getDiaSemana() {
//        LocalDate localDate = LocalDate.of(2021, Month.AUGUST, 7);
//        Date date2 = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
//        localDate.getDayOfWeek();

        
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    private void resolverImagenBoton(JButton boton, Sillas silla) {
        String sufijoImagen = "";
        switch (silla.getEstado()){
            case DISPONIBLE:
                sufijoImagen = ".png";
                break;
            case OCUPADA:
                sufijoImagen = "Ocupada.png";
                break;
            case RESERVADA:
                sufijoImagen = "Reservada.png";
                break;
            
        }
        ImageIcon imagen = new ImageIcon("/home/userx/cinema-imagenes/"+ silla.getImagen()+ sufijoImagen);
        boton.setIcon(imagen);
    }

    private Cliente buscarCliente(String documento) {
        return this.clientes.get(documento);
    }

    private Ventas buscarVenta(Integer noSilla) {
        for (Ventas venta : ventas){
            if (venta.getSilla().getNumeroSillas() == noSilla) {
                return  venta;
            }
        }
        return null;
    }
}
