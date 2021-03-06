package interfaces;

import militar.ColasD;
import javax.swing.JOptionPane;
import militar.Bicolas;
import militar.CartillaMilitar;
import militar.Nodo;
import militar.PilasD;

public class Index extends javax.swing.JFrame
{

    public static ColasD general;
    public static Bicolas bcolas;
    public static boolean ban = false;
    public static Bicolas<Nodo> bc = new Bicolas<>(new Nodo[1000]);
    private ColasD tmp;
    private int canI = 0;

    /**
     * Creates new form Index
     */
    public Index()
    {
        initComponents();
        if (!ban)
        {
            general = new ColasD();
            ban = true;
        }
        mostrarTodos();
    }

    public void mostrarTodos()
    {
        PilasD tmp = new PilasD();
        int tama = Index.general.getTam();
        String matriz[][] = new String[tama][3];
        for (int i = 0; i < tama; i++)
        {
            Nodo aux = Index.general.elimina();
            CartillaMilitar obj = (CartillaMilitar) aux.getObj();
            matriz[i][0] = obj.getNombre();
            matriz[i][1] = obj.getClase() + "";
            matriz[i][2] = obj.getRemiso() + "";
            tmp.inserta(aux);
        }

        tablaPri.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]
        {
            "Nombre", "Clase", "Remisos"
        })

        {
            @Override
            public boolean isCellEditable(int filas, int columnas)
            {
                if (columnas != 0)
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
        );
        tablaPri.setEnabled(false);

        Nodo aux = tmp.elimina();
        while (aux != null)
        {
            Index.general.inserta(aux);
            aux = tmp.elimina();
        }
    }

    public void mostrarRemisos()
    {
        PilasD tmpo = new PilasD();
        int tama = tmp.getTam();
        String matriz[][] = new String[tama][3];
        for (int i = 0; i < tama; i++)
        {
            Nodo aux = Index.general.elimina();
            CartillaMilitar obj = (CartillaMilitar) aux.getObj();
            matriz[i][0] = obj.getNombre();
            matriz[i][1] = obj.getClase() + "";
            matriz[i][2] = obj.getRemiso() + "";
            tmpo.inserta(aux);
        }

        tablaPri.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]
        {
            "Nombre", "Clase", "Remisos"
        })

        {
            @Override
            public boolean isCellEditable(int filas, int columnas)
            {
                if (columnas != 0)
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
        );
        tablaPri.setEnabled(false);

        Nodo aux = tmpo.elimina();
        while (aux != null)
        {
            Index.general.inserta(aux);
            aux = tmpo.elimina();
        }
    }

    public void mostrarEnc(Nodo enc)
    {
        String matriz[][] = new String[1][3];
        CartillaMilitar obj = (CartillaMilitar) enc.getObj();
        matriz[0][0] = obj.getNombre();
        matriz[0][1] = obj.getClase() + "";
        matriz[0][2] = obj.getRemiso() + "";

        tablaPri.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]
        {
            "Nombre", "Clase", "Remisos"
        })

        {
            @Override
            public boolean isCellEditable(int filas, int columnas)
            {
                if (columnas != 0)
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
        );
        tablaPri.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPri = new javax.swing.JTable();
        btnTodos = new javax.swing.JButton();
        btnRemisos = new javax.swing.JButton();
        btnQuitarRemisos = new javax.swing.JButton();
        btnAltas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaPri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(tablaPri);

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTodosActionPerformed(evt);
            }
        });

        btnRemisos.setText("Quitar Remisos");
        btnRemisos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRemisosActionPerformed(evt);
            }
        });

        btnQuitarRemisos.setText("Remisos");
        btnQuitarRemisos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnQuitarRemisosActionPerformed(evt);
            }
        });

        btnAltas.setText("Agregar");
        btnAltas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltasActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRemisos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitarRemisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAltas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnTodos)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemisos)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitarRemisos)
                        .addGap(18, 18, 18)
                        .addComponent(btnAltas)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarRemisosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnQuitarRemisosActionPerformed
    {//GEN-HEADEREND:event_btnQuitarRemisosActionPerformed

//        for (int i = 0; i > canI; i++)
//        {
//            Object arr[] = bc.elimina(bc.getAtras1(), -1, 1);
//            bc.setAtras1((int) arr[1]);
//            Nodo nw = (Nodo) arr[0];
//            general.inserta(nw);
//        }
//
//        mostrarRemisos();
        
        JOptionPane.showMessageDialog(this, "Opcion en desarrollo");
        
        

    }//GEN-LAST:event_btnQuitarRemisosActionPerformed

    private void btnRemisosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemisosActionPerformed
    {//GEN-HEADEREND:event_btnRemisosActionPerformed
        // Lado Izquierdo remisos
        if(Index.general.getTam()>0){
            Nodo aux = general.elimina();
            int can = 0;
            while (aux != null)
            {
                CartillaMilitar obj = (CartillaMilitar) aux.getObj();
                if (obj.getClase() > 18)
                {
                    Index.bc.setAtras1(Index.bc.inserta(aux, Index.bc.getAtras1(), Index.bc.getAtras2(), 1));
                    System.out.println("Lado izquierdo");
                    canI++;
                } else
                {
                    Index.bc.setAtras2(Index.bc.inserta(aux, Index.bc.getAtras2(), Index.bc.getAtras1(), -1));
                    System.out.println("Lado derecho");
                    can++;
                }
                aux = general.elimina();
            }

            for (int i = 0; i < can; i++)
            {
                Object arr[] = bc.elimina(bc.getAtras2(), bc.getCola().length, -1);
                bc.setAtras2((int) arr[1]);
                Nodo nw = (Nodo) arr[0];
                general.inserta(nw);
            }
            mostrarTodos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos en la cola");
        }
    }//GEN-LAST:event_btnRemisosActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtBuscarActionPerformed
    {//GEN-HEADEREND:event_txtBuscarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtBuscarKeyTyped
    {//GEN-HEADEREND:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        if (txtBuscar.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed

        PilasD tmp = new PilasD();
        Nodo aux = general.elimina();
        Nodo enc = null;
        while (aux != null)
        {
            if (aux.getEtq().compareTo(txtBuscar.getText()) != 0)
            {
                tmp.inserta(aux);
                aux = general.elimina();
            } else
            {
                enc = aux;
                tmp.inserta(aux);
                break;
            }
        }

        if (enc == null)
        {
            JOptionPane.showMessageDialog(this, "No se encontro el dato");
        } else
        {
            System.out.println("Si encontre a " + enc.getEtq());
            mostrarEnc(enc);
        }

        aux = tmp.elimina();
        while (aux != null)
        {
            general.inserta(aux);
            aux = tmp.elimina();
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAltasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltasActionPerformed
    {//GEN-HEADEREND:event_btnAltasActionPerformed

        this.dispose();
        this.setVisible(false);
        new AltaMilitar().setVisible(true);
        mostrarTodos();

    }//GEN-LAST:event_btnAltasActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTodosActionPerformed
    {//GEN-HEADEREND:event_btnTodosActionPerformed
        
        if(Index.general.getTam() > 0)
        {
            mostrarTodos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos");
        }
        
    }//GEN-LAST:event_btnTodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnQuitarRemisos;
    private javax.swing.JButton btnRemisos;
    private javax.swing.JButton btnTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPri;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
