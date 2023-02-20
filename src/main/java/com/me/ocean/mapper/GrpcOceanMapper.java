package com.me.ocean.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @author my
 */
@Mapper
public interface GrpcOceanMapper {

  int deleteTboceanRequest(@Param("d_id") int d_id);

  int updateTboceanRequest(@Param("d_id") int d_id, @Param("t_id") int t_id,
                           @Param("d_title") String d_title, @Param("d_content") String d_content,
                           @Param("d_author") String d_author, @Param("d_releaseDate") Date d_releaseDate);

  int addTboceanRequest(@Param("d_id")  int d_id);

  int deleteTboceanaRequest(@Param("u_id") int u_id);

  int updateTboceanaRequest(@Param("c_id") int c_id, @Param("cd_id") int cd_id,
                            @Param("c_content") String c_content, @Param("c_author") String c_author,
                            @Param("c_createDate") Date c_createDate);

  int addTboceanaRequest(@Param("c_id")  int c_id);

}
