package com.sloera.mng.core.action;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.util.HtmlUtils;
import org.springframework.web.util.JavaScriptUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public abstract class BaseController {
    public Logger logger = LogManager.getLogger(this.getClass());
    public static final String USER_TOCKEN = "_Invalidate_Session_Token_";
    public String SYSTEM_CDN = "localhost";

    @Resource
    public Properties appConstant;
    @Resource
    public HttpServletRequest request;

    public BaseController() {
    }

    public String getPara(String name) {
        String str = this.request.getParameter(name);
        if (StringUtils.isNotBlank(str)) {
            str = str.trim();
        }
        //处理字符
        str = StringEscapeUtils.escapeSql(str);
        str = HtmlUtils.htmlEscape(str);
        str = JavaScriptUtils.javaScriptEscape(str);
        return str;
    }

    public String getCdnURL(HttpServletRequest request) {
        String cdn = this.SYSTEM_CDN;
        if (cdn.indexOf("localhost") != -1) {
            String url = this.getContextPath(request);
            if (url.endsWith("/")) {
                url = url.substring(0, url.length() - 1);
            }
            return url;
        }else {
            // TODO: 2019/12/17 cdn页面 
            return "";
        }
    }

    /*
    * @Description 获得真实url地址。返回结尾不带"/"
    * @param null: 
    * @return http://localhost:8080/mavenssm_war_exploded
    * @author liuwangyang
    * @Date 2019-12-21 14:36
    */
    public String getContextPath(HttpServletRequest request) {
        String path = request.getContextPath();
        String basePath =
                request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
        logger.error("basePath:" + basePath);
        return basePath;
    }
    public void setAttr(String key, Object value){
        this.request.setAttribute(key, value);
    }

    public void renderJson(HttpServletResponse response, String text){
        this.render(response, "application/json;charset=UTF-8", text);
    }
    public void renderText(HttpServletResponse response, String text){
        this.render(response, "text/plain;charset=UTF-8", text);
    }
    public void renderXml(HttpServletResponse response, String text){
        this.render(response, "text/xml;charset=UTF-8", text);
    }
    public void renderHtml(HttpServletResponse response, String text){
        this.render(response, "text/html;charset=UTF-8", text);
    }
    /*
    * @Description 向前端输出信息
    * @return
    * @author liuwangyang
    * @Date 2019-12-23 15:01
    */
    private void render(HttpServletResponse response, String contentType, String text){
        response.setContentType(contentType);
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0L);
        try {
            response.getWriter().write(text);
        } catch (IOException e){
            logger.error(e.getMessage(),e);
        }
    }

    /*
     * @Description 获取post请求的body参数
     * @param request:  request请求
     * @Return java.lang.String body字符串形式内容
     * @Author SloeraN
     * @Date 2020/3/1 20:13
     */
    public String getPostBody(HttpServletRequest request) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String line = null;
        StringBuilder sb = new StringBuilder();
        try {
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sb.toString();
    }
}
