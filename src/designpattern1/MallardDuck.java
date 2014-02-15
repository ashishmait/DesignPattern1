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
public class MallardDuck extends AbstractDuck implements quackable{
    
    public void tellMeYourName()
    {
        System.out.println("m a mallard duck");
    }
    public void quack()
    {
       System.out.println("quack");
    }
    
}
