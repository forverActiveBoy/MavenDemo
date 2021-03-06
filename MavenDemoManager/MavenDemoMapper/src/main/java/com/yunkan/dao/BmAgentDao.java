package com.yunkan.dao;

import com.yunkan.entity.BmAgent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface BmAgentDao{






	/**
	 * 获得BmAgent数据的总行数
	 * @return
	 */
    long getBmAgentRowCount();
	/**
	 * 获得BmAgent数据集合
	 * @return
	 */
    List<BmAgent> selectBmAgent();
	/**
	 * 获得一个BmAgent对象,以参数BmAgent对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BmAgent selectBmAgentByObj(BmAgent obj);
	/**
	 * 通过BmAgent的id获得BmAgent对象
	 * @param id
	 * @return
	 */
    BmAgent selectBmAgentById(Long id);
	/**
	 * 插入BmAgent到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBmAgent(BmAgent value);
	/**
	 * 插入BmAgent中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBmAgent(BmAgent value);
	/**
	 * 通过BmAgent的id删除BmAgent
	 * @param id
	 * @return
	 */
    int deleteBmAgentById(Long id);
	/**
	 * 通过BmAgent的id更新BmAgent中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBmAgentById(BmAgent enti);
	/**
	 * 通过BmAgent的id更新BmAgent中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBmAgentById(BmAgent enti);
    List<BmAgent> getAllByPage(@Param("start") int start,@Param("rows") int rows);
    int deleteMany(int[] ids);
}