package com.opps.abstractclass;

interface MusicPlayer{
	void ply();
	void stop();
}

class Spotify implements MusicPlayer{

	@Override
	public void ply() {
 
		System.out.println("playing song on Spotify");
	}

	@Override
	public void stop() {
		System.out.println("Music stopped");
		
	}
	
}



public class InterfaceImpDemo {

	public static void main(String[] args) {
 
		MusicPlayer ply = new Spotify();
		ply.ply();
		ply.stop();
	}

}
