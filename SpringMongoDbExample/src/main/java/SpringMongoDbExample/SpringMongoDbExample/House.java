package SpringMongoDbExample.SpringMongoDbExample;

import java.awt.Image;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;


public class House {

    @Id
    public String id;

    public String type;
    public String propertyType;
    public int squareFeet;
    public int rooms;
    public int bathrooms;
    public String address;
    //public HousePictures images;   //Will be array of housePic objects
    public ArrayList<Image> housePics;
    public String garden;
    public int houseValue;
    //public boolean rent;
    
    
    public String password;
    public boolean subscription;
    //public house housesForSale;
    

    public House() {}

    public House(String type, String propertyType, int squareFeet, int rooms, int bathrooms,String address,String garden,int houseValue ) {
        this.type = type;
        this.propertyType = propertyType;
        this.squareFeet=squareFeet;
        this.rooms=rooms;
        this.bathrooms=bathrooms;
        this.address = address;
        this.garden=garden;
        this.houseValue=houseValue;
    }

    @Override
    public String toString() {
        return String.format(
                "House[id=%s, type='%s', propertyType='%s', squareFeet='%s', rooms='%s', bathrooms='%s',address='%s',garden='%s',houseValue='%s']",
                id, type, propertyType, squareFeet, rooms,bathrooms,address,garden,houseValue);
    }

}