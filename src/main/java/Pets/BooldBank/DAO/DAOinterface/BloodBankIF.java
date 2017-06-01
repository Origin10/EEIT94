package Pets.BooldBank.DAO.DAOinterface;

import Pets.BooldBank.model.BloodBank;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */
public interface BloodBankIF {

    public void insert(BloodBank BloodBank);

    public void update(BloodBank BloodBank);

    public void delete(Integer id);

    public BloodBank findByPrimaryKey(Integer id);

    public List<BloodBank> getAll();

    public Set<BloodBank> getEmpsByDeptno(Integer id);
}
