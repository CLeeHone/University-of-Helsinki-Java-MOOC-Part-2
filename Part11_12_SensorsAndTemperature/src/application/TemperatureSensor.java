/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
 
/**
 *
 * @author chloe
 */
import java.util.Random;
 
public class TemperatureSensor implements Sensor {
    private boolean sensorSetting;
    
    public TemperatureSensor() {
 
    }
 
    @Override
    public boolean isOn() {
        return sensorSetting;
    }
 
    @Override
    public void setOn() {
        sensorSetting = true;
    }
 
    @Override
    public void setOff() {
        sensorSetting = false;
    }
 
    @Override
    public int read() {
 
        if (this.isOn()) {
            int firstNumber = new Random().nextInt(31);
            int secondNumber = new Random().nextInt(61);
 
            while (true) {
                if (firstNumber - secondNumber < -30) {
                    secondNumber = new Random().nextInt(61);
                } else {
                    return firstNumber - secondNumber;
                }
            }
        } else {
            throw new IllegalStateException("Impossible. The sensor is off");
        }
    }
}