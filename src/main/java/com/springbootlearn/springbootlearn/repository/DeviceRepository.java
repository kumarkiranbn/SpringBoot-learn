package com.springbootlearn.springbootlearn.repository;

import org.springframework.stereotype.Repository;
import com.springbootlearn.springbootlearn.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

    
}