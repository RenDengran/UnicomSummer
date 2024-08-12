import request from '@/utils/request'

// 查询ipran设备配置列表
export function listIpran(query) {
  return request({
    url: '/unicom/ipran/list',
    method: 'get',
    params: query
  })
}

// 查询ipran设备配置详细
export function getIpran(id) {
  return request({
    url: '/unicom/ipran/' + id,
    method: 'get'
  })
}

// 新增ipran设备配置
export function addIpran(data) {
  return request({
    url: '/unicom/ipran',
    method: 'post',
    data: data
  })
}

// 修改ipran设备配置
export function updateIpran(data) {
  return request({
    url: '/unicom/ipran',
    method: 'put',
    data: data
  })
}

// 删除ipran设备配置
export function delIpran(id) {
  return request({
    url: '/unicom/ipran/' + id,
    method: 'delete'
  })
}
