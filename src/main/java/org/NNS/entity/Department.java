package org.NNS.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int did;
    private String dname;

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }
    public Department()
    {
    }
    @OneToMany(targetEntity=Teacher.class, cascade = {CascadeType.ALL})
    private List teacherList;

    public List getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List teacherList) {
        this.teacherList = teacherList;
    }

    public int getDid() {
        return did;
    }
    public void setDid(int did) {
        this.did = did;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }

}
