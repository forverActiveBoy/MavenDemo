package com.yunkan.dao;
import com.yunkan.entity.SysResources;
import java.util.List;
public interface SysResourcesDao{
	/**
	 * 获得SysResources数据的总行数
	 * @return
	 */
    long getSysResourcesRowCount();
	/**
	 * 获得SysResources数据集合
	 * @return
	 */
    List<SysResources> selectSysResources();
	/**
	 * 获得一个SysResources对象,以参数SysResources对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysResources selectSysResourcesByObj(SysResources obj);
	/**
	 * 通过SysResources的id获得SysResources对象
	 * @param id
	 * @return
	 */
    SysResources selectSysResourcesById(Long id);
	/**
	 * 插入SysResources到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysResources(SysResources value);
	/**
	 * 插入SysResources中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysResources(SysResources value);
	/**
	 * 通过SysResources的id删除SysResources
	 * @param id
	 * @return
	 */
    int deleteSysResourcesById(Long id);
	/**
	 * 通过SysResources的id更新SysResources中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysResourcesById(SysResources enti);
	/**
	 * 通过SysResources的id更新SysResources中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysResourcesById(SysResources enti);
    List<SysResources> findByParentId();
    List<SysResources> selectMeau();
}