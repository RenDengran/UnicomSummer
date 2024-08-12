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
import com.ruoyi.unicom.domain.BusinessAddresses;
import com.ruoyi.unicom.service.IBusinessAddressesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 业务逻辑ipController
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@RestController
@RequestMapping("/unicom/addresses")
public class BusinessAddressesController extends BaseController
{
    @Autowired
    private IBusinessAddressesService businessAddressesService;

    /**
     * 查询业务逻辑ip列表
     */
    @PreAuthorize("@ss.hasPermi('unicom:addresses:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusinessAddresses businessAddresses)
    {
        startPage();
        List<BusinessAddresses> list = businessAddressesService.selectBusinessAddressesList(businessAddresses);
        return getDataTable(list);
    }

    /**
     * 导出业务逻辑ip列表
     */
    @PreAuthorize("@ss.hasPermi('unicom:addresses:export')")
    @Log(title = "业务逻辑ip", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusinessAddresses businessAddresses)
    {
        List<BusinessAddresses> list = businessAddressesService.selectBusinessAddressesList(businessAddresses);
        ExcelUtil<BusinessAddresses> util = new ExcelUtil<BusinessAddresses>(BusinessAddresses.class);
        util.exportExcel(response, list, "业务逻辑ip数据");
    }

    /**
     * 获取业务逻辑ip详细信息
     */
    @PreAuthorize("@ss.hasPermi('unicom:addresses:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(businessAddressesService.selectBusinessAddressesById(id));
    }

    /**
     * 新增业务逻辑ip
     */
    @PreAuthorize("@ss.hasPermi('unicom:addresses:add')")
    @Log(title = "业务逻辑ip", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusinessAddresses businessAddresses)
    {
        return toAjax(businessAddressesService.insertBusinessAddresses(businessAddresses));
    }

    /**
     * 修改业务逻辑ip
     */
    @PreAuthorize("@ss.hasPermi('unicom:addresses:edit')")
    @Log(title = "业务逻辑ip", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusinessAddresses businessAddresses)
    {
        return toAjax(businessAddressesService.updateBusinessAddresses(businessAddresses));
    }

    /**
     * 删除业务逻辑ip
     */
    @PreAuthorize("@ss.hasPermi('unicom:addresses:remove')")
    @Log(title = "业务逻辑ip", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(businessAddressesService.deleteBusinessAddressesByIds(ids));
    }
}
