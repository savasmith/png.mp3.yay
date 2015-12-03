
/**
 * Write a description of class SongAdder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class SongAdderGUI extends javax.swing.JPanel {

    /**
     * Creates new form SongAdder
     */
    public SongAdderGUI() {
        initComponents();
    }

                           
    private void initComponents() {

        songField = new javax.swing.JTextField();
        artistField = new javax.swing.JTextField();
        moodField = new javax.swing.JTextField();
        songName = new java.awt.Label();
        artistName = new java.awt.Label();
        mood = new java.awt.Label();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();

        setBackground(java.awt.Color.WHITE);
        songField.setText("");

        artistField.setText("");

        moodField.setText("");

        songName.setText("Song: ");

        artistName.setText("Artist: ");

        mood.setText("Mood: ");

        label1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label1.setText("Add a Song");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(songName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songField, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(artistField)
                            .addComponent(moodField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(artistField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      NewSong song = new NewSong(artistField.getText(), songField.getText(), moodField.getText());
      songAdder = new SongAdder(song);
      
    //  System.out.println("Echo Nest: " + songAdder.checkEchoSong(song));
      System.out.println("Database: " + songAdder.checkSongDatabase(song));
      if (!(songAdder.checkEchoSong(song)) && !(songAdder.checkSongDatabase(song))){
          songAdder.addSong(song);
     //     System.out.println("Database: " + songAdder.checkSongDatabase(song));
        }

    }                                        


    // Variables declaration - do not modify    
    private SongAdder songAdder;
    private java.awt.Label artistName;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField songField;
    private javax.swing.JTextField artistField;
    private javax.swing.JTextField moodField;
    private java.awt.Label label1;
    private java.awt.Label mood;
    private java.awt.Label songName;
    // End of variables declaration                   
}
