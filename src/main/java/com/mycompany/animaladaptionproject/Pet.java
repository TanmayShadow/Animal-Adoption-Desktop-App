/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaladaptionproject;

/**
 *
 * @author Tanmay
 */
public class Pet {
    int id;
    String name;
    String dob;
    String gender;
    String pClass;
    String breed;
    String color;
    String owner_phone;
    String status;
    String medicalInfo;
    
    public Pet(){}
    public Pet(int id, String name, String dob, String gender, String pClass, String breed, String color, String owner_phone,
            String status, String medicalInfo)
    {
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.pClass=pClass;
        this.breed=breed;
        this.color=color;
        this.owner_phone=owner_phone;
        this.status=status;
        this.medicalInfo=medicalInfo;
    }
    
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public String getDOB(){return this.dob;}
    public String getGender(){return this.gender;}
    public String getPClass(){return this.pClass;}
    public String getBreed(){return this.breed;}
    public String getColor(){return this.color;}
    public String getOwner_phone(){return this.owner_phone;}
    public String getStatus(){return this.status;}
    public String getMedicalInfo(){return this.medicalInfo;}

    
}
