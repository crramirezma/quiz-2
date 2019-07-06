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
public class Hamster extends Pet {
    private double weight;
    public Hamster(double h,String id, String name, String haircolor){
        this.weight=h;
        super.hairColor=haircolor;
        super.id=id;
        super.name=name;
    }

    public double getWeight() {
        return weight;
    }
    
    
    @Override
    public String sound() {
        return "";
    }
    
}
