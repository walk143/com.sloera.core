package com.sloera.demo.po;

import java.util.Date;

/**
 * Bean对象与mybatis的mapper映射
 * @author jamesli
 * @date 2014-10-10
 * @version 1.0
 * @description mapper的映射文件在src/resource/mybatis/mappers/com/sloera目录下面
 */
public class MonitorBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String ip_address;
	private String mac_address;
	private String run_city;
	private String run_stat;
	private Date run_time;
	private Date stop_time;
	private String run_result;
	private String run_mode;
	private String os_name;
	private String os_version;
	private String os_strunct;
	private String jvm_name;
	private String jvm_version;
	private String home_dir;
	private String home_user;
	private String system_code;
	private String system_name;
	private String system_version;
	private String system_key;
	private String has_change;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getMac_address() {
		return mac_address;
	}
	public void setMac_address(String mac_address) {
		this.mac_address = mac_address;
	}
	public String getRun_city() {
		return run_city;
	}
	public void setRun_city(String run_city) {
		this.run_city = run_city;
	}
	public String getRun_stat() {
		return run_stat;
	}
	public void setRun_stat(String run_stat) {
		this.run_stat = run_stat;
	}
	public Date getRun_time() {
		return run_time;
	}
	public void setRun_time(Date run_time) {
		this.run_time = run_time;
	}
	public Date getStop_time() {
		return stop_time;
	}
	public void setStop_time(Date stop_time) {
		this.stop_time = stop_time;
	}
	public String getRun_result() {
		return run_result;
	}
	public void setRun_result(String run_result) {
		this.run_result = run_result;
	}
	public String getRun_mode() {
		return run_mode;
	}
	public void setRun_mode(String run_mode) {
		this.run_mode = run_mode;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getOs_version() {
		return os_version;
	}
	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}
	public String getOs_strunct() {
		return os_strunct;
	}
	public void setOs_strunct(String os_strunct) {
		this.os_strunct = os_strunct;
	}
	public String getJvm_name() {
		return jvm_name;
	}
	public void setJvm_name(String jvm_name) {
		this.jvm_name = jvm_name;
	}
	public String getJvm_version() {
		return jvm_version;
	}
	public void setJvm_version(String jvm_version) {
		this.jvm_version = jvm_version;
	}
	public String getHome_dir() {
		return home_dir;
	}
	public void setHome_dir(String home_dir) {
		this.home_dir = home_dir;
	}
	public String getHome_user() {
		return home_user;
	}
	public void setHome_user(String home_user) {
		this.home_user = home_user;
	}
	public String getSystem_code() {
		return system_code;
	}
	public void setSystem_code(String system_code) {
		this.system_code = system_code;
	}
	public String getSystem_name() {
		return system_name;
	}
	public void setSystem_name(String system_name) {
		this.system_name = system_name;
	}
	public String getSystem_version() {
		return system_version;
	}
	public void setSystem_version(String system_version) {
		this.system_version = system_version;
	}
	public String getSystem_key() {
		return system_key;
	}
	public void setSystem_key(String system_key) {
		this.system_key = system_key;
	}
	public String getHas_change() {
		return has_change;
	}
	public void setHas_change(String has_change) {
		this.has_change = has_change;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
