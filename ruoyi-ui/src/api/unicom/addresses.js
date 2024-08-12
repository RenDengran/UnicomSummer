import request from '@/utils/request'

// 查询业务逻辑ip列表
export function listAddresses(query) {
  return request({
    url: '/unicom/addresses/list',
    method: 'get',
    params: query
  })
}

// 查询业务逻辑ip详细
export function getAddresses(id) {
  return request({
    url: '/unicom/addresses/' + id,
    method: 'get'
  })
}

// 新增业务逻辑ip
export function addAddresses(data) {
  return request({
    url: '/unicom/addresses',
    method: 'post',
    data: data
  })
}

// 修改业务逻辑ip
export function updateAddresses(data) {
  return request({
    url: '/unicom/addresses',
    method: 'put',
    data: data
  })
}

// 删除业务逻辑ip
export function delAddresses(id) {
  return request({
    url: '/unicom/addresses/' + id,
    method: 'delete'
  })
}
