package com.springbootlearn.springbootlearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deviceId;
	private String name;
	private Long userId;
	private Long groupId;
	private String groupName;
	
	public Long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public Device(Long deviceId, String name, Long userId, Long groupId, String groupName) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.userId = userId;
		this.groupId = groupId;
		this.groupName = groupName;
	}
	
	public Device() {
		super();
	}
	
	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", name=" + name + ", userId=" + userId + ", groupId=" + groupId
				+ ", groupName=" + groupName + "]";
	}
	
	
	
	

	
}
