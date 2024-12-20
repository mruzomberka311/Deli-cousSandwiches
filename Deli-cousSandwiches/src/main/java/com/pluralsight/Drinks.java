package com.pluralsight;

public class Drinks
{
    private String size;
    private String flavor;


    public Drinks(String size, String flavor)
    {
        this.size = size;
        this.flavor = flavor;
    }

   public double getPrice(String size)
   {
        switch (getSize().toLowerCase()){
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default:
                System.out.println("Not a valid drink size");
                break;
        }
            return 0;
   }

    public String getSize()
    {
        return size;
    }

    public String getFlavor()
    {
        return flavor;
    }


    public String toString(){
        return size + " ," + flavor + "............... $" + getPrice(size);
    }
}