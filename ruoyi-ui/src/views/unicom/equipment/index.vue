<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="区县" prop="district">
        <el-input
          v-model="queryParams.district"
          placeholder="请输入区县"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备名称" prop="deviceName">
        <el-input
          v-model="queryParams.deviceName"
          placeholder="请输入设备名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备型号" prop="model">
        <el-input
          v-model="queryParams.model"
          placeholder="请输入设备型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="管理IP-1" prop="managementIp1">
        <el-input
          v-model="queryParams.managementIp1"
          placeholder="请输入管理IP-1"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="管理IP-2" prop="managementIp2">
        <el-input
          v-model="queryParams.managementIp2"
          placeholder="请输入管理IP-2"
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
      <el-form-item label="业务编码" prop="serviceCode">
        <el-input
          v-model="queryParams.serviceCode"
          placeholder="请输入业务编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="带宽" prop="bandwidth">
        <el-input
          v-model="queryParams.bandwidth"
          placeholder="请输入带宽"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="Z端设备型号" prop="zSideModel">
        <el-input
          v-model="queryParams.zSideModel"
          placeholder="请输入Z端设备型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="客户名称" prop="customerName">
        <el-input
          v-model="queryParams.customerName"
          placeholder="请输入客户名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外层vlan组" prop="outerVlanGroup">
        <el-input
          v-model="queryParams.outerVlanGroup"
          placeholder="请输入外层vlan组"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外层vlan值" prop="outerVlanValue">
        <el-input
          v-model="queryParams.outerVlanValue"
          placeholder="请输入外层vlan值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内层vlan组" prop="innerVlanGroup">
        <el-input
          v-model="queryParams.innerVlanGroup"
          placeholder="请输入内层vlan组"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内层vlan值" prop="innerVlanValue">
        <el-input
          v-model="queryParams.innerVlanValue"
          placeholder="请输入内层vlan值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="请求IP地址数" prop="requestedIpCount">
        <el-input
          v-model="queryParams.requestedIpCount"
          placeholder="请输入请求IP地址数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网关IP地址" prop="gatewayIp">
        <el-input
          v-model="queryParams.gatewayIp"
          placeholder="请输入网关IP地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务IP地址" prop="businessIp">
        <el-input
          v-model="queryParams.businessIp"
          placeholder="请输入业务IP地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="序列号loid" prop="serialNumber">
        <el-input
          v-model="queryParams.serialNumber"
          placeholder="请输入序列号loid"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="VPN实例名称" prop="vpnInstanceName">
        <el-input
          v-model="queryParams.vpnInstanceName"
          placeholder="请输入VPN实例名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="VPN-RD" prop="vpnRd">
        <el-input
          v-model="queryParams.vpnRd"
          placeholder="请输入VPN-RD"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="VPN-RT" prop="vpnRt">
        <el-input
          v-model="queryParams.vpnRt"
          placeholder="请输入VPN-RT"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户端互联地址" prop="userInterconnectAddress">
        <el-input
          v-model="queryParams.userInterconnectAddress"
          placeholder="请输入用户端互联地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="调单号" prop="orderNumber">
        <el-input
          v-model="queryParams.orderNumber"
          placeholder="请输入调单号"
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
          v-hasPermi="['unicom:equipment:add']"
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
          v-hasPermi="['unicom:equipment:edit']"
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
          v-hasPermi="['unicom:equipment:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['unicom:equipment:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="equipmentList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="记录唯一标识" align="center" prop="id" />
      <el-table-column label="区县" align="center" prop="district" />
      <el-table-column label="设备名称" align="center" prop="deviceName" />
      <el-table-column label="设备型号" align="center" prop="model" />
      <el-table-column label="管理IP-1" align="center" prop="managementIp1" />
      <el-table-column label="管理IP-2" align="center" prop="managementIp2" />
      <el-table-column label="设备框" align="center" prop="frame" />
      <el-table-column label="设备槽" align="center" prop="slot" />
      <el-table-column label="设备子卡" align="center" prop="subCard" />
      <el-table-column label="设备端口" align="center" prop="port" />
      <el-table-column label="设备子端口" align="center" prop="subPort" />
      <el-table-column label="业务分类" align="center" prop="serviceCategory" />
      <el-table-column label="业务编码" align="center" prop="serviceCode" />
      <el-table-column label="业务状态" align="center" prop="serviceStatus" />
      <el-table-column label="带宽" align="center" prop="bandwidth" />
      <el-table-column label="Z端设备型号" align="center" prop="zSideModel" />
      <el-table-column label="客户名称" align="center" prop="customerName" />
      <el-table-column label="外层vlan组" align="center" prop="outerVlanGroup" />
      <el-table-column label="外层vlan值" align="center" prop="outerVlanValue" />
      <el-table-column label="内层vlan组" align="center" prop="innerVlanGroup" />
      <el-table-column label="内层vlan值" align="center" prop="innerVlanValue" />
      <el-table-column label="请求IP地址数" align="center" prop="requestedIpCount" />
      <el-table-column label="网关IP地址" align="center" prop="gatewayIp" />
      <el-table-column label="业务IP地址" align="center" prop="businessIp" />
      <el-table-column label="序列号loid" align="center" prop="serialNumber" />
      <el-table-column label="VPN实例名称" align="center" prop="vpnInstanceName" />
      <el-table-column label="VPN-RD" align="center" prop="vpnRd" />
      <el-table-column label="VPN-RT" align="center" prop="vpnRt" />
      <el-table-column label="用户端互联地址" align="center" prop="userInterconnectAddress" />
      <el-table-column label="调单号" align="center" prop="orderNumber" />
      <el-table-column label="备注" align="center" prop="remarks" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['unicom:equipment:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['unicom:equipment:remove']"
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

    <!-- 添加或修改网络配置对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="区县" prop="district">
          <el-input v-model="form.district" placeholder="请输入区县" />
        </el-form-item>
        <el-form-item label="设备名称" prop="deviceName">
          <el-input v-model="form.deviceName" placeholder="请输入设备名称" />
        </el-form-item>
        <el-form-item label="设备型号" prop="model">
          <el-input v-model="form.model" placeholder="请输入设备型号" />
        </el-form-item>
        <el-form-item label="管理IP-1" prop="managementIp1">
          <el-input v-model="form.managementIp1" placeholder="请输入管理IP-1" />
        </el-form-item>
        <el-form-item label="管理IP-2" prop="managementIp2">
          <el-input v-model="form.managementIp2" placeholder="请输入管理IP-2" />
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
        <el-form-item label="业务编码" prop="serviceCode">
          <el-input v-model="form.serviceCode" placeholder="请输入业务编码" />
        </el-form-item>
        <el-form-item label="带宽" prop="bandwidth">
          <el-input v-model="form.bandwidth" placeholder="请输入带宽" />
        </el-form-item>
        <el-form-item label="Z端设备型号" prop="zSideModel">
          <el-input v-model="form.zSideModel" placeholder="请输入Z端设备型号" />
        </el-form-item>
        <el-form-item label="客户名称" prop="customerName">
          <el-input v-model="form.customerName" placeholder="请输入客户名称" />
        </el-form-item>
        <el-form-item label="外层vlan组" prop="outerVlanGroup">
          <el-input v-model="form.outerVlanGroup" placeholder="请输入外层vlan组" />
        </el-form-item>
        <el-form-item label="外层vlan值" prop="outerVlanValue">
          <el-input v-model="form.outerVlanValue" placeholder="请输入外层vlan值" />
        </el-form-item>
        <el-form-item label="内层vlan组" prop="innerVlanGroup">
          <el-input v-model="form.innerVlanGroup" placeholder="请输入内层vlan组" />
        </el-form-item>
        <el-form-item label="内层vlan值" prop="innerVlanValue">
          <el-input v-model="form.innerVlanValue" placeholder="请输入内层vlan值" />
        </el-form-item>
        <el-form-item label="请求IP地址数" prop="requestedIpCount">
          <el-input v-model="form.requestedIpCount" placeholder="请输入请求IP地址数" />
        </el-form-item>
        <el-form-item label="网关IP地址" prop="gatewayIp">
          <el-input v-model="form.gatewayIp" placeholder="请输入网关IP地址" />
        </el-form-item>
        <el-form-item label="业务IP地址" prop="businessIp">
          <el-input v-model="form.businessIp" placeholder="请输入业务IP地址" />
        </el-form-item>
        <el-form-item label="序列号loid" prop="serialNumber">
          <el-input v-model="form.serialNumber" placeholder="请输入序列号loid" />
        </el-form-item>
        <el-form-item label="VPN实例名称" prop="vpnInstanceName">
          <el-input v-model="form.vpnInstanceName" placeholder="请输入VPN实例名称" />
        </el-form-item>
        <el-form-item label="VPN-RD" prop="vpnRd">
          <el-input v-model="form.vpnRd" placeholder="请输入VPN-RD" />
        </el-form-item>
        <el-form-item label="VPN-RT" prop="vpnRt">
          <el-input v-model="form.vpnRt" placeholder="请输入VPN-RT" />
        </el-form-item>
        <el-form-item label="用户端互联地址" prop="userInterconnectAddress">
          <el-input v-model="form.userInterconnectAddress" placeholder="请输入用户端互联地址" />
        </el-form-item>
        <el-form-item label="调单号" prop="orderNumber">
          <el-input v-model="form.orderNumber" placeholder="请输入调单号" />
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
import { listEquipment, getEquipment, delEquipment, addEquipment, updateEquipment } from "@/api/unicom/equipment";

export default {
  name: "Equipment",
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
      // 网络配置表格数据
      equipmentList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        district: null,
        deviceName: null,
        model: null,
        managementIp1: null,
        managementIp2: null,
        frame: null,
        slot: null,
        subCard: null,
        port: null,
        subPort: null,
        serviceCategory: null,
        serviceCode: null,
        serviceStatus: null,
        bandwidth: null,
        zSideModel: null,
        customerName: null,
        outerVlanGroup: null,
        outerVlanValue: null,
        innerVlanGroup: null,
        innerVlanValue: null,
        requestedIpCount: null,
        gatewayIp: null,
        businessIp: null,
        serialNumber: null,
        vpnInstanceName: null,
        vpnRd: null,
        vpnRt: null,
        userInterconnectAddress: null,
        orderNumber: null,
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
    /** 查询网络配置列表 */
    getList() {
      this.loading = true;
      listEquipment(this.queryParams).then(response => {
        this.equipmentList = response.rows;
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
        district: null,
        deviceName: null,
        model: null,
        managementIp1: null,
        managementIp2: null,
        frame: null,
        slot: null,
        subCard: null,
        port: null,
        subPort: null,
        serviceCategory: null,
        serviceCode: null,
        serviceStatus: null,
        bandwidth: null,
        zSideModel: null,
        customerName: null,
        outerVlanGroup: null,
        outerVlanValue: null,
        innerVlanGroup: null,
        innerVlanValue: null,
        requestedIpCount: null,
        gatewayIp: null,
        businessIp: null,
        serialNumber: null,
        vpnInstanceName: null,
        vpnRd: null,
        vpnRt: null,
        userInterconnectAddress: null,
        orderNumber: null,
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
      this.title = "添加网络配置";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getEquipment(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改网络配置";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateEquipment(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addEquipment(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除网络配置编号为"' + ids + '"的数据项？').then(function() {
        return delEquipment(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('unicom/equipment/export', {
        ...this.queryParams
      }, `equipment_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
