

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael K�lling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }


    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param song The file to be played.
     */
    public void startPlaying(Song song)
    {
        System.out.println(song.getFileName() + " is playing..." + " Release Date: " +
                song.getReleaseDate() + " Producer: " + song.getProducer());
        isPlaying = true;
    }

    public void stop()
    {
        System.out.println("player is stopped!");
        isPlaying = false;
    }



}