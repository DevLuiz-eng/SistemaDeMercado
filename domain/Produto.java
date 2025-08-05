package exercicios.exercicioMercado.domain;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String type;
    private String name;
    private String brand;
    private double price;
    private int quantity;

    public Produto (String name, String type, String brand, double price, int quantity) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Valor inválido.");
            return;
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
