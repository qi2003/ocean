package com.me.ocean.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Set;


/**
 * @author my
 */
@Mapper
public interface GrpcOceanMapper {
  

  int deleteTboceanRequest(@Param("d_id") int d_id);

  int updateTboceanRequest(@Param("d_id") int d_id);

  int addTboceanRequest(@Param("d_id")  int d_id);

  int deleteTboceanaRequest(@Param("u_id") int u_id);

  int updateTboceanaRequest(@Param("c_id") int c_id);

  int addTboceanaRequest(@Param("c_id")  int c_id);

}
