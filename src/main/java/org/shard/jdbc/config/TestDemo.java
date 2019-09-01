package org.shard.jdbc.config;


import org.shard.jdbc.utils.HashUtil;

public class TestDemo {
          //分库算法
          public static String doSchemaSharding(String value) {
             int hash = HashUtil.rsHash(value);
             return "ds_" + ((hash % 2) + 2);
         }

    //分表算法
    public static String doTableSharding(String value) {
        int hash = HashUtil.rsHash(value);
        return "table_one_" + (hash % 5+1);
    }

    public static void main(String[] args) {
            int i = 6;
            String phone = "phone"+i;
            System.out.println(doTableSharding(phone));
        System.out.println(doSchemaSharding(phone));

    }
}
