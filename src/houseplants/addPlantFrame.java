/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseplants;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import houseplants.plantInfoFrame.planetName;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class addPlantFrame extends javax.swing.JFrame {

   
    public addPlantFrame() {
        initComponents();
               
pack();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plant8 = new javax.swing.JButton();
        plant7 = new javax.swing.JButton();
        plant10 = new javax.swing.JButton();
        plant2 = new javax.swing.JButton();
        plant12 = new javax.swing.JButton();
        plant3 = new javax.swing.JButton();
        plant14 = new javax.swing.JButton();
        plant5 = new javax.swing.JButton();
        plant13 = new javax.swing.JButton();
        plant1 = new javax.swing.JButton();
        plant11 = new javax.swing.JButton();
        plant4 = new javax.swing.JButton();
        plant6 = new javax.swing.JButton();
        plant9 = new javax.swing.JButton();
        plant15 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        plant8.setText("Ficus elastica");
        plant8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant8ActionPerformed(evt);
            }
        });
        getContentPane().add(plant8);
        plant8.setBounds(228, 167, 204, 64);

        plant7.setText("Chlorophytum comosum ");
        plant7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant7ActionPerformed(evt);
            }
        });
        getContentPane().add(plant7);
        plant7.setBounds(15, 167, 204, 64);

        plant10.setText("Nephrolepis exaltata");
        plant10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant10ActionPerformed(evt);
            }
        });
        getContentPane().add(plant10);
        plant10.setBounds(15, 238, 204, 64);

        plant2.setText("Peperomia spp");
        plant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant2ActionPerformed(evt);
            }
        });
        getContentPane().add(plant2);
        plant2.setBounds(228, 16, 204, 64);

        plant12.setText("Codiaeum variegatum");
        plant12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant12ActionPerformed(evt);
            }
        });
        getContentPane().add(plant12);
        plant12.setBounds(441, 238, 204, 64);

        plant3.setText("Aglaonema commutatum");
        plant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant3ActionPerformed(evt);
            }
        });
        getContentPane().add(plant3);
        plant3.setBounds(441, 16, 204, 64);

        plant14.setText("Beaucarnea recurvata");
        plant14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant14ActionPerformed(evt);
            }
        });
        getContentPane().add(plant14);
        plant14.setBounds(228, 310, 204, 64);

        plant5.setText("Dieffenbachia spp");
        plant5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant5ActionPerformed(evt);
            }
        });
        getContentPane().add(plant5);
        plant5.setBounds(228, 96, 204, 64);

        plant13.setText("Dracaena marginata");
        plant13.setToolTipText("");
        plant13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant13ActionPerformed(evt);
            }
        });
        getContentPane().add(plant13);
        plant13.setBounds(15, 310, 204, 64);

        plant1.setText("Araucaria heterophylla");
        plant1.setToolTipText("");
        plant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant1ActionPerformed(evt);
            }
        });
        getContentPane().add(plant1);
        plant1.setBounds(15, 16, 204, 64);

        plant11.setText("Aspidistra elatior");
        plant11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant11ActionPerformed(evt);
            }
        });
        getContentPane().add(plant11);
        plant11.setBounds(228, 238, 204, 64);

        plant4.setText("Ficus lyrata");
        plant4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant4ActionPerformed(evt);
            }
        });
        getContentPane().add(plant4);
        plant4.setBounds(15, 96, 204, 64);

        plant6.setText("Zamioculcas zamiifolia");
        plant6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant6ActionPerformed(evt);
            }
        });
        getContentPane().add(plant6);
        plant6.setBounds(441, 96, 204, 64);

        plant9.setText("Dracaena deremensis");
        plant9.setToolTipText("");
        plant9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant9ActionPerformed(evt);
            }
        });
        getContentPane().add(plant9);
        plant9.setBounds(441, 167, 204, 64);

        plant15.setText("Schefflera actinophylla");
        plant15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plant15ActionPerformed(evt);
            }
        });
        getContentPane().add(plant15);
        plant15.setBounds(441, 310, 204, 64);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plant8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant8ActionPerformed
        String plant8 = "An old-fashioned classic, rubber tree gets its name from the sticky, milky sap it exudes if injured. It eventually grows \n "
        + "into a large tree, but you can easily keep it shorter by pruning back long stems, causing it to branch into a multi-stemmed shrub.\n "
        + "\n \n Note: In frost-free areas, you may see rubber trees as a full-size shade trees outdoors."
        + "\n\n Why We Love It:\n "
        + " Its big, dark green shiny leaves definitely make a statement. The older plants get, the larger they become a good-sized rubber\n"
        + " tree makes a big, dramatic accent in any room."
        + "\n\n insert (08) if you have it ..";

        String plant8ID= JOptionPane.showInputDialog(plant8);
        plantInfoFrame plant1Info = new plantInfoFrame (plant8ID);
        plant8ActionPerformed.addActionListener(new plantInfoFrame.planetName());
    }//GEN-LAST:event_plant8ActionPerformed

    private void plant7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant7ActionPerformed
        String plant7 = "You may remember this from your grandmother's house; spider plants have been grown for years and are still popular today."
        + "\n Look for a number of varieties -- from types with plain green leaves to others that offer foliage marked with cream or white "
        + "\n stripes. All make handsome hanging plants that develop plantlets at the ends of arching stems. These babies readily root in "
        + "\n water or potting soil to start new plants."
        + "\n\n Why We Love It: \n It offers tons of old-fashioned appeal and an easy-care nature."
        + "\n\n insert(07) if you have it ..";

        String plant7ID= JOptionPane.showInputDialog(plant7);
        plantInfoFrame plant1Info = new plantInfoFrame (plant7ID);
    }//GEN-LAST:event_plant7ActionPerformed

    private void plant10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant10ActionPerformed
        String plant10 ="Boston fern's arching, lacy fronds make it well suited to hanging baskets or for display on a pedestal. Don't let its "
        + "\n delicate appearance mislead you, though: This tough plant that will live for decades if you keep it moist and give it "
        + "\n moderate light and enough humidity. The variety 'Dallas' is more compact and more tolerant of dry air."
        + "\n\n Why We Love It:\n"
        + " Boston ferns create a classic feel in any room. Their beautiful, arching fronds work well with any decorating style but\n"
        + " especially cottage and country."
        + "\n\n insert (10) if you have it .. ";

        String plant10ID= JOptionPane.showInputDialog(plant10);
        plantInfoFrame plant1Info = new plantInfoFrame (plant10ID);

    }//GEN-LAST:event_plant10ActionPerformed

    private void plant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant2ActionPerformed
        String plant2 = "Peperomias are a diverse group of small houseplants with waxy and often highly textured leaves. "
        + "\n Red-edge peperomia (pictured) has a narrow band of red surrounding a wide creamy leaf margin."
        + "\n Other peperomias we love include ripple peperomia, watermelon peperomia, baby rubber plant, and silverleaf "
        + "\n peperomia."
        + "\n \n Why We Love It: \n Its waxy, colorful foliage adds a splash of color in any room \n "
        + "without taking up a lot of space."
        + "\n\n insert (02) if you have it";

        String plant2ID= JOptionPane.showInputDialog(plant2);
        plantInfoFrame plant1Info = new plantInfoFrame (plant2ID);
    }//GEN-LAST:event_plant2ActionPerformed

    private void plant12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant12ActionPerformed
        String plant12 ="While this showy shrub survives in low light levels, its foliage shows the best color in bright spots. Its gold, pink,"
        + "\n and orange tones glow when backlit from a sunny window. Wash the leaves occasionally to maintain their shine and keep it "
        + "\n looking dramatic."
        + "\n\n Why We Love It: \n It has beautiful, leathery leaves with exotic and colorful markings."
        + "\n insert (12) if you have it ..";

        String plant12ID= JOptionPane.showInputDialog(plant12);
        plantInfoFrame plant1Info = new plantInfoFrame (plant12ID);
    }//GEN-LAST:event_plant12ActionPerformed

    private void plant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant3ActionPerformed
        String plant3 = "This plant has great foliage; the leaves are punctuated with shades of silver, gray, or shades of green "
        + "\n making Chinese evergreen an attractive choice to brighten low-light areas of your home. Take a cue from shopping"
        + "\n  mall plantings and use Chinese evergreen as a ground cover around an upright, treelike houseplant. Or showcase it "
        + "\n alone as a specimen plant."
        + "\n \n Why We Love It: \n It's extra tough and has attractive leaves that brighten low light spots"
        + "\n\n insert (03) if you have it ";

        String plant3ID= JOptionPane.showInputDialog(plant3);
        plantInfoFrame plant1Info = new plantInfoFrame (plant3ID);

    }//GEN-LAST:event_plant3ActionPerformed

    private void plant14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant14ActionPerformed
        String plant14 ="Despite its common name, this plant is a succulent rather than a true palm. Its graceful arching leaves are always"
        + "\n  attractive and its swollen trunk looks great, too. (The trunk holds moisture for the plant.) Keep your ponytail palm in "
        + "\n a container only a couple of inches wider than its trunk base to control its size. It is sometimes sold as Nolina recurvata."
        + "\n\n Why We Love It: \n  Because the trunk actually stores moisture, ponytail palm can survive for long periods without watering."
        + "\n\n insert (14) if you have it ..";
        String plant14ID= JOptionPane.showInputDialog(plant14);
        plantInfoFrame plant1Info = new plantInfoFrame (plant14ID);
    }//GEN-LAST:event_plant14ActionPerformed

    private void plant5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant5ActionPerformed
        String plant5 = "Several closely related species share the common name of dieffenbachia. All produce canelike stems with lush foliage"
        + "\n variegated in green and white. Grow one by itself to for a tree appearance or several together in a single container for"
        + "\n a shrubby look. One of the plant's common names, dumb cane, comes from the effect of the toxic sap that if eaten causes "
        + "\n swelling and numbness in the mouth and throat."
        + " \n\n Why We Love It:\n  Its large, green-and-white leaves create a decidedly tropical look to any room of your home \n "
        + "(and it's great for decorating decks and patios in the summer)."
        + "\n\n insert(05) if you have it ..";

        String plant5ID= JOptionPane.showInputDialog(plant5);
        plantInfoFrame plant1Info = new plantInfoFrame (plant5ID);
    }//GEN-LAST:event_plant5ActionPerformed

    private void plant13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant13ActionPerformed
        String plant13 = "This plant is as impressive as its name. It bears tufts of long, narrow, deep green leaves edged in red at the tips of "
        + "\n woody gray stems. Young plants are shrubbier, but soon grow more upright. The variety 'Tricolor' has pink-and-cream leaf "
        + "\n margins, and is sometimes known as rainbow plant."
        + "\n\n Why We Love It: \n Its grassy leaves on tall stems give it a festive appearance."
        + "\n\n insert (13) if you have it ..";

        String plant13ID= JOptionPane.showInputDialog(plant13);
        plantInfoFrame plant1Info = new plantInfoFrame (plant13ID);
    }//GEN-LAST:event_plant13ActionPerformed

    private void plant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant1ActionPerformed

        String plant1="The secret to keeping Norfolk Island pine healthy is to give it ample light and humidity. "
        + "\n In low light, the lower branches may turn brown and fall off. If the air is too dry, it becomes a"
        + " \n prime target for spider mites, a common houseplant pest. In its native habitat, Norfolk Island"
        + "\n  pine can reach 200 feet tall, but don't worry -- indoors, it seldom grows taller than 10 feet."
        + "\n \n  Why We Love It: \n This tree is perfect for decorating for Christmas -- or giving as a holiday gift."
        + " Outside the holidays, \n its soft texture adds a cozy feeling to any room."
        + " \n \n insert (01) if you have it ..";

        String plant1ID= JOptionPane.showInputDialog(plant1);
        plantInfoFrame plant1Info = new plantInfoFrame (plant1ID);

    }//GEN-LAST:event_plant1ActionPerformed

    private void plant11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant11ActionPerformed
        String plant11 ="One of the toughest you can grow, cast-iron plant withstands neglect, low light, low humidity, and a wide range "
        + "\n of temperatures. It grows slowly so purchase a plant that is large enough for the space in which you intend to use it."
        + "\n Several varieties have white or yellow variegation on their leaves."
        + "\n\n Why We Love It:"
        + "\n This plant really lives up to its name: It's nearly indestructible."
        + "\n insert (11) if you have it ..";
        String plant11ID= JOptionPane.showInputDialog(plant11);
        plantInfoFrame plant1Info = new plantInfoFrame (plant11ID);

    }//GEN-LAST:event_plant11ActionPerformed

    private void plant4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant4ActionPerformed
        String plant4 = "Fiddleleaf fig is a beautiful tree that gets its common name comes from the violin-shape outline of its leathery, "
        + "\n deep green leaves. It tolerates low light well, though it may lose its lower leaves in dim spots. If your fiddleleaf"
        + "\n fig grows too tall, prune stems back to the desired height, or start a new plant by air layering elongated shoots."
        + "\n\n Why We Love It: This is one of the classiest-looking indoor trees thanks to its big leaves and the shape it forms"
        + "\n as it grows."
        + "\n\n insert (04) if you have it ..";

        String plant4ID= JOptionPane.showInputDialog(plant4);
        plantInfoFrame plant1Info = new plantInfoFrame (plant4ID);
    }//GEN-LAST:event_plant4ActionPerformed

    private void plant6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant6ActionPerformed
        String plant6 ="Sometimes called eternity plant because it lasts so long, succulent zeezee plant tolerates low light and neglect."
        + "\n The thick, fleshy leafstalks are so durable that you might even think it's plastic. It is a slow grower, so purchase "
        + "\n a large plant if you want a big specimen. Cut stems remain green and healthy in appearance for several weeks, even without"
        + "\n  water."
        + "\n\n Why We Love It: \n This plant is so easy it's almost a challenge to kill it."
        + "\n\n insert(06) if you have it ..";
        String plant6ID= JOptionPane.showInputDialog(plant6);
        plantInfoFrame plant1Info = new plantInfoFrame (plant6ID);
    }//GEN-LAST:event_plant6ActionPerformed

    private void plant9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant9ActionPerformed
        String plant9 = "Some varieties of green dracaena, such as 'Janet Craig' have solid green leaves. Others such as 'Warneckii' "
        + "\n (pictured), bear white, cream, gold or chartreuse stripes on their foliage. All form compact rosettes when young,"
        + "\n  but eventually become striking upright foliage plants. They tolerate low light, but produce better color in medium \n"
        + "to bright light."
        + "\n\n Why We Love It:\n "
        + " It's a durable, upright plant with good-looking leaves."
        + "\n\n insert (09) if you have it ..";

        String plant9ID= JOptionPane.showInputDialog(plant9);
        plantInfoFrame plant1Info = new plantInfoFrame (plant9ID);

    }//GEN-LAST:event_plant9ActionPerformed

    private void plant15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plant15ActionPerformed
        String plant15 = "Also commonly called umbrella tree, this plant offers glossy foliage with leaflets that radiate out from a central"
        + "\n spoke, similar to the ribs of an umbrella. A close relative, dwarf schefflera (Schefflera arboricola) has smaller, "
        + "\n thickerleaflets and shorter stems. Both are sometimes classified in the genus Brassaia."
        + "\n\n Why We Love It:\n "
        + " Its large glossy green leaves create instant tropical flair."
        + "\n\n insert (15) if you have it ..";

        String plant15ID= JOptionPane.showInputDialog(plant15);
        plantInfoFrame plant1Info = new plantInfoFrame (plant15ID);

    }//GEN-LAST:event_plant15ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton plant1;
    public javax.swing.JButton plant10;
    public javax.swing.JButton plant11;
    public javax.swing.JButton plant12;
    public javax.swing.JButton plant13;
    public javax.swing.JButton plant14;
    public javax.swing.JButton plant15;
    public javax.swing.JButton plant2;
    public javax.swing.JButton plant3;
    public javax.swing.JButton plant4;
    public javax.swing.JButton plant5;
    public javax.swing.JButton plant6;
    public javax.swing.JButton plant7;
    public javax.swing.JButton plant8;
    public javax.swing.JButton plant9;
    // End of variables declaration//GEN-END:variables
}
