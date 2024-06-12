package org.example.dream_house.service;

import org.example.dream_house.mapper.DataMapper;
import org.example.dream_house.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataMapper dataMapper;

    /**
     * 新增信息
     *
     * @param ip
     * @param province
     * @param time
     * @param str
     * @param likes
     * @return
     */
    public String insert(String ip, String province, String time, String str, int likes) {
        dataMapper.insert( ip, province, time, str, likes);
        return "succeed";
    }

    /**
     * 查询id对应的信息
     *
     * @param id
     * @return
     */
    public Data findById(int id) {
        return dataMapper.findById(id);
    }

    /**
     * 更新信息
     *
     * @param data
     */
    public void update(Data data) {
        dataMapper.update(data);
    }

    /**
     * 删除id对应的信息
     *
     * @param id
     */
    public void delete(int id) {
        dataMapper.delete(id);
    }

}
