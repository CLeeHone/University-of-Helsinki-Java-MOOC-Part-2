/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.ArrayList;
 
public class Pipe<T> {
 
    private ArrayList<T> pipe;
 
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
 
    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
 
    public T takeFromPipe() {
        T value;
        if (this.pipe.isEmpty()) {
            return null;
        } else {
            value = this.pipe.get(0);
            this.pipe.remove(0);
            return value;
        }
    }
 
    public boolean isInPipe() {
        return (!(this.pipe.isEmpty()));
    }
}
 