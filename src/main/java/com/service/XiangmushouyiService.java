package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmushouyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmushouyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmushouyiView;


/**
 * 项目收益
 *
 * @author 
 * @email 
 * @date 2021-03-10 20:37:31
 */
public interface XiangmushouyiService extends IService<XiangmushouyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmushouyiVO> selectListVO(Wrapper<XiangmushouyiEntity> wrapper);
   	
   	XiangmushouyiVO selectVO(@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);
   	
   	List<XiangmushouyiView> selectListView(Wrapper<XiangmushouyiEntity> wrapper);
   	
   	XiangmushouyiView selectView(@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmushouyiEntity> wrapper);
   	
}

