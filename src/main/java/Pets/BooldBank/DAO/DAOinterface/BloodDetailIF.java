package Pets.BooldBank.DAO.DAOinterface;

import Pets.BooldBank.model.BloodDetail;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */
public interface BloodDetailIF {

    public void insert(BloodDetail bloodDetail);

    public void update(BloodDetail bloodDetail);

    public void delete(Integer id);

    public BloodDetail findByPrimaryKey(Integer id);

    public List<BloodDetail> getAll();

    public Set<BloodDetail> getEmpsByDeptno(Integer id);
}
