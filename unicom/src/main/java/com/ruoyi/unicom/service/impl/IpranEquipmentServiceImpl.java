package com.ruoyi.unicom.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.unicom.mapper.IpranEquipmentMapper;
import com.ruoyi.unicom.domain.IpranEquipment;
import com.ruoyi.unicom.service.IIpranEquipmentService;

/**
 * ipran设备配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class IpranEquipmentServiceImpl implements IIpranEquipmentService 
{
    @Autowired
    private IpranEquipmentMapper ipranEquipmentMapper;

    /**
     * 查询ipran设备配置
     * 
     * @param id ipran设备配置主键
     * @return ipran设备配置
     */
    @Override
    public IpranEquipment selectIpranEquipmentById(Long id)
    {
        return ipranEquipmentMapper.selectIpranEquipmentById(id);
    }

    /**
     * 查询ipran设备配置列表
     * 
     * @param ipranEquipment ipran设备配置
     * @return ipran设备配置
     */
    @Override
    public List<IpranEquipment> selectIpranEquipmentList(IpranEquipment ipranEquipment)
    {
        return ipranEquipmentMapper.selectIpranEquipmentList(ipranEquipment);
    }

    /**
     * 新增ipran设备配置
     * 
     * @param ipranEquipment ipran设备配置
     * @return 结果
     */
    @Override
    public int insertIpranEquipment(IpranEquipment ipranEquipment)
    {
        return ipranEquipmentMapper.insertIpranEquipment(ipranEquipment);
    }

    /**
     * 修改ipran设备配置
     * 
     * @param ipranEquipment ipran设备配置
     * @return 结果
     */
    @Override
    public int updateIpranEquipment(IpranEquipment ipranEquipment)
    {
        return ipranEquipmentMapper.updateIpranEquipment(ipranEquipment);
    }

    /**
     * 批量删除ipran设备配置
     * 
     * @param ids 需要删除的ipran设备配置主键
     * @return 结果
     */
    @Override
    public int deleteIpranEquipmentByIds(Long[] ids)
    {
        return ipranEquipmentMapper.deleteIpranEquipmentByIds(ids);
    }

    /**
     * 删除ipran设备配置信息
     * 
     * @param id ipran设备配置主键
     * @return 结果
     */
    @Override
    public int deleteIpranEquipmentById(Long id)
    {
        return ipranEquipmentMapper.deleteIpranEquipmentById(id);
    }
}
