package com.springbootlearn.springbootlearn.service;

import java.util.List;

import com.springbootlearn.springbootlearn.entity.Device;

public interface DeviceService {
	
	Device saveDeviceInfo(Device device);
	
	List<Device> fetchAllDeviceInfo();
	
	Device fetchDeviceInfoById(Long deviceId);
	
	void deleteDeviceInfoById(Long deviceId);

	
}
