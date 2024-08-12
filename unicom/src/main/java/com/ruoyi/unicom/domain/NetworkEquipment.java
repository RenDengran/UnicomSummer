package com.ruoyi.unicom.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 网络配置对象 network_equipment
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public class NetworkEquipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识 */
    private Long id;

    /** 区县 */
    @Excel(name = "区县")
    private String district;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String model;

    /** 管理IP-1 */
    @Excel(name = "管理IP-1")
    private String managementIp1;

    /** 管理IP-2 */
    @Excel(name = "管理IP-2")
    private String managementIp2;

    /** 设备框 */
    @Excel(name = "设备框")
    private Long frame;

    /** 设备槽 */
    @Excel(name = "设备槽")
    private Long slot;

    /** 设备子卡 */
    @Excel(name = "设备子卡")
    private Long subCard;

    /** 设备端口 */
    @Excel(name = "设备端口")
    private Long port;

    /** 设备子端口 */
    @Excel(name = "设备子端口")
    private Long subPort;

    /** 业务分类 */
    @Excel(name = "业务分类")
    private Long serviceCategory;

    /** 业务编码 */
    @Excel(name = "业务编码")
    private String serviceCode;

    /** 业务状态 */
    @Excel(name = "业务状态")
    private Long serviceStatus;

    /** 带宽 */
    @Excel(name = "带宽")
    private Long bandwidth;

    /** Z端设备型号 */
    @Excel(name = "Z端设备型号")
    private String zSideModel;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 外层vlan组 */
    @Excel(name = "外层vlan组")
    private String outerVlanGroup;

    /** 外层vlan值 */
    @Excel(name = "外层vlan值")
    private String outerVlanValue;

    /** 内层vlan组 */
    @Excel(name = "内层vlan组")
    private String innerVlanGroup;

    /** 内层vlan值 */
    @Excel(name = "内层vlan值")
    private String innerVlanValue;

    /** 请求IP地址数 */
    @Excel(name = "请求IP地址数")
    private String requestedIpCount;

    /** 网关IP地址 */
    @Excel(name = "网关IP地址")
    private String gatewayIp;

    /** 业务IP地址 */
    @Excel(name = "业务IP地址")
    private String businessIp;

    /** 序列号loid */
    @Excel(name = "序列号loid")
    private String serialNumber;

    /** VPN实例名称 */
    @Excel(name = "VPN实例名称")
    private String vpnInstanceName;

    /** VPN-RD */
    @Excel(name = "VPN-RD")
    private String vpnRd;

    /** VPN-RT */
    @Excel(name = "VPN-RT")
    private String vpnRt;

    /** 用户端互联地址 */
    @Excel(name = "用户端互联地址")
    private String userInterconnectAddress;

    /** 调单号 */
    @Excel(name = "调单号")
    private String orderNumber;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setManagementIp1(String managementIp1) 
    {
        this.managementIp1 = managementIp1;
    }

    public String getManagementIp1() 
    {
        return managementIp1;
    }
    public void setManagementIp2(String managementIp2) 
    {
        this.managementIp2 = managementIp2;
    }

    public String getManagementIp2() 
    {
        return managementIp2;
    }
    public void setFrame(Long frame) 
    {
        this.frame = frame;
    }

    public Long getFrame() 
    {
        return frame;
    }
    public void setSlot(Long slot) 
    {
        this.slot = slot;
    }

    public Long getSlot() 
    {
        return slot;
    }
    public void setSubCard(Long subCard) 
    {
        this.subCard = subCard;
    }

    public Long getSubCard() 
    {
        return subCard;
    }
    public void setPort(Long port) 
    {
        this.port = port;
    }

    public Long getPort() 
    {
        return port;
    }
    public void setSubPort(Long subPort) 
    {
        this.subPort = subPort;
    }

    public Long getSubPort() 
    {
        return subPort;
    }
    public void setServiceCategory(Long serviceCategory) 
    {
        this.serviceCategory = serviceCategory;
    }

    public Long getServiceCategory() 
    {
        return serviceCategory;
    }
    public void setServiceCode(String serviceCode) 
    {
        this.serviceCode = serviceCode;
    }

    public String getServiceCode() 
    {
        return serviceCode;
    }
    public void setServiceStatus(Long serviceStatus) 
    {
        this.serviceStatus = serviceStatus;
    }

    public Long getServiceStatus() 
    {
        return serviceStatus;
    }
    public void setBandwidth(Long bandwidth) 
    {
        this.bandwidth = bandwidth;
    }

    public Long getBandwidth() 
    {
        return bandwidth;
    }
    public void setzSideModel(String zSideModel) 
    {
        this.zSideModel = zSideModel;
    }

    public String getzSideModel() 
    {
        return zSideModel;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setOuterVlanGroup(String outerVlanGroup) 
    {
        this.outerVlanGroup = outerVlanGroup;
    }

    public String getOuterVlanGroup() 
    {
        return outerVlanGroup;
    }
    public void setOuterVlanValue(String outerVlanValue) 
    {
        this.outerVlanValue = outerVlanValue;
    }

    public String getOuterVlanValue() 
    {
        return outerVlanValue;
    }
    public void setInnerVlanGroup(String innerVlanGroup) 
    {
        this.innerVlanGroup = innerVlanGroup;
    }

    public String getInnerVlanGroup() 
    {
        return innerVlanGroup;
    }
    public void setInnerVlanValue(String innerVlanValue) 
    {
        this.innerVlanValue = innerVlanValue;
    }

    public String getInnerVlanValue() 
    {
        return innerVlanValue;
    }
    public void setRequestedIpCount(String requestedIpCount) 
    {
        this.requestedIpCount = requestedIpCount;
    }

    public String getRequestedIpCount() 
    {
        return requestedIpCount;
    }
    public void setGatewayIp(String gatewayIp) 
    {
        this.gatewayIp = gatewayIp;
    }

    public String getGatewayIp() 
    {
        return gatewayIp;
    }
    public void setBusinessIp(String businessIp) 
    {
        this.businessIp = businessIp;
    }

    public String getBusinessIp() 
    {
        return businessIp;
    }
    public void setSerialNumber(String serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() 
    {
        return serialNumber;
    }
    public void setVpnInstanceName(String vpnInstanceName) 
    {
        this.vpnInstanceName = vpnInstanceName;
    }

    public String getVpnInstanceName() 
    {
        return vpnInstanceName;
    }
    public void setVpnRd(String vpnRd) 
    {
        this.vpnRd = vpnRd;
    }

    public String getVpnRd() 
    {
        return vpnRd;
    }
    public void setVpnRt(String vpnRt) 
    {
        this.vpnRt = vpnRt;
    }

    public String getVpnRt() 
    {
        return vpnRt;
    }
    public void setUserInterconnectAddress(String userInterconnectAddress) 
    {
        this.userInterconnectAddress = userInterconnectAddress;
    }

    public String getUserInterconnectAddress() 
    {
        return userInterconnectAddress;
    }
    public void setOrderNumber(String orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() 
    {
        return orderNumber;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("district", getDistrict())
            .append("deviceName", getDeviceName())
            .append("model", getModel())
            .append("managementIp1", getManagementIp1())
            .append("managementIp2", getManagementIp2())
            .append("frame", getFrame())
            .append("slot", getSlot())
            .append("subCard", getSubCard())
            .append("port", getPort())
            .append("subPort", getSubPort())
            .append("serviceCategory", getServiceCategory())
            .append("serviceCode", getServiceCode())
            .append("serviceStatus", getServiceStatus())
            .append("bandwidth", getBandwidth())
            .append("zSideModel", getzSideModel())
            .append("customerName", getCustomerName())
            .append("outerVlanGroup", getOuterVlanGroup())
            .append("outerVlanValue", getOuterVlanValue())
            .append("innerVlanGroup", getInnerVlanGroup())
            .append("innerVlanValue", getInnerVlanValue())
            .append("requestedIpCount", getRequestedIpCount())
            .append("gatewayIp", getGatewayIp())
            .append("businessIp", getBusinessIp())
            .append("serialNumber", getSerialNumber())
            .append("vpnInstanceName", getVpnInstanceName())
            .append("vpnRd", getVpnRd())
            .append("vpnRt", getVpnRt())
            .append("userInterconnectAddress", getUserInterconnectAddress())
            .append("orderNumber", getOrderNumber())
            .append("remarks", getRemarks())
            .toString();
    }
}
