package com.springbootlearn.springbootlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootlearn.springbootlearn.entity.Device;
import com.springbootlearn.springbootlearn.repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceRepository deviceRepository;
	
	public Device saveDeviceInfo(Device device) {
		return deviceRepository.save(device);
	}

	public List<Device> fetchAllDeviceInfo() {
		return deviceRepository.findAll();
	}

	public Device fetchDeviceInfoById(Long deviceId) {
		return deviceRepository.findById(deviceId).get();
	}
	
	public void deleteDeviceInfoById(Long deviceId) {
		deviceRepository.deleteById(deviceId);
	}
	
	
	
}
