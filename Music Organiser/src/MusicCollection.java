import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Song> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param piece The file to be added.
     */
    public void addFile(Song piece) {
        files.add(piece);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        System.out.println("File name: " + files.get(index).getFileName() + ", Release Date: " +
                files.get(index).getReleaseDate() + ", Producer: " + files.get(index).getProducer());
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (int i = 0; i < files.size(); ++i) {
            listFile(i);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if(validIndex(index))
            files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if(validIndex(index))
            player.startPlaying(files.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        return index >= 0 && index < files.size();
    }
    /**
     * Adds a song to the favourites collection created as a
     * collection outside the class
     * @param favourites the favourites music collection
     * @param index the index of the song in the currect list
     */
    public void addToFavourites(MusicCollection favourites, int index) {
        if(validIndex(index))
            favourites.addFile(files.get(index));
    }
    /**
     * Searches a key among the files's names and producers and illustrates the results
     * @param key key to be searched for
     */
    public void search(String key) {
        int size = files.size(); // size of the collection
        int searchResults = 0; // the number of the search results
        for (int i = 0; i < size; ++i) {
            if(files.get(i).getFileName().contains(key) || files.get(i).getProducer().contains(key)) {
                listFile(i);
                ++searchResults;
            }
        }
        if(searchResults == 0) System.out.println("No file found!");
    }
}