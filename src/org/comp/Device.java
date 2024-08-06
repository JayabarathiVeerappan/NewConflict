package org.comp;

public class Device extends Computer {
private void desktopSize() {
System.out.println("desktop size is 32 inch");
}
public static void main(String[] args) {
	Device d=new Device();
	d.desktopSize();
	d.computerModel();
	
}
}
