package com.yunkan.controller;

import com.yunkan.dao.SysResourcesDao;
import com.yunkan.entity.SysResources;
import com.yunkan.service.SysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sysResources")
public class SysResourcesController {
    @Autowired
    private SysResourcesService sysResourcesService;
    @RequestMapping("/findMeau.do")
    public @ResponseBody List<SysResources> findMeau(){
        return  sysResourcesService.findMeau();
    }
}
