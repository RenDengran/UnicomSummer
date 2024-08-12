import request from '@/utils/request'

// 查询网络配置列表
export function listEquipment(query) {
  return request({
    url: '/unicom/equipment/list',
    method: 'get',
    params: query
  })
}

// 查询网络配置详细
export function getEquipment(id) {
  return request({
    url: '/unicom/equipment/' + id,
    method: 'get'
  })
}

// 新增网络配置
export function addEquipment(data) {
  return request({
    url: '/unicom/equipment',
    method: 'post',
    data: data
  })
}

// 修改网络配置
export function updateEquipment(data) {
  return request({
    url: '/unicom/equipment',
    method: 'put',
    data: data
  })
}

// 删除网络配置
export function delEquipment(id) {
  return request({
    url: '/unicom/equipment/' + id,
    method: 'delete'
  })
}
