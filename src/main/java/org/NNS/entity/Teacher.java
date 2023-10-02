package org.NNS.entity;

import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    private int tit;
    private String salary;
    private String Teachername;


    public Teacher(int tit, String salary, String teachername) {
        super();
        this.tit = tit;
        this.salary = salary;
        Teachername = teachername;	}
    public Teacher()
    {}


    public int getTit() {
        return tit;
    }
    public void setTit(int tit) {
        this.tit = tit;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getTeachername() {
        return Teachername;
    }
    public void setTeachername(String teachername) {
        Teachername = teachername;	}

}
