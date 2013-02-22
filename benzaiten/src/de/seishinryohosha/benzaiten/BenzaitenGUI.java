/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.seishinryohosha.benzaiten;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author seishinryohosha
 */
public class BenzaitenGUI extends javax.swing.JFrame implements MusicPlayerListener {

    private JFileChooser fc;
    private MusicPlayer mplayer;

    /**
     * Creates new form BenzaitenGUI
     */
    public BenzaitenGUI() {
        fc = new JFileChooser();
        mplayer = new MusicPlayer();
        mplayer.addListener(this);
        initComponents();
    }

    public void positionChanged(int position) {
        playbackJSlider.setValue(position);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        musicInfoJPanel = new javax.swing.JPanel();
        artistJlabel = new javax.swing.JLabel();
        songTitleJLabel = new javax.swing.JLabel();
        albumJLabel = new javax.swing.JLabel();
        controlsJPanel = new javax.swing.JPanel();
        rewindJButton = new javax.swing.JButton();
        playPauseJButton = new javax.swing.JButton();
        stopPlayingJButton = new javax.swing.JButton();
        fastForwardJButton = new javax.swing.JButton();
        playbackJSlider = new javax.swing.JSlider();
        volumeJSlider = new javax.swing.JSlider();
        volumeJButton = new javax.swing.JButton();
        playlistJScrollPane = new javax.swing.JScrollPane();
        playlistButtonsJPanel = new javax.swing.JPanel();
        openPlaylistJButton = new javax.swing.JButton();
        savePlaylistJButton = new javax.swing.JButton();
        addTitleToPlaylistJButton = new javax.swing.JButton();
        removeTitleFromPlaylistJButton = new javax.swing.JButton();
        addTitleFromFolderToPlaylistJButton = new javax.swing.JButton();
        erasePlaylistJButton = new javax.swing.JButton();
        moveTitleUpJButton = new javax.swing.JButton();
        moveTitleDownJbutton = new javax.swing.JButton();
        unsortedListJButton = new javax.swing.JButton();
        loopListJButton = new javax.swing.JButton();
        shuffleListJButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(45, 0), new java.awt.Dimension(0, 0));
        closePlaylistJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        dateiJMenu = new javax.swing.JMenu();
        openJMenuItem = new javax.swing.JMenuItem();
        openFolderJMenuItem = new javax.swing.JMenuItem();
        openPlaceMenuItem = new javax.swing.JMenuItem();
        discJMenu = new javax.swing.JMenu();
        openAudioCDJMenuItem = new javax.swing.JMenuItem();
        openDVDJMenuItem = new javax.swing.JMenuItem();
        openDVDFolderJMenuItem = new javax.swing.JMenuItem();
        openDVDisoJMenuItem = new javax.swing.JMenuItem();
        openVCDJMenuItem = new javax.swing.JMenuItem();
        tvJMenu = new javax.swing.JMenu();
        openTVanalogJMenuItem = new javax.swing.JMenuItem();
        openTVdigitalJMenuItem = new javax.swing.JMenuItem();
        openLastPlaybackJMenu = new javax.swing.JMenu();
        closeJMenuItem = new javax.swing.JMenuItem();
        editJMenu = new javax.swing.JMenu();
        randomPlaybackJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        playbackAllJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        setAudioJMenuItem = new javax.swing.JMenuItem();
        standardAudioLanguageJMenu = new javax.swing.JMenu();
        setSubtitletrackJMenuItem = new javax.swing.JMenuItem();
        standardSubtitleLanguageJMenuItem = new javax.swing.JMenuItem();
        takeSnapshotJMenuItem = new javax.swing.JMenuItem();
        preferencesJMenuItem = new javax.swing.JMenuItem();
        viewJMenu = new javax.swing.JMenu();
        playlistJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        mediaInformationJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        detailsJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        spectrumAnalyzerJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        fullscreenJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        normalViewJMenuItem = new javax.swing.JMenuItem();
        doubleViewJMenuItem = new javax.swing.JMenuItem();
        halfViewJMenuItem = new javax.swing.JMenuItem();
        halfLargerViewJMenuItem = new javax.swing.JMenuItem();
        aspectRatioJMenu = new javax.swing.JMenu();
        showSubtitlesJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        decreaseSubtitleSizeJMenuItem = new javax.swing.JMenuItem();
        increaseSubtitleSizeJMenuItem = new javax.swing.JMenuItem();
        decreaseSubtitleDisplayDurationJMenuItem = new javax.swing.JMenuItem();
        increaseSubtitleDisplayDurationJMenuItem = new javax.swing.JMenuItem();
        changePerspectiveJMenuItem = new javax.swing.JMenuItem();
        controlElementsJCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        videoImageAdjustmentJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        infoJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Benzaiten");
        setForeground(java.awt.Color.white);
        setResizable(false);

        musicInfoJPanel.setLayout(new java.awt.BorderLayout());
        musicInfoJPanel.setVisible(false);

        artistJlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        artistJlabel.setText("Artist");
        artistJlabel.setMaximumSize(new java.awt.Dimension(41, 21));
        artistJlabel.setMinimumSize(new java.awt.Dimension(41, 21));
        artistJlabel.setPreferredSize(new java.awt.Dimension(41, 21));
        musicInfoJPanel.add(artistJlabel, java.awt.BorderLayout.CENTER);

        songTitleJLabel.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        songTitleJLabel.setText("Song");
        musicInfoJPanel.add(songTitleJLabel, java.awt.BorderLayout.PAGE_START);

        albumJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        albumJLabel.setText("Album");
        musicInfoJPanel.add(albumJLabel, java.awt.BorderLayout.PAGE_END);

        rewindJButton.setText("«");
        rewindJButton.setEnabled(false);
        rewindJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewindJButtonActionPerformed(evt);
            }
        });
        controlsJPanel.add(rewindJButton);

        playPauseJButton.setText("►");
        playPauseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPauseJButtonActionPerformed(evt);
            }
        });
        controlsJPanel.add(playPauseJButton);

        stopPlayingJButton.setText("∎");
        stopPlayingJButton.setEnabled(false);
        stopPlayingJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopPlayingJButtonActionPerformed(evt);
            }
        });
        controlsJPanel.add(stopPlayingJButton);

        fastForwardJButton.setText("»");
        fastForwardJButton.setEnabled(false);
        fastForwardJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastForwardJButtonActionPerformed(evt);
            }
        });
        controlsJPanel.add(fastForwardJButton);

        playbackJSlider.setPaintLabels(true);
        playbackJSlider.setToolTipText("Position");
        playbackJSlider.setValue(0);
        playbackJSlider.setEnabled(false);
        playbackJSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playbackJSliderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playbackJSliderMouseReleased(evt);
            }
        });
        playbackJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                playbackJSliderStateChanged(evt);
            }
        });
        controlsJPanel.add(playbackJSlider);

        volumeJSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        volumeJSlider.setValue(100);
        volumeJSlider.setMaximumSize(new java.awt.Dimension(36, 38));
        volumeJSlider.setPreferredSize(new java.awt.Dimension(36, 48));
        volumeJSlider.setVisible(false);
        volumeJSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volumeJSliderMouseExited(evt);
            }
        });
        volumeJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeJSliderStateChanged(evt);
            }
        });
        controlsJPanel.add(volumeJSlider);

        volumeJButton.setText("\uD83D\uDD0A");
        volumeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeJButtonActionPerformed(evt);
            }
        });
        controlsJPanel.add(volumeJButton);

        playlistJScrollPane.setVisible(false);

        openPlaylistJButton.setText("1");
        openPlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(openPlaylistJButton);

        savePlaylistJButton.setText("2");
        savePlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(savePlaylistJButton);

        addTitleToPlaylistJButton.setText("3");
        addTitleToPlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(addTitleToPlaylistJButton);

        removeTitleFromPlaylistJButton.setText("4");
        removeTitleFromPlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(removeTitleFromPlaylistJButton);

        addTitleFromFolderToPlaylistJButton.setText("5");
        addTitleFromFolderToPlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(addTitleFromFolderToPlaylistJButton);

        erasePlaylistJButton.setText("6");
        erasePlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(erasePlaylistJButton);

        moveTitleUpJButton.setText("7");
        moveTitleUpJButton.setVisible(false);
        playlistButtonsJPanel.add(moveTitleUpJButton);

        moveTitleDownJbutton.setText("8");
        moveTitleDownJbutton.setVisible(false);
        playlistButtonsJPanel.add(moveTitleDownJbutton);

        unsortedListJButton.setText("9");
        unsortedListJButton.setVisible(false);
        playlistButtonsJPanel.add(unsortedListJButton);

        loopListJButton.setText("10");
        loopListJButton.setVisible(false);
        playlistButtonsJPanel.add(loopListJButton);

        shuffleListJButton.setText("11");
        shuffleListJButton.setVisible(false);
        playlistButtonsJPanel.add(shuffleListJButton);
        playlistButtonsJPanel.add(filler1);

        closePlaylistJButton.setText("12");
        closePlaylistJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closePlaylistJButtonActionPerformed(evt);
            }
        });
        closePlaylistJButton.setVisible(false);
        playlistButtonsJPanel.add(closePlaylistJButton);

        dateiJMenu.setText("Datei");

        openJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openJMenuItem.setText("Öffnen");
        openJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openJMenuItemActionPerformed(evt);
            }
        });
        dateiJMenu.add(openJMenuItem);

        openFolderJMenuItem.setText("Ordner öffnen");
        openFolderJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderJMenuItemActionPerformed(evt);
            }
        });
        dateiJMenu.add(openFolderJMenuItem);

        openPlaceMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        openPlaceMenuItem.setText("Öffne Ort");
        openPlaceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPlaceMenuItemActionPerformed(evt);
            }
        });
        dateiJMenu.add(openPlaceMenuItem);

        discJMenu.setText("Disc");

        openAudioCDJMenuItem.setText("Öffne Audio-CD");
        discJMenu.add(openAudioCDJMenuItem);

        openDVDJMenuItem.setText("Öffne DVD mit Menüs");
        discJMenu.add(openDVDJMenuItem);

        openDVDFolderJMenuItem.setText("Öffne DVD aus Ordner mit Menüs");
        discJMenu.add(openDVDFolderJMenuItem);

        openDVDisoJMenuItem.setText("Öffne DVD von ISO-Abbild mit Menüs");
        discJMenu.add(openDVDisoJMenuItem);

        openVCDJMenuItem.setText("Öffne VCD");
        discJMenu.add(openVCDJMenuItem);

        dateiJMenu.add(discJMenu);

        tvJMenu.setText("TV");

        openTVanalogJMenuItem.setText("Öffne Analog-TV");
        tvJMenu.add(openTVanalogJMenuItem);

        openTVdigitalJMenuItem.setText("Öffne Digital-TV");
        tvJMenu.add(openTVdigitalJMenuItem);

        dateiJMenu.add(tvJMenu);

        openLastPlaybackJMenu.setText("Öffne letzte Wiedergabe");
        dateiJMenu.add(openLastPlaybackJMenu);

        closeJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        closeJMenuItem.setText("Beenden");
        closeJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJMenuItemActionPerformed(evt);
            }
        });
        dateiJMenu.add(closeJMenuItem);

        jMenuBar1.add(dateiJMenu);

        editJMenu.setText("Bearbeiten");
        editJMenu.setEnabled(false);

        randomPlaybackJCheckBoxMenuItem.setText("Zufällige Wiedergabe");
        editJMenu.add(randomPlaybackJCheckBoxMenuItem);

        playbackAllJCheckBoxMenuItem.setText("Alle Wiederholen");
        playbackAllJCheckBoxMenuItem.setEnabled(false);
        playbackAllJCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbackAllJCheckBoxMenuItemActionPerformed(evt);
            }
        });
        editJMenu.add(playbackAllJCheckBoxMenuItem);

        setAudioJMenuItem.setText("Audio setzen");
        setAudioJMenuItem.setEnabled(false);
        editJMenu.add(setAudioJMenuItem);

        standardAudioLanguageJMenu.setText("Standard-Audiosprache:");
        standardAudioLanguageJMenu.setEnabled(false);
        editJMenu.add(standardAudioLanguageJMenu);

        setSubtitletrackJMenuItem.setText("Setze Untertitelspur");
        setSubtitletrackJMenuItem.setEnabled(false);
        editJMenu.add(setSubtitletrackJMenuItem);

        standardSubtitleLanguageJMenuItem.setText("Standard Untertitelsprache:");
        standardSubtitleLanguageJMenuItem.setEnabled(false);
        editJMenu.add(standardSubtitleLanguageJMenuItem);

        takeSnapshotJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        takeSnapshotJMenuItem.setText("Schnappschuss nehmen");
        takeSnapshotJMenuItem.setEnabled(false);
        editJMenu.add(takeSnapshotJMenuItem);

        preferencesJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        preferencesJMenuItem.setText("Einstellungen");
        editJMenu.add(preferencesJMenuItem);

        jMenuBar1.add(editJMenu);

        viewJMenu.setText("Ansicht");

        playlistJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        playlistJCheckBoxMenuItem.setText("Wiedergabeliste");
        playlistJCheckBoxMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                playlistJCheckBoxMenuItemItemStateChanged(evt);
            }
        });
        viewJMenu.add(playlistJCheckBoxMenuItem);

        mediaInformationJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, 0));
        mediaInformationJCheckBoxMenuItem.setSelected(true);
        mediaInformationJCheckBoxMenuItem.setText("Media-Informationen");
        mediaInformationJCheckBoxMenuItem.setEnabled(false);
        mediaInformationJCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaInformationJCheckBoxMenuItemActionPerformed(evt);
            }
        });
        viewJMenu.add(mediaInformationJCheckBoxMenuItem);

        detailsJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        detailsJCheckBoxMenuItem.setSelected(true);
        detailsJCheckBoxMenuItem.setText("Details");
        detailsJCheckBoxMenuItem.setEnabled(false);
        viewJMenu.add(detailsJCheckBoxMenuItem);

        spectrumAnalyzerJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        spectrumAnalyzerJCheckBoxMenuItem.setText("Spektrumanalysator");
        viewJMenu.add(spectrumAnalyzerJCheckBoxMenuItem);

        fullscreenJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        fullscreenJCheckBoxMenuItem.setSelected(true);
        fullscreenJCheckBoxMenuItem.setText("Vollbild");
        fullscreenJCheckBoxMenuItem.setEnabled(false);
        fullscreenJCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullscreenJCheckBoxMenuItemActionPerformed(evt);
            }
        });
        viewJMenu.add(fullscreenJCheckBoxMenuItem);

        normalViewJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        normalViewJMenuItem.setText("Normal (1:1)");
        normalViewJMenuItem.setEnabled(false);
        viewJMenu.add(normalViewJMenuItem);

        doubleViewJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        doubleViewJMenuItem.setText("Doppelte Größe (2:1)");
        doubleViewJMenuItem.setEnabled(false);
        doubleViewJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleViewJMenuItemActionPerformed(evt);
            }
        });
        viewJMenu.add(doubleViewJMenuItem);

        halfViewJMenuItem.setText("Halbe Größe (1:2)");
        halfViewJMenuItem.setEnabled(false);
        viewJMenu.add(halfViewJMenuItem);

        halfLargerViewJMenuItem.setText("Hälfte Größer (1.5:1)");
        halfLargerViewJMenuItem.setEnabled(false);
        halfLargerViewJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfLargerViewJMenuItemActionPerformed(evt);
            }
        });
        viewJMenu.add(halfLargerViewJMenuItem);

        aspectRatioJMenu.setText("Seitenverhältnis");
        aspectRatioJMenu.setEnabled(false);
        viewJMenu.add(aspectRatioJMenu);

        showSubtitlesJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        showSubtitlesJCheckBoxMenuItem.setSelected(true);
        showSubtitlesJCheckBoxMenuItem.setText("Zeige Untertitel");
        showSubtitlesJCheckBoxMenuItem.setEnabled(false);
        viewJMenu.add(showSubtitlesJCheckBoxMenuItem);

        decreaseSubtitleSizeJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        decreaseSubtitleSizeJMenuItem.setText("Verringere Untertitelgröße");
        decreaseSubtitleSizeJMenuItem.setEnabled(false);
        viewJMenu.add(decreaseSubtitleSizeJMenuItem);

        increaseSubtitleSizeJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        increaseSubtitleSizeJMenuItem.setText("Erhöhe Untertitelgröße");
        increaseSubtitleSizeJMenuItem.setEnabled(false);
        viewJMenu.add(increaseSubtitleSizeJMenuItem);

        decreaseSubtitleDisplayDurationJMenuItem.setText("Verringere die Untertitel-Anzeigedauer");
        decreaseSubtitleDisplayDurationJMenuItem.setEnabled(false);
        viewJMenu.add(decreaseSubtitleDisplayDurationJMenuItem);

        increaseSubtitleDisplayDurationJMenuItem.setText("Erhöhe die Untertitel-Anzeigedauer");
        increaseSubtitleDisplayDurationJMenuItem.setEnabled(false);
        viewJMenu.add(increaseSubtitleDisplayDurationJMenuItem);

        changePerspectiveJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        changePerspectiveJMenuItem.setText("Blickwinkel wechseln");
        changePerspectiveJMenuItem.setEnabled(false);
        viewJMenu.add(changePerspectiveJMenuItem);

        controlElementsJCheckBoxMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        controlElementsJCheckBoxMenuItem.setSelected(true);
        controlElementsJCheckBoxMenuItem.setText("Bedienelemente");
        controlElementsJCheckBoxMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                controlElementsJCheckBoxMenuItemItemStateChanged(evt);
            }
        });
        viewJMenu.add(controlElementsJCheckBoxMenuItem);

        videoImageAdjustmentJMenuItem.setText("Videobildanpassung");
        videoImageAdjustmentJMenuItem.setEnabled(false);
        viewJMenu.add(videoImageAdjustmentJMenuItem);

        jMenuBar1.add(viewJMenu);

        helpJMenu.setText("Hilfe");

        infoJMenuItem.setText("Info");
        helpJMenu.add(infoJMenuItem);

        jMenuBar1.add(helpJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(musicInfoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playlistJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playlistButtonsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musicInfoJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playlistJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playlistButtonsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("Mplayer under Java");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFolderJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openFolderJMenuItemActionPerformed

    private void openPlaceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPlaceMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openPlaceMenuItemActionPerformed

    private void closeJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeJMenuItemActionPerformed

    private void playbackAllJCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbackAllJCheckBoxMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playbackAllJCheckBoxMenuItemActionPerformed

    private void mediaInformationJCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaInformationJCheckBoxMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaInformationJCheckBoxMenuItemActionPerformed

    private void fullscreenJCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullscreenJCheckBoxMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullscreenJCheckBoxMenuItemActionPerformed

    private void doubleViewJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleViewJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doubleViewJMenuItemActionPerformed

    private void halfLargerViewJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfLargerViewJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_halfLargerViewJMenuItemActionPerformed

    private void volumeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeJButtonActionPerformed
        volumeJButton.setVisible(false);
        volumeJSlider.setVisible(true);
    }//GEN-LAST:event_volumeJButtonActionPerformed

    private void openJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openJMenuItemActionPerformed
        int returnVal = fc.showOpenDialog(BenzaitenGUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File file = fc.getSelectedFile();

            this.setTitle("Benzaiten - " + file.getName());
            mplayer.open(file.getAbsolutePath());
            mplayer.play();
            playPauseJButton.setText("||");

            rewindJButton.setEnabled(true);
            stopPlayingJButton.setEnabled(true);
            fastForwardJButton.setEnabled(true);
            playbackJSlider.setEnabled(true);

            musicInfoJPanel.setVisible(true);
            pack();

        }
    }//GEN-LAST:event_openJMenuItemActionPerformed

    private void rewindJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindJButtonActionPerformed
        if (mplayer.getStatus() == MusicPlayer.PLAYING) {
            mplayer.rewind();
        } else {
            rewindJButton.setEnabled(false);
        }
    }//GEN-LAST:event_rewindJButtonActionPerformed

    private void playPauseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPauseJButtonActionPerformed
        switch (mplayer.getStatus()) {
            case MusicPlayer.PAUSED:
                mplayer.resume();
                playPauseJButton.setText("||");
                break;
            case MusicPlayer.PLAYING:
                mplayer.pause();
                playPauseJButton.setText("►");
                break;
            case MusicPlayer.STOPPED:
                mplayer.play();
        }
    }//GEN-LAST:event_playPauseJButtonActionPerformed

    private void controlElementsJCheckBoxMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_controlElementsJCheckBoxMenuItemItemStateChanged
        if (controlsJPanel.isVisible()) {
            controlsJPanel.setVisible(false);
            pack();
        } else {
            controlsJPanel.setVisible(true);
            pack();
        }
    }//GEN-LAST:event_controlElementsJCheckBoxMenuItemItemStateChanged

    private void volumeJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeJSliderStateChanged
        JSlider source = (JSlider) evt.getSource();

        if (!source.getValueIsAdjusting()) {
            mplayer.setGain(source.getValue());
        }
    }//GEN-LAST:event_volumeJSliderStateChanged

    private void volumeJSliderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeJSliderMouseExited
        volumeJSlider.setVisible(false);
        volumeJButton.setVisible(true);
    }//GEN-LAST:event_volumeJSliderMouseExited

    private void stopPlayingJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopPlayingJButtonActionPerformed
        mplayer.stop();
    }//GEN-LAST:event_stopPlayingJButtonActionPerformed

    private void fastForwardJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastForwardJButtonActionPerformed
        if (mplayer.getStatus() == MusicPlayer.PLAYING) {
            mplayer.fastForward();
        } else {
            fastForwardJButton.setEnabled(false);
        }
    }//GEN-LAST:event_fastForwardJButtonActionPerformed

    private void playbackJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_playbackJSliderStateChanged
        JSlider source = (JSlider) evt.getSource();

        if (!source.getValueIsAdjusting() && mplayer.getStatus() == MusicPlayer.PAUSED) {
            int position = (int) source.getValue();
            mplayer.seek(position);
        }

    }//GEN-LAST:event_playbackJSliderStateChanged

    private void playbackJSliderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbackJSliderMousePressed
        mplayer.pause();
    }//GEN-LAST:event_playbackJSliderMousePressed

    private void playbackJSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbackJSliderMouseReleased
        mplayer.resume();
    }//GEN-LAST:event_playbackJSliderMouseReleased

    private void playlistJCheckBoxMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_playlistJCheckBoxMenuItemItemStateChanged
        if (!playlistJScrollPane.isVisible()) {
            playlistJScrollPane.setVisible(true);
            pack();
        } else {
            playlistJScrollPane.setVisible(false);
            pack();
        }
    }//GEN-LAST:event_playlistJCheckBoxMenuItemItemStateChanged

    private void closePlaylistJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closePlaylistJButtonActionPerformed
        playlistJScrollPane.setVisible(false);
        pack();
    }//GEN-LAST:event_closePlaylistJButtonActionPerformed
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
            java.util.logging.Logger.getLogger(BenzaitenGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BenzaitenGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BenzaitenGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BenzaitenGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BenzaitenGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTitleFromFolderToPlaylistJButton;
    private javax.swing.JButton addTitleToPlaylistJButton;
    private javax.swing.JLabel albumJLabel;
    private javax.swing.JLabel artistJlabel;
    private javax.swing.JMenu aspectRatioJMenu;
    private javax.swing.JMenuItem changePerspectiveJMenuItem;
    private javax.swing.JMenuItem closeJMenuItem;
    private javax.swing.JButton closePlaylistJButton;
    private javax.swing.JCheckBoxMenuItem controlElementsJCheckBoxMenuItem;
    private javax.swing.JPanel controlsJPanel;
    private javax.swing.JMenu dateiJMenu;
    private javax.swing.JMenuItem decreaseSubtitleDisplayDurationJMenuItem;
    private javax.swing.JMenuItem decreaseSubtitleSizeJMenuItem;
    private javax.swing.JCheckBoxMenuItem detailsJCheckBoxMenuItem;
    private javax.swing.JMenu discJMenu;
    private javax.swing.JMenuItem doubleViewJMenuItem;
    private javax.swing.JMenu editJMenu;
    private javax.swing.JButton erasePlaylistJButton;
    private javax.swing.JButton fastForwardJButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBoxMenuItem fullscreenJCheckBoxMenuItem;
    private javax.swing.JMenuItem halfLargerViewJMenuItem;
    private javax.swing.JMenuItem halfViewJMenuItem;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JMenuItem increaseSubtitleDisplayDurationJMenuItem;
    private javax.swing.JMenuItem increaseSubtitleSizeJMenuItem;
    private javax.swing.JMenuItem infoJMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton loopListJButton;
    private javax.swing.JCheckBoxMenuItem mediaInformationJCheckBoxMenuItem;
    private javax.swing.JButton moveTitleDownJbutton;
    private javax.swing.JButton moveTitleUpJButton;
    private javax.swing.JPanel musicInfoJPanel;
    private javax.swing.JMenuItem normalViewJMenuItem;
    private javax.swing.JMenuItem openAudioCDJMenuItem;
    private javax.swing.JMenuItem openDVDFolderJMenuItem;
    private javax.swing.JMenuItem openDVDJMenuItem;
    private javax.swing.JMenuItem openDVDisoJMenuItem;
    private javax.swing.JMenuItem openFolderJMenuItem;
    private javax.swing.JMenuItem openJMenuItem;
    private javax.swing.JMenu openLastPlaybackJMenu;
    private javax.swing.JMenuItem openPlaceMenuItem;
    private javax.swing.JButton openPlaylistJButton;
    private javax.swing.JMenuItem openTVanalogJMenuItem;
    private javax.swing.JMenuItem openTVdigitalJMenuItem;
    private javax.swing.JMenuItem openVCDJMenuItem;
    private javax.swing.JButton playPauseJButton;
    private javax.swing.JCheckBoxMenuItem playbackAllJCheckBoxMenuItem;
    private javax.swing.JSlider playbackJSlider;
    private javax.swing.JPanel playlistButtonsJPanel;
    private javax.swing.JCheckBoxMenuItem playlistJCheckBoxMenuItem;
    private javax.swing.JScrollPane playlistJScrollPane;
    private javax.swing.JMenuItem preferencesJMenuItem;
    private javax.swing.JCheckBoxMenuItem randomPlaybackJCheckBoxMenuItem;
    private javax.swing.JButton removeTitleFromPlaylistJButton;
    private javax.swing.JButton rewindJButton;
    private javax.swing.JButton savePlaylistJButton;
    private javax.swing.JMenuItem setAudioJMenuItem;
    private javax.swing.JMenuItem setSubtitletrackJMenuItem;
    private javax.swing.JCheckBoxMenuItem showSubtitlesJCheckBoxMenuItem;
    private javax.swing.JButton shuffleListJButton;
    private javax.swing.JLabel songTitleJLabel;
    private javax.swing.JCheckBoxMenuItem spectrumAnalyzerJCheckBoxMenuItem;
    private javax.swing.JMenu standardAudioLanguageJMenu;
    private javax.swing.JMenuItem standardSubtitleLanguageJMenuItem;
    private javax.swing.JButton stopPlayingJButton;
    private javax.swing.JMenuItem takeSnapshotJMenuItem;
    private javax.swing.JMenu tvJMenu;
    private javax.swing.JButton unsortedListJButton;
    private javax.swing.JMenuItem videoImageAdjustmentJMenuItem;
    private javax.swing.JMenu viewJMenu;
    private javax.swing.JButton volumeJButton;
    private javax.swing.JSlider volumeJSlider;
    // End of variables declaration//GEN-END:variables
}
