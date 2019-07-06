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
public class Cat extends Pet {
    private boolean ishunter;
    public Cat(boolean h,String id, String name, String haircolor){
        this.ishunter=h;
        super.hairColor=haircolor;
        super.id=id;
        super.name=name;
    }
    public boolean isIshunter() {
        return this.ishunter;
    }


    
    @Override
    public String sound() {
        return "miau";
    }
    
}
