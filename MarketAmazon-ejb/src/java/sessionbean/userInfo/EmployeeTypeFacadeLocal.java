/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.EmployeeType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface EmployeeTypeFacadeLocal {

    void create(EmployeeType employeeType);

    void edit(EmployeeType employeeType);

    void remove(EmployeeType employeeType);

    EmployeeType find(Object id);

    List<EmployeeType> findAll();

    List<EmployeeType> findRange(int[] range);

    int count();
    
}
