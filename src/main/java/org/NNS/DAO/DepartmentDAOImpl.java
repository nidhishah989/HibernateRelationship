package org.NNS.DAO;

import org.NNS.entity.Department;
import org.NNS.util.ConnectionFactory;

public class DepartmentDAOImpl implements DepartmentDAO{

    ConnectionFactory connectionFactory = ConnectionFactory.GET_SESSION.getInstance();

    @Override
    public void saveDepartment(Department department) {
        connectionFactory.getSession().persist(department);
    }
}
