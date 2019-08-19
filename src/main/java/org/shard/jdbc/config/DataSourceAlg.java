package org.shard.jdbc.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.shard.jdbc.utils.HashUtil;
import org.slf4j.LoggerFactory;
import java.util.Collection;
import java.util.logging.Logger;

public class DataSourceAlg implements PreciseShardingAlgorithm<String> {
    private static org.slf4j.Logger LOG = LoggerFactory.getLogger(DataSourceAlg.class);

    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        LOG.debug("分库算法参数 {},{}",collection,preciseShardingValue);
        int hash = HashUtil.rsHash(String.valueOf(preciseShardingValue.getValue()));
        return "ds_"+((hash%2)+2);
    }
}
