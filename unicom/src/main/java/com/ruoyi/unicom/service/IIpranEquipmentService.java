package com.ruoyi.unicom.service;

import java.util.List;
import com.ruoyi.unicom.domain.IpranEquipment;

/**
 * ipran设备配置Service接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface IIpranEquipmentService 
{
    /**
     * 查询ipran设备配置
     * 
     * @param id ipran设备配置主键
     * @return ipran设备配置
     */
    public IpranEquipment selectIpranEquipmentById(Long id);

    /**
     * 查询ipran设备配置列表
     * 
     * @param ipranEquipment ipran设备配置
     * @return ipran设备配置集合
     */
    public List<IpranEquipment> selectIpranEquipmentList(IpranEquipment ipranEquipment);

    /**
     * 新增ipran设备配置
     * 
     * @param ipranEquipment ipran设备配置
     * @return 结果
     */
    public int insertIpranEquipment(IpranEquipment ipranEquipment);

    /**
     * 修改ipran设备配置
     * 
     * @param ipranEquipment ipran设备配置
     * @return 结果
     */
    public int updateIpranEquipment(IpranEquipment ipranEquipment);

    /**
     * 批量删除ipran设备配置
     * 
     * @param ids 需要删除的ipran设备配置主键集合
     * @return 结果
     */
    public int deleteIpranEquipmentByIds(Long[] ids);

    /**
     * 删除ipran设备配置信息
     * 
     * @param id ipran设备配置主键
     * @return 结果
     */
    public int deleteIpranEquipmentById(Long id);
}
