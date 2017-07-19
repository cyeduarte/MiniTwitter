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
public class User {
    private String userName;
    private String password;
    private ArrayList<String> followingList;
    private ArrayList<String> followersList;
    private ArrayList<Newsfeed> tweetList;
    
    
    public User(String userName, String password){
        setUsername(userName);
        setPassword(password);
        followingList = new ArrayList<>();
        followersList = new ArrayList<>();
        tweetList = new ArrayList<>();
    }
    
    public void setUsername(String userName){
        this.userName = userName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setFollowing(String id){
        followingList.add(id);
    }
    
    public void setFollower(String id){
        followersList.add(id);
    }
    
    public void postTweet(String tweet){
    }
    
    public String getUsername(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void showFollowing(){
        for(int i = 0; i < followingList.size(); i++){
            System.out.println(followingList.get(i));
        }
    }
    
    public void showFollower(){
        for(int i = 0; i < followersList.size(); i++){
            System.out.println(followersList.get(i));
        }
    }
    
}
