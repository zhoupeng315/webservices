package org.itat.xml;

public class Classroom {

    private int id;
    private String name;
    private int grade;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Classroom(int id, String name, int grade) {
	super();
	this.id = id;
	this.name = name;
	this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public Classroom() {
	super();
	// TODO Auto-generated constructor stub
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
    
}
