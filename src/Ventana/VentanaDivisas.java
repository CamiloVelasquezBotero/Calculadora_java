/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

/**
 *
 * @author Camilo
 */
public class VentanaDivisas extends javax.swing.JFrame {

    private String divisa1 = "Estados Unidos - USD";
    private String divisa2 = "Estados Unidos - USD";
    private String cantidad = "";
    private double dinero, cambio;
    private boolean punto = true;

    /**
     * Creates new form VentanaDivisas
     */
    public VentanaDivisas() {
        initComponents();
        setSize(300, 450);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        etiquetaDivisa1 = new javax.swing.JLabel();
        comboDivisas2 = new javax.swing.JComboBox<>();
        etiquetaCambio1 = new javax.swing.JLabel();
        etiquetaDivisa2 = new javax.swing.JLabel();
        etiquetaCambio2 = new javax.swing.JLabel();
        comboDivisas1 = new javax.swing.JComboBox<>();
        botonC = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuUsos = new javax.swing.JMenu();
        subsmenuCalculadora = new javax.swing.JMenuItem();
        submenuConversor = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        submenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Divisas");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisa1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa1.setText("$USD");
        etiquetaDivisa1.setMaximumSize(new java.awt.Dimension(40, 28));
        etiquetaDivisa1.setMinimumSize(new java.awt.Dimension(40, 28));
        etiquetaDivisa1.setPreferredSize(new java.awt.Dimension(40, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        jPanel1.add(etiquetaDivisa1, gridBagConstraints);

        comboDivisas2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comboDivisas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - USD", "Europa - EUR", "Peru - SOL", "Colombia - COP" }));
        comboDivisas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 15);
        jPanel1.add(comboDivisas2, gridBagConstraints);

        etiquetaCambio1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaCambio1.setText("0");
        etiquetaCambio1.setPreferredSize(new java.awt.Dimension(20, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(etiquetaCambio1, gridBagConstraints);

        etiquetaDivisa2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa2.setText("$USD");
        etiquetaDivisa2.setMaximumSize(new java.awt.Dimension(40, 28));
        etiquetaDivisa2.setMinimumSize(new java.awt.Dimension(40, 28));
        etiquetaDivisa2.setPreferredSize(new java.awt.Dimension(40, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        jPanel1.add(etiquetaDivisa2, gridBagConstraints);

        etiquetaCambio2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaCambio2.setText("0");
        etiquetaCambio2.setPreferredSize(new java.awt.Dimension(20, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(etiquetaCambio2, gridBagConstraints);

        comboDivisas1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comboDivisas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - USD", "Europa - EUR", "Peru - SOL", "Colombia - COP" }));
        comboDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 15);
        jPanel1.add(comboDivisas1, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(botonC, gridBagConstraints);

        botonBorrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        botonBorrar.setPreferredSize(new java.awt.Dimension(49, 37));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(botonBorrar, gridBagConstraints);

        boton9.setText("9");
        boton9.setPreferredSize(new java.awt.Dimension(49, 37));
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton9, gridBagConstraints);

        boton8.setText("8");
        boton8.setPreferredSize(new java.awt.Dimension(49, 37));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton8, gridBagConstraints);

        boton7.setText("7");
        boton7.setPreferredSize(new java.awt.Dimension(49, 37));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton7, gridBagConstraints);

        boton6.setText("6");
        boton6.setPreferredSize(new java.awt.Dimension(49, 37));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton6, gridBagConstraints);

        boton5.setText("5");
        boton5.setPreferredSize(new java.awt.Dimension(49, 37));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton5, gridBagConstraints);

        boton4.setText("4");
        boton4.setPreferredSize(new java.awt.Dimension(49, 37));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton4, gridBagConstraints);

        boton3.setText("3");
        boton3.setPreferredSize(new java.awt.Dimension(49, 37));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton3, gridBagConstraints);

        boton2.setText("2");
        boton2.setPreferredSize(new java.awt.Dimension(49, 37));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton2, gridBagConstraints);

        boton1.setText("1");
        boton1.setPreferredSize(new java.awt.Dimension(49, 37));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton1, gridBagConstraints);

        boton0.setText("0");
        boton0.setPreferredSize(new java.awt.Dimension(49, 37));
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton0, gridBagConstraints);

        botonPunto.setText(".");
        botonPunto.setPreferredSize(new java.awt.Dimension(49, 37));
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(botonPunto, gridBagConstraints);

        menuUsos.setText("Usos");
        menuUsos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        subsmenuCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora.png"))); // NOI18N
        subsmenuCalculadora.setText("Calculadora Estandar");
        subsmenuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsmenuCalculadoraActionPerformed(evt);
            }
        });
        menuUsos.add(subsmenuCalculadora);

        submenuConversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/divisas.png"))); // NOI18N
        submenuConversor.setText("Conversor de Divisas");
        menuUsos.add(submenuConversor);
        menuUsos.add(separador1);

        submenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        submenuSalir.setText("Salir");
        submenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuSalirActionPerformed(evt);
            }
        });
        menuUsos.add(submenuSalir);

        barraMenu.add(menuUsos);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_submenuSalirActionPerformed

    private void subsmenuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsmenuCalculadoraActionPerformed
        VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);

        dispose();
    }//GEN-LAST:event_subsmenuCalculadoraActionPerformed

    private void comboDivisas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas2ActionPerformed
        divisa2 = (String) comboDivisas2.getSelectedItem();

        if (divisa2 == "Estados Unidos - USD") {
            etiquetaDivisa2.setText("USD");
        } else if (divisa2 == "Europa - EUR") {
            etiquetaDivisa2.setText("EUR");
        } else if (divisa2 == "Peru - SOL") {
            etiquetaDivisa2.setText("SOL");
        } else if (divisa2 == "Colombia - COP") {
            etiquetaDivisa2.setText("COP");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas2ActionPerformed

    private void comboDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas1ActionPerformed
        divisa1 = (String) comboDivisas1.getSelectedItem();

        if (divisa1 == "Estados Unidos - USD") {
            etiquetaDivisa1.setText("USD");
        } else if (divisa1 == "Europa - EUR") {
            etiquetaDivisa1.setText("EUR");
        } else if (divisa1 == "Peru - SOL") {
            etiquetaDivisa1.setText("SOL");
        } else if (divisa1 == "Colombia - COP") {
            etiquetaDivisa1.setText("COP");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas1ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "1";
        } else {
            cantidad += "1";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "2";
        } else {
            cantidad += "2";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "3";
        } else {
            cantidad += "3";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "4";
        } else {
            cantidad += "4";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "5";
        } else {
            cantidad += "5";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "6";
        } else {
            cantidad += "6";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "7";
        } else {
            cantidad += "7";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "8";
        } else {
            cantidad += "8";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "9";
        } else {
            cantidad += "9";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if (cantidad != "") {
            if (etiquetaCambio1.getText() == "0") {
                cantidad = "0";
            } else {
                cantidad += "0";
            }
            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (punto == true) {
            if (cantidad == "") {
                cantidad = "0.";
            } else {
                cantidad += ".";
            }
            etiquetaCambio1.setText(cantidad);
            
            punto = false;
        }

    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int tamaño = cantidad.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cantidad = "0";
            }
            else{
                cantidad = cantidad.substring(0, cantidad.length()-1);
            }
            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        cantidad = "";
        punto = true;
        etiquetaCambio1.setText("0");
        etiquetaCambio2.setText("0");
    }//GEN-LAST:event_botonCActionPerformed

    private void obtenerDinero() {
        cantidad = etiquetaCambio1.getText();
        dinero = Double.parseDouble(cantidad);
        cambioDivisas();
        dinero *= cambio;
        etiquetaCambio2.setText(String.format("%.2f", dinero));
    }

    private void cambioDivisas() {
        if (divisa1.equals(divisa2)) {
            cambio = 1;
        } else if (divisa1.equals("Estados Unidos - USD") && divisa2.equals("Peru - SOL")) {
            cambio = 3.83;
        } else if (divisa1.equals("Estados Unidos - USD") && divisa2.equals("Europa - EUR")) {
            cambio = 0.95;
        } else if (divisa1.equals("Estados Unidos - USD") && divisa2.equals("Colombia - COP")) {
            cambio = 4791.51;
        } else if (divisa1.equals("Europa - EUR") && divisa2.equals("Estados Unidos - USD")) {
            cambio = 1.05;
        } else if (divisa1.equals("Europa - EUR") && divisa2.equals("Peru - SOL")) {
            cambio = 4.02;
        } else if (divisa1.equals("Europa - EUR") && divisa2.equals("Colombia - COP")) {
            cambio = 5024.19;
        } else if (divisa1.equals("Peru - SOL") && divisa2.equals("Estados Unidos - USD")) {
            cambio = 0.26;
        } else if (divisa1.equals("Peru - SOL") && divisa2.equals("Europa - EUR")) {
            cambio = 0.25;
        } else if (divisa1.equals("Peru - SOL") && divisa2.equals("Colombia - COP")) {
            cambio = 1250.41;
        } else if (divisa1.equals("Colombia - COP") && divisa2.equals("Estados Unidos - USD")) {
            cambio = 0.00021;
        } else if (divisa1.equals("Colombia - COP") && divisa2.equals("Europa - EUR")) {
            cambio = 0.00020;
        } else if (divisa1.equals("Colombia - COP") && divisa2.equals("Peru - SOL")) {
            cambio = 0.00080;
        }
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
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonPunto;
    private javax.swing.JComboBox<String> comboDivisas1;
    private javax.swing.JComboBox<String> comboDivisas2;
    private javax.swing.JLabel etiquetaCambio1;
    private javax.swing.JLabel etiquetaCambio2;
    private javax.swing.JLabel etiquetaDivisa1;
    private javax.swing.JLabel etiquetaDivisa2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuUsos;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JMenuItem submenuConversor;
    private javax.swing.JMenuItem submenuSalir;
    private javax.swing.JMenuItem subsmenuCalculadora;
    // End of variables declaration//GEN-END:variables
}
