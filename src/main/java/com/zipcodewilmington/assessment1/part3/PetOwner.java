package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    Pet pets1[];
    private PetOwner petOwner;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    public PetOwner(String name, Pet... pets) {
        this.name=name;
        this.pets1=pets;
    }
//PetOwner po=new PetOwner(name,pets1);
    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
       petOwner.add(pet);
    }

    private static void add(Pet pet) {
     // po.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return true;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets1.length;
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
        return pets1;
    }
}
