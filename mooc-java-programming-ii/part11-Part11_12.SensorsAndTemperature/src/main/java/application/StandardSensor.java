/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author salma
 */
public class StandardSensor implements Sensor {

    private int nmb;

    public StandardSensor(int nmb) {
        this.nmb = nmb;
    }

    @Override
    public boolean isOn() {
        return true; // always on
    }

    @Override
    public void setOn() {
        return; // always on
    }

    @Override
    public void setOff() {
        return;// always on
    }

    @Override
    public int read() {
        return this.nmb;
    }

}
