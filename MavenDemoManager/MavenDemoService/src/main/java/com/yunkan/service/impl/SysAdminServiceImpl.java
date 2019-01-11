package com.yunkan.service.impl;
import java.util.List;
import com.yunkan.dao.SysAdminDao;
import com.yunkan.entity.SysAdmin;
import com.yunkan.service.SysAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysAdminServiceImpl implements SysAdminService{
    @Autowired
    private SysAdminDao sysAdminDao;
    @Override
    public long getSysAdminRowCount(){
        return sysAdminDao.getSysAdminRowCount();
    }
    @Override
    public List<SysAdmin> selectSysAdmin(){
        return sysAdminDao.selectSysAdmin();
    }
    @Override
    public SysAdmin selectSysAdminByObj(SysAdmin obj){
        return sysAdminDao.selectSysAdminByObj(obj);
    }
    @Override
    public SysAdmin selectSysAdminById(Long id){
        return sysAdminDao.selectSysAdminById(id);
    }
    @Override
    public int insertSysAdmin(SysAdmin value){
        return sysAdminDao.insertSysAdmin(value);
    }
    @Override
    public int insertNonEmptySysAdmin(SysAdmin value){
        return sysAdminDao.insertNonEmptySysAdmin(value);
    }
    @Override
    public int deleteSysAdminById(Long id){
        return sysAdminDao.deleteSysAdminById(id);
    }
    @Override
    public int updateSysAdminById(SysAdmin enti){
        return sysAdminDao.updateSysAdminById(enti);
    }
    @Override
    public int updateNonEmptySysAdminById(SysAdmin enti){
        return sysAdminDao.updateNonEmptySysAdminById(enti);
    }

    @Override
    public SysAdmin findByUsername(String username) {
        return sysAdminDao.selectByUsername(username);
    }


}