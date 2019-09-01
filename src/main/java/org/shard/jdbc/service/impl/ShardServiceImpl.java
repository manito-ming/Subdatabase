package org.shard.jdbc.service.impl;

import org.shard.jdbc.mapper.TableOneMapper;
import org.shard.jdbc.pojo.TableOne;
import org.shard.jdbc.service.ShardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShardServiceImpl implements ShardService {

    @Resource
    private TableOneMapper tableOneMapper ;
    @Autowired
    @Qualifier("dataOneTemplate")
    private JdbcTemplate jdbcTemplate ;

    @Autowired
    @Qualifier("dataTwoTemplate")
    private JdbcTemplate dataTwoTemplate ;

    @Autowired
    @Qualifier("dataThreeTemplate")
    private JdbcTemplate dataThreeTemplate ;

    public void createTable() {
        for (int i = 1 ; i <= 5 ; i++){
            String executeSQL = "CREATE TABLE table_test_"+i+" (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',\n" +
                    "  `phone` varchar(20) NOT NULL COMMENT '手机号',\n" +
                    "  `back_one` varchar(50) DEFAULT NULL COMMENT '备用1',\n" +
                    "  `back_two` varchar(50) DEFAULT NULL COMMENT '备用2',\n" +
                    "  `back_three` varchar(50) DEFAULT NULL COMMENT '备用3',\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  KEY `phoneIndex` (`phone`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8;" ;
            dataTwoTemplate.execute(executeSQL);
            dataThreeTemplate.execute(executeSQL);
        }
    }

    public void updateOneByPhone(TableOne one) {
        System.out.println(one);
        tableOneMapper.updateOnePhone(one);
    }
}
