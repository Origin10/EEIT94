package Pets.BooldBank.DAO;



import Pets.BooldBank.DAO.DAOinterface.BloodDetailIF;
import Pets.BooldBank.model.BloodDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */

@Repository
public class BloodDetailDAO implements BloodDetailIF{


    @Override
    public void insert(BloodDetail bloodDetail) {

    }

    @Override
    public void update(BloodDetail bloodDetail) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public BloodDetail findByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<BloodDetail> getAll() {
        return null;
    }

    @Override
    public Set<BloodDetail> getEmpsByDeptno(Integer id) {
        return null;
    }
}
