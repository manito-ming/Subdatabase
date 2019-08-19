package org.shard.jdbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.shard.jdbc.pojo.TableOne;

@Mapper
public interface TableOneMapper {

    int updateOnePhone(TableOne one);
}
