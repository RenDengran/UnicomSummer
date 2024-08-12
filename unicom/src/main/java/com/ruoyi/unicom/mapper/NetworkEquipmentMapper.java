package com.ruoyi.unicom.mapper;

import java.util.List;
import com.ruoyi.unicom.domain.NetworkEquipment;

/**
 * 网络配置Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface NetworkEquipmentMapper 
{
    /**
     * 查询网络配置
     * 
     * @param id 网络配置主键
     * @return 网络配置
     */
    public NetworkEquipment selectNetworkEquipmentById(Long id);

    /**
     * 查询网络配置列表
     * 
     * @param networkEquipment 网络配置
     * @return 网络配置集合
     */
    public List<NetworkEquipment> selectNetworkEquipmentList(NetworkEquipment networkEquipment);

    /**
     * 新增网络配置
     * 
     * @param networkEquipment 网络配置
     * @return 结果
     */
    public int insertNetworkEquipment(NetworkEquipment networkEquipment);

    /**
     * 修改网络配置
     * 
     * @param networkEquipment 网络配置
     * @return 结果
     */
    public int updateNetworkEquipment(NetworkEquipment networkEquipment);

    /**
     * 删除网络配置
     * 
     * @param id 网络配置主键
     * @return 结果
     */
    public int deleteNetworkEquipmentById(Long id);

    /**
     * 批量删除网络配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNetworkEquipmentByIds(Long[] ids);
}
