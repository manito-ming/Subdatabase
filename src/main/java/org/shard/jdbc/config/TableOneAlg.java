package org.shard.jdbc.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.shard.jdbc.utils.HashUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class TableOneAlg implements PreciseShardingAlgorithm<String> {
    private static Logger LOG = LoggerFactory.getLogger(TableOneAlg.class);

    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        LOG.debug("分表算法参数 {},{}",collection,preciseShardingValue);
        int hash = HashUtil.rsHash(String.valueOf(preciseShardingValue.getValue()));
        return "table_one_" + (hash % 5+1);
    }
}
