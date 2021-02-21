package com.example.server.model;


import javax.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String netCarbs;

    @Column
    private String image;

    @Column(nullable = false)
    private String ingredient01;

    @Column
    private String ingredient02;

    @Column
    private String ingredient03;

    @Column
    private String ingredient04;

    @Column
    private String ingredient05;

    @Column
    private String ingredient06;

    @Column
    private String ingredient07;

    @Column
    private String ingredient08;

    @Column
    private String sourceLink;

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNetCarbs() {
        return netCarbs;
    }

    public void setNetCarbs(String netCarbs) {
        this.netCarbs = netCarbs;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIngredient01() {
        return ingredient01;
    }

    public void setIngredient01(String ingredient01) {
        this.ingredient01 = ingredient01;
    }

    public String getIngredient02() {
        return ingredient02;
    }

    public void setIngredient02(String ingredient02) {
        this.ingredient02 = ingredient02;
    }

    public String getIngredient03() {
        return ingredient03;
    }

    public void setIngredient03(String ingredient03) {
        this.ingredient03 = ingredient03;
    }

    public String getIngredient04() {
        return ingredient04;
    }

    public void setIngredient04(String ingredient04) {
        this.ingredient04 = ingredient04;
    }

    public String getIngredient05() {
        return ingredient05;
    }

    public void setIngredient05(String ingredient05) {
        this.ingredient05 = ingredient05;
    }

    public String getIngredient06() {
        return ingredient06;
    }

    public void setIngredient06(String ingredient06) {
        this.ingredient06 = ingredient06;
    }

    public String getIngredient07() {
        return ingredient07;
    }

    public void setIngredient07(String ingredient07) {
        this.ingredient07 = ingredient07;
    }

    public String getIngredient08() {
        return ingredient08;
    }

    public void setIngredient08(String ingredient08) {
        this.ingredient08 = ingredient08;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }
}
