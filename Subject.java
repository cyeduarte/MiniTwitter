/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

/**
 *
 * @author chris
 */
public interface Subject {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notified();
}
