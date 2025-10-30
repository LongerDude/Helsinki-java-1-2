/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class Hideout<T> {

    private T t;

    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }

    public T takeFromHideout() {
        T removed = t;
        this.t = null;
        return removed;
    }

    public boolean isInHideout() {
        return !(this.t == null);
    }

}
