package me.jinkun.db;

import me.jinkun.db.utils.FtUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: HelloWorld！ <br/>
 * Autor: Created by jinkun on 2017/1/16.
 */
public class TestFreemaker {
    public static void main(String[] args) throws Exception {

        //模拟2个列ID、AGE
        Map<String, Object> column1 = new HashMap<>();
        column1.put("NAME", "ID");
        Map<String, Object> column2 = new HashMap<>();
        column2.put("NAME", "AGE");

        //模拟一个列集合
        List<Map<String, Object>> columnList = new ArrayList<>();
        columnList.add(column1);
        columnList.add(column2);

        //模拟一张表
        Map<String, Object> table = new HashMap<>();
        table.put("NAME", "T_USER");
        table.put("COLUMNS", columnList);

        //模拟一个表集合
        List<Map<String, Object>> tableList = new ArrayList<>();
        tableList.add(table);

        Map map = new HashMap<>();
        //map.put("table", "123");
        map.put("table", tableList);


        FtUtil ftUtil = new FtUtil();
        ftUtil.generateFile("/", "test.ftl", map, "D:/", "test.txt");
    }
}
