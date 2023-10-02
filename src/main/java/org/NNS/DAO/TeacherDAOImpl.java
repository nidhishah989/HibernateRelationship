package org.NNS.DAO;

import org.NNS.entity.Teacher;
import org.NNS.util.ConnectionFactory;

public class TeacherDAOImpl implements TeacherDAO {
    ConnectionFactory connectionfactory = ConnectionFactory.GET_SESSION.getInstance();
    @Override
    public void saveTeacher(Teacher teacher) {

        connectionfactory.getSession().persist(teacher);


    }
}
