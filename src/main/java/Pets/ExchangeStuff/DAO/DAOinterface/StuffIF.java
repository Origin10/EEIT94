package Pets.ExchangeStuff.DAO.DAOinterface;

import Pets.ExchangeStuff.model.Stuff;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */
public interface StuffIF {

    public void insert(Stuff stuff);

    public void update(Stuff stuff);

    public void delete(Integer id);

    public Stuff findByPrimaryKey(Integer id);

    public List<Stuff> getAll();

    public Set<Stuff> getEmpsByDeptno(Integer id);
}
