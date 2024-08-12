package com.ruoyi.unicom.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 业务逻辑ip对象 business_addresses
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public class BusinessAddresses extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识 */
    private Long id;

    /** 请求业务地址数 */
    @Excel(name = "请求业务地址数")
    private Long requestedAddresses;

    /** 业务地址掩码 */
    @Excel(name = "业务地址掩码")
    private String addressMask;

    /** 业务地址子网掩码 */
    @Excel(name = "业务地址子网掩码")
    private String subnetMask;

    /** 业务地址网络地址 */
    @Excel(name = "业务地址网络地址")
    private String networkAddress;

    /** 业务地址网关地址 */
    @Excel(name = "业务地址网关地址")
    private String gatewayAddress;

    /** 业务地址使用地址 */
    @Excel(name = "业务地址使用地址")
    private String usedAddress;

    /** 业务地址空闲地址 */
    @Excel(name = "业务地址空闲地址")
    private String freeAddress;

    /** 业务地址广播地址 */
    @Excel(name = "业务地址广播地址")
    private String broadcastAddress;

    /** 业务静态地址段 */
    @Excel(name = "业务静态地址段")
    private String staticAddressRange;

    /** 业务编码 */
    @Excel(name = "业务编码")
    private String serviceCode;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRequestedAddresses(Long requestedAddresses) 
    {
        this.requestedAddresses = requestedAddresses;
    }

    public Long getRequestedAddresses() 
    {
        return requestedAddresses;
    }
    public void setAddressMask(String addressMask) 
    {
        this.addressMask = addressMask;
    }

    public String getAddressMask() 
    {
        return addressMask;
    }
    public void setSubnetMask(String subnetMask) 
    {
        this.subnetMask = subnetMask;
    }

    public String getSubnetMask() 
    {
        return subnetMask;
    }
    public void setNetworkAddress(String networkAddress) 
    {
        this.networkAddress = networkAddress;
    }

    public String getNetworkAddress() 
    {
        return networkAddress;
    }
    public void setGatewayAddress(String gatewayAddress) 
    {
        this.gatewayAddress = gatewayAddress;
    }

    public String getGatewayAddress() 
    {
        return gatewayAddress;
    }
    public void setUsedAddress(String usedAddress) 
    {
        this.usedAddress = usedAddress;
    }

    public String getUsedAddress() 
    {
        return usedAddress;
    }
    public void setFreeAddress(String freeAddress) 
    {
        this.freeAddress = freeAddress;
    }

    public String getFreeAddress() 
    {
        return freeAddress;
    }
    public void setBroadcastAddress(String broadcastAddress) 
    {
        this.broadcastAddress = broadcastAddress;
    }

    public String getBroadcastAddress() 
    {
        return broadcastAddress;
    }
    public void setStaticAddressRange(String staticAddressRange) 
    {
        this.staticAddressRange = staticAddressRange;
    }

    public String getStaticAddressRange() 
    {
        return staticAddressRange;
    }
    public void setServiceCode(String serviceCode) 
    {
        this.serviceCode = serviceCode;
    }

    public String getServiceCode() 
    {
        return serviceCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("requestedAddresses", getRequestedAddresses())
            .append("addressMask", getAddressMask())
            .append("subnetMask", getSubnetMask())
            .append("networkAddress", getNetworkAddress())
            .append("gatewayAddress", getGatewayAddress())
            .append("usedAddress", getUsedAddress())
            .append("freeAddress", getFreeAddress())
            .append("broadcastAddress", getBroadcastAddress())
            .append("staticAddressRange", getStaticAddressRange())
            .append("serviceCode", getServiceCode())
            .toString();
    }
}
