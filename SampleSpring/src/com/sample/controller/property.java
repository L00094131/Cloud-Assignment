package com.sample.controller;

import java.awt.Image;

import org.springframework.data.annotation.Id;


public class property {

    @Id
    public String id;
    public String Address1;
    public String Address2;
    public String Address3;
    public String Address4;
    public String postcode;
    public String property_type;
    public String Description;
    public String Features;
    public String BER_Rating;
    public String Asking_Price;
    public Image image_1;
    

    public property() {}

    public property(String add1, String add2 ,String add3, String add4, String pc,
    		String prop_type, String Descrip, String Feat, String BER, String price)
    {
        this.Address1 = add1;
        this.Address2 = add2;
        this.Address3 = add3;
        this.Address4 = add4;
        this.postcode = pc;
        this.property_type = prop_type;
        this.Description = Descrip;
        this.Features = Feat;
        this.BER_Rating = BER;
        this.Asking_Price = price;
    }
    public void setAddressLine1(String add1in)
    {
      Address1 = add1in;
    }
    public void setAddressLine2(String add2in)
    {
      Address2 = add2in;
    }
    public void setAddressLine3(String add3in)
    {
      Address3 = add3in;
    }
    public void setAddressLine4(String add4in)
    {
      Address4 = add4in;
    }
    public void setpostcode(String pcin)
    {
      postcode = pcin;
    }
    public void setPropertyType(String ptin)
    {
      property_type = ptin;
    }
    public void setDescription(String descin)
    {
      Description = descin;
    }
    public void setFeatures(String featin)
    {
      Features = featin;
    }
    public void setBER_Rating(String berin)
    {
      BER_Rating = berin;
    }
    public void setAskingPrice(String pricein)
    {
      Asking_Price = pricein;
    }
    public String getAddress1()
    {
    	return Address1;
    }
    public String getAddress2()
    {
    	return Address2;
    }
    public String getAddress3()
    {
    	return Address3;
    }
    public String getAddress4()
    {
    	return Address4;
    }
    public String getpostcode()
    {
    	return postcode;
    }
    public String getPropertyType()
    {
    	return property_type;
    }
    public String getDescription()
    {
    	return Description;
    }
    public String getFeatures()
    {
    	return Features;
    }
    public String getBER()
    {
    	return BER_Rating;
    }
    public String getAsking_price()
    {
    	return Asking_Price;
    }
   
    @Override
    public String toString() {
        return String.format(
                "Property[id=%s, AddressLine1='%s', AddressLine2='%s', AddressLine3='%s', AddressLine4='%s', postcode='%s', property_type='%s', Description='%s', Features='%s', BER_rating='%s', Asking_Price='%s']",
                id, Address1, Address2, Address3, Address4, postcode, property_type, Description, Features, BER_Rating, Asking_Price);
    }

}