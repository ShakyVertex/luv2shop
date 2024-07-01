# luv2shop商城项目

## MySQL database

username = `ecommerceapp`

password = `ecommerceapp`



## RESTAPI

http://localhost:8080/api 访问所有的API Reference列表



## Angular

http://localhost:4200/products 前端主页访问

`ng serve` 启动前端服务



## Okta

Client ID = `0oahkwfe11jA3xiSW5d7`

Okta Domain = `dev-86678017.okta.com`

Okta管理员账号使用Github账号直连

**账号1：**

`sellamomota@outlook.com -p lyqlah5577`



# 学习总结

该项目是我入门Java Web前后端开发的入门项目，项目整体简单，确实没什么亮点，但十分完善。首先，项目采用了最简单的Spring Data JPA作为持久层框架。作为一个单体项目，没有复杂的多表查询，甚至都没有写很多SQL语句，但是是非常适合新手入门的全栈项目，这个项目目前我做了3遍，效果拔群，全栈开发的那些知识点都在不断加深印象。

最大的特点是，这个项目的前端是自己手敲的，从无到有，现在很多国内比较追求的企业级项目由于内容过于庞大，前端简单的模板已经支撑不了庞大的项目了，所以很多国内的项目并不能锻炼前端开发的知识，这个商城项目由于前端完全手敲，而且是国内用的不多的Angular框架，个人认为会有一定的面试优势。

作为一个商城项目，购物车内容的相关代码是集成在前端的，个人认为这是该项目最大的特点。因为国内的商城项目，像购物车实现的代码几乎都是在后端实现，后端计算，这个项目的设计优化了后端服务器的运行压力（好吧，实在这个项目没什么好吹的）

一句话评价这个项目：麻雀虽小，五脏俱全，非常适合新手入门



# 简历准备

网上商城全栈项目：Angular前端，Springboot+Spring Data JPA，MySQL

* 应用Bootstrap和fontawesome拓展，实现对页面的美化和分页效果
* 前端代码实现对购物车商品的Full CRUD操作
* 完成Angular动态表单的设计，增强程序的可拓展性和复用性，便于进行接口测试
* 后端实现订单的动态生成，自动生成UUID和订单创建时间等便于订单追踪
* 应用OAuth2框架和JWT技术实现用户登录、用户分组和用户权限管理





# 未完成项目

本项目在Udemy对应教程的Section30下卡住，想要通过Okta对订单记录的后端进行加密，但完成代码后SpringBoot不能正常运行
