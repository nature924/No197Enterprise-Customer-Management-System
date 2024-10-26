package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehuxinxiView;


/**
 * 客户信息
 *
 * @author 
 * @email 
 * @date 2021-03-10 20:37:30
 */
public interface KehuxinxiService extends IService<KehuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehuxinxiVO> selectListVO(Wrapper<KehuxinxiEntity> wrapper);
   	
   	KehuxinxiVO selectVO(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
   	
   	List<KehuxinxiView> selectListView(Wrapper<KehuxinxiEntity> wrapper);
   	
   	KehuxinxiView selectView(@Param("ew") Wrapper<KehuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehuxinxiEntity> wrapper);
   	
}

