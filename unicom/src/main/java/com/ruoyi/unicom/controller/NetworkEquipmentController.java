package com.ruoyi.unicom.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.unicom.domain.NetworkEquipment;
import com.ruoyi.unicom.service.INetworkEquipmentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网络配置Controller
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@RestController
@RequestMapping("/unicom/equipment")
public class NetworkEquipmentController extends BaseController
{
    @Autowired
    private INetworkEquipmentService networkEquipmentService;

    /**
     * 查询网络配置列表
     */
    @PreAuthorize("@ss.hasPermi('unicom:equipment:list')")
    @GetMapping("/list")
    public TableDataInfo list(NetworkEquipment networkEquipment)
    {
        startPage();
        List<NetworkEquipment> list = networkEquipmentService.selectNetworkEquipmentList(networkEquipment);
        return getDataTable(list);
    }

    /**
     * 导出网络配置列表
     */
    @PreAuthorize("@ss.hasPermi('unicom:equipment:export')")
    @Log(title = "网络配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NetworkEquipment networkEquipment)
    {
        List<NetworkEquipment> list = networkEquipmentService.selectNetworkEquipmentList(networkEquipment);
        ExcelUtil<NetworkEquipment> util = new ExcelUtil<NetworkEquipment>(NetworkEquipment.class);
        util.exportExcel(response, list, "网络配置数据");
    }

    /**
     * 获取网络配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('unicom:equipment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(networkEquipmentService.selectNetworkEquipmentById(id));
    }

    /**
     * 新增网络配置
     */
    @PreAuthorize("@ss.hasPermi('unicom:equipment:add')")
    @Log(title = "网络配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NetworkEquipment networkEquipment)
    {
        return toAjax(networkEquipmentService.insertNetworkEquipment(networkEquipment));
    }

    /**
     * 修改网络配置
     */
    @PreAuthorize("@ss.hasPermi('unicom:equipment:edit')")
    @Log(title = "网络配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NetworkEquipment networkEquipment)
    {
        return toAjax(networkEquipmentService.updateNetworkEquipment(networkEquipment));
    }

    /**
     * 删除网络配置
     */
    @PreAuthorize("@ss.hasPermi('unicom:equipment:remove')")
    @Log(title = "网络配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(networkEquipmentService.deleteNetworkEquipmentByIds(ids));
    }
}
