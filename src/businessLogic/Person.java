/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;
import java.util.*;
/**
 *
 * @author pc 1
 */
public class Person {
    private String name;
    private String id;
    private ArrayList<Pet>pets;
    public Person(String name,String id){
        this.name=name;
        this.id=id;
        pets=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    public Boolean addPet(Pet pet){
        return pets.add(pet);
        
    }
    public void showPets(){
        
    }
    
    
}
