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
public interface Visitor {
    public void visit(User user);
    public void visit(Group group);
    public void visit(String newsfeed);
}
