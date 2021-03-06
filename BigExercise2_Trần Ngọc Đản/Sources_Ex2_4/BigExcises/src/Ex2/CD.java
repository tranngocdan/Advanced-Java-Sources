package Ex2;

import java.io.Serializable;

/**
 * @author Tran Ngoc Dan
 * @since 19/09/2016
 * @version 1.0
 */
public class CD implements Serializable {

    /**
     * the serialVersionUID is used to deserialize your class. it is
     * auto-generated by default. but changing anything in your class would
     * generate a different serialVersionUID and you cannot deserialise "old"
     * objects. so you define your own serialVersionUID to help deserialisation
     * find the right class.
     */
    private static final long serialVersionUID = 6106269076155338045L;

    /**
     * id of CD.
     */
    private int id;
    /**
     * name of CD.
     */
    private String name;
    /**
     * a singer singe all of songs in CD.
     */
    private String singer;
    /**
     * number of songs in CD.
     */
    private int numberOfSongs;
    /**
     * price of this CD.
     */
    private double price;

    /**
     * constructor.
     *
     * @param id
     * @param name
     * @param singer
     * @param numberOfSongs
     * @param price
     */
    public CD(int id, String name, String singer, int numberOfSongs, double price) {

        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numberOfSongs = numberOfSongs;
        this.price = price;
    }

    /**
     * constructor.
     */
    public CD() {
    }

    /**
     * set id of CD.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * set name of CD.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set singer's name sings songs in CD.
     *
     * @param singer
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * set number of songs.
     *
     * @param numberOfSongs
     */
    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    /**
     * set price of this CD.
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * get id of CD.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * get CD's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * get singer sings songs in this CD.
     *
     * @return name of singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * get number of songs in CD.
     *
     * @return number of songs
     */
    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    /**
     * get price of CD.
     *
     * @return price of CD
     */
    public double getPrice() {
        return price;
    }

    /**
     * show all of information.
     */
    public void showInfo() {
        System.out.println("[name] " + this.name);
        System.out.println("[singer] " + this.singer);
        System.out.println("[number of songs] " + this.numberOfSongs);
        System.out.println("[price] " + this.price);
        System.out.println("");
    }

}
