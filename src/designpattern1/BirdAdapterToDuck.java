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
public class BirdAdapterToDuck implements quackable{
    
    private Bird b;
    public BirdAdapterToDuck(Bird b)
    {
        this.b = b;
    }
    public void quack()
    {
        System.out.println("bird is now quacking");
        b.chirp();
    }
}
