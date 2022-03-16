package com.springbootlearn.springbootlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootlearn.springbootlearn.entity.Device;
import com.springbootlearn.springbootlearn.service.DeviceService;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@PostMapping("/device")
	public Device saveDeviceInfo(@RequestBody Device device) {
		//DeviceService service = new DeviceService(); - call services using the new key word -> dependency injection
		return deviceService.saveDeviceInfo(device);
	}
	
	@GetMapping("/device")
	public List<Device> getAllDeviceInfo() {
		return deviceService.fetchAllDeviceInfo();
	}
	
	@GetMapping("/device/{id}")
	public Device getDeviceInfoById(@PathVariable("id") Long deviceId) {
		return deviceService.fetchDeviceInfoById(deviceId);
	}
	
	@DeleteMapping("device/{id}")
	public void deleteDeviceInfoById(@PathVariable("id") Long deviceId) {
		deviceService.deleteDeviceInfoById(deviceId);
	}
}