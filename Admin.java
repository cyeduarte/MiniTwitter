package minitwitter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

/**
 *
 * @author chris
 */
public class Admin 
{
    private JFrame frame;
    private JTree tree;
    private JTextArea userID, groupID;
    private static Admin admin = null; //Singleton Pattern
    
    private static int countUser, countGroup, countTweets;
    ArrayList<User> userList;
    ArrayList<Group> groupList;
    private HashMap<String, String> userGroup;
    
    public Admin(){
        userList = new ArrayList<>();
        groupList = new ArrayList<>();
        countUser = 0;
        countGroup = 0;
        countTweets = 0;
        
        initialize();
    }
    
    public static Admin getInstance(){
        if(admin == null)
            admin = new Admin();
        return admin;
    }
    
    public void createUser(String userName, String password){
        User user = new User(userName, password);
        userList.add(user);
    }
    
    public void createGroup(String groupName){
        Group group = new Group(groupName);
        groupList.add(group);
    }
    
    public void initialize(){
        frame = new JFrame("Admin Control Panel");
        frame.setBounds(200, 200, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
    }
}
