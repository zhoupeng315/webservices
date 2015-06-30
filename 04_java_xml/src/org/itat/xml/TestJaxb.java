package org.itat.xml;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.omg.CORBA.MARSHAL;

public class TestJaxb {
    
    @Test
    public void test01(){
	try {
	    JAXBContext ctx = JAXBContext.newInstance(Student.class);
	    Marshaller marshaller = ctx.createMarshaller();
	    Student stu = new Student(1, "zhang3", 15, new Classroom(1,"10jisuanji",2010));
	    marshaller.marshal(stu, System.out);
	    
	} catch (JAXBException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    @Test
    public void test02(){
	String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student><age>15</age><classroom><grade>2010</grade><id>1</id><name>10jisuanji</name></classroom><id>1</id><name>zhang3</name></student>";
	try {
	    JAXBContext ctx = JAXBContext.newInstance(Student.class);
	    Unmarshaller um = ctx.createUnmarshaller();
	    Student stu = (Student) um.unmarshal(new StringReader(xml));
	    System.out.println();
	    System.out.println(stu.getName()+","+stu.getClassroom().getName());
	} catch (JAXBException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
}
