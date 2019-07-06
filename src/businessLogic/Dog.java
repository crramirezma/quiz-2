/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author pc 1
 */
public class Dog extends Pet {
    private String breed;
    public Dog(String h,String id, String name, String haircolor){
        this.breed=h;
        super.hairColor=haircolor;
        super.id=id;
        super.name=name;
    }

    public String getBreed() {
        return this.breed;
    }
    
    
    @Override
    public String sound() {
        return "guau";
    }
    
}
