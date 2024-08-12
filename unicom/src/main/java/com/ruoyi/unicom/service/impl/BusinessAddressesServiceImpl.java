package com.ruoyi.unicom.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.unicom.mapper.BusinessAddressesMapper;
import com.ruoyi.unicom.domain.BusinessAddresses;
import com.ruoyi.unicom.service.IBusinessAddressesService;

/**
 * 业务逻辑ipService业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class BusinessAddressesServiceImpl implements IBusinessAddressesService 
{
    @Autowired
    private BusinessAddressesMapper businessAddressesMapper;

    /**
     * 查询业务逻辑ip
     * 
     * @param id 业务逻辑ip主键
     * @return 业务逻辑ip
     */
    @Override
    public BusinessAddresses selectBusinessAddressesById(Long id)
    {
        return businessAddressesMapper.selectBusinessAddressesById(id);
    }

    /**
     * 查询业务逻辑ip列表
     * 
     * @param businessAddresses 业务逻辑ip
     * @return 业务逻辑ip
     */
    @Override
    public List<BusinessAddresses> selectBusinessAddressesList(BusinessAddresses businessAddresses)
    {
        return businessAddressesMapper.selectBusinessAddressesList(businessAddresses);
    }

    /**
     * 新增业务逻辑ip
     * 
     * @param businessAddresses 业务逻辑ip
     * @return 结果
     */
    @Override
    public int insertBusinessAddresses(BusinessAddresses businessAddresses)
    {
        return businessAddressesMapper.insertBusinessAddresses(businessAddresses);
    }

    /**
     * 修改业务逻辑ip
     * 
     * @param businessAddresses 业务逻辑ip
     * @return 结果
     */
    @Override
    public int updateBusinessAddresses(BusinessAddresses businessAddresses)
    {
        return businessAddressesMapper.updateBusinessAddresses(businessAddresses);
    }

    /**
     * 批量删除业务逻辑ip
     * 
     * @param ids 需要删除的业务逻辑ip主键
     * @return 结果
     */
    @Override
    public int deleteBusinessAddressesByIds(Long[] ids)
    {
        return businessAddressesMapper.deleteBusinessAddressesByIds(ids);
    }

    /**
     * 删除业务逻辑ip信息
     * 
     * @param id 业务逻辑ip主键
     * @return 结果
     */
    @Override
    public int deleteBusinessAddressesById(Long id)
    {
        return businessAddressesMapper.deleteBusinessAddressesById(id);
    }
}
