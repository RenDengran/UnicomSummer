package com.ruoyi.unicom.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * ipran设备配置对象 ipran_equipment
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public class IpranEquipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识 */
    private Long id;

    /** 设备 */
    @Excel(name = "设备")
    private String device;

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

    /** 汇聚口 */
    @Excel(name = "汇聚口")
    private String aggregationPort;

    /** 传输归属区域 */
    @Excel(name = "传输归属区域")
    private String transmissionArea;

    /** 传输网元编号 */
    @Excel(name = "传输网元编号")
    private String transmissionElementId;

    /** 传输网元名称 */
    @Excel(name = "传输网元名称")
    private String transmissionElementName;

    /** 传输网元管理IP */
    @Excel(name = "传输网元管理IP")
    private String transmissionElementMgmtIp;

    /** 接入设备类型 */
    @Excel(name = "接入设备类型")
    private String accessDeviceType;

    /** 传输厂商 */
    @Excel(name = "传输厂商")
    private String transmissionVendor;

    /** 调单号 */
    @Excel(name = "调单号")
    private String workOrderNumber;

    /** 业务分类 */
    @Excel(name = "业务分类")
    private String serviceCategory;

    /** 业务号码 */
    @Excel(name = "业务号码")
    private String serviceNumber;

    /** 电路编号 */
    @Excel(name = "电路编号")
    private String circuitId;

    /** 业务类型 */
    @Excel(name = "业务类型")
    private String serviceType;

    /** 电路带宽 */
    @Excel(name = "电路带宽")
    private String circuitBandwidth;

    /** A端客户名 */
    @Excel(name = "A端客户名")
    private String aEndCustomerName;

    /** A端接入设备接口 */
    @Excel(name = "A端接入设备接口")
    private String aEndAccessDeviceInterface;

    /** 子端口号 */
    @Excel(name = "子端口号")
    private Long subPortNumber;

    /** A端IPV4地址 */
    @Excel(name = "A端IPV4地址")
    private String aEndIpv4Address;

    /** Z端客户名 */
    @Excel(name = "Z端客户名")
    private String zEndCustomerName;

    /** Z端接入设备接口 */
    @Excel(name = "Z端接入设备接口")
    private String zEndAccessDeviceInterface;

    /** Z端IPV4地址 */
    @Excel(name = "Z端IPV4地址")
    private String zEndIpv4Address;

    /** 省管设备转接信息 */
    @Excel(name = "省管设备转接信息")
    private String provincialEquipmentConnectionInfo;

    /** 外层vlan */
    @Excel(name = "外层vlan")
    private Long outerVlan;

    /** IPV4地址 */
    @Excel(name = "IPV4地址")
    private String ipv4Address;

    /** 基站编号 */
    @Excel(name = "基站编号")
    private String baseStationId;

    /** 站名 */
    @Excel(name = "站名")
    private String stationName;

    /** 基站网管VLAN */
    @Excel(name = "基站网管VLAN")
    private Long baseStationNetworkMgmtVlan;

    /** 网管端口IP掩码 */
    @Excel(name = "网管端口IP掩码")
    private String networkMgmtPortIpMask;

    /** 网管端口IP（传输侧） */
    @Excel(name = "网管端口IP", readConverterExp = "传=输侧")
    private String networkMgmtPortIpTransmissionSide;

    /** 网管端口IP（业务侧） */
    @Excel(name = "网管端口IP", readConverterExp = "业=务侧")
    private String networkMgmtPortIpServiceSide;

    /** 业务VLAN号 */
    @Excel(name = "业务VLAN号")
    private Long businessVlanNumber;

    /** 业务端口IP掩码 */
    @Excel(name = "业务端口IP掩码")
    private String businessPortIpMask;

    /** 业务端口IP（传输侧） */
    @Excel(name = "业务端口IP", readConverterExp = "传=输侧")
    private String businessPortIpTransmissionSide;

    /** 基站业务端口IP（基站侧） */
    @Excel(name = "基站业务端口IP", readConverterExp = "基=站侧")
    private String baseStationBusinessPortIpStationSide;

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
    public void setDevice(String device) 
    {
        this.device = device;
    }

    public String getDevice() 
    {
        return device;
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
    public void setAggregationPort(String aggregationPort) 
    {
        this.aggregationPort = aggregationPort;
    }

    public String getAggregationPort() 
    {
        return aggregationPort;
    }
    public void setTransmissionArea(String transmissionArea) 
    {
        this.transmissionArea = transmissionArea;
    }

    public String getTransmissionArea() 
    {
        return transmissionArea;
    }
    public void setTransmissionElementId(String transmissionElementId) 
    {
        this.transmissionElementId = transmissionElementId;
    }

    public String getTransmissionElementId() 
    {
        return transmissionElementId;
    }
    public void setTransmissionElementName(String transmissionElementName) 
    {
        this.transmissionElementName = transmissionElementName;
    }

    public String getTransmissionElementName() 
    {
        return transmissionElementName;
    }
    public void setTransmissionElementMgmtIp(String transmissionElementMgmtIp) 
    {
        this.transmissionElementMgmtIp = transmissionElementMgmtIp;
    }

    public String getTransmissionElementMgmtIp() 
    {
        return transmissionElementMgmtIp;
    }
    public void setAccessDeviceType(String accessDeviceType) 
    {
        this.accessDeviceType = accessDeviceType;
    }

    public String getAccessDeviceType() 
    {
        return accessDeviceType;
    }
    public void setTransmissionVendor(String transmissionVendor) 
    {
        this.transmissionVendor = transmissionVendor;
    }

    public String getTransmissionVendor() 
    {
        return transmissionVendor;
    }
    public void setWorkOrderNumber(String workOrderNumber) 
    {
        this.workOrderNumber = workOrderNumber;
    }

    public String getWorkOrderNumber() 
    {
        return workOrderNumber;
    }
    public void setServiceCategory(String serviceCategory) 
    {
        this.serviceCategory = serviceCategory;
    }

    public String getServiceCategory() 
    {
        return serviceCategory;
    }
    public void setServiceNumber(String serviceNumber) 
    {
        this.serviceNumber = serviceNumber;
    }

    public String getServiceNumber() 
    {
        return serviceNumber;
    }
    public void setCircuitId(String circuitId) 
    {
        this.circuitId = circuitId;
    }

    public String getCircuitId() 
    {
        return circuitId;
    }
    public void setServiceType(String serviceType) 
    {
        this.serviceType = serviceType;
    }

    public String getServiceType() 
    {
        return serviceType;
    }
    public void setCircuitBandwidth(String circuitBandwidth) 
    {
        this.circuitBandwidth = circuitBandwidth;
    }

    public String getCircuitBandwidth() 
    {
        return circuitBandwidth;
    }
    public void setaEndCustomerName(String aEndCustomerName) 
    {
        this.aEndCustomerName = aEndCustomerName;
    }

    public String getaEndCustomerName() 
    {
        return aEndCustomerName;
    }
    public void setaEndAccessDeviceInterface(String aEndAccessDeviceInterface) 
    {
        this.aEndAccessDeviceInterface = aEndAccessDeviceInterface;
    }

    public String getaEndAccessDeviceInterface() 
    {
        return aEndAccessDeviceInterface;
    }
    public void setSubPortNumber(Long subPortNumber) 
    {
        this.subPortNumber = subPortNumber;
    }

    public Long getSubPortNumber() 
    {
        return subPortNumber;
    }
    public void setaEndIpv4Address(String aEndIpv4Address) 
    {
        this.aEndIpv4Address = aEndIpv4Address;
    }

    public String getaEndIpv4Address() 
    {
        return aEndIpv4Address;
    }
    public void setzEndCustomerName(String zEndCustomerName) 
    {
        this.zEndCustomerName = zEndCustomerName;
    }

    public String getzEndCustomerName() 
    {
        return zEndCustomerName;
    }
    public void setzEndAccessDeviceInterface(String zEndAccessDeviceInterface) 
    {
        this.zEndAccessDeviceInterface = zEndAccessDeviceInterface;
    }

    public String getzEndAccessDeviceInterface() 
    {
        return zEndAccessDeviceInterface;
    }
    public void setzEndIpv4Address(String zEndIpv4Address) 
    {
        this.zEndIpv4Address = zEndIpv4Address;
    }

    public String getzEndIpv4Address() 
    {
        return zEndIpv4Address;
    }
    public void setProvincialEquipmentConnectionInfo(String provincialEquipmentConnectionInfo) 
    {
        this.provincialEquipmentConnectionInfo = provincialEquipmentConnectionInfo;
    }

    public String getProvincialEquipmentConnectionInfo() 
    {
        return provincialEquipmentConnectionInfo;
    }
    public void setOuterVlan(Long outerVlan) 
    {
        this.outerVlan = outerVlan;
    }

    public Long getOuterVlan() 
    {
        return outerVlan;
    }
    public void setIpv4Address(String ipv4Address) 
    {
        this.ipv4Address = ipv4Address;
    }

    public String getIpv4Address() 
    {
        return ipv4Address;
    }
    public void setBaseStationId(String baseStationId) 
    {
        this.baseStationId = baseStationId;
    }

    public String getBaseStationId() 
    {
        return baseStationId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setBaseStationNetworkMgmtVlan(Long baseStationNetworkMgmtVlan) 
    {
        this.baseStationNetworkMgmtVlan = baseStationNetworkMgmtVlan;
    }

    public Long getBaseStationNetworkMgmtVlan() 
    {
        return baseStationNetworkMgmtVlan;
    }
    public void setNetworkMgmtPortIpMask(String networkMgmtPortIpMask) 
    {
        this.networkMgmtPortIpMask = networkMgmtPortIpMask;
    }

    public String getNetworkMgmtPortIpMask() 
    {
        return networkMgmtPortIpMask;
    }
    public void setNetworkMgmtPortIpTransmissionSide(String networkMgmtPortIpTransmissionSide) 
    {
        this.networkMgmtPortIpTransmissionSide = networkMgmtPortIpTransmissionSide;
    }

    public String getNetworkMgmtPortIpTransmissionSide() 
    {
        return networkMgmtPortIpTransmissionSide;
    }
    public void setNetworkMgmtPortIpServiceSide(String networkMgmtPortIpServiceSide) 
    {
        this.networkMgmtPortIpServiceSide = networkMgmtPortIpServiceSide;
    }

    public String getNetworkMgmtPortIpServiceSide() 
    {
        return networkMgmtPortIpServiceSide;
    }
    public void setBusinessVlanNumber(Long businessVlanNumber) 
    {
        this.businessVlanNumber = businessVlanNumber;
    }

    public Long getBusinessVlanNumber() 
    {
        return businessVlanNumber;
    }
    public void setBusinessPortIpMask(String businessPortIpMask) 
    {
        this.businessPortIpMask = businessPortIpMask;
    }

    public String getBusinessPortIpMask() 
    {
        return businessPortIpMask;
    }
    public void setBusinessPortIpTransmissionSide(String businessPortIpTransmissionSide) 
    {
        this.businessPortIpTransmissionSide = businessPortIpTransmissionSide;
    }

    public String getBusinessPortIpTransmissionSide() 
    {
        return businessPortIpTransmissionSide;
    }
    public void setBaseStationBusinessPortIpStationSide(String baseStationBusinessPortIpStationSide) 
    {
        this.baseStationBusinessPortIpStationSide = baseStationBusinessPortIpStationSide;
    }

    public String getBaseStationBusinessPortIpStationSide() 
    {
        return baseStationBusinessPortIpStationSide;
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
            .append("device", getDevice())
            .append("frame", getFrame())
            .append("slot", getSlot())
            .append("subCard", getSubCard())
            .append("port", getPort())
            .append("subPort", getSubPort())
            .append("aggregationPort", getAggregationPort())
            .append("transmissionArea", getTransmissionArea())
            .append("transmissionElementId", getTransmissionElementId())
            .append("transmissionElementName", getTransmissionElementName())
            .append("transmissionElementMgmtIp", getTransmissionElementMgmtIp())
            .append("accessDeviceType", getAccessDeviceType())
            .append("transmissionVendor", getTransmissionVendor())
            .append("workOrderNumber", getWorkOrderNumber())
            .append("serviceCategory", getServiceCategory())
            .append("serviceNumber", getServiceNumber())
            .append("circuitId", getCircuitId())
            .append("serviceType", getServiceType())
            .append("circuitBandwidth", getCircuitBandwidth())
            .append("aEndCustomerName", getaEndCustomerName())
            .append("aEndAccessDeviceInterface", getaEndAccessDeviceInterface())
            .append("subPortNumber", getSubPortNumber())
            .append("aEndIpv4Address", getaEndIpv4Address())
            .append("zEndCustomerName", getzEndCustomerName())
            .append("zEndAccessDeviceInterface", getzEndAccessDeviceInterface())
            .append("zEndIpv4Address", getzEndIpv4Address())
            .append("provincialEquipmentConnectionInfo", getProvincialEquipmentConnectionInfo())
            .append("outerVlan", getOuterVlan())
            .append("ipv4Address", getIpv4Address())
            .append("baseStationId", getBaseStationId())
            .append("stationName", getStationName())
            .append("baseStationNetworkMgmtVlan", getBaseStationNetworkMgmtVlan())
            .append("networkMgmtPortIpMask", getNetworkMgmtPortIpMask())
            .append("networkMgmtPortIpTransmissionSide", getNetworkMgmtPortIpTransmissionSide())
            .append("networkMgmtPortIpServiceSide", getNetworkMgmtPortIpServiceSide())
            .append("businessVlanNumber", getBusinessVlanNumber())
            .append("businessPortIpMask", getBusinessPortIpMask())
            .append("businessPortIpTransmissionSide", getBusinessPortIpTransmissionSide())
            .append("baseStationBusinessPortIpStationSide", getBaseStationBusinessPortIpStationSide())
            .append("remarks", getRemarks())
            .toString();
    }
}
