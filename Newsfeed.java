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
public class Newsfeed {
    
    private String tweet;
    User user;
    private static int positive, negative;
    
    public Newsfeed(User user, String tweet){
        setUser(user);
        setTweet(tweet);
        positive = 0;
        negative = 0;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    public void setTweet(String tweet){
        this.tweet = tweet;
    }
    
    public User getUser(){
        return user;
    }
    
    public String getTweet(){
        return tweet;
    }
    
    public void showTweet(){
        System.out.println(tweet);
    }
    
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
    public void like(){
        positive++;
    }
    
    public void dislike(){
        negative++;
    }
    
    public String toString(){
        return "There are " + positive + " likes and " + negative +" dislikes.";
    }
}
