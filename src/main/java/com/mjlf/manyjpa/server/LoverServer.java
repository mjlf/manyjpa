package com.mjlf.manyjpa.server;

import com.mjlf.manyjpa.entity.Love;
import com.mjlf.manyjpa.mapper.master.LoveMasterMapper;
import com.mjlf.manyjpa.mapper.slave.LoveSlaveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by a123 on 17/7/9.
 */
@Service
public class LoverServer {
    @Autowired
    private LoveMasterMapper loveMasterMapper;
    @Autowired
    private LoveSlaveMapper loveSlaveMapper;

    public int insert(Love love){
        return loveMasterMapper.slave(love);
    }

    public int delete(int id){
        return loveMasterMapper.delete(id);
    }

    public Love find(int id){
        return loveSlaveMapper.findById(id);
    }
}
