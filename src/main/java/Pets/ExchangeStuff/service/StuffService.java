package Pets.ExchangeStuff.service;

import Pets.ExchangeStuff.DAO.StuffDAO;
import Pets.ExchangeStuff.model.Stuff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Student on 2017/6/1.
 */

@Service
public class StuffService {

    @Autowired private StuffDAO stuffDAO;

    public List<Stuff> getStuffs(){
        return null;
    }

    public void addStuff(Stuff stuff){}

    public void updateStuff(Stuff stuff){}

    public void deleteStuff(Stuff stuff){}

}
