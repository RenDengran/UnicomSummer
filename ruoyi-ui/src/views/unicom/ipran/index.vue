<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="设备" prop="device">
        <el-input
          v-model="queryParams.device"
          placeholder="请输入设备"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备框" prop="frame">
        <el-input
          v-model="queryParams.frame"
          placeholder="请输入设备框"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备槽" prop="slot">
        <el-input
          v-model="queryParams.slot"
          placeholder="请输入设备槽"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备子卡" prop="subCard">
        <el-input
          v-model="queryParams.subCard"
          placeholder="请输入设备子卡"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备端口" prop="port">
        <el-input
          v-model="queryParams.port"
          placeholder="请输入设备端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备子端口" prop="subPort">
        <el-input
          v-model="queryParams.subPort"
          placeholder="请输入设备子端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="汇聚口" prop="aggregationPort">
        <el-input
          v-model="queryParams.aggregationPort"
          placeholder="请输入汇聚口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="传输归属区域" prop="transmissionArea">
        <el-input
          v-model="queryParams.transmissionArea"
          placeholder="请输入传输归属区域"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="传输网元编号" prop="transmissionElementId">
        <el-input
          v-model="queryParams.transmissionElementId"
          placeholder="请输入传输网元编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="传输网元名称" prop="transmissionElementName">
        <el-input
          v-model="queryParams.transmissionElementName"
          placeholder="请输入传输网元名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="传输网元管理IP" prop="transmissionElementMgmtIp">
        <el-input
          v-model="queryParams.transmissionElementMgmtIp"
          placeholder="请输入传输网元管理IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="传输厂商" prop="transmissionVendor">
        <el-input
          v-model="queryParams.transmissionVendor"
          placeholder="请输入传输厂商"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="调单号" prop="workOrderNumber">
        <el-input
          v-model="queryParams.workOrderNumber"
          placeholder="请输入调单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务分类" prop="serviceCategory">
        <el-input
          v-model="queryParams.serviceCategory"
          placeholder="请输入业务分类"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务号码" prop="serviceNumber">
        <el-input
          v-model="queryParams.serviceNumber"
          placeholder="请输入业务号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电路编号" prop="circuitId">
        <el-input
          v-model="queryParams.circuitId"
          placeholder="请输入电路编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电路带宽" prop="circuitBandwidth">
        <el-input
          v-model="queryParams.circuitBandwidth"
          placeholder="请输入电路带宽"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A端客户名" prop="aEndCustomerName">
        <el-input
          v-model="queryParams.aEndCustomerName"
          placeholder="请输入A端客户名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A端接入设备接口" prop="aEndAccessDeviceInterface">
        <el-input
          v-model="queryParams.aEndAccessDeviceInterface"
          placeholder="请输入A端接入设备接口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="子端口号" prop="subPortNumber">
        <el-input
          v-model="queryParams.subPortNumber"
          placeholder="请输入子端口号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A端IPV4地址" prop="aEndIpv4Address">
        <el-input
          v-model="queryParams.aEndIpv4Address"
          placeholder="请输入A端IPV4地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="Z端客户名" prop="zEndCustomerName">
        <el-input
          v-model="queryParams.zEndCustomerName"
          placeholder="请输入Z端客户名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="Z端接入设备接口" prop="zEndAccessDeviceInterface">
        <el-input
          v-model="queryParams.zEndAccessDeviceInterface"
          placeholder="请输入Z端接入设备接口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="Z端IPV4地址" prop="zEndIpv4Address">
        <el-input
          v-model="queryParams.zEndIpv4Address"
          placeholder="请输入Z端IPV4地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="省管设备转接信息" prop="provincialEquipmentConnectionInfo">
        <el-input
          v-model="queryParams.provincialEquipmentConnectionInfo"
          placeholder="请输入省管设备转接信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外层vlan" prop="outerVlan">
        <el-input
          v-model="queryParams.outerVlan"
          placeholder="请输入外层vlan"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="IPV4地址" prop="ipv4Address">
        <el-input
          v-model="queryParams.ipv4Address"
          placeholder="请输入IPV4地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="基站编号" prop="baseStationId">
        <el-input
          v-model="queryParams.baseStationId"
          placeholder="请输入基站编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="站名" prop="stationName">
        <el-input
          v-model="queryParams.stationName"
          placeholder="请输入站名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="基站网管VLAN" prop="baseStationNetworkMgmtVlan">
        <el-input
          v-model="queryParams.baseStationNetworkMgmtVlan"
          placeholder="请输入基站网管VLAN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网管端口IP掩码" prop="networkMgmtPortIpMask">
        <el-input
          v-model="queryParams.networkMgmtPortIpMask"
          placeholder="请输入网管端口IP掩码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网管端口IP" prop="networkMgmtPortIpTransmissionSide">
        <el-input
          v-model="queryParams.networkMgmtPortIpTransmissionSide"
          placeholder="请输入网管端口IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网管端口IP" prop="networkMgmtPortIpServiceSide">
        <el-input
          v-model="queryParams.networkMgmtPortIpServiceSide"
          placeholder="请输入网管端口IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务VLAN号" prop="businessVlanNumber">
        <el-input
          v-model="queryParams.businessVlanNumber"
          placeholder="请输入业务VLAN号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务端口IP掩码" prop="businessPortIpMask">
        <el-input
          v-model="queryParams.businessPortIpMask"
          placeholder="请输入业务端口IP掩码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务端口IP" prop="businessPortIpTransmissionSide">
        <el-input
          v-model="queryParams.businessPortIpTransmissionSide"
          placeholder="请输入业务端口IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="基站业务端口IP" prop="baseStationBusinessPortIpStationSide">
        <el-input
          v-model="queryParams.baseStationBusinessPortIpStationSide"
          placeholder="请输入基站业务端口IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="remarks">
        <el-input
          v-model="queryParams.remarks"
          placeholder="请输入备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['unicom:ipran:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['unicom:ipran:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['unicom:ipran:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['unicom:ipran:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="ipranList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="记录唯一标识" align="center" prop="id" />
      <el-table-column label="设备" align="center" prop="device" />
      <el-table-column label="设备框" align="center" prop="frame" />
      <el-table-column label="设备槽" align="center" prop="slot" />
      <el-table-column label="设备子卡" align="center" prop="subCard" />
      <el-table-column label="设备端口" align="center" prop="port" />
      <el-table-column label="设备子端口" align="center" prop="subPort" />
      <el-table-column label="汇聚口" align="center" prop="aggregationPort" />
      <el-table-column label="传输归属区域" align="center" prop="transmissionArea" />
      <el-table-column label="传输网元编号" align="center" prop="transmissionElementId" />
      <el-table-column label="传输网元名称" align="center" prop="transmissionElementName" />
      <el-table-column label="传输网元管理IP" align="center" prop="transmissionElementMgmtIp" />
      <el-table-column label="接入设备类型" align="center" prop="accessDeviceType" />
      <el-table-column label="传输厂商" align="center" prop="transmissionVendor" />
      <el-table-column label="调单号" align="center" prop="workOrderNumber" />
      <el-table-column label="业务分类" align="center" prop="serviceCategory" />
      <el-table-column label="业务号码" align="center" prop="serviceNumber" />
      <el-table-column label="电路编号" align="center" prop="circuitId" />
      <el-table-column label="业务类型" align="center" prop="serviceType" />
      <el-table-column label="电路带宽" align="center" prop="circuitBandwidth" />
      <el-table-column label="A端客户名" align="center" prop="aEndCustomerName" />
      <el-table-column label="A端接入设备接口" align="center" prop="aEndAccessDeviceInterface" />
      <el-table-column label="子端口号" align="center" prop="subPortNumber" />
      <el-table-column label="A端IPV4地址" align="center" prop="aEndIpv4Address" />
      <el-table-column label="Z端客户名" align="center" prop="zEndCustomerName" />
      <el-table-column label="Z端接入设备接口" align="center" prop="zEndAccessDeviceInterface" />
      <el-table-column label="Z端IPV4地址" align="center" prop="zEndIpv4Address" />
      <el-table-column label="省管设备转接信息" align="center" prop="provincialEquipmentConnectionInfo" />
      <el-table-column label="外层vlan" align="center" prop="outerVlan" />
      <el-table-column label="IPV4地址" align="center" prop="ipv4Address" />
      <el-table-column label="基站编号" align="center" prop="baseStationId" />
      <el-table-column label="站名" align="center" prop="stationName" />
      <el-table-column label="基站网管VLAN" align="center" prop="baseStationNetworkMgmtVlan" />
      <el-table-column label="网管端口IP掩码" align="center" prop="networkMgmtPortIpMask" />
      <el-table-column label="网管端口IP" align="center" prop="networkMgmtPortIpTransmissionSide" />
      <el-table-column label="网管端口IP" align="center" prop="networkMgmtPortIpServiceSide" />
      <el-table-column label="业务VLAN号" align="center" prop="businessVlanNumber" />
      <el-table-column label="业务端口IP掩码" align="center" prop="businessPortIpMask" />
      <el-table-column label="业务端口IP" align="center" prop="businessPortIpTransmissionSide" />
      <el-table-column label="基站业务端口IP" align="center" prop="baseStationBusinessPortIpStationSide" />
      <el-table-column label="备注" align="center" prop="remarks" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['unicom:ipran:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['unicom:ipran:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改ipran设备配置对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="设备" prop="device">
          <el-input v-model="form.device" placeholder="请输入设备" />
        </el-form-item>
        <el-form-item label="设备框" prop="frame">
          <el-input v-model="form.frame" placeholder="请输入设备框" />
        </el-form-item>
        <el-form-item label="设备槽" prop="slot">
          <el-input v-model="form.slot" placeholder="请输入设备槽" />
        </el-form-item>
        <el-form-item label="设备子卡" prop="subCard">
          <el-input v-model="form.subCard" placeholder="请输入设备子卡" />
        </el-form-item>
        <el-form-item label="设备端口" prop="port">
          <el-input v-model="form.port" placeholder="请输入设备端口" />
        </el-form-item>
        <el-form-item label="设备子端口" prop="subPort">
          <el-input v-model="form.subPort" placeholder="请输入设备子端口" />
        </el-form-item>
        <el-form-item label="汇聚口" prop="aggregationPort">
          <el-input v-model="form.aggregationPort" placeholder="请输入汇聚口" />
        </el-form-item>
        <el-form-item label="传输归属区域" prop="transmissionArea">
          <el-input v-model="form.transmissionArea" placeholder="请输入传输归属区域" />
        </el-form-item>
        <el-form-item label="传输网元编号" prop="transmissionElementId">
          <el-input v-model="form.transmissionElementId" placeholder="请输入传输网元编号" />
        </el-form-item>
        <el-form-item label="传输网元名称" prop="transmissionElementName">
          <el-input v-model="form.transmissionElementName" placeholder="请输入传输网元名称" />
        </el-form-item>
        <el-form-item label="传输网元管理IP" prop="transmissionElementMgmtIp">
          <el-input v-model="form.transmissionElementMgmtIp" placeholder="请输入传输网元管理IP" />
        </el-form-item>
        <el-form-item label="传输厂商" prop="transmissionVendor">
          <el-input v-model="form.transmissionVendor" placeholder="请输入传输厂商" />
        </el-form-item>
        <el-form-item label="调单号" prop="workOrderNumber">
          <el-input v-model="form.workOrderNumber" placeholder="请输入调单号" />
        </el-form-item>
        <el-form-item label="业务分类" prop="serviceCategory">
          <el-input v-model="form.serviceCategory" placeholder="请输入业务分类" />
        </el-form-item>
        <el-form-item label="业务号码" prop="serviceNumber">
          <el-input v-model="form.serviceNumber" placeholder="请输入业务号码" />
        </el-form-item>
        <el-form-item label="电路编号" prop="circuitId">
          <el-input v-model="form.circuitId" placeholder="请输入电路编号" />
        </el-form-item>
        <el-form-item label="电路带宽" prop="circuitBandwidth">
          <el-input v-model="form.circuitBandwidth" placeholder="请输入电路带宽" />
        </el-form-item>
        <el-form-item label="A端客户名" prop="aEndCustomerName">
          <el-input v-model="form.aEndCustomerName" placeholder="请输入A端客户名" />
        </el-form-item>
        <el-form-item label="A端接入设备接口" prop="aEndAccessDeviceInterface">
          <el-input v-model="form.aEndAccessDeviceInterface" placeholder="请输入A端接入设备接口" />
        </el-form-item>
        <el-form-item label="子端口号" prop="subPortNumber">
          <el-input v-model="form.subPortNumber" placeholder="请输入子端口号" />
        </el-form-item>
        <el-form-item label="A端IPV4地址" prop="aEndIpv4Address">
          <el-input v-model="form.aEndIpv4Address" placeholder="请输入A端IPV4地址" />
        </el-form-item>
        <el-form-item label="Z端客户名" prop="zEndCustomerName">
          <el-input v-model="form.zEndCustomerName" placeholder="请输入Z端客户名" />
        </el-form-item>
        <el-form-item label="Z端接入设备接口" prop="zEndAccessDeviceInterface">
          <el-input v-model="form.zEndAccessDeviceInterface" placeholder="请输入Z端接入设备接口" />
        </el-form-item>
        <el-form-item label="Z端IPV4地址" prop="zEndIpv4Address">
          <el-input v-model="form.zEndIpv4Address" placeholder="请输入Z端IPV4地址" />
        </el-form-item>
        <el-form-item label="省管设备转接信息" prop="provincialEquipmentConnectionInfo">
          <el-input v-model="form.provincialEquipmentConnectionInfo" placeholder="请输入省管设备转接信息" />
        </el-form-item>
        <el-form-item label="外层vlan" prop="outerVlan">
          <el-input v-model="form.outerVlan" placeholder="请输入外层vlan" />
        </el-form-item>
        <el-form-item label="IPV4地址" prop="ipv4Address">
          <el-input v-model="form.ipv4Address" placeholder="请输入IPV4地址" />
        </el-form-item>
        <el-form-item label="基站编号" prop="baseStationId">
          <el-input v-model="form.baseStationId" placeholder="请输入基站编号" />
        </el-form-item>
        <el-form-item label="站名" prop="stationName">
          <el-input v-model="form.stationName" placeholder="请输入站名" />
        </el-form-item>
        <el-form-item label="基站网管VLAN" prop="baseStationNetworkMgmtVlan">
          <el-input v-model="form.baseStationNetworkMgmtVlan" placeholder="请输入基站网管VLAN" />
        </el-form-item>
        <el-form-item label="网管端口IP掩码" prop="networkMgmtPortIpMask">
          <el-input v-model="form.networkMgmtPortIpMask" placeholder="请输入网管端口IP掩码" />
        </el-form-item>
        <el-form-item label="网管端口IP" prop="networkMgmtPortIpTransmissionSide">
          <el-input v-model="form.networkMgmtPortIpTransmissionSide" placeholder="请输入网管端口IP" />
        </el-form-item>
        <el-form-item label="网管端口IP" prop="networkMgmtPortIpServiceSide">
          <el-input v-model="form.networkMgmtPortIpServiceSide" placeholder="请输入网管端口IP" />
        </el-form-item>
        <el-form-item label="业务VLAN号" prop="businessVlanNumber">
          <el-input v-model="form.businessVlanNumber" placeholder="请输入业务VLAN号" />
        </el-form-item>
        <el-form-item label="业务端口IP掩码" prop="businessPortIpMask">
          <el-input v-model="form.businessPortIpMask" placeholder="请输入业务端口IP掩码" />
        </el-form-item>
        <el-form-item label="业务端口IP" prop="businessPortIpTransmissionSide">
          <el-input v-model="form.businessPortIpTransmissionSide" placeholder="请输入业务端口IP" />
        </el-form-item>
        <el-form-item label="基站业务端口IP" prop="baseStationBusinessPortIpStationSide">
          <el-input v-model="form.baseStationBusinessPortIpStationSide" placeholder="请输入基站业务端口IP" />
        </el-form-item>
        <el-form-item label="备注" prop="remarks">
          <el-input v-model="form.remarks" placeholder="请输入备注" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listIpran, getIpran, delIpran, addIpran, updateIpran } from "@/api/unicom/ipran";

export default {
  name: "Ipran",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // ipran设备配置表格数据
      ipranList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        device: null,
        frame: null,
        slot: null,
        subCard: null,
        port: null,
        subPort: null,
        aggregationPort: null,
        transmissionArea: null,
        transmissionElementId: null,
        transmissionElementName: null,
        transmissionElementMgmtIp: null,
        accessDeviceType: null,
        transmissionVendor: null,
        workOrderNumber: null,
        serviceCategory: null,
        serviceNumber: null,
        circuitId: null,
        serviceType: null,
        circuitBandwidth: null,
        aEndCustomerName: null,
        aEndAccessDeviceInterface: null,
        subPortNumber: null,
        aEndIpv4Address: null,
        zEndCustomerName: null,
        zEndAccessDeviceInterface: null,
        zEndIpv4Address: null,
        provincialEquipmentConnectionInfo: null,
        outerVlan: null,
        ipv4Address: null,
        baseStationId: null,
        stationName: null,
        baseStationNetworkMgmtVlan: null,
        networkMgmtPortIpMask: null,
        networkMgmtPortIpTransmissionSide: null,
        networkMgmtPortIpServiceSide: null,
        businessVlanNumber: null,
        businessPortIpMask: null,
        businessPortIpTransmissionSide: null,
        baseStationBusinessPortIpStationSide: null,
        remarks: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询ipran设备配置列表 */
    getList() {
      this.loading = true;
      listIpran(this.queryParams).then(response => {
        this.ipranList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        device: null,
        frame: null,
        slot: null,
        subCard: null,
        port: null,
        subPort: null,
        aggregationPort: null,
        transmissionArea: null,
        transmissionElementId: null,
        transmissionElementName: null,
        transmissionElementMgmtIp: null,
        accessDeviceType: null,
        transmissionVendor: null,
        workOrderNumber: null,
        serviceCategory: null,
        serviceNumber: null,
        circuitId: null,
        serviceType: null,
        circuitBandwidth: null,
        aEndCustomerName: null,
        aEndAccessDeviceInterface: null,
        subPortNumber: null,
        aEndIpv4Address: null,
        zEndCustomerName: null,
        zEndAccessDeviceInterface: null,
        zEndIpv4Address: null,
        provincialEquipmentConnectionInfo: null,
        outerVlan: null,
        ipv4Address: null,
        baseStationId: null,
        stationName: null,
        baseStationNetworkMgmtVlan: null,
        networkMgmtPortIpMask: null,
        networkMgmtPortIpTransmissionSide: null,
        networkMgmtPortIpServiceSide: null,
        businessVlanNumber: null,
        businessPortIpMask: null,
        businessPortIpTransmissionSide: null,
        baseStationBusinessPortIpStationSide: null,
        remarks: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加ipran设备配置";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getIpran(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改ipran设备配置";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateIpran(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addIpran(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除ipran设备配置编号为"' + ids + '"的数据项？').then(function() {
        return delIpran(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('unicom/ipran/export', {
        ...this.queryParams
      }, `ipran_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
