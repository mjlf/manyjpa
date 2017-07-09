package com.mjlf.manyjpa.mapper.slave;

import com.mjlf.manyjpa.entity.Love;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by a123 on 17/7/9.
 */
@Mapper
public interface LoveSlaveMapper {
    public Love findById(@Param("id") int id);
}
