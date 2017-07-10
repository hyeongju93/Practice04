package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	if(str.equals("앱")) {
    		app();
    	} else if(str.equals("음악")) {
    		playMusic();
    	} else {
    		call();
    	}
        
        //코드작성
        
    }
    
    public void app() {
    	System.out.println("앱실행");
    }
    
    public void call() {
    	System.out.println("통화기능시작");
    }
    
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    
    //메소드작성
    
    
    
}
