package com.nttdata.ms.services;

import com.nttdata.ms.dtos.MicroServiceDto;

/**
 * Interfaz del servicio
 * @author Angel
 *
 */
public interface ServiceI
{
	/**
	 * Devuelve la información básica de la aplicación
	 * @return Un MicroServiceDto con la información básica de la aplicación
	 */
	public MicroServiceDto getAppDataInfo();
}
