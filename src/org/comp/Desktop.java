package org.comp;

public class Desktop extends Computer {
private void desktopSize() {
System.out.println("desktop size is 32 inch");
}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopSize();
	d.computerModel();
}
}
