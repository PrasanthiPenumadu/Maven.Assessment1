package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    static ArrayList<Pet> pets1 ;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    public PetOwner(String name, Pet... pets) {
        this.name=name;
     //   pets1 = new ArrayList<Pet>(Arrays.asList(pets));
        if (pets != null){
       pets1 = new ArrayList<>(Arrays.asList(pets));
       for(int i=0;i<pets1.size();i++)
        pets1.get(i).setOwner(this);}
       else pets1 = new ArrayList<>();
// pets1 = new ArrayList<>(Arrays.asList(pets));
    }
//PetOwner po=new PetOwner(name,pets1);
    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
       PetOwner.add(pet);
    }

    private static void add(Pet pet) {
        pets1.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

if (pets1.size()>1)  pets1.remove(pet);
else {pets1 = new ArrayList<>();pets1.add(null);}
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pets1.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer min=5;
        for(int i=0;i< pets1.size();i++){
            if(pets1.get(i).getAge()<min)
                min=pets1.get(i).getAge();}
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer max=0;
        for(int i=0;i< pets1.size();i++){
            if(pets1.get(i).getAge()>max)
                max=pets1.get(i).getAge();}
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer sum = 0;
        Float average = Float.valueOf(0);
        for (int i = 0; i < pets1.size(); i++) {
            sum = sum + pets1.get(i).getAge();
            average = Float.valueOf(sum / pets1.size());

        }
        return average;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets1.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        Pet[] pets2 = new Pet[pets1.size()];
        pets2 = pets1.toArray(pets2);


        return pets2;
    }
}
