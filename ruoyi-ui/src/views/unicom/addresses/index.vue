<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="请求业务地址数" prop="requestedAddresses">
        <el-input
          v-model="queryParams.requestedAddresses"
          placeholder="请输入请求业务地址数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址掩码" prop="addressMask">
        <el-input
          v-model="queryParams.addressMask"
          placeholder="请输入业务地址掩码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址子网掩码" prop="subnetMask">
        <el-input
          v-model="queryParams.subnetMask"
          placeholder="请输入业务地址子网掩码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址网络地址" prop="networkAddress">
        <el-input
          v-model="queryParams.networkAddress"
          placeholder="请输入业务地址网络地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址网关地址" prop="gatewayAddress">
        <el-input
          v-model="queryParams.gatewayAddress"
          placeholder="请输入业务地址网关地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址使用地址" prop="usedAddress">
        <el-input
          v-model="queryParams.usedAddress"
          placeholder="请输入业务地址使用地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址空闲地址" prop="freeAddress">
        <el-input
          v-model="queryParams.freeAddress"
          placeholder="请输入业务地址空闲地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务地址广播地址" prop="broadcastAddress">
        <el-input
          v-model="queryParams.broadcastAddress"
          placeholder="请输入业务地址广播地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务静态地址段" prop="staticAddressRange">
        <el-input
          v-model="queryParams.staticAddressRange"
          placeholder="请输入业务静态地址段"
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
          v-hasPermi="['unicom:addresses:add']"
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
          v-hasPermi="['unicom:addresses:edit']"
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
          v-hasPermi="['unicom:addresses:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['unicom:addresses:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="addressesList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="记录唯一标识" align="center" prop="id" />
      <el-table-column label="请求业务地址数" align="center" prop="requestedAddresses" />
      <el-table-column label="业务地址掩码" align="center" prop="addressMask" />
      <el-table-column label="业务地址子网掩码" align="center" prop="subnetMask" />
      <el-table-column label="业务地址网络地址" align="center" prop="networkAddress" />
      <el-table-column label="业务地址网关地址" align="center" prop="gatewayAddress" />
      <el-table-column label="业务地址使用地址" align="center" prop="usedAddress" />
      <el-table-column label="业务地址空闲地址" align="center" prop="freeAddress" />
      <el-table-column label="业务地址广播地址" align="center" prop="broadcastAddress" />
      <el-table-column label="业务静态地址段" align="center" prop="staticAddressRange" />
      <el-table-column label="业务编码" align="center" prop="serviceCode" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['unicom:addresses:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['unicom:addresses:remove']"
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

    <!-- 添加或修改业务逻辑ip对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="请求业务地址数" prop="requestedAddresses">
          <el-input v-model="form.requestedAddresses" placeholder="请输入请求业务地址数" />
        </el-form-item>
        <el-form-item label="业务地址掩码" prop="addressMask">
          <el-input v-model="form.addressMask" placeholder="请输入业务地址掩码" />
        </el-form-item>
        <el-form-item label="业务地址子网掩码" prop="subnetMask">
          <el-input v-model="form.subnetMask" placeholder="请输入业务地址子网掩码" />
        </el-form-item>
        <el-form-item label="业务地址网络地址" prop="networkAddress">
          <el-input v-model="form.networkAddress" placeholder="请输入业务地址网络地址" />
        </el-form-item>
        <el-form-item label="业务地址网关地址" prop="gatewayAddress">
          <el-input v-model="form.gatewayAddress" placeholder="请输入业务地址网关地址" />
        </el-form-item>
        <el-form-item label="业务地址使用地址" prop="usedAddress">
          <el-input v-model="form.usedAddress" placeholder="请输入业务地址使用地址" />
        </el-form-item>
        <el-form-item label="业务地址空闲地址" prop="freeAddress">
          <el-input v-model="form.freeAddress" placeholder="请输入业务地址空闲地址" />
        </el-form-item>
        <el-form-item label="业务地址广播地址" prop="broadcastAddress">
          <el-input v-model="form.broadcastAddress" placeholder="请输入业务地址广播地址" />
        </el-form-item>
        <el-form-item label="业务静态地址段" prop="staticAddressRange">
          <el-input v-model="form.staticAddressRange" placeholder="请输入业务静态地址段" />
        </el-form-item>
        <el-form-item label="业务编码" prop="serviceCode">
          <el-input v-model="form.serviceCode" placeholder="请输入业务编码" />
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
import { listAddresses, getAddresses, delAddresses, addAddresses, updateAddresses } from "@/api/unicom/addresses";

export default {
  name: "Addresses",
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
      // 业务逻辑ip表格数据
      addressesList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        requestedAddresses: null,
        addressMask: null,
        subnetMask: null,
        networkAddress: null,
        gatewayAddress: null,
        usedAddress: null,
        freeAddress: null,
        broadcastAddress: null,
        staticAddressRange: null,
        serviceCode: null
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
    /** 查询业务逻辑ip列表 */
    getList() {
      this.loading = true;
      listAddresses(this.queryParams).then(response => {
        this.addressesList = response.rows;
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
        requestedAddresses: null,
        addressMask: null,
        subnetMask: null,
        networkAddress: null,
        gatewayAddress: null,
        usedAddress: null,
        freeAddress: null,
        broadcastAddress: null,
        staticAddressRange: null,
        serviceCode: null
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
      this.title = "添加业务逻辑ip";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getAddresses(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改业务逻辑ip";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateAddresses(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addAddresses(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除业务逻辑ip编号为"' + ids + '"的数据项？').then(function() {
        return delAddresses(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('unicom/addresses/export', {
        ...this.queryParams
      }, `addresses_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
