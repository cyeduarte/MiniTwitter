/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.util.ArrayList;
/**
 *
 * @author chris
 */
public class Group {
    
    private String groupName;
    private ArrayList<User> group;
    
    public Group(String groupName){
        setGroupName(groupName);
    }
    
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    
    public String groupName(){
        return groupName;
    }
    
    public void join(User user){
        group.add(user);
    }
    
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
}
