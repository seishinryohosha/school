package de.seishinryohosha.benzaiten;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.*;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javazoom.jlgui.basicplayer.*;
//import org.tritonus.share.sampled.TAudioFormat;
import org.tritonus.share.sampled.file.TAudioFileFormat;

/**
 * MusicPlayer bietet grundlegende Funktionalität zum Abspielen von
 * Musikdateien.
 *
 * Im Wesentlichen ist MusicPlayer eine Wrapper-Klasse für BasicPlayer von
 * javazoom.com, um die Benutzung dieser Klassen zu vereinfachen. Wer n�heres
 * wissen will, kann sich den Quelltext der Datei anschauen. Wer den Code
 * komplett versteht, kann sich in Informatik erst mal zur�ck lehnen ;-)
 *
 * @author Thomas Karp
 */
public class MusicPlayer {

    public static final int PAUSED = SimplePlayer.PAUSED;
    public static final int PLAYING = SimplePlayer.PLAYING;
    public static final int STOPPED = SimplePlayer.STOPPED;
    public static final int OPENED = SimplePlayer.OPENED;
    public static final int SEEKING = SimplePlayer.SEEKING;
    public static final int UNKNOWN = SimplePlayer.UNKNOWN;
    // Delegation-Muster, um einige Methoden zu verbergen.
    private SimplePlayer player;
    /**
     * Angemeldete Listener
     */
    private ArrayList<MusicPlayerListener> listeners;
    /**
     * Position des Audiomaterials in der Datei
     */
    private int startPos;

    /**
     * Erzeugt einen neuen MusicPlayer.
     */
    public MusicPlayer() {
        player = new SimplePlayer();
        player.addBasicPlayerListener(player);
        listeners = new ArrayList<MusicPlayerListener>();
    }

    /**
     * Gibt den aktuellen Status des MusicPlayers zur�ck (siehe Konstanten)
     *
     * @return Status des MusicPlayer
     */
    public int getStatus() {
        return player.getStatus();
    }

    /**
     * Gibt prozentuale Position zur�ck.
     *
     * @return Aktuelle Position in Prozent.
     */
    public int getPositionInPercent() {
        int audioLength = player.getLength() - startPos;
        int audioPos = player.getPosition() - startPos;
        double fraq = audioPos * 100 / audioLength;
        return (int) fraq;
    }

    /**
     * �ffnet eine Datei �ber ihren Dateinamen.
     *
     * @param filename Name der Datei
     * @return true, falls das �ffnen erfolgreich war, ansonsten false
     */
    public boolean open(String filename) {
        try {
            player.open(new File(filename));
            startPos = player.getPosition();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Spielt den aktuellen Song ab. Falls dieser schon abgespielt wird,
     * passiert nichts.
     */
    public void play() {
        try {
            player.play();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Beendet das Abspielen des aktuellen Songs.
     */
    public void stop() {
        try {
            player.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Pausiert das Abspielen des aktuellen Songs.
     */
    public void pause() {
        try {
            player.pause();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Setzt das Abspielen nach dem Pausieren fort.
     */
    public void resume() {
        try {
            player.resume();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Setzt die Lautst�rke im Intervall von 0..100
     *
     * @param gain Neue Lautst�rke
     */
    public void setGain(int gain) {
        try {
            player.setGain((double) gain / 100.0);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Spult den Song etwas vor.
     */
    public void fastForward() {
        fastForward(5);
    }

    /**
     * Spult den Song vor.
     *
     * @param amount Prozentualer Sprung.
     */
    public void fastForward(int amount) {
        this.seek(this.getPositionInPercent() + amount);
    }

    /**
     * Spult den Song etwas zur�ck.
     */
    public void rewind() {
        rewind(5);
    }

    /**
     * Spult den Song zur�ck.
     *
     * @param amount Prozentualer Sprung.
     */
    public void rewind(int amount) {
        this.seek(this.getPositionInPercent() - amount);
    }

    /**
     * Setzt die aktuelle Position des Songs.
     *
     * @param pos Prozentualle Position
     */
    public void seek(int pos) {
        try {
            player.seek(pos * (player.getLength() / 100));
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * F�gt neuen Listener hinzu. Alle Listener werden �ber die Schnittstelle
     * "MusicPlayerListener" �ber entsprechende Ereignisse benachrichtigt.
     *
     * @param listener Objekt, das �ber Ver�nderungen benachrichtigt werden
     * soll.
     */
    public void addListener(MusicPlayerListener listener) {
        listeners.add(listener);
    }

    /**
     * Entfernt Listener.
     *
     * @param listener Zu entfernender Listener
     */
    public void removeListener(MusicPlayerListener listener) {
        listeners.remove(listener);
    }

    // Added bei seishinryohosha START
    public String getTitle(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);

            // TAudioFileFormat properties
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "title";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getArtist(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);

            // TAudioFileFormat properties
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "author";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getAlbum(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);
            AudioFormat baseFormat = baseFileFormat.getFormat();

            // TAudioFileFormat properties
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "album";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getAudioFormat(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);
            AudioFormat baseFormat = baseFileFormat.getFormat();
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "mp3.version.encoding";
                String val = (String) properties.get(key);

                return "85"; // Not correct of course!
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getAudioCodec(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);
            AudioFormat baseFormat = baseFileFormat.getFormat();
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "mp3.version.encoding";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getAudioChannels(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);
            AudioFormat baseFormat = baseFileFormat.getFormat();
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "mp3.channels";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getAudioBitrate(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);
            AudioFormat baseFormat = baseFileFormat.getFormat();
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "mp3.bitrate.nominal.bps";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public String getSampleRate(File filename) {
        try {
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(filename);
            AudioFormat baseFormat = baseFileFormat.getFormat();
            if (baseFileFormat instanceof TAudioFileFormat) {
                Map properties = ((TAudioFileFormat) baseFileFormat).properties();
                String key = "mp3.frequency.hz";
                String val = (String) properties.get(key);

                return val;
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    // Added by seishinryohosha END
    // Als innere Klasse eine Unterklasse von BasicPlayer, um Klasse unsichtbar zu machen nach au�en.
    private class SimplePlayer extends BasicPlayer implements BasicPlayerListener {

        public int getLength() {
            return super.encodedLength;
        }

        public int getPosition() {
            return super.getEncodedStreamPosition();
        }

        @Override
        public void opened(Object arg0, Map arg1) {
        }

        @Override
        public void progress(int arg0, long arg1, byte[] arg2, Map arg3) {
            for (MusicPlayerListener listener : listeners) {
                listener.positionChanged(getPositionInPercent());
            }
        }

        @Override
        public void stateUpdated(BasicPlayerEvent arg0) {
        }

        @Override
        public void setController(BasicController arg0) {
        }
    }
}
