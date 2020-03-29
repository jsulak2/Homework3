package com.homework3.homework3.Models;
import javax.persistence.*;


@Entity
@Table(name = "inventory")
public class Inventory
{
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "productname")
    private String productname;
    @Column(name = "category")
    private String category;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private String price;
    @Column(name = "color")
    private String color;

    public Inventory(){ }

    public Inventory(String id, String productname, String category, String description, String price, String color)
    {
        this.id = id;
        this.productname = productname;
        this.category = category;
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public String getId()
    {
        return id;
    }

    public String getProductname()
    {
        return productname;
    }

    public String getCategory()
    {
        return category;
    }

    public String getDescription()
    {
        return description;
    }

    public String getPrice()
    {
        return price;
    }

    public String getColor()
    {
        return color;
    }
}
