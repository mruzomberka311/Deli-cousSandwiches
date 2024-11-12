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
                break;
            case "medium":
                return 2.50;
                break;
            case "large":
                return 3.00;
                break;
            default:
                System.out.println("Not a valid drink size");
                break;
        }

   }

    public String getSize()
    {
        return size;
    }

    public String getFlavor()
    {
        return flavor;
    }
}
