package database;

import java.io.*;
import java.sql.SQLOutput;

public class DataBase implements RealEstateInterface {
    //Свойства, которые будут иметь классы (Apartment,Villa,Garage)
    private Integer room_count;
    private Integer floor;
    private Float area;
    private Location location;
    private Offer offer;

    public DataBase(Integer room_count, Integer floor, Float area, Location location, Offer offer) {
        this.room_count = room_count;
        this.floor = floor;
        this.area = area;
        this.location = location;
        this.offer = offer;
    }



    public Integer getRoom_count() {
        return room_count;
    }

    public void setRoom_count(Integer room_count) {
        this.room_count = room_count;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        if(area != 0){
            this.area = area;
        }

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "DataBase" + "\n\troom_count " + room_count + "\n\tfloor " + floor + "\n\tarea " + area + "\n---------------------"+ "\nLocation " + location +"\n---------------------"+ "\nOffer " + offer;
    }
    @Override
    public void toFile(String title,String file_name) {

        try{
            BufferedWriter write = new BufferedWriter(new FileWriter(file_name));
            write.write(String.format("%s\n%s\n%s\n\tArea % .2f" ,title, getLocation(),getOffer(),getArea()));
            write.close();
        }catch (IOException e){
            System.err.println("ERRORE");
        }
    }

    public void fromFile(String file_name){
        try{
            BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream(file_name)));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("ERRORE");
        }
    }
}
