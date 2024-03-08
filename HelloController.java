package com.example.test3;

public class HelloController {
    private String name;
    private String pizzasize;
    private Integer numberoftoppings;
    private Integer phone;
    private String totalbill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPizzasize() {
        return pizzasize;
    }

    public void setPizzasize(String pizzasize) {
        this.pizzasize = pizzasize;
    }

    public Integer getNumberoftoppings() {
        return numberoftoppings;
    }

    public void setNumberoftoppings(Integer numberoftoppings) {
        this.numberoftoppings = numberoftoppings;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getTotalbill() {
        return totalbill;
    }

    public void setTotalbill(String totalbill) {
        this.totalbill = totalbill;
    }

    public void HelloController(String name, String pizzasize, Integer numberoftoppings, Integer phone, String totalbill) {
        this.name = name;
        this.pizzasize = pizzasize;
        this.numberoftoppings = numberoftoppings;
        this.phone = phone;
        this.totalbill = totalbill;

    }
}

