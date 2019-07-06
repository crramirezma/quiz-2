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
public class Vet {
    
    private ArrayList<Pet>pets;
    public Vet(){
        pets=new ArrayList<>();
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    
    
    
    
    
    
    
    public void removePet(Pet p){
        if(pets.remove(p))System.out.println("eliminado satisfactoriamente");
        else
            System.out.println("no se completo la operacion");
    };
    
    public void showPetsByType(String Type){
       
        //for(int i=0;i<pets.size();i++){       if(pets.get(i).getClass()==)}
    }
    
    public void showPets(){
        
    }
}
