package Pets.ExchangeStuff.DAO;


import Pets.ExchangeStuff.DAO.DAOinterface.ImageIF;
import Pets.ExchangeStuff.model.ImageInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */

@Repository
public class ImageInfoDAO implements ImageIF{


    @Override
    public void insert(ImageInfo imageInfo) {

    }

    @Override
    public void update(ImageInfo imageInfo) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public ImageInfo findByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<ImageInfo> getAll() {
        return null;
    }

    @Override
    public Set<ImageInfo> getEmpsByDeptno(Integer id) {
        return null;
    }
}
