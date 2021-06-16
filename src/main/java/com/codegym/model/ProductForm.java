package com.codegym.model;
import org.springframework.web.multipart.MultipartFile;
public class ProductForm {
    private String name;
    private String description;
    private MultipartFile image;
    private int id;

    public ProductForm(String name, String description, MultipartFile image, int id) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.id = id;
    }
    public ProductForm(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
