package com.jianma.ichl.service;

import com.jianma.ichl.model.Permission;

public interface PermissionsService {

	public int createPermission(Permission permission);

	public int deletePermission(Long permissionId);
}
