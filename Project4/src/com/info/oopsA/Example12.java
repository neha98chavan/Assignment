package com.info.oopsA;
class Room{
	int height;
	int width;
	int breadth;
	public Room(int height, int width, int breadth) {
		
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	void volume() {
		int v= height*width*breadth;
		System.out.println("Volume of room"+v);
	}
}
public class Example12 {

	public static void main(String[] args) {
		 Room r= new  Room(5, 8,9);
		 r.volume();
	}

}
