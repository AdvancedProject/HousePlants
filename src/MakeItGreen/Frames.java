
package MakeItGreen;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        plantInfo = new javax.swing.JLabel();
        waterNo = new javax.swing.JRadioButton();
        waterYes = new javax.swing.JRadioButton();
        imgLabel = new javax.swing.JLabel();
        signInFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        forgetPasswordButton = new javax.swing.JButton();
        backIn = new javax.swing.JButton();
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
        profilrFrame = new javax.swing.JPanel();
        addPlantButton = new javax.swing.JButton();
        okeyButton = new javax.swing.JButton();
        idPlantText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlantList = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JPanel();
        userNameFPText = new javax.swing.JLabel();
        userNameFP = new javax.swing.JTextField();
        passwordFPText = new javax.swing.JLabel();
        passwordFP = new javax.swing.JPasswordField();
        backFP = new javax.swing.JButton();
        updateFP = new javax.swing.JButton();
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

        PlantNameLabel1.setText("plant name");

        watringLabel1.setText("wataring");

        doneButton1.setText("done");
        doneButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButton1ActionPerformed(evt);
            }
        });

        delete1.setText("delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        back1.setText("back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        calender1.setText("Calender");
        calender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calender1ActionPerformed(evt);
            }
        });

        waterNo.setText("no");

        waterYes.setText("yes");

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame);
        infoFrame.setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoFrameLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(PlantNameLabel1))
                    .addGroup(infoFrameLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(watringLabel1)
                            .addComponent(back1))
                        .addGap(38, 38, 38)
                        .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calender1)
                            .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(infoFrameLayout.createSequentialGroup()
                                    .addComponent(delete1)
                                    .addGap(36, 36, 36)
                                    .addComponent(doneButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoFrameLayout.createSequentialGroup()
                                    .addComponent(waterYes)
                                    .addGap(33, 33, 33)
                                    .addComponent(waterNo))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoFrameLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        infoFrameLayout.setVerticalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PlantNameLabel1)
                .addGap(38, 38, 38)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(watringLabel1)
                    .addComponent(waterNo)
                    .addComponent(waterYes))
                .addGap(64, 64, 64)
                .addComponent(calender1)
                .addGap(18, 18, 18)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton1)
                    .addComponent(delete1)
                    .addComponent(back1))
                .addGap(58, 58, 58))
        );

        jLabel1.setText("user name");

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        passwordLabel.setText("password");

        signInButton.setText("sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        forgetPasswordButton.setText("forget Password");
        forgetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswordButtonActionPerformed(evt);
            }
        });

        backIn.setText("back");
        backIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signInFrameLayout = new javax.swing.GroupLayout(signInFrame);
        signInFrame.setLayout(signInFrameLayout);
        signInFrameLayout.setHorizontalGroup(
            signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInFrameLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addComponent(backIn)
                        .addGap(23, 23, 23)
                        .addComponent(signInButton)
                        .addGap(31, 31, 31)
                        .addComponent(forgetPasswordButton))
                    .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(signInFrameLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(26, 26, 26)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(signInFrameLayout.createSequentialGroup()
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(password))))
                .addContainerGap())
        );
        signInFrameLayout.setVerticalGroup(
            signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInFrameLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton)
                    .addComponent(forgetPasswordButton)
                    .addComponent(backIn))
                .addGap(42, 42, 42))
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
            .addComponent(imgwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        welcomeFrameLayout.setVerticalGroup(
            welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(welcomeFrameLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        userNameLabel.setText("username");

        emailLabel.setText("email");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        PasswordLabel.setText("password");

        jLabel6.setText("pasword-con");

        signUpButton.setText("sign up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpFrameLayout = new javax.swing.GroupLayout(signUpFrame);
        signUpFrame.setLayout(signUpFrameLayout);
        signUpFrameLayout.setHorizontalGroup(
            signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpFrameLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameS)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                    .addGroup(signUpFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(16, 16, 16)
                        .addComponent(passwordCon))
                    .addGroup(signUpFrameLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(PasswordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(passwordF, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpFrameLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(signUpButton)
                .addGap(71, 71, 71))
        );
        signUpFrameLayout.setVerticalGroup(
            signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(passwordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpButton)
                    .addComponent(jButton1))
                .addContainerGap(37, Short.MAX_VALUE))
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
        PlantList.setRows(5);
        PlantList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlantList.setEnabled(false);
        jScrollPane1.setViewportView(PlantList);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeItGreen/صورة15.png"))); // NOI18N

        javax.swing.GroupLayout profilrFrameLayout = new javax.swing.GroupLayout(profilrFrame);
        profilrFrame.setLayout(profilrFrameLayout);
        profilrFrameLayout.setHorizontalGroup(
            profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(idPlantText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(okeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(addPlantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        profilrFrameLayout.setVerticalGroup(
            profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(idPlantText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okeyButton)
                    .addComponent(addPlantButton)))
            .addComponent(jLabel7)
        );

        userNameFPText.setText("username");

        passwordFPText.setText("new password");

        backFP.setText("back");
        backFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFPActionPerformed(evt);
            }
        });

        updateFP.setText("update");
        updateFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forgotPasswordLayout = new javax.swing.GroupLayout(forgotPassword);
        forgotPassword.setLayout(forgotPasswordLayout);
        forgotPasswordLayout.setHorizontalGroup(
            forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forgotPasswordLayout.createSequentialGroup()
                        .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(forgotPasswordLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(userNameFPText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(forgotPasswordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordFPText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameFP)
                            .addComponent(passwordFP, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                    .addGroup(forgotPasswordLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backFP, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(updateFP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        forgotPasswordLayout.setVerticalGroup(
            forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPasswordLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameFPText)
                    .addComponent(userNameFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordFPText)
                    .addComponent(passwordFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backFP)
                    .addComponent(updateFP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        plant32.setText("Aspidistra elatior");
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
                .addComponent(plant20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plant23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plant24, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(plant28, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant30, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(plant32, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(plant38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(backAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant33, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(plant36, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant40, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(plant21, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(plant26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addPlantFrameLayout.setVerticalGroup(
            addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plant19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plant22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plant25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plant30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(plant38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(backAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(plant33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(plant36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(plant40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(plant21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(plant26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGap(39, 39, 39)
                    .addComponent(infoFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(39, 39, 39)))
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
                    .addGap(18, 18, 18)
                    .addComponent(infoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
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

  /* public boolean addUser(){
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            String query ;
            con = DBManager.getConnection();
    if((!u.isUserNameExist(userNameS.getText()))&&(u.comparePassword(passwordF.getText(),passwordCon.getText()))&&
            (u.isPasswordValid(passwordF.getText()))&&(u.isValidEmail(email.getText()))){
            
        query = "INSERT INTO User VALUES (?,?,?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, ""+userNameS.getText());
        pstmt.setString(2, ""+email.getText());
        pstmt.setString(3, ""+passwordF.getText());
        System.out.println("added");
        int result = pstmt.executeUpdate();
        if(result == 1){ 
          return true;
         } 
        
        
        }        
        }catch( Exception e ){
              e.printStackTrace();
        }
        finally {
            if(pstmt != null)
        try{pstmt.close();
            }catch( Exception e ){
              e.printStackTrace();
        }
            if(con != null) 
        try{ con.close();
            }catch( Exception e ){
              e.printStackTrace();
        }
        }
        return false;
}
   
   public void clear1(){
        userNameS.setText("");
        email.setText("");
        passwordF.setText("");
        passwordCon.setText("");
    }
   public void clear2(){
        passwordFP.setText(""); }*/
    
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
pack();}
else{ 
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
 pack(); }
      
        else {
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
        System.out.println(plantId);
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
            pack();
           PlantNameLabel1.setText(p.loadPlantName(plantId));
           plantInfo.setText(p.loadPlantInfo(plantId));
           p.loadImg(imgLabel, plantId);
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
            pack();
            PlantNameLabel1.setText(p.loadPlantName(plantId));
            plantInfo.setText(p.loadPlantInfo(plantId));
            p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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
//p.loadImg(imgLabel, plantId);
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
//               p.loadImg(imgLabel, plantId);
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

        p.setPlantId(plantId);

        if (plantId!=null)
        p.save(username2,plantId,Date,water);
        else
        p.save(username2,plantId2,Date,water);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    public javax.swing.JLabel plantInfo;
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
