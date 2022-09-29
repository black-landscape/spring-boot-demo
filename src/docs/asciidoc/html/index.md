# spring-boot-starter-swagger


<a name="overview"></a>
## Overview
Spring Boot Starter Swagger


### Version information
*Version* : 2.0.2.RELEASE


### Contact information
*Contact* : didi  
*Contact Email* : dyc87112@qq.com


### License information
*License* : Apache License, Version 2.0  
*License URL* : https://www.apache.org/licenses/LICENSE-2.0.html  
*Terms of service* : https://github.com/dyc87112/spring-boot-starter-swagger


### URI scheme
*Host* : localhost:8080  
*BasePath* : /


### Tags

* 1-教师管理 : Teacher Controller
* 2-学生管理 : Student Controller
* 3-教学管理 : Teacher Controller
* demo-application : Demo Application
* 用户管理 : User Controller




<a name="paths"></a>
## Paths

<a name="indexusingpost"></a>
### index
```
POST /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="indexusingget"></a>
### index
```
GET /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="indexusingput"></a>
### index
```
PUT /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="indexusingdelete"></a>
### index
```
DELETE /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="indexusingpatch"></a>
### index
```
PATCH /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="indexusinghead"></a>
### index
```
HEAD /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="indexusingoptions"></a>
### index
```
OPTIONS /hello
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* demo-application


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="createstudentusingpost"></a>
### 创建一个学生
```
POST /student/create
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 2-学生管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getstudentteachersusingget"></a>
### 获取教某个学生的老师清单
```
GET /student/his-teachers
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 2-学生管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getstudentlistusingget"></a>
### 获取学生清单
```
GET /student/list
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 2-学生管理
* 3-教学管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="xxxusingget"></a>
### xxx
```
GET /teacher/xxx
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 1-教师管理
* 3-教学管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="postuserusingpost"></a>
### 创建用户
```
POST /users/
```


#### Description
根据User对象创建用户


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**user**  <br>*required*|user|[User](#user)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserlistusingget"></a>
### 获取用户列表
```
GET /users/
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|< [User](#user) > array|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserusingget"></a>
### 获取用户详细信息
```
GET /users/{id}
```


#### Description
根据url的id来获取用户详细信息


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int64)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="putuserusingput"></a>
### 更新用户详细信息
```
PUT /users/{id}
```


#### Description
根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|用户编号|integer (int64)|
|**Body**|**user**  <br>*required*|user|[User](#user)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="deleteuserusingdelete"></a>
### 删除用户
```
DELETE /users/{id}
```


#### Description
根据url的id来指定删除对象


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int64)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|




<a name="definitions"></a>
## Definitions

<a name="user"></a>
### User
用户实体


|Name|Description|Schema|
|---|---|---|
|**age**  <br>*optional*|用户年龄  <br>**Minimum value** : `10`  <br>**Maximum value** : `100`|integer (int32)|
|**email**  <br>*optional*|用户邮箱|string|
|**id**  <br>*optional*|用户编号|integer (int64)|
|**name**  <br>*optional*|用户姓名  <br>**Length** : `2 - 5`|string|




<a name="securityscheme"></a>
## Security

<a name="authorization"></a>
### Authorization
*Type* : apiKey  
*Name* : TOKEN  
*In* : HEADER



