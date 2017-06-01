package Pets.ExchangeStuff.controller;

import Pets.ExchangeStuff.model.Stuff;
import Pets.ExchangeStuff.service.StuffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Student on 2017/6/1.
 */

@Controller
public class StuffController {

    @Autowired private StuffService stuffService;

    public List<Stuff> getStuffs(){
        return null;
    }

    public void addStuff(Stuff stuff){}

    public void updateStuff(Stuff stuff){}

    public void deleteStuff(Stuff stuff){}
}
