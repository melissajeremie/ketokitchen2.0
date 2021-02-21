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
    private String ingredient09;

    @Column
    private String ingredient010;

    @Column
    private String ingredient011;

    @Column
    private String ingredient012;

    @Column
    private String ingredient013;

    @Column
    private String ingredient014;

    @Column
    private String ingredient015;

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

    public String getIngredient09() {
        return ingredient09;
    }

    public void setIngredient09(String ingredient09) {
        this.ingredient09 = ingredient09;
    }

    public String getIngredient010() {
        return ingredient010;
    }

    public void setIngredient010(String ingredient010) {
        this.ingredient010 = ingredient010;
    }

    public String getIngredient011() {
        return ingredient011;
    }

    public void setIngredient011(String ingredient011) {
        this.ingredient011 = ingredient011;
    }

    public String getIngredient012() {
        return ingredient012;
    }

    public void setIngredient012(String ingredient012) {
        this.ingredient012 = ingredient012;
    }

    public String getIngredient013() {
        return ingredient013;
    }

    public void setIngredient013(String ingredient013) {
        this.ingredient013 = ingredient013;
    }

    public String getIngredient014() {
        return ingredient014;
    }

    public void setIngredient014(String ingredient014) {
        this.ingredient014 = ingredient014;
    }

    public String getIngredient015() {
        return ingredient015;
    }

    public void setIngredient015(String ingredient015) {
        this.ingredient015 = ingredient015;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }
}
