package com.nttdata.ms.dtos;

/**
 * DTO con la informacion
 * @author Angel
 *
 */
public class MicroServiceDto
{
	/** Nombre de la aplicación */
	private String appName;
	
	/** Puerto por el que escucha */
	private String port;

	/**
	 * @return the appName
	 */
	public String getAppName()
	{
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName)
	{
		this.appName = appName;
	}

	/**
	 * @return the port
	 */
	public String getPort()
	{
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(String port)
	{
		this.port = port;
	}
	
	
}
