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
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
 
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;;
    private List<Integer> averageTemperatures;
 
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.averageTemperatures = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return averageTemperatures;
    }
    
     @Override
    public boolean isOn() {
        for(int i = 0; i < sensors.size(); i++) {
            if (sensors.get(i).isOn() == false) {
                return false;
            }
        }
        return true;
    }
 
    @Override
    public void setOn() {
        for(int i = 0; i < sensors.size(); i++) {
            sensors.get(i).setOn();
        }
 
    }
 
    @Override
    public void setOff() {
        for(int i = 0; i < sensors.size(); i++) {
            sensors.get(i).setOff();
        }
    }
 
    @Override
    public int read() {
        if (this.isOn() == false) {
            throw new IllegalStateException("This method cannot be called while the sensor is off or if no sensors have been added.");
        }
        
        Iterator<Sensor> iterator = sensors.iterator();
        int newTemperature = 0;
        int sum = 0;
        
        while(iterator.hasNext()) {
            newTemperature = iterator.next().read();
            sum = sum + newTemperature;
        }
        averageTemperatures.add(sum/sensors.size());
        return sum / sensors.size();
    }
}
 