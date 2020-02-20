package com.sloera.demo.service;

import com.sloera.demo.dao.DemoDao;
import com.sloera.demo.po.MonitorBean;
import com.sloera.mng.core.db.Record;
import com.sloera.mng.core.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;


/**
 * 样例管理逻辑层
 * @author 丁宁
 * @date 2014-9-18
 * @version 
 * @description 样例管理服务
 */
@Service("demoService")
@Transactional
public class DemoService {
	
	
	/**
	 * 注入数据访问对象
	 */
	@Autowired
	private DemoDao demoDao;
	/**
	 * 删除记录
	 * @param id
	 * @throws Exception 
	 */
	public void deleteDemo(String id) throws Exception{
		demoDao.delete("com.sloera.demo.deleteTest", id);//使用mybatis删除
		demoDao.updateSQL("delete from monitor_server where id = ?", new Object[]{id});//使用sql删除
	}
	/**
	 * 分页数据
	 * @param pageNumber
	 * @param pageSize
	 * @param select
	 * @param sqlExceptSelect
	 * @param paras
	 * @return
	 */
	@Transactional(readOnly=true)
	public Page<Record> paginate(int pageNumber, int pageSize, String select, String sqlExceptSelect, Object... paras) throws Exception {
		return this.demoDao.paginate(pageNumber, pageSize, select, sqlExceptSelect, paras);
	}
	
	public void save(MonitorBean monitorBean)  throws Exception{
		this.demoDao.save("com.sloera.demo.insertTest", monitorBean);//保存
	}
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> findFirst(String id) {
		return (Map<String, Object>) this.demoDao.selectMap("com.sloera.demo.selectDemo", id);
		//(MonitorBean) this.demoDao.selectOne("com.sloera.demo.getDemo", id); 返回Bean
	}
	
	public void update(MonitorBean monitorBean) {
		this.demoDao.update("com.sloera.demo.updateTest", monitorBean);//编辑
	}
	public MonitorBean findById(String id) {
		return this.demoDao.selectOne("com.sloera.demo.getDemo", id);
	}
	
}
