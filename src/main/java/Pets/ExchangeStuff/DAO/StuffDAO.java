package Pets.ExchangeStuff.DAO;

import Pets.ExchangeStuff.DAO.DAOinterface.StuffIF;
import Pets.ExchangeStuff.model.Stuff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */

@Repository
public class StuffDAO implements StuffIF {

    @Resource private SessionFactory sessionFactory;

    @Override
    public void insert(Stuff stuff) {

    }

    @Override
    public void update(Stuff stuff) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Stuff findByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Stuff> getAll() {
        return null;
    }

    @Override
    public Set<Stuff> getEmpsByDeptno(Integer id) {
        return null;
    }
}
