package com.ruoyi.unicom.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.unicom.mapper.NetworkEquipmentMapper;
import com.ruoyi.unicom.domain.NetworkEquipment;
import com.ruoyi.unicom.service.INetworkEquipmentService;

/**
 * 网络配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class NetworkEquipmentServiceImpl implements INetworkEquipmentService 
{
    @Autowired
    private NetworkEquipmentMapper networkEquipmentMapper;

    /**
     * 查询网络配置
     * 
     * @param id 网络配置主键
     * @return 网络配置
     */
    @Override
    public NetworkEquipment selectNetworkEquipmentById(Long id)
    {
        return networkEquipmentMapper.selectNetworkEquipmentById(id);
    }

    /**
     * 查询网络配置列表
     * 
     * @param networkEquipment 网络配置
     * @return 网络配置
     */
    @Override
    public List<NetworkEquipment> selectNetworkEquipmentList(NetworkEquipment networkEquipment)
    {
        return networkEquipmentMapper.selectNetworkEquipmentList(networkEquipment);
    }

    /**
     * 新增网络配置
     * 
     * @param networkEquipment 网络配置
     * @return 结果
     */
    @Override
    public int insertNetworkEquipment(NetworkEquipment networkEquipment)
    {
        return networkEquipmentMapper.insertNetworkEquipment(networkEquipment);
    }

    /**
     * 修改网络配置
     * 
     * @param networkEquipment 网络配置
     * @return 结果
     */
    @Override
    public int updateNetworkEquipment(NetworkEquipment networkEquipment)
    {
        return networkEquipmentMapper.updateNetworkEquipment(networkEquipment);
    }

    /**
     * 批量删除网络配置
     * 
     * @param ids 需要删除的网络配置主键
     * @return 结果
     */
    @Override
    public int deleteNetworkEquipmentByIds(Long[] ids)
    {
        return networkEquipmentMapper.deleteNetworkEquipmentByIds(ids);
    }

    /**
     * 删除网络配置信息
     * 
     * @param id 网络配置主键
     * @return 结果
     */
    @Override
    public int deleteNetworkEquipmentById(Long id)
    {
        return networkEquipmentMapper.deleteNetworkEquipmentById(id);
    }
}
