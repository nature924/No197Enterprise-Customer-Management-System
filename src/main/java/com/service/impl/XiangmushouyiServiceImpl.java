package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiangmushouyiDao;
import com.entity.XiangmushouyiEntity;
import com.service.XiangmushouyiService;
import com.entity.vo.XiangmushouyiVO;
import com.entity.view.XiangmushouyiView;

@Service("xiangmushouyiService")
public class XiangmushouyiServiceImpl extends ServiceImpl<XiangmushouyiDao, XiangmushouyiEntity> implements XiangmushouyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmushouyiEntity> page = this.selectPage(
                new Query<XiangmushouyiEntity>(params).getPage(),
                new EntityWrapper<XiangmushouyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmushouyiEntity> wrapper) {
		  Page<XiangmushouyiView> page =new Query<XiangmushouyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmushouyiVO> selectListVO(Wrapper<XiangmushouyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmushouyiVO selectVO(Wrapper<XiangmushouyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmushouyiView> selectListView(Wrapper<XiangmushouyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmushouyiView selectView(Wrapper<XiangmushouyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
