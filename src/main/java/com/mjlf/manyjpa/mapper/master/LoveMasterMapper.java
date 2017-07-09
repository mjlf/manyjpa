package com.mjlf.manyjpa.mapper.master;

import com.mjlf.manyjpa.entity.Love;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by a123 on 17/7/9.
 */
@Mapper
public interface LoveMasterMapper {

    public int slave(Love love);

    public int delete (@Param("id") int id);
}
