package com.nttdata.ms.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.ms.dtos.MicroServiceDto;

@Service
public class ServiceImpl implements ServiceI
{
	/** Nombre de la aplicación */
	@Value("${spring.application.name}")
	private String appName;
	
	/** Puerto por el que escucha */
	@Value("${server.port}")
	private String port;
	
	@Override
	public MicroServiceDto getAppDataInfo()
	{
		MicroServiceDto dto = new MicroServiceDto();
		dto.setAppName(this.appName);
		dto.setPort(this.port);
		
		return dto;
	}
	
}
