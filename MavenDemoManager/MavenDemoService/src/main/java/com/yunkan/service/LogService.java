package com.yunkan.service;
import com.yunkan.annotation.LogAnnotation;
import com.yunkan.entity.Log;

import java.util.Map;


public interface LogService{
	@LogAnnotation("分页查询日志")
	Map findByPage(int page, int rows);
}