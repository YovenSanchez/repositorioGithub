package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Menu;
import com.Restaurante.Servicios.Dao.MenuDao;
import com.Restaurante.Servicios.Service.MenuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{
  @Autowired
    private MenuDao menuDao;
    @Override
    @Transactional(readOnly=false)
    public Menu save(Menu menu) {
        return menuDao.save(menu);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        menuDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Menu findById(int id) {
        return menuDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Menu> findByAll() {
        return (List<Menu>) menuDao.findAll();
    }
      
}
