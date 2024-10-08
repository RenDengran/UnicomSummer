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
import com.ruoyi.unicom.domain.IpranEquipment;
import com.ruoyi.unicom.service.IIpranEquipmentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * ipran设备配置Controller
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@RestController
@RequestMapping("/unicom/ipran")
public class IpranEquipmentController extends BaseController
{
    @Autowired
    private IIpranEquipmentService ipranEquipmentService;

    /**
     * 查询ipran设备配置列表
     */
    @PreAuthorize("@ss.hasPermi('unicom:ipran:list')")
    @GetMapping("/list")
    public TableDataInfo list(IpranEquipment ipranEquipment)
    {
        startPage();
        List<IpranEquipment> list = ipranEquipmentService.selectIpranEquipmentList(ipranEquipment);
        return getDataTable(list);
    }

    /**
     * 导出ipran设备配置列表
     */
    @PreAuthorize("@ss.hasPermi('unicom:ipran:export')")
    @Log(title = "ipran设备配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IpranEquipment ipranEquipment)
    {
        List<IpranEquipment> list = ipranEquipmentService.selectIpranEquipmentList(ipranEquipment);
        ExcelUtil<IpranEquipment> util = new ExcelUtil<IpranEquipment>(IpranEquipment.class);
        util.exportExcel(response, list, "ipran设备配置数据");
    }

    /**
     * 获取ipran设备配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('unicom:ipran:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ipranEquipmentService.selectIpranEquipmentById(id));
    }

    /**
     * 新增ipran设备配置
     */
    @PreAuthorize("@ss.hasPermi('unicom:ipran:add')")
    @Log(title = "ipran设备配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IpranEquipment ipranEquipment)
    {
        return toAjax(ipranEquipmentService.insertIpranEquipment(ipranEquipment));
    }

    /**
     * 修改ipran设备配置
     */
    @PreAuthorize("@ss.hasPermi('unicom:ipran:edit')")
    @Log(title = "ipran设备配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IpranEquipment ipranEquipment)
    {
        return toAjax(ipranEquipmentService.updateIpranEquipment(ipranEquipment));
    }

    /**
     * 删除ipran设备配置
     */
    @PreAuthorize("@ss.hasPermi('unicom:ipran:remove')")
    @Log(title = "ipran设备配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ipranEquipmentService.deleteIpranEquipmentByIds(ids));
    }
}
