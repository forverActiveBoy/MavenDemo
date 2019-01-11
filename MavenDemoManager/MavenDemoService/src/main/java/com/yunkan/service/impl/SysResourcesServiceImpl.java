package com.yunkan.service.impl;
import java.util.List;
import com.yunkan.dao.SysResourcesDao;
import com.yunkan.entity.SysResources;
import com.yunkan.service.SysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysResourcesServiceImpl implements SysResourcesService{
    @Autowired
    private SysResourcesDao sysResourcesDao;
    @Override
    public long getSysResourcesRowCount(){
        return sysResourcesDao.getSysResourcesRowCount();
    }
    @Override
    public List<SysResources> selectSysResources(){
        return sysResourcesDao.selectSysResources();
    }
    @Override
    public SysResources selectSysResourcesByObj(SysResources obj){
        return sysResourcesDao.selectSysResourcesByObj(obj);
    }
    @Override
    public SysResources selectSysResourcesById(Long id){
        return sysResourcesDao.selectSysResourcesById(id);
    }
    @Override
    public int insertSysResources(SysResources value){
        return sysResourcesDao.insertSysResources(value);
    }
    @Override
    public int insertNonEmptySysResources(SysResources value){
        return sysResourcesDao.insertNonEmptySysResources(value);
    }
    @Override
    public int deleteSysResourcesById(Long id){
        return sysResourcesDao.deleteSysResourcesById(id);
    }
    @Override
    public int updateSysResourcesById(SysResources enti){
        return sysResourcesDao.updateSysResourcesById(enti);
    }
    @Override
    public int updateNonEmptySysResourcesById(SysResources enti){
        return sysResourcesDao.updateNonEmptySysResourcesById(enti);
    }

    @Override
    public List<SysResources> findMeau() {
        return sysResourcesDao.selectMeau();
    }


}