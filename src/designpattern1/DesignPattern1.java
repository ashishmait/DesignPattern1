/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designpattern1;

/**
 *
 * @author ashagg
 */
public class DesignPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MallardDuck duckObj = new MallardDuck();
        Bird birdObj = new Bird();
        
        BirdAdapterToDuck adapter = new BirdAdapterToDuck(birdObj);
        quackable quackInterface;
        //duckObj.tellMeYourName();
        quackInterface = duckObj;
        quackInterface.quack();
        
        quackInterface = adapter;
        quackInterface.quack();
    }
    
}
