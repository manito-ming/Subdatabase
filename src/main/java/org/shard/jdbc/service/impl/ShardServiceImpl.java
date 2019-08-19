package org.shard.jdbc.service.impl;

import org.shard.jdbc.mapper.TableOneMapper;
import org.shard.jdbc.pojo.TableOne;
import org.shard.jdbc.service.ShardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShardServiceImpl implements ShardService {

    @Resource
    private TableOneMapper tableOneMapper ;


    public void updateOneByPhone(TableOne one) {
        System.out.println(one);
        tableOneMapper.updateOnePhone(one);
    }
}
