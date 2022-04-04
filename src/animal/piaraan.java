/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ACER
 */
public class piaraan implements Animal {
    String nama;
    String tipe;
    String sound;
    
    public piaraan (String nama, String tipe, String sound){
        this.nama = nama;
        this.tipe = tipe;
        this.sound = sound;
    }
    
    @Override
    public String getName(){
        return this.nama;
    }
    @Override
    public String getType(){
        return this.tipe;
    }
    @Override
    public void makeSound(){
        System.out.println(this.sound);
    }
    
     public void printAnimal(Animal animal){
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");
        animal.makeSound();
    }
}
