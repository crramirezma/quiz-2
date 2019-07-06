/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc 1
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vet veterinaria;
        File text=new File("pets.txt");
        Scanner read;
        ArrayList<Person>person=new ArrayList<>();
        int h=0;
        String clase=null;
        String id=null;
        String nombre=null;
        String haircolor=null;
        String named=null;
        String idd=null;
        double jijo=0;
        String hola=null;
        boolean chao;
        Person persona=null;
        
        Pet pet=null;

        try {
            veterinaria=new Vet();

            read=new Scanner(text);
                          
            while(read.hasNext()){
                switch(h%7){
                    case 0:
                        clase=read.next();
                        break;
                    case 1:
                        id=read.next();
                        break;
                    case 2:
                        nombre=read.next();
                        break;
                    case 3:
                        haircolor=read.next();
                        break;
                    case 4:
                        if(clase.equals("Dog")){
                            hola=read.next();
                            pet=new Dog(hola,id,nombre,haircolor);
                        }
                        else if(clase.equals("Cat")){
                            if(read.next().equals("true")){
                                chao=true;
                                
                            }else{
                                chao=false;
                                pet=new Cat(chao,id,nombre,haircolor);
                            }
                        }else if(clase.equals("Hamster")){
                            jijo=Double.parseDouble(read.next());
                            pet=new Hamster(jijo,id,nombre,haircolor);
                        }
                        break;
                    case 5:
                        named=read.next();
                        break;
                    case 6:
                        idd=read.next();
                        boolean j=true;
                        if(person.size()!=0){
                            for(int i=0;i<person.size();i++){
                                if(person.get(i)!=null){
                                    if(person.get(i).getName().equals(named)){
                                        person.get(i).getPets().add(pet);
                                        j=false;
                                    }else if(i==person.size()){
                                        persona=new Person(named,id);
                                        person.add(persona);
                                        person.get(i+1).getPets().add(pet);
                                    }
                                }else{
                                    if(person.get(i).getName().equals(named)){
                                        person.get(i).getPets().add(pet);
                                        j=false;
                                    }else if(i==person.size()){
                                        persona=new Person(named,id);
                                        person.add(persona);
                                        person.get(i+1).getPets().add(pet);
                                    }
                                }
                            }
                        }else{
                            persona=new Person(named,id);
                            person.add(persona);
                            person.get(0).getPets().add(pet);
                        }
                        
                       
                        break;
                    default:
                        System.out.println("error");
                }
                
            h++;    
            }
            System.out.println(person.size());
            for(int i=0;i<person.size();i++){
                
                System.out.println(person.get(i).getName());
            }
            
                
            
            
            
            
            
            
            //aqui estan las pruebas que hice
            
            /*
            try {
            File pets=new File("pets.txt");
            Scanner text=new Scanner(pets);
            File tries=new File("tries.txt");
            if(!tries.exists()){
            
            System.out.println(tries.createNewFile());
            }
            Scanner trie=new Scanner(tries);
            PrintStream imp=new PrintStream(tries);
            text.useDelimiter(" ");
            while(text.hasNext()){
            imp.println(text.next());
            }
            
            } catch (FileNotFoundException ex) {
            System.out.println("hola");
            } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo");
            }*/
        } catch (FileNotFoundException ex) {
            System.out.println("hubo un error");
        }
        
    }
    
    public void readPets(){
        
    };
    
    public void manageVet(){
        
    }
    
}
