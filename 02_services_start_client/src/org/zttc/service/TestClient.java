package org.zttc.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestClient {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8888/ns?wsdl");
			QName sname = new QName("http://service.zttc.org/","MyServiceImplService");
			Service service = Service.create(url,sname);
			
			IMyService ms = service.getPort(IMyService.class);
			System.out.println(ms.add(12,33));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
