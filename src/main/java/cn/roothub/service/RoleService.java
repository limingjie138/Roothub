package cn.roothub.service;

import java.util.List;

import cn.roothub.dto.PageDataBody;
import cn.roothub.entity.Role;

/**
 * @author miansen.wang
 * @date 2019年2月27日 下午3:40:52
 */
public interface RoleService {
	
	// 根据ID查询角色
	Role getById(Integer id);
	
	//分页查询所有角色
	PageDataBody<Role> page(Integer pageNumber, Integer pageSize);
	
	// 根据后台用户ID查询所关联的所有角色
	List<Role> getByAdminUserId(Integer adminUserId,Integer pageNumber, Integer pageSize);
	
	// 新增角色
	void save(Role role);
	
	// 更新角色
	void update(Role role);
	
	// 删除角色
	void removeById(Integer id);
	
	// 统计所有角色
	int countAll();
}
