package com.nttdata.ms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.ms.dtos.MicroServiceDto;
import com.nttdata.ms.services.ServiceI;

/**
 * Controlador
 * @author Angel
 *
 */
@RestController("api")
public class MicroServiceController
{
	@Autowired
	private ServiceI service;
	
	@GetMapping("/whoAreYou")
	public MicroServiceDto sendAppDataInfo()
	{
		return service.getAppDataInfo();
	}
}
