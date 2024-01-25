package egento.cvice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sellers {

    private static String name;
    private static LocalDate birthdate;
    private static int negotiatedContracts;
    private static double numberOfCarrotsSold;
    private static String city;
    private static String spz;
    private static double consPer100Km;
    private static String ipAdress;

    // konstruktor


    public Sellers(String name, LocalDate birthdate, int negotiatedContracts, double numberOfCarrotsSold, String city, String spz, double consPer100Km, String ipAdress) {
        this.name = name;
        this.birthdate = birthdate;
        this.negotiatedContracts = negotiatedContracts;
        this.numberOfCarrotsSold = numberOfCarrotsSold;
        this.city = city;
        this.spz = spz;
        this.consPer100Km = consPer100Km;
        this.ipAdress = ipAdress;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public static int getNegotiatedContracts() {
        return negotiatedContracts;
    }

    public void setNegotiatedContracts(int negotiatedContracts) {
        this.negotiatedContracts = negotiatedContracts;
    }

    public static double getNumberOfCarrotsSold() {
        return numberOfCarrotsSold;
    }

    public void setNumberOfCarrotsSold(double numberOfCarrotsSold) {
        this.numberOfCarrotsSold = numberOfCarrotsSold;
    }

    public static String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public static double getConsPer100Km() {
        return consPer100Km;
    }

    public void setConsPer100Km(double consPer100Km) {
        this.consPer100Km = consPer100Km;
    }

    public static String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }
}
