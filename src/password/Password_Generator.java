package password;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import static password.Letras_Mayusculas.Mayusculas;
import static password.Letras_Minusculas.Minusculas;
import static password.Numeros_xd.Numeritos;
import static password.Simbolitos.Simbolitos;

public class Password_Generator extends javax.swing.JFrame {

    public Password_Generator() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Img/icono.png")).getImage());
        tPassword.setEchoChar((char) 0);
        meme.setText("" + jSlider.getValue());
        str = "" + jSlider.getValue();
        Rango = Integer.parseInt(str);
        Si.setVisible(false);
        No.setVisible(true);
        TextPrompt P = new TextPrompt("- - -", tPassword);
        jSlider.setCursor(new Cursor(HAND_CURSOR));
        Copiar.setVisible(false);
        numer = 0;
        sNum.setOnOff(false);
        sNum.repaint();
        simbol = 0;
        sSimb.setOnOff(false);
        sSimb.repaint();
        cc.setVisible(false);
    }

    String str = "";
    String cadena_may = "";
    String cadena = "";
    String cadena_num = "";
    String cadena_sim = "";
    String Copy = "";

    int Rango = 0;
    int numer = 1;
    int mayuscu = 1;
    int minus = 1;
    int simbol = 1;

    public void xd() {
        if (Rango > 17) {
            cc.setVisible(true);
        } else {
            cc.setVisible(false);
        }
    }

    public void cmmo() {
        try {
            if (Rango >= 8) {
                tSwitch.setText("");
                tSlider.setText("");
                BrooMiViejoMePagaLaU();
                xd();
            } else {
                Copiar.setVisible(false);
                tPassword.setText("");
                tSlider.setText("* El rango debe ser mayor a 7");
                Toolkit.getDefaultToolkit().beep();
            }
            if (mayuscu == 0 && minus == 0 && numer == 0 && simbol == 0) {
                Copiar.setVisible(false);
                tPassword.setText("");
                tSwitch.setText("* Seleccione carácteres a incluir");
                Toolkit.getDefaultToolkit().beep();
                cc.setVisible(false);
            } else {
                tSwitch.setText("");
                xd();
            }
        } catch (Exception e) {
            System.out.println("Error de jSlider " + e);
        }
    }

    public void BrooMiViejoMePagaLaU() {
        try {
            if (mayuscu == 1) {
                cadena_may = Mayusculas(Rango);
                /*System.out.printf("Cadena aleatoria de %d caracteres: %s\n", Rango, cadena_may);*/
            } else {
                cadena_may = "";
            }
            if (minus == 1) {
                cadena = Minusculas(Rango);
                /*System.out.printf("Cadena aleatoria de %d caracteres: %s\n", Rango, cadena);*/
            } else {
                cadena = "";
            }
            if (numer == 1) {
                cadena_num = Numeritos(Rango);
                /*System.out.printf("Cadena aleatoria de %d caracteres: %s\n", Rango, cadena_num);*/
            } else {
                cadena_num = "";
            }
            if (simbol == 1) {
                cadena_sim = Simbolitos(Rango);
                /*System.out.printf("Cadena aleatoria de %d caracteres: %s\n", Rango, cadena_sim);*/
            } else {
                cadena_sim = "";
            }
            String banco2 = (cadena + cadena_may + cadena_num + cadena_sim);
            String lol = "";
            for (int x = 0; x < Rango; x++) {
                int indiceAleatorio = numeroAleatorioEnRango(0, banco2.length() - 1);
                char caracterAleatorio = banco2.charAt(indiceAleatorio);
                lol += caracterAleatorio;
            }
            tPassword.setText(lol);
            Copy = lol;
            Copiar.setVisible(true);
        } catch (Exception e) {
            Copiar.setVisible(false);
            tPassword.setText("");
            //JOptionPane.showMessageDialog(this, "<html><p style=\"font-family:Roboto; font-size:12\">Seleccione elementos a incluir... </p></html>", "", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Copiar_texto() {
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection strSel = new StringSelection(Copy);
        cb.setContents(strSel, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelRound1 = new LIB.JPanelRound();
        sSimb = new password.Switch();
        jLabel8 = new javax.swing.JLabel();
        jPanelRound2 = new LIB.JPanelRound();
        jSeparator2 = new javax.swing.JSeparator();
        No = new javax.swing.JButton();
        Si = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        cc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelRound3 = new LIB.JPanelRound();
        jSlider = new password.JsliderCustom();
        jLabel10 = new javax.swing.JLabel();
        meme = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        meme1 = new javax.swing.JLabel();
        Copiar = new javax.swing.JLabel();
        jPanelRound4 = new LIB.JPanelRound();
        sMayus = new password.Switch();
        jLabel6 = new javax.swing.JLabel();
        jPanelRound5 = new LIB.JPanelRound();
        sMin = new password.Switch();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelRound6 = new LIB.JPanelRound();
        sNum = new password.Switch();
        jLabel9 = new javax.swing.JLabel();
        rSButtonRound2 = new rojerusan.RSButtonRound();
        jLabel5 = new javax.swing.JLabel();
        tSlider = new javax.swing.JLabel();
        tSwitch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 21, 70));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setText("x");
        Cerrar.setToolTipText("");
        Cerrar.setBorder(null);
        Cerrar.setBorderPainted(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.setFocusPainted(false);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        Cerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CerrarKeyPressed(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 20));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password Generator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanelRound1.setBackground(new java.awt.Color(92, 92, 163));
        jPanelRound1.setOpaque(true);
        jPanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sSimb.setBackgroundColor(new java.awt.Color(156, 109, 249));
        sSimb.setOnOff(false);
        sSimb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sSimbMouseClicked(evt);
            }
        });
        jPanelRound1.add(sSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 2, 55, 35));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Incluir Simbolos");
        jPanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jPanel1.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 250, 40));

        jPanelRound2.setBackground(new java.awt.Color(92, 92, 163));
        jPanelRound2.setOpaque(true);
        jPanelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 30));

        No.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/NoVer.png"))); // NOI18N
        No.setToolTipText("");
        No.setBorder(null);
        No.setBorderPainted(false);
        No.setContentAreaFilled(false);
        No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No.setFocusPainted(false);
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanelRound2.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 6, 35, 35));

        Si.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ver.png"))); // NOI18N
        Si.setToolTipText("");
        Si.setBorder(null);
        Si.setBorderPainted(false);
        Si.setContentAreaFilled(false);
        Si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Si.setFocusPainted(false);
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });
        jPanelRound2.add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 6, 35, 35));

        tPassword.setEditable(false);
        tPassword.setBackground(new java.awt.Color(92, 92, 163));
        tPassword.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tPassword.setForeground(new java.awt.Color(255, 255, 255));
        tPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPassword.setBorder(null);
        tPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tPassword.setSelectionColor(new java.awt.Color(156, 109, 249));
        jPanelRound2.add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 30));

        cc.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        cc.setForeground(new java.awt.Color(160, 128, 224));
        cc.setText("<");
        jPanelRound2.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 13, 13, 20));

        jPanel1.add(jPanelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Incluir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jPanelRound3.setBackground(new java.awt.Color(92, 92, 163));
        jPanelRound3.setOpaque(true);
        jPanelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider.setBackground(new java.awt.Color(255, 255, 255));
        jSlider.setForeground(new java.awt.Color(156, 109, 249));
        jSlider.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSliderMouseReleased(evt);
            }
        });
        jPanelRound3.add(jSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 17, 120, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("8");
        jPanelRound3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 10, 20));

        meme.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        meme.setForeground(new java.awt.Color(255, 255, 255));
        meme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelRound3.add(meme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 13, 25, 20));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelRound3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 30));

        meme1.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        meme1.setForeground(new java.awt.Color(255, 255, 255));
        meme1.setText("100");
        jPanelRound3.add(meme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 13, 25, 20));

        jPanel1.add(jPanelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 50));

        Copiar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Copiar.setForeground(new java.awt.Color(255, 255, 255));
        Copiar.setText("Copiar");
        Copiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Copiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CopiarMouseClicked(evt);
            }
        });
        jPanel1.add(Copiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 120, 40, -1));

        jPanelRound4.setBackground(new java.awt.Color(92, 92, 163));
        jPanelRound4.setOpaque(true);
        jPanelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sMayus.setBackgroundColor(new java.awt.Color(156, 109, 249));
        sMayus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMayusMouseClicked(evt);
            }
        });
        jPanelRound4.add(sMayus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 2, 55, 35));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Incluir Mayúsculas");
        jPanelRound4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jPanel1.add(jPanelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 40));

        jPanelRound5.setBackground(new java.awt.Color(92, 92, 163));
        jPanelRound5.setOpaque(true);
        jPanelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sMin.setBackgroundColor(new java.awt.Color(156, 109, 249));
        sMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMinMouseClicked(evt);
            }
        });
        jPanelRound5.add(sMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 2, 55, 35));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Incluir Minúsculas");
        jPanelRound5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jPanel1.add(jPanelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 250, 40));

        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 30));

        jPanelRound6.setBackground(new java.awt.Color(92, 92, 163));
        jPanelRound6.setOpaque(true);
        jPanelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sNum.setBackgroundColor(new java.awt.Color(156, 109, 249));
        sNum.setOnOff(false);
        sNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sNumMouseClicked(evt);
            }
        });
        jPanelRound6.add(sNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 2, 55, 35));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Incluir Números");
        jPanelRound6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jPanel1.add(jPanelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 250, 40));

        rSButtonRound2.setBackground(new java.awt.Color(150, 80, 208));
        rSButtonRound2.setText("GENERAR CONTRASEÑA");
        rSButtonRound2.setColorHover(new java.awt.Color(179, 90, 179));
        rSButtonRound2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        rSButtonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 250, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Longitud");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        tSlider.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tSlider.setForeground(new java.awt.Color(255, 102, 102));
        tSlider.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(tSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 140, 170, 16));

        tSwitch.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tSwitch.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(tSwitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 230, 170, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int xx, xy;
    private void rSButtonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound2ActionPerformed
        cmmo();
    }//GEN-LAST:event_rSButtonRound2ActionPerformed

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    private void sNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sNumMouseClicked
        boolean onOff = this.sNum.isOnOff();
        if (onOff) {
            numer = 1;
        } else {
            numer = 0;
        }
    }//GEN-LAST:event_sNumMouseClicked

    private void jSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderMouseReleased
        meme.setText("" + jSlider.getValue());
        try {
            str = "" + jSlider.getValue();
            Rango = Integer.parseInt(str);
            //System.out.println(Rango);
        } catch (Exception e) {
            System.out.println("Error en jSlider: " + e);
        }
    }//GEN-LAST:event_jSliderMouseReleased

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        Si.setVisible(true);
        No.setVisible(false);
        tPassword.setEchoChar((char) 8226);
    }//GEN-LAST:event_NoActionPerformed

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        Si.setVisible(false);
        No.setVisible(true);
        tPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_SiActionPerformed

    private void sMayusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMayusMouseClicked
        boolean onOff = this.sMayus.isOnOff();
        if (onOff) {
            mayuscu = 1;
        } else {
            mayuscu = 0;
        }
    }//GEN-LAST:event_sMayusMouseClicked

    private void sMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMinMouseClicked
        boolean onOff = this.sMin.isOnOff();
        if (onOff) {
            minus = 1;
        } else {
            minus = 0;
        }
    }//GEN-LAST:event_sMinMouseClicked

    private void sSimbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sSimbMouseClicked
        boolean onOff = this.sSimb.isOnOff();
        if (onOff) {
            simbol = 1;
        } else {
            simbol = 0;
        }
    }//GEN-LAST:event_sSimbMouseClicked

    private void CopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopiarMouseClicked
        Copiar_texto();
    }//GEN-LAST:event_CopiarMouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void CerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CerrarKeyPressed
        System.exit(0);
    }//GEN-LAST:event_CerrarKeyPressed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         */

        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Copiar;
    private javax.swing.JButton No;
    private javax.swing.JButton Si;
    private javax.swing.JLabel cc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private LIB.JPanelRound jPanelRound1;
    private LIB.JPanelRound jPanelRound2;
    private LIB.JPanelRound jPanelRound3;
    private LIB.JPanelRound jPanelRound4;
    private LIB.JPanelRound jPanelRound5;
    private LIB.JPanelRound jPanelRound6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private password.JsliderCustom jSlider;
    private javax.swing.JLabel meme;
    private javax.swing.JLabel meme1;
    private rojerusan.RSButtonRound rSButtonRound2;
    private password.Switch sMayus;
    private password.Switch sMin;
    private password.Switch sNum;
    private password.Switch sSimb;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JLabel tSlider;
    private javax.swing.JLabel tSwitch;
    // End of variables declaration//GEN-END:variables

}
