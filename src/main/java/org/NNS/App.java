package org.NNS;

import org.NNS.DAO.DepartmentDAO;
import org.NNS.DAO.DepartmentDAOImpl;
import org.NNS.DAO.TeacherDAO;
import org.NNS.DAO.TeacherDAOImpl;
import org.NNS.entity.Department;
import org.NNS.entity.Teacher;
import org.NNS.util.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ConnectionFactory connectionFactory = ConnectionFactory.GET_SESSION.getInstance();

        // teacheres
        Teacher t1 = new Teacher();
        t1.setSalary("1000");
        t1.setTeachername("MHaseeb");

        Teacher t2 = new Teacher();
        t2.setSalary("2220");
        t2.setTeachername("Shahparan");

        Teacher t3 = new Teacher();
        t3.setSalary("30000");
        t3.setTeachername("James");

        Teacher t4 = new Teacher();
        t4.setSalary("40000");
        t4.setTeachername("Joseph");

        //Teacher List
        List<Teacher> teachlist1 = new ArrayList();
        teachlist1.add(t1);
        teachlist1.add(t2);
        List<Teacher> teachlist2 = new ArrayList();
        teachlist2.add(t3);
        teachlist2.add(t4);

        //department
        Department dep1 = new Department();
        dep1.setDname("IT");
        dep1.setTeacherList(teachlist1);

        Department dep2 = new Department();
        dep2.setDname("HR");
        dep2.setTeacherList(teachlist2);

        DepartmentDAO departmentdao = new DepartmentDAOImpl();

        departmentdao.saveDepartment(dep1);
        departmentdao.saveDepartment(dep2);

//
//
//        TeacherDAO teacherdao = new TeacherDAOImpl();
//        teacherdao.saveTeacher(t1);
//        teacherdao.saveTeacher(t2);
//        teacherdao.saveTeacher(t3);
//        teacherdao.saveTeacher(t4);

        connectionFactory.closeSession();


    }
}
