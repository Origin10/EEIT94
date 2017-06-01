package Pets.BooldBank.DAO;



import Pets.BooldBank.DAO.DAOinterface.BloodBankIF;
import Pets.BooldBank.model.BloodBank;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */

@Repository
public class BloodBankDAO implements BloodBankIF{


    @Override
    public void insert(BloodBank BloodBank) {

    }

    @Override
    public void update(BloodBank BloodBank) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public BloodBank findByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<BloodBank> getAll() {
        return null;
    }

    @Override
    public Set<BloodBank> getEmpsByDeptno(Integer id) {
        return null;
    }
}
