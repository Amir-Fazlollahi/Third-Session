/**
 * Class Song stores the name, producer and date of release of a
 * song
 */
public class Song {
private String fileName;
private String releaseDate;
private String producer;
/**
 * Constructor creates an object of the class and instanciates its fields
 * @param fileName name of the file
 * @param releaseDate date of the issue of the recording
 * @param producer the producer's name
 */
public Song(String fileName, String releaseDate, String producer) {
        this.fileName = fileName;
        this.releaseDate = releaseDate;
        this.producer = producer;
        }
/**
 * @return String name of the file
 */
public String getFileName() {
        return fileName;
        }
/**
 * @return String release date
 */
public String getReleaseDate() {
        return releaseDate;
        }
/**
 * @return String producer's name
 */
public String getProducer() {
        return producer;
        }
        }