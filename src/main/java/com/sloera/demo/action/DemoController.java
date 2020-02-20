package com.sloera.demo.action;

import com.sloera.demo.service.DemoService;
import com.sloera.mng.core.action.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 框架样例控制器
 * @author jamesli
 * @date 20134-09-18
 * @version 
 * @description 框架样例控制
 */
@Controller
@RequestMapping(value = "/webfinal/demo")
public class DemoController extends BaseController {
	/**
	 * 注入业务逻辑对象
	 */
	@Autowired
	private DemoService demoService;
	/**
	 * 菜单首页[使用iframe加载时：this.getIndexView("demo/index", map);]
	 */
	//@RequestMapping("/index")
	//@Override
	//public String index(HttpServletResponse response, ModelMap map) {
	//	return this.getIndexView("demo/index", map);
	//}
	//
	///**
	// * 新增页面
	// * @param repsonse
	// * @return
	// */
	//@RequestMapping(value = "/add")
	//@Override
	//public String add(HttpServletResponse repsonse) {
	//	return "demo/add";
	//}
	//
	//
	///**
	// * 批量删除数据
	// */
	//@RequestMapping( params = "method=del", method = RequestMethod.POST)
	//@Override
	//public void del(HttpServletResponse response) {
	//	try {
	//		String[] ids = this.getParaJsonStr("id").split(",");
	//		for (String id : ids) {
	//			this.demoService.deleteDemo(id);
	//			System.out.println(id);
	//		}
	//		this.ajaxDoneSuccess(response, null);
	//	} catch(Exception e) {
	//		e.printStackTrace();
	//		logger.error(e.getMessage(),e);
	//		this.ajaxDoneError(response, null);
	//	}
	//}
	//
	//
	//
	///**
	// * 查询分页数据
	// */
	//@RequestMapping(value = "/query", method = RequestMethod.POST)
	//@Override
	//public void query(@RequestParam Integer page, @RequestParam Integer rows,
    //                  HttpServletRequest request, HttpServletResponse response, ModelMap map) {
	//	//排序条件
	//	String sord = this.getPara("sord").toUpperCase();
	//	String sidx = this.getPara("sidx").toUpperCase();
	//	String orderStr = " ORDER BY RUN_TIME," + sidx + " " + sord;
	//	//获取名称查询条件
	//	String name = this.getPara("name");
	//	StringBuffer sqlWhere = new StringBuffer(" WHERE STATUS =?");
	//	List<Object> sqlParam = new ArrayList<Object>();
	//	sqlParam.add(SYSTEM_ON);
	//	String select = "SELECT ID,NAME,IP_ADDRESS,MAC_ADDRESS, RUN_TIME,OS_NAME,OS_VERSION,OS_STRUNCT,JVM_NAME, STATUS";
	//	String sqlExceptSelect = "  FROM monitor_server";
	//	try{
	//		if (StringUtils.isNotEmpty(name)) {
	//			sqlWhere.append(" AND NAME LIKE ? ");
	//			sqlParam.add("%" + name + "%");
	//		}
	//		Page<Record> list = this.demoService.paginate(page, rows, select, sqlExceptSelect.concat(sqlWhere.toString()).concat(orderStr), sqlParam.toArray());
	//		JSONObject json =  this.toJqueryGrid(list);
	//		this.renderJson(response,PowerUtils.filterJsonString(json.toString()));
	//	} catch(Exception e) {
	//		logger.error(e.getMessage(),e);
	//		this.ajaxDoneError(response, null);
	//	}
	//}
	//
	//@RequestMapping(params = "method=save", method = RequestMethod.POST)
	//public void save(HttpServletResponse response, MonitorBean monitorBean) {
	//	try{
	//		monitorBean.setId(super.getUUID());
	//		monitorBean.setStatus(ServiceConstant.SYSTEM_ON);
	//		demoService.save(monitorBean);
	//		this.ajaxDoneSuccess(response, null);
	//	}catch(Exception e){
	//		e.printStackTrace();
	//		this.ajaxDoneError(response, e.getMessage());
	//	}
	//}
	//
	///**
	// * 信息编辑页面
	// */
	//@RequestMapping(value = "/show")
	//@Override
	//public String show(HttpServletResponse response) {
	//	String id = this.getPara("id");
	//	MonitorBean bean = this.demoService.findById(id);
	//	this.setAttr("role", bean);
	//	request.setAttribute("root", request.getContextPath());
	//	return "demo/edit";
	//}
	///**
	// * 编辑角色
	// * @param response
	// * @param monitorBean
	// */
	//@RequestMapping(params = "method=update",method = RequestMethod.POST)
	//public void update(HttpServletResponse response, MonitorBean monitorBean) {
	//	try{
	//		demoService.update(monitorBean);
	//		this.ajaxDoneSuccess(response, null);
	//	}catch(RuntimeException e){
	//		logger.error(e.getMessage(),e);
	//	}catch(Exception e){
	//		logger.error(e.getMessage(),e);
	//		this.ajaxDoneError(response, e.getMessage());
	//	}
	//}
	//
	//@Override
	//public void save(HttpServletResponse arg0) {
	//	// TODO Auto-generated method stub
	//
	//}
	//
	//@Override
	//public void update(HttpServletResponse arg0) {
	//	// TODO Auto-generated method stub
	//
	//}
	
	

}
