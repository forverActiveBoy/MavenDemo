package com.yunkan.dao;
import com.yunkan.entity.SysAdmin;
import java.util.List;
public interface SysAdminDao{
	/**
	 * 获得SysAdmin数据的总行数
	 * @return
	 */
    long getSysAdminRowCount();
	/**
	 * 获得SysAdmin数据集合
	 * @return
	 */
    List<SysAdmin> selectSysAdmin();
	/**
	 * 获得一个SysAdmin对象,以参数SysAdmin对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysAdmin selectSysAdminByObj(SysAdmin obj);
	/**
	 * 通过SysAdmin的id获得SysAdmin对象
	 * @param id
	 * @return
	 */
    SysAdmin selectSysAdminById(Long id);
	/**
	 * 插入SysAdmin到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysAdmin(SysAdmin value);
	/**
	 * 插入SysAdmin中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysAdmin(SysAdmin value);
	/**
	 * 通过SysAdmin的id删除SysAdmin
	 * @param id
	 * @return
	 */
    int deleteSysAdminById(Long id);
	/**
	 * 通过SysAdmin的id更新SysAdmin中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysAdminById(SysAdmin enti);
	/**
	 * 通过SysAdmin的id更新SysAdmin中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysAdminById(SysAdmin enti);
	SysAdmin selectByUsername(String username);
}