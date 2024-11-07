package com.dao;

import com.entity.ShixizhiweiToudiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixizhiweiToudiView;

/**
 * 实习申请 Dao 接口
 *
 * @author 
 */
public interface ShixizhiweiToudiDao extends BaseMapper<ShixizhiweiToudiEntity> {

   List<ShixizhiweiToudiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
