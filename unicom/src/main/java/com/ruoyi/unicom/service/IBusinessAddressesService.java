package com.ruoyi.unicom.service;

import java.util.List;
import com.ruoyi.unicom.domain.BusinessAddresses;

/**
 * 业务逻辑ipService接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface IBusinessAddressesService 
{
    /**
     * 查询业务逻辑ip
     * 
     * @param id 业务逻辑ip主键
     * @return 业务逻辑ip
     */
    public BusinessAddresses selectBusinessAddressesById(Long id);

    /**
     * 查询业务逻辑ip列表
     * 
     * @param businessAddresses 业务逻辑ip
     * @return 业务逻辑ip集合
     */
    public List<BusinessAddresses> selectBusinessAddressesList(BusinessAddresses businessAddresses);

    /**
     * 新增业务逻辑ip
     * 
     * @param businessAddresses 业务逻辑ip
     * @return 结果
     */
    public int insertBusinessAddresses(BusinessAddresses businessAddresses);

    /**
     * 修改业务逻辑ip
     * 
     * @param businessAddresses 业务逻辑ip
     * @return 结果
     */
    public int updateBusinessAddresses(BusinessAddresses businessAddresses);

    /**
     * 批量删除业务逻辑ip
     * 
     * @param ids 需要删除的业务逻辑ip主键集合
     * @return 结果
     */
    public int deleteBusinessAddressesByIds(Long[] ids);

    /**
     * 删除业务逻辑ip信息
     * 
     * @param id 业务逻辑ip主键
     * @return 结果
     */
    public int deleteBusinessAddressesById(Long id);
}
