# 核心工具包说明

此项目为web项目的一个基础框架，包含了mybatis，freemarker，数据库等基础组件。其他项目可扩展`BaseController`来简化一些数据库读写、http请求等操作。

## 配置文件说明

```yaml
properties/datasource.properties: 数据库链接配置
properties/constant.properties: 一些常量配置，可通过如下方式引用
#@Resource
 #private Properties properties;
 #String status = properties.getProperty("rocketmq.status");
log4j2.xml: 个性化日志输出
```

## 部署说明

```sh
mvn clean
# 清理 target下编译的文件
mvn compile
# 编译
mvn package
# 打包 到 target/mng.jar
mvn install
# package的基础上 安装到本地的maven仓库
mvn deploy
# install的基础上 部署到nexus仓库。
    # nexus仓库地址在 pom.xml:<distributionManagement><repository></repository></distributionManagement>
    # 需要在maven的settings.xml中<servers><server></server></servers>配置验证信息
```

一般执行`mvn install`即可

## 引入

在新项目的`pom.xml`中添加如下依赖即可使用相关工具
```xml
<dependency>
  <groupId>com.sloera</groupId>
  <artifactId>mng</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```