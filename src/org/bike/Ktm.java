package org.bike;

public class Ktm implements Bike {
public void cost() {
System.out.println("150000");

}
public void speed() {
	System.out.println("250km");

}
public static void main(String[] args) {
	Ktm m = new Ktm();
	m.cost();
	m.speed();
}

}
