package org.zttc.service;

public class TestClient2 {

	public static void main(String[] args) {
		MyServiceImplService msis = new MyServiceImplService();
		IMyService ms = msis.getMyServiceImplPort();
		System.out.println(ms.minus(29, 11));
	}
}
