
package MakeItGreen;

//import houseplants.plantInfoFrame;
//import houseplants.profileFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public String user;  
public String plantId;
public String PlantName;


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

        infoFrame = new javax.swing.JPanel();
        PlantNameLabel = new javax.swing.JLabel();
        watringLabel = new javax.swing.JLabel();
        waterYes = new javax.swing.JCheckBox();
        waterNo = new javax.swing.JCheckBox();
        doneButton = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        calender = new javax.swing.JButton();
        plantInfo = new javax.swing.JLabel();
        signInFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        forgetPasswordButton = new javax.swing.JButton();
        welcomeFrame = new javax.swing.JPanel();
        signUp = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
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
        profilrFrame = new javax.swing.JPanel();
        yourPlant = new javax.swing.JLabel();
        addPlantButton = new javax.swing.JButton();
        okeyButton = new javax.swing.JButton();
        idPlantText = new javax.swing.JTextField();
        addPlantFrame = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        plant16 = new javax.swing.JButton();
        plant17 = new javax.swing.JButton();
        plant18 = new javax.swing.JButton();
        plant19 = new javax.swing.JButton();
        plant21 = new javax.swing.JButton();
        plant22 = new javax.swing.JButton();
        plant24 = new javax.swing.JButton();
        plant26 = new javax.swing.JButton();
        plant28 = new javax.swing.JButton();
        plant30 = new javax.swing.JButton();
        plant32 = new javax.swing.JButton();
        plant33 = new javax.swing.JButton();
        plant36 = new javax.swing.JButton();
        plant38 = new javax.swing.JButton();
        plant40 = new javax.swing.JButton();
        forgotPassword = new javax.swing.JPanel();
        userNameFPText = new javax.swing.JLabel();
        userNameFP = new javax.swing.JTextField();
        passwordFPText = new javax.swing.JLabel();
        passwordFP = new javax.swing.JPasswordField();
        backFP = new javax.swing.JButton();
        updateFP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlantNameLabel.setText("plant name");

        watringLabel.setText("wataring");

        waterYes.setText("yes");
        waterYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterYesActionPerformed(evt);
            }
        });

        waterNo.setText("no");
        waterNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterNoActionPerformed(evt);
            }
        });

        doneButton.setText("done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        calender.setText("Calender");
        calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame);
        infoFrame.setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(PlantNameLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(watringLabel)
                    .addComponent(back))
                .addGap(38, 38, 38)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calender)
                    .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                            .addComponent(delete)
                            .addGap(36, 36, 36)
                            .addComponent(doneButton))
                        .addGroup(infoFrameLayout.createSequentialGroup()
                            .addComponent(waterYes)
                            .addGap(72, 72, 72)
                            .addComponent(waterNo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        infoFrameLayout.setVerticalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PlantNameLabel)
                .addGap(38, 38, 38)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(watringLabel)
                    .addComponent(waterYes)
                    .addComponent(waterNo))
                .addGap(49, 49, 49)
                .addComponent(calender)
                .addGap(18, 18, 18)
                .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(delete)
                    .addComponent(back))
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

        javax.swing.GroupLayout signInFrameLayout = new javax.swing.GroupLayout(signInFrame);
        signInFrame.setLayout(signInFrameLayout);
        signInFrameLayout.setHorizontalGroup(
            signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInFrameLayout.createSequentialGroup()
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(signInButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forgetPasswordButton))
                    .addGroup(signInFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(signInFrameLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(signInFrameLayout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(password)))))
                .addGap(61, 61, 61))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(signInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton)
                    .addComponent(forgetPasswordButton))
                .addGap(42, 42, 42))
        );

        signUp.setText("Sign up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        signIn.setText("Sign in");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomeFrameLayout = new javax.swing.GroupLayout(welcomeFrame);
        welcomeFrame.setLayout(welcomeFrameLayout);
        welcomeFrameLayout.setHorizontalGroup(
            welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeFrameLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(signUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(signIn)
                .addGap(45, 45, 45))
        );
        welcomeFrameLayout.setVerticalGroup(
            welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeFrameLayout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(welcomeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signIn)
                    .addComponent(signUp))
                .addGap(25, 25, 25))
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
                        .addComponent(passwordF)))
                .addContainerGap())
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(signUpButton)
                .addGap(26, 241, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(signUpButton)
                .addGap(58, 58, 58))
        );

        yourPlant.setText("your plant are: ");

        addPlantButton.setText("add plant");
        addPlantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlantButtonActionPerformed(evt);
            }
        });

        okeyButton.setText("ok");
        okeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okeyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilrFrameLayout = new javax.swing.GroupLayout(profilrFrame);
        profilrFrame.setLayout(profilrFrameLayout);
        profilrFrameLayout.setHorizontalGroup(
            profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilrFrameLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yourPlant, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilrFrameLayout.createSequentialGroup()
                        .addGroup(profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idPlantText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okeyButton))
                        .addGap(48, 48, 48)
                        .addComponent(addPlantButton)))
                .addGap(70, 70, 70))
        );
        profilrFrameLayout.setVerticalGroup(
            profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilrFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yourPlant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(idPlantText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(profilrFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPlantButton)
                    .addComponent(okeyButton))
                .addContainerGap())
        );

        plant16.setText("Araucaria heterophylla");
        plant16.setToolTipText("");
        plant16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant16ActionPerformed(evt);
            }
        });

        plant17.setText("Peperomia spp");
        plant17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant17ActionPerformed(evt);
            }
        });

        plant18.setText("Aglaonema commutatum");
        plant18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant18ActionPerformed(evt);
            }
        });

        plant19.setText("Ficus lyrata");
        plant19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant19ActionPerformed(evt);
            }
        });

        plant21.setText("Dieffenbachia spp");
        plant21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant21ActionPerformed(evt);
            }
        });

        plant22.setText("Zamioculcas zamiifolia");
        plant22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant22ActionPerformed(evt);
            }
        });

        plant24.setText("Chlorophytum comosum ");
        plant24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant24ActionPerformed(evt);
            }
        });

        plant26.setText("Ficus elastica");
        plant26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant26ActionPerformed(evt);
            }
        });

        plant28.setText("Dracaena deremensis");
        plant28.setToolTipText("");
        plant28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant28ActionPerformed(evt);
            }
        });

        plant30.setText("Nephrolepis exaltata");
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

        plant33.setText("Codiaeum variegatum");
        plant33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant33ActionPerformed(evt);
            }
        });

        plant36.setText("Dracaena marginata");
        plant36.setToolTipText("");
        plant36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant36ActionPerformed(evt);
            }
        });

        plant38.setText("Beaucarnea recurvata");
        plant38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant38ActionPerformed(evt);
            }
        });

        plant40.setText("Schefflera actinophylla");
        plant40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPlantFrameLayout = new javax.swing.GroupLayout(addPlantFrame);
        addPlantFrame.setLayout(addPlantFrameLayout);
        addPlantFrameLayout.setHorizontalGroup(
            addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(plant16, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plant17, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plant18, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPlantFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plant19, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plant21, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plant22, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plant30, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plant24, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPlantFrameLayout.createSequentialGroup()
                                .addComponent(plant26, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plant28, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(addPlantFrameLayout.createSequentialGroup()
                                .addComponent(plant36, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plant33, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addContainerGap())))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addComponent(plant32, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plant38, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plant40, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addPlantFrameLayout.setVerticalGroup(
            addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPlantFrameLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plant16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plant19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plant24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3))
                    .addGroup(addPlantFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plant30, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plant33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plant36, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPlantFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plant32, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant38, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant40, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
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
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(733, 733, 733)
                .addComponent(infoFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(addPlantFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(profilrFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(361, 361, 361)
                                .addComponent(signInFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addComponent(signUpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(144, 144, 144)
                        .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(welcomeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profilrFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(infoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(signInFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(signUpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(addPlantFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    user = userName.getText();
if(v.isUserNameAndpaswordExist(user,password.getText())) {
    JOptionPane.showMessageDialog(this,"Welcome "+user, "",JOptionPane.INFORMATION_MESSAGE);  
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(true);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);
    pack();
    User u = new User();
    UserPlant us = new UserPlant();
    u.setUsername(user);
    us.setUsertName(user);
}
else{
    JOptionPane.showMessageDialog(this,"please check your info", "Error",JOptionPane.ERROR_MESSAGE);  
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(true);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);
    pack();
   }
    u.clear(password);

    }//GEN-LAST:event_signInButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
// sign up - profile

pack();
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
    JOptionPane.showMessageDialog(null,"your sign up done succ");
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

    private void waterNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterNoActionPerformed
        // no
    }//GEN-LAST:event_waterNoActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        Plant p = new Plant();
        User u = new User();
        user = userName.getText();
        //System.out.println(plantId);
        String plantId2 = idPlantText.getText();

        String water = "";
     
        if( waterYes.isSelected()){
         water = "yes";
        }else{
            water = "no";
        }
        UserPlant up = new UserPlant();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        up.setDate(dtf.format(localDate));
        String Date = up.getDate();
        
        u.setUsername(user);
        p.setPlantId(plantId);
        
        if (plantId!=null)
            p.save(user,plantId,Date,water);
        else
        p.save(user,plantId2,Date,water);

    }//GEN-LAST:event_doneButtonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      Plant p = new Plant();
        user = userName.getText();
        plantId = idPlantText.getText();
        p.deletePlant(user, plantId);
    }//GEN-LAST:event_deleteActionPerformed

    private void okeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okeyButtonActionPerformed
    plantId = idPlantText.getText();
    boolean ex = p.isidPlantExist(plantId);
    System.out.println(ex);
if (ex!=true){
    JOptionPane.showMessageDialog(null,"this ID does not exit");
   }
else {
    PlantNameLabel.setText(p.loadPlantName(plantId));
    plantInfo.setText(p.loadPlantInfo(plantId));
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    addPlantFrame.setVisible(false);
    forgotPassword.setVisible(false);
    pack();
}
    }//GEN-LAST:event_okeyButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
 // back profile 
    welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(true);
    infoFrame.setVisible(false);
    addPlantFrame.setVisible(false);
     forgotPassword.setVisible(false);
    pack();
    }//GEN-LAST:event_backActionPerformed

    private void waterYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterYesActionPerformed
        //yes
    }//GEN-LAST:event_waterYesActionPerformed

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

    private void plant16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant16ActionPerformed

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
     pack();}
   
    }//GEN-LAST:event_plant16ActionPerformed

    private void plant17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant17ActionPerformed
        String plant2 = "Peperomias are a diverse group of small houseplants with waxy and often highly textured leaves. "
        + "\n Red-edge peperomia (pictured) has a narrow band of red surrounding a wide creamy leaf margin."
        + "\n Other peperomias we love include ripple peperomia, watermelon peperomia, baby rubber plant, and silverleaf "
        + "\n peperomia."
        + "\n \n Why We Love It: \n Its waxy, colorful foliage adds a splash of color in any room \n "
        + "without taking up a lot of space."
        + "\n\n insert (02) if you have it";

        String plant2ID= JOptionPane.showInputDialog(plant2);
             if(p.isidPlantExist(plant2ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
    }//GEN-LAST:event_plant17ActionPerformed

    private void plant18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant18ActionPerformed
       String plant3 = "This plant has great foliage; the leaves are punctuated with shades of silver, gray, or shades of green "
        + "\n making Chinese evergreen an attractive choice to brighten low-light areas of your home. Take a cue from shopping"
        + "\n  mall plantings and use Chinese evergreen as a ground cover around an upright, treelike houseplant. Or showcase it "
        + "\n alone as a specimen plant."
        + "\n \n Why We Love It: \n It's extra tough and has attractive leaves that brighten low light spots"
        + "\n\n insert (03) if you have it ";

        String plant3ID= JOptionPane.showInputDialog(plant3);
               if(p.isidPlantExist(plant3ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
    }//GEN-LAST:event_plant18ActionPerformed

    private void plant19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant19ActionPerformed
        String plant4 = "Fiddleleaf fig is a beautiful tree that gets its common name comes from the violin-shape outline of its leathery, "
        + "\n deep green leaves. It tolerates low light well, though it may lose its lower leaves in dim spots. If your fiddleleaf"
        + "\n fig grows too tall, prune stems back to the desired height, or start a new plant by air layering elongated shoots."
        + "\n\n Why We Love It: This is one of the classiest-looking indoor trees thanks to its big leaves and the shape it forms"
        + "\n as it grows."
        + "\n\n insert (04) if you have it ..";

        String plant4ID= JOptionPane.showInputDialog(plant4);
               if(p.isidPlantExist(plant4ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
    }//GEN-LAST:event_plant19ActionPerformed

    private void plant21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant21ActionPerformed
        String plant5 = "Several closely related species share the common name of dieffenbachia. All produce canelike stems with lush foliage"
        + "\n variegated in green and white. Grow one by itself to for a tree appearance or several together in a single container for"
        + "\n a shrubby look. One of the plant's common names, dumb cane, comes from the effect of the toxic sap that if eaten causes "
        + "\n swelling and numbness in the mouth and throat."
        + " \n\n Why We Love It:\n  Its large, green-and-white leaves create a decidedly tropical look to any room of your home \n "
        + "(and it's great for decorating decks and patios in the summer)."
        + "\n\n insert(05) if you have it ..";

        String plant5ID= JOptionPane.showInputDialog(plant5);
               if(p.isidPlantExist(plant5ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
        String plant6 ="Sometimes called eternity plant because it lasts so long, succulent zeezee plant tolerates low light and neglect."
        + "\n The thick, fleshy leafstalks are so durable that you might even think it's plastic. It is a slow grower, so purchase "
        + "\n a large plant if you want a big specimen. Cut stems remain green and healthy in appearance for several weeks, even without"
        + "\n  water."
        + "\n\n Why We Love It: \n This plant is so easy it's almost a challenge to kill it."
        + "\n\n insert(06) if you have it ..";
        String plant6ID= JOptionPane.showInputDialog(plant6);
               if(p.isidPlantExist(plant6ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

    private void plant24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant24ActionPerformed
       String plant7 = "You may remember this from your grandmother's house; spider plants have been grown for years and are still popular today."
        + "\n Look for a number of varieties -- from types with plain green leaves to others that offer foliage marked with cream or white "
        + "\n stripes. All make handsome hanging plants that develop plantlets at the ends of arching stems. These babies readily root in "
        + "\n water or potting soil to start new plants."
        + "\n\n Why We Love It: \n It offers tons of old-fashioned appeal and an easy-care nature."
        + "\n\n insert(07) if you have it ..";

        String plant7ID= JOptionPane.showInputDialog(plant7);
               if(p.isidPlantExist(plant7ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

    private void plant26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant26ActionPerformed
       String plant8 = "An old-fashioned classic, rubber tree gets its name from the sticky, milky sap it exudes if injured. It eventually grows \n "
        + "into a large tree, but you can easily keep it shorter by pruning back long stems, causing it to branch into a multi-stemmed shrub.\n "
        + "\n \n Note: In frost-free areas, you may see rubber trees as a full-size shade trees outdoors."
        + "\n\n Why We Love It:\n "
        + " Its big, dark green shiny leaves definitely make a statement. The older plants get, the larger they become a good-sized rubber\n"
        + " tree makes a big, dramatic accent in any room."
        + "\n\n insert (08) if you have it ..";

        String plant8ID= JOptionPane.showInputDialog(plant8);
               if(p.isidPlantExist(plant8ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

        String plant9ID= JOptionPane.showInputDialog(plant9);
               if(p.isidPlantExist(plant9ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

        String plant10ID= JOptionPane.showInputDialog(plant10);
               if(p.isidPlantExist(plant10ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
        String plant11ID= JOptionPane.showInputDialog(plant11);
               if(p.isidPlantExist(plant11ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

        String plant12ID= JOptionPane.showInputDialog(plant12);
               if(p.isidPlantExist(plant12ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

        String plant13ID= JOptionPane.showInputDialog(plant13);
               if(p.isidPlantExist(plant13ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
        String plant14ID= JOptionPane.showInputDialog(plant14);
               if(p.isidPlantExist(plant14ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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

        String plant15ID= JOptionPane.showInputDialog(plant15);
               if(p.isidPlantExist(plant15ID)) {
     welcomeFrame.setVisible(false);
    signUpFrame.setVisible(false);
    signInFrame.setVisible(false);
    profilrFrame.setVisible(false);
    infoFrame.setVisible(true);
    forgotPassword.setVisible(false);
    addPlantFrame.setVisible(false);
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
} else {
        JOptionPane.showMessageDialog(this,"please check your info", "Error",JOptionPane.ERROR_MESSAGE);   
        }
        u.clear(passwordFP);       
    }//GEN-LAST:event_updateFPActionPerformed

    private void calenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calenderActionPerformed
        // TODO add your handling code here:
       UserPlant p = new UserPlant();
       user = userName.getText();
       plantId = idPlantText.getText();
       Calender cal = new Calender();
       cal.setList(p.loadDate(user,plantId));
    }//GEN-LAST:event_calenderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel PasswordLabel;
    public javax.swing.JLabel PlantNameLabel;
    private javax.swing.JButton addPlantButton;
    public javax.swing.JPanel addPlantFrame;
    public javax.swing.JButton back;
    private javax.swing.JButton backFP;
    private javax.swing.JButton calender;
    public javax.swing.JButton delete;
    private javax.swing.JButton doneButton;
    public javax.swing.JTextField email;
    public javax.swing.JLabel emailLabel;
    public javax.swing.JButton forgetPasswordButton;
    private javax.swing.JPanel forgotPassword;
    private javax.swing.JTextField idPlantText;
    public javax.swing.JPanel infoFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton okeyButton;
    public javax.swing.JPasswordField password;
    public javax.swing.JPasswordField passwordCon;
    public javax.swing.JPasswordField passwordF;
    private javax.swing.JPasswordField passwordFP;
    private javax.swing.JLabel passwordFPText;
    public javax.swing.JLabel passwordLabel;
    public javax.swing.JButton plant16;
    public javax.swing.JButton plant17;
    public javax.swing.JButton plant18;
    public javax.swing.JButton plant19;
    public javax.swing.JButton plant21;
    public javax.swing.JButton plant22;
    public javax.swing.JButton plant24;
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
    public javax.swing.JButton signUp;
    public javax.swing.JButton signUpButton;
    public javax.swing.JPanel signUpFrame;
    private javax.swing.JButton updateFP;
    public javax.swing.JTextField userName;
    private javax.swing.JTextField userNameFP;
    private javax.swing.JLabel userNameFPText;
    public javax.swing.JLabel userNameLabel;
    public javax.swing.JTextField userNameS;
    public javax.swing.JCheckBox waterNo;
    public javax.swing.JCheckBox waterYes;
    public javax.swing.JLabel watringLabel;
    public javax.swing.JPanel welcomeFrame;
    public javax.swing.JLabel yourPlant;
    // End of variables declaration//GEN-END:variables
}
