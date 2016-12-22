
package MakeItGreen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Frames extends javax.swing.JFrame {
 validation v = new validation();
 User u = new User();
 Plant p = new Plant();
 UserPlant userPlants = new UserPlant();
 String user;  
 String plantId;
 String PlantName;  
 public String username2 ;



    public Frames() {
    initComponents();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    welcomeFrame.setVisible(true);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);
    this.setResizable(false);
    pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        infoFrame = new javax.swing.JPanel();
        PlantNameLabel1 = new javax.swing.JLabel();
        watringLabel1 = new javax.swing.JLabel();
        doneButton1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        calender1 = new javax.swing.JButton();
        waterNo = new javax.swing.JRadioButton();
        waterYes = new javax.swing.JRadioButton();
        imgLabel = new javax.swing.JLabel();
        plantInfo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        signInFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        forgetPasswordButton = new javax.swing.JButton();
        backIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        welcomeFrame = new javax.swing.JPanel();
        signUp = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
        imgwelcome = new javax.swing.JLabel();
        signUpFrame = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameS = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        passwordF = new javax.swing.JPasswordField();
        passwordCon = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        profilrFrame = new javax.swing.JPanel();
        addPlantButton = new javax.swing.JButton();
        okeyButton = new javax.swing.JButton();
        idPlantText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlantList = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JPanel();
        userNameFPText = new javax.swing.JLabel();
        userNameFP = new javax.swing.JTextField();
        passwordFPText = new javax.swing.JLabel();
        passwordFP = new javax.swing.JPasswordField();
        backFP = new javax.swing.JButton();
        updateFP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addPlantFrame = new javax.swing.JPanel();
        plant19 = new javax.swing.JButton();
        plant20 = new javax.swing.JButton();
        plant21 = new javax.swing.JButton();
        plant22 = new javax.swing.JButton();
        plant23 = new javax.swing.JButton();
        plant24 = new javax.swing.JButton();
        plant25 = new javax.swing.JButton();
        plant26 = new javax.swing.JButton();
        plant28 = new javax.swing.JButton();
        plant30 = new javax.swing.JButton();
        plant32 = new javax.swing.JButton();
        plant33 = new javax.swing.JButton();
        plant36 = new javax.swing.JButton();
        plant38 = new javax.swing.JButton();
        plant40 = new javax.swing.JButton();
        backAdd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PlantNameLabel1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        PlantNameLabel1.setText("plant name");

        watringLabel1.setFont(new java.awt.Font("SimSun-ExtB", 2, 18)); // NOI18N
        watringLabel1.setText("wataring");

        doneButton1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        doneButton1.setText("done");
        doneButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doneButton1.setContentAreaFilled(false);
        doneButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButton1ActionPerformed(evt);
            }
        });

        delete1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete1.setText("delete");
        delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete1.setContentAreaFilled(false);
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        back1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        back1.setText("back");
        back1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back1.setContentAreaFilled(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        calender1.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        calender1.setText("Calender");
        calender1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calender1.setContentAreaFilled(false);
        calender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calender1ActionPerformed(evt);
            }
        });

        waterNo.setFont(new java.awt.Font("Sylfaen", 2, 14)); // NOI18N
        waterNo.setText("no");
        waterNo.setContentAreaFilled(false);

        waterYes.setBackground(new java.awt.Color(255, 255, 255));
        waterYes.setFont(new java.awt.Font("Sylfaen", 2, 14)); // NOI18N
        waterYes.setText("yes");
        waterYes.setContentAreaFilled(false);
        waterYes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        imgLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        plantInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/1.jpg"))); // NOI18N

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame);
        infoFrame.setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(PlantNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(watringLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(calender1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(doneButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(waterYes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(waterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(back1))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        infoFrameLayout.setVerticalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PlantNameLabel1)
                .addGap(49, 49, 49)
                .addComponent(watringLabel1)
                .addGap(71, 71, 71)
                .addComponent(calender1)
                .addGap(17, 17, 17)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(waterYes))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(waterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(back1))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel1.setText("username");
        jLabel1.setEnabled(false);

        userName.setBackground(new java.awt.Color(232, 232, 242));
        userName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        passwordLabel.setText("password");
        passwordLabel.setEnabled(false);

        signInButton.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        signInButton.setText("sign in");
        signInButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(232, 232, 242));
        password.setAutoscrolls(false);
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        forgetPasswordButton.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        forgetPasswordButton.setText("forget Password");
        forgetPasswordButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        forgetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswordButtonActionPerformed(evt);
            }
        });

        backIn.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        backIn.setText("back");
        backIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backInActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/SingINNN.jpg"))); // NOI18N

        javax.swing.GroupLayout signInFrameLayout = new javax.swing.GroupLayout(signInFrame);
        signInFrame.setLayout(signInFrameLayout);
        signInFrameLayout.setHorizontalGroup(
            signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backIn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(forgetPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2)
        );
        signInFrameLayout.setVerticalGroup(
            signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forgetPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        signUp.setBackground(new java.awt.Color(204, 204, 204));
        signUp.setFont(new java.awt.Font("David", 0, 36)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Sign up");
        signUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUp.setContentAreaFilled(false);
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signUp.setDefaultCapable(false);
        signUp.setHideActionText(true);
        signUp.setInheritsPopupMenu(true);
        signUp.setName(""); // NOI18N
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        signIn.setBackground(new java.awt.Color(204, 204, 204));
        signIn.setFont(new java.awt.Font("David", 0, 36)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("Sign in");
        signIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signIn.setContentAreaFilled(false);
        signIn.setDefaultCapable(false);
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        imgwelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/Screenshot (344).png"))); // NOI18N

        javax.swing.GroupLayout welcomeFrameLayout = new javax.swing.GroupLayout(welcomeFrame);
        welcomeFrame.setLayout(welcomeFrameLayout);
        welcomeFrameLayout.setHorizontalGroup(
            welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        welcomeFrameLayout.setVerticalGroup(
            welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeFrameLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(imgwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        userNameLabel.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        userNameLabel.setText("username");

        emailLabel.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        emailLabel.setText("email");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        PasswordLabel.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        PasswordLabel.setText("password");

        jLabel6.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel6.setText("pasword-con");

        signUpButton.setText("sign up");
        signUpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUpButton.setContentAreaFilled(false);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/img10.jpg"))); // NOI18N

        javax.swing.GroupLayout signUpFrameLayout = new javax.swing.GroupLayout(signUpFrame);
        signUpFrame.setLayout(signUpFrameLayout);
        signUpFrameLayout.setHorizontalGroup(
            signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(userNameS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(passwordF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(passwordCon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        signUpFrameLayout.setVerticalGroup(
            signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(passwordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(passwordCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userNameLabel))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(emailLabel))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        addPlantButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addPlantButton.setText("add plant");
        addPlantButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPlantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlantButtonActionPerformed(evt);
            }
        });

        okeyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okeyButton.setText("ok");
        okeyButton.setAutoscrolls(true);
        okeyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okeyButtonActionPerformed(evt);
            }
        });

        idPlantText.setBackground(new java.awt.Color(204, 255, 204));
        idPlantText.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        idPlantText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        idPlantText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idPlantText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        PlantList.setBackground(new java.awt.Color(229, 255, 229));
        PlantList.setColumns(20);
        PlantList.setRows(15);
        PlantList.setToolTipText("");
        PlantList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlantList.setEnabled(false);
        jScrollPane1.setViewportView(PlantList);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton2.setText("sign out");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/صورة15.png"))); // NOI18N

        javax.swing.GroupLayout profilrFrameLayout = new javax.swing.GroupLayout(profilrFrame);
        profilrFrame.setLayout(profilrFrameLayout);
        profilrFrameLayout.setHorizontalGroup(
            profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(okeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(addPlantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(idPlantText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        profilrFrameLayout.setVerticalGroup(
            profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(okeyButton))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(addPlantButton))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(idPlantText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7)
        );

        userNameFPText.setFont(new java.awt.Font("Sylfaen", 2, 14)); // NOI18N
        userNameFPText.setText("username");

        userNameFP.setBackground(new java.awt.Color(224, 224, 242));
        userNameFP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordFPText.setFont(new java.awt.Font("Sylfaen", 2, 14)); // NOI18N
        passwordFPText.setText("new password");

        passwordFP.setBackground(new java.awt.Color(224, 224, 242));
        passwordFP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backFP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        backFP.setText("back");
        backFP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backFP.setContentAreaFilled(false);
        backFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFPActionPerformed(evt);
            }
        });

        updateFP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        updateFP.setForeground(new java.awt.Color(255, 255, 255));
        updateFP.setText("update");
        updateFP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateFP.setContentAreaFilled(false);
        updateFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFPActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/singInN.jpg"))); // NOI18N

        javax.swing.GroupLayout forgotPasswordLayout = new javax.swing.GroupLayout(forgotPassword);
        forgotPassword.setLayout(forgotPasswordLayout);
        forgotPasswordLayout.setHorizontalGroup(
            forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(userNameFP, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(passwordFPText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passwordFP, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backFP, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(updateFP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(userNameFPText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        forgotPasswordLayout.setVerticalGroup(
            forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forgotPasswordLayout.createSequentialGroup()
                        .addComponent(userNameFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordFPText)
                            .addComponent(passwordFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backFP)
                            .addComponent(updateFP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(userNameFPText)))
        );

        plant19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im3.png"))); // NOI18N
        plant19.setToolTipText("");
        plant19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant19.setContentAreaFilled(false);
        plant19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant19ActionPerformed(evt);
            }
        });

        plant20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im10.png"))); // NOI18N
        plant20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant20.setContentAreaFilled(false);
        plant20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant20ActionPerformed(evt);
            }
        });

        plant21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im12.png"))); // NOI18N
        plant21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant21.setContentAreaFilled(false);
        plant21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant21ActionPerformed(evt);
            }
        });

        plant22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im13.png"))); // NOI18N
        plant22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant22.setContentAreaFilled(false);
        plant22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant22ActionPerformed(evt);
            }
        });

        plant23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im14.png"))); // NOI18N
        plant23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant23.setContentAreaFilled(false);
        plant23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant23ActionPerformed(evt);
            }
        });

        plant24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im15.png"))); // NOI18N
        plant24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant24.setContentAreaFilled(false);
        plant24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant24ActionPerformed(evt);
            }
        });

        plant25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im16.png"))); // NOI18N
        plant25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant25.setContentAreaFilled(false);
        plant25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant25ActionPerformed(evt);
            }
        });

        plant26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im17.png"))); // NOI18N
        plant26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant26.setContentAreaFilled(false);
        plant26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant26ActionPerformed(evt);
            }
        });

        plant28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im18.png"))); // NOI18N
        plant28.setToolTipText("");
        plant28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant28.setContentAreaFilled(false);
        plant28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant28ActionPerformed(evt);
            }
        });

        plant30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im19.png"))); // NOI18N
        plant30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant30.setContentAreaFilled(false);
        plant30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant30ActionPerformed(evt);
            }
        });

        plant32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im26.png"))); // NOI18N
        plant32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant32.setContentAreaFilled(false);
        plant32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant32ActionPerformed(evt);
            }
        });

        plant33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im21.png"))); // NOI18N
        plant33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant33.setContentAreaFilled(false);
        plant33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant33ActionPerformed(evt);
            }
        });

        plant36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im22.png"))); // NOI18N
        plant36.setToolTipText("");
        plant36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant36.setContentAreaFilled(false);
        plant36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant36ActionPerformed(evt);
            }
        });

        plant38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im23.png"))); // NOI18N
        plant38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant38.setContentAreaFilled(false);
        plant38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant38ActionPerformed(evt);
            }
        });

        plant40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/im24.png"))); // NOI18N
        plant40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plant40.setContentAreaFilled(false);
        plant40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant40ActionPerformed(evt);
            }
        });

        backAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backAdd.setText("back");
        backAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backAdd.setContentAreaFilled(false);
        backAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAddActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/ion.png"))); // NOI18N

        javax.swing.GroupLayout addPlantFrameLayout = new javax.swing.GroupLayout(addPlantFrame);
        addPlantFrame.setLayout(addPlantFrameLayout);
        addPlantFrameLayout.setHorizontalGroup(
            addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant19, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plant20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plant21, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plant23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(plant26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(plant32, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(plant38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant40, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant36, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(backAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant24, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant28, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant33, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant30, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addPlantFrameLayout.setVerticalGroup(
            addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plant19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plant20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plant21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plant22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plant23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(plant26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(plant32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(plant38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(plant40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(plant25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(plant36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(backAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(plant24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(plant28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(plant33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(plant30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilrFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signInFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addPlantFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(infoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilrFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(signInFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(welcomeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(signUpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addPlantFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(infoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        welcomeFrame.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){
      
        password.setText(""); }


    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
// sign in 
welcomeFrame.setVisible(false);
signUpFrame.setVisible(false);
signInFrame.setVisible(true);
profilrFrame.setVisible(false);
infoFrame.setVisible(false);
addPlantFrame.setVisible(false);
forgotPassword.setVisible(false);
pack();
    }//GEN-LAST:event_signInActionPerformed
    
    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
// sign up
welcomeFrame.setVisible(false);
signUpFrame.setVisible(true);
signInFrame.setVisible(false);
profilrFrame.setVisible(false);
infoFrame.setVisible(false);
addPlantFrame.setVisible(false);
forgotPassword.setVisible(false);
pack();
    }//GEN-LAST:event_signUpActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
      // profile 
        String user1 = userName.getText();
if(v.isUserNameAndpaswordExist(user1,password.getText())) {
    JOptionPane.showMessageDialog(this,"Welcome "+user1, "",JOptionPane.INFORMATION_MESSAGE);  
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(true);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);
    pack();
    
    
    u.setUsername(user1);
    username2 = u.getUsername();
    u.userPlantsFile(user1);
    PlantList.setText(userPlants.loadUserPlants(username2));
      
}   
else{
    JOptionPane.showMessageDialog(this,"please check your info", "Error",JOptionPane.ERROR_MESSAGE);  
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(true);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    pack();
     }
    clear();

    }//GEN-LAST:event_signInButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        user = userNameS.getText();
        boolean check = u.addUser(userNameS, email,passwordF, passwordCon);
        if(check != true){
        JOptionPane.showMessageDialog(null,"your information does not correct , Please try again");
                   u.clear1(userNameS, email,passwordF, passwordCon);
        signUpFrame.setVisible(true);
        signInFrame.setVisible(false);
        profilrFrame.setVisible(false);
        infoFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false);
        pack();
        }else{ 
            JOptionPane.showMessageDialog(null,"your sign up done ");
            u.setUsername(user);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(true);
            infoFrame.setVisible(false);
            addPlantFrame.setVisible(false);
            forgotPassword.setVisible(false);
            pack();
}
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void addPlantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlantButtonActionPerformed
        welcomeFrame.setVisible(false);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);
        profilrFrame.setVisible(false);
        infoFrame.setVisible(false);
        addPlantFrame.setVisible(true);
        forgotPassword.setVisible(false);
        pack();
    }//GEN-LAST:event_addPlantButtonActionPerformed

    private void okeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okeyButtonActionPerformed
        plantId = idPlantText.getText();
        username2 = u.getUsername();
        boolean exist = userPlants.isIDPExist(plantId,username2) ;
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(waterYes);
        buttonGroup1.add(waterNo);
        if(exist){
            infoFrame.setVisible(true);
            profilrFrame.setVisible(false);
        } else{
            infoFrame.setVisible(false);
            JOptionPane.showMessageDialog(this,"please check the ID ", "Error",JOptionPane.ERROR_MESSAGE);
            profilrFrame.setVisible(true);
        }
        PlantNameLabel1.setText(p.loadPlantName(plantId));
        plantInfo.setText(p.loadPlantInfo(plantId));
        p.loadImg(imgLabel, plantId);
        welcomeFrame.setVisible(false);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false);
        pack();  
    }//GEN-LAST:event_okeyButtonActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void forgetPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPasswordButtonActionPerformed
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(true);	
    pack();	

    }//GEN-LAST:event_forgetPasswordButtonActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void backFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFPActionPerformed
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(true);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);	
    pack();
    }//GEN-LAST:event_backFPActionPerformed

    private void updateFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFPActionPerformed
if(v.isPasswordValid(passwordFP.getText())){
    u.ubdateUesr(passwordFP.getText(),userNameFP.getText());
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(true);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);	
 pack(); 
}else{
    JOptionPane.showMessageDialog(this,"please check your info", "Error",JOptionPane.ERROR_MESSAGE);   
    }
    u.clear(passwordFP);           
    }//GEN-LAST:event_updateFPActionPerformed

    private void plant19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant19ActionPerformed

      String plant1="The secret to keeping Norfolk Island pine healthy is to give it ample light and humidity. "
        + "\n In low light, the lower branches may turn brown and fall off. If the air is too dry, it becomes a"
        + " \n prime target for spider mites, a common houseplant pest. In its native habitat, Norfolk Island"
        + "\n  pine can reach 200 feet tall, but don't worry -- indoors, it seldom grows taller than 10 feet."
        + "\n \n  Why We Love It: \n This tree is perfect for decorating for Christmas -- or giving as a holiday gift."
        + " Outside the holidays, \n its soft texture adds a cozy feeling to any room."
        + " \n \n insert (01) if you have it ..";
        plantId = JOptionPane.showInputDialog(plant1);
//        System.out.println(plantId);
        if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            //pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
           // pack();
        }

    }//GEN-LAST:event_plant19ActionPerformed

    private void plant20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant20ActionPerformed
      String plant2 = "Peperomias are a diverse group of small houseplants with waxy and often highly textured leaves. "
        + "\n Red-edge peperomia (pictured) has a narrow band of red surrounding a wide creamy leaf margin."
        + "\n Other peperomias we love include ripple peperomia, watermelon peperomia, baby rubber plant, and silverleaf "
        + "\n peperomia."
        + "\n \n Why We Love It: \n Its waxy, colorful foliage adds a splash of color in any room \n "
        + "without taking up a lot of space."
        + "\n\n insert (02) if you have it";
         
      plantId = JOptionPane.showInputDialog(plant2);
        if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant20ActionPerformed

    private void plant21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant21ActionPerformed
    String plant3 = "This plant has great foliage; the leaves are punctuated with shades of silver, gray, or shades of green "
        + "\n making Chinese evergreen an attractive choice to brighten low-light areas of your home. Take a cue from shopping"
        + "\n  mall plantings and use Chinese evergreen as a ground cover around an upright, treelike houseplant. Or showcase it "
        + "\n alone as a specimen plant."
        + "\n \n Why We Love It: \n It's extra tough and has attractive leaves that brighten low light spots"
        + "\n\n insert (03) if you have it ";

      plantId = JOptionPane.showInputDialog(plant3);
        if(p.isidPlantExist(plantId))  {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
            
        }
    }//GEN-LAST:event_plant21ActionPerformed

    private void plant22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant22ActionPerformed
        String plant4 = "Fiddleleaf fig is a beautiful tree that gets its common name comes from the violin-shape outline of its leathery, "
        + "\n deep green leaves. It tolerates low light well, though it may lose its lower leaves in dim spots. If your fiddleleaf"
        + "\n fig grows too tall, prune stems back to the desired height, or start a new plant by air layering elongated shoots."
        + "\n\n Why We Love It: This is one of the classiest-looking indoor trees thanks to its big leaves and the shape it forms"
        + "\n as it grows."
        + "\n\n insert (04) if you have it ..";

     plantId = JOptionPane.showInputDialog(plant4);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant22ActionPerformed

    private void plant23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant23ActionPerformed
        String plant5 = "Several closely related species share the common name of dieffenbachia. All produce canelike stems with lush foliage"
        + "\n variegated in green and white. Grow one by itself to for a tree appearance or several together in a single container for"
        + "\n a shrubby look. One of the plant's common names, dumb cane, comes from the effect of the toxic sap that if eaten causes "
        + "\n swelling and numbness in the mouth and throat."
        + " \n\n Why We Love It:\n  Its large, green-and-white leaves create a decidedly tropical look to any room of your home \n "
        + "(and it's great for decorating decks and patios in the summer)."
        + "\n\n insert(05) if you have it ..";

       plantId = JOptionPane.showInputDialog(plant5);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant23ActionPerformed

    private void plant24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant24ActionPerformed
        String plant6 ="Sometimes called eternity plant because it lasts so long, succulent zeezee plant tolerates low light and neglect."
        + "\n The thick, fleshy leafstalks are so durable that you might even think it's plastic. It is a slow grower, so purchase "
        + "\n a large plant if you want a big specimen. Cut stems remain green and healthy in appearance for several weeks, even without"
        + "\n  water."
        + "\n\n Why We Love It: \n This plant is so easy it's almost a challenge to kill it."
        + "\n\n insert(06) if you have it ..";
        plantId = JOptionPane.showInputDialog(plant6);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
       }
    }//GEN-LAST:event_plant24ActionPerformed

    private void plant25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant25ActionPerformed
        String plant7 = "You may remember this from your grandmother's house; spider plants have been grown for years and are still popular today."
        + "\n Look for a number of varieties -- from types with plain green leaves to others that offer foliage marked with cream or white "
        + "\n stripes. All make handsome hanging plants that develop plantlets at the ends of arching stems. These babies readily root in "
        + "\n water or potting soil to start new plants."
        + "\n\n Why We Love It: \n It offers tons of old-fashioned appeal and an easy-care nature."
        + "\n\n insert(07) if you have it ..";

        plantId = JOptionPane.showInputDialog(plant7);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant25ActionPerformed

    private void plant26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant26ActionPerformed
        String plant8 = "An old-fashioned classic, rubber tree gets its name from the sticky, milky sap it exudes if injured. It eventually grows \n "
        + "into a large tree, but you can easily keep it shorter by pruning back long stems, causing it to branch into a multi-stemmed shrub.\n "
        + "\n \n Note: In frost-free areas, you may see rubber trees as a full-size shade trees outdoors."
        + "\n\n Why We Love It:\n "
        + " Its big, dark green shiny leaves definitely make a statement. The older plants get, the larger they become a good-sized rubber\n"
        + " tree makes a big, dramatic accent in any room."
        + "\n\n insert (08) if you have it ..";

        plantId = JOptionPane.showInputDialog(plant8);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant26ActionPerformed

    private void plant28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant28ActionPerformed
        String plant9 = "Some varieties of green dracaena, such as 'Janet Craig' have solid green leaves. Others such as 'Warneckii' "
        + "\n (pictured), bear white, cream, gold or chartreuse stripes on their foliage. All form compact rosettes when young,"
        + "\n  but eventually become striking upright foliage plants. They tolerate low light, but produce better color in medium \n"
        + "to bright light."
        + "\n\n Why We Love It:\n "
        + " It's a durable, upright plant with good-looking leaves."
        + "\n\n insert (09) if you have it ..";

       plantId = JOptionPane.showInputDialog(plant9);
               if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant28ActionPerformed

    private void plant30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant30ActionPerformed
       String plant10 ="Boston fern's arching, lacy fronds make it well suited to hanging baskets or for display on a pedestal. Don't let its "
        + "\n delicate appearance mislead you, though: This tough plant that will live for decades if you keep it moist and give it "
        + "\n moderate light and enough humidity. The variety 'Dallas' is more compact and more tolerant of dry air."
        + "\n\n Why We Love It:\n"
        + " Boston ferns create a classic feel in any room. Their beautiful, arching fronds work well with any decorating style but\n"
        + " especially cottage and country."
        + "\n\n insert (10) if you have it .. ";

        plantId = JOptionPane.showInputDialog(plant10);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant30ActionPerformed

    private void plant32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant32ActionPerformed
         String plant11 ="One of the toughest you can grow, cast-iron plant withstands neglect, low light, low humidity, and a wide range "
        + "\n of temperatures. It grows slowly so purchase a plant that is large enough for the space in which you intend to use it."
        + "\n Several varieties have white or yellow variegation on their leaves."
        + "\n\n Why We Love It:"
        + "\n This plant really lives up to its name: It's nearly indestructible."
        + "\n insert (11) if you have it ..";
       plantId = JOptionPane.showInputDialog(plant11);
       if(p.isidPlantExist(plantId)){
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant32ActionPerformed

    private void plant33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant33ActionPerformed
      String plant12 ="While this showy shrub survives in low light levels, its foliage shows the best color in bright spots. Its gold, pink,"
        + "\n and orange tones glow when backlit from a sunny window. Wash the leaves occasionally to maintain their shine and keep it "
        + "\n looking dramatic."
        + "\n\n Why We Love It: \n It has beautiful, leathery leaves with exotic and colorful markings."
        + "\n insert (12) if you have it ..";

        plantId = JOptionPane.showInputDialog(plant12);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant33ActionPerformed

    private void plant36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant36ActionPerformed
       String plant13 = "This plant is as impressive as its name. It bears tufts of long, narrow, deep green leaves edged in red at the tips of "
        + "\n woody gray stems. Young plants are shrubbier, but soon grow more upright. The variety 'Tricolor' has pink-and-cream leaf "
        + "\n margins, and is sometimes known as rainbow plant."
        + "\n\n Why We Love It: \n Its grassy leaves on tall stems give it a festive appearance."
        + "\n\n insert (13) if you have it ..";

        plantId = JOptionPane.showInputDialog(plant13);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant36ActionPerformed

    private void plant38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant38ActionPerformed
        String plant14 ="Despite its common name, this plant is a succulent rather than a true palm. Its graceful arching leaves are always"
        + "\n  attractive and its swollen trunk looks great, too. (The trunk holds moisture for the plant.) Keep your ponytail palm in "
        + "\n a container only a couple of inches wider than its trunk base to control its size. It is sometimes sold as Nolina recurvata."
        + "\n\n Why We Love It: \n  Because the trunk actually stores moisture, ponytail palm can survive for long periods without watering."
        + "\n\n insert (14) if you have it ..";
        
        plantId = JOptionPane.showInputDialog(plant14);
       if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant38ActionPerformed

    private void plant40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant40ActionPerformed
         String plant15 = "Also commonly called umbrella tree, this plant offers glossy foliage with leaflets that radiate out from a central"
        + "\n spoke, similar to the ribs of an umbrella. A close relative, dwarf schefflera (Schefflera arboricola) has smaller, "
        + "\n thickerleaflets and shorter stems. Both are sometimes classified in the genus Brassaia."
        + "\n\n Why We Love It:\n "
        + " Its large glossy green leaves create instant tropical flair."
        + "\n\n insert (15) if you have it ..";
         
            plantId = JOptionPane.showInputDialog(plant15);
           if(p.isidPlantExist(plantId)) {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(true);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(false);
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
            pack();
        }
        else {
            welcomeFrame.setVisible(false);
            signUpFrame.setVisible(false);
            signInFrame.setVisible(false);
            profilrFrame.setVisible(false);
            infoFrame.setVisible(false);
            forgotPassword.setVisible(false);
            addPlantFrame.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_plant40ActionPerformed

    private void doneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButton1ActionPerformed
        username2 = u.getUsername();
        String plantId2 = idPlantText.getText();
        String water = "";
        
        if( waterYes.isSelected()){
            water = "yes";
        }else if( waterNo.isSelected()){
            water = "no";
        }
        else {
            water = "no";
        }
        UserPlant up = new UserPlant();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        up.setDate(dtf.format(localDate));
        String Date = up.getDate();
        calender1.setVisible(true);
        p.setPlantId(plantId);
        if (plantId!=null)
        p.save(username2,plantId,Date,water);
        else
        p.save(username2,plantId2,Date,water);
        
        Calender cal = new Calender();
        cal.setList(userPlants.loadDate(username2,plantId));     
    }//GEN-LAST:event_doneButton1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        Plant p = new Plant();
        user = u.getUsername();
        plantId = idPlantText.getText();
        p.deletePlant(user, plantId);
    }//GEN-LAST:event_delete1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // back profile
        username2 = u.getUsername();
        PlantList.setText(userPlants.loadUserPlants(username2)); 
        
        welcomeFrame.setVisible(false);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);
        profilrFrame.setVisible(true);
        infoFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false);
        pack(); 
    }//GEN-LAST:event_back1ActionPerformed

    private void calender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calender1ActionPerformed
        // TODO add your handling code here:
        username2 = u.getUsername();
        plantId = idPlantText.getText();
        Calender cal = new Calender();
        cal.setList(userPlants.loadDate(username2,plantId));
    }//GEN-LAST:event_calender1ActionPerformed

    private void backInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backInActionPerformed
        welcomeFrame.setVisible(true);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);
        profilrFrame.setVisible(false);
        infoFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false);	
        pack();
    }//GEN-LAST:event_backInActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        welcomeFrame.setVisible(true);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);
        profilrFrame.setVisible(false);
        infoFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false);	
        pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAddActionPerformed
        welcomeFrame.setVisible(false);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);
        profilrFrame.setVisible(true);
        infoFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false);	
        pack();
    }//GEN-LAST:event_backAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "Sign out succsess");
        u.clear(password);
        profilrFrame.setVisible(false);
        welcomeFrame.setVisible(true);
        signUpFrame.setVisible(false);
        signInFrame.setVisible(false);

        infoFrame.setVisible(false);
        addPlantFrame.setVisible(false);
        forgotPassword.setVisible(false); 
        pack();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextArea PlantList;
    public javax.swing.JLabel PlantNameLabel1;
    private javax.swing.JButton addPlantButton;
    public javax.swing.JPanel addPlantFrame;
    public javax.swing.JButton back1;
    private javax.swing.JButton backAdd;
    private javax.swing.JButton backFP;
    private javax.swing.JButton backIn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calender1;
    public javax.swing.JButton delete1;
    private javax.swing.JButton doneButton1;
    public javax.swing.JTextField email;
    public javax.swing.JLabel emailLabel;
    public javax.swing.JButton forgetPasswordButton;
    private javax.swing.JPanel forgotPassword;
    private javax.swing.JTextField idPlantText;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel imgwelcome;
    public javax.swing.JPanel infoFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okeyButton;
    public javax.swing.JPasswordField password;
    public javax.swing.JPasswordField passwordCon;
    public javax.swing.JPasswordField passwordF;
    private javax.swing.JPasswordField passwordFP;
    private javax.swing.JLabel passwordFPText;
    public javax.swing.JLabel passwordLabel;
    public javax.swing.JButton plant19;
    public javax.swing.JButton plant20;
    public javax.swing.JButton plant21;
    public javax.swing.JButton plant22;
    public javax.swing.JButton plant23;
    public javax.swing.JButton plant24;
    public javax.swing.JButton plant25;
    public javax.swing.JButton plant26;
    public javax.swing.JButton plant28;
    public javax.swing.JButton plant30;
    public javax.swing.JButton plant32;
    public javax.swing.JButton plant33;
    public javax.swing.JButton plant36;
    public javax.swing.JButton plant38;
    public javax.swing.JButton plant40;
    private javax.swing.JLabel plantInfo;
    public javax.swing.JPanel profilrFrame;
    public javax.swing.JButton signIn;
    public javax.swing.JButton signInButton;
    public javax.swing.JPanel signInFrame;
    private javax.swing.JButton signUp;
    public javax.swing.JButton signUpButton;
    public javax.swing.JPanel signUpFrame;
    private javax.swing.JButton updateFP;
    public javax.swing.JTextField userName;
    private javax.swing.JTextField userNameFP;
    private javax.swing.JLabel userNameFPText;
    public javax.swing.JLabel userNameLabel;
    public javax.swing.JTextField userNameS;
    public javax.swing.JRadioButton waterNo;
    public javax.swing.JRadioButton waterYes;
    public javax.swing.JLabel watringLabel1;
    public javax.swing.JPanel welcomeFrame;
    // End of variables declaration//GEN-END:variables
}
