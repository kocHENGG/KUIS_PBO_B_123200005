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
public class jenishewan {
    public static void main(String[] args) {
        piaraan animal1 = new piaraan ("dog", "anjing", "gukguk");
        piaraan animal2 = new piaraan("bird", "burung", "citcitcit");
        piaraan animal3 = new piaraan("goat", "kambing", "mbeeekk");
        
        animal1.printAnimal(animal1); 
        animal2.printAnimal(animal2); 
        animal3.printAnimal(animal3);
    }
    
}
