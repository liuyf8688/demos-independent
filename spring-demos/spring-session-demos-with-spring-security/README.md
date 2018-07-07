# 1. 初始访问

	curl -v http://localhost:8080/api/users

	# 返回未授权
# 2. Basic Authentication

	curl -v http://localhost:8080/api/users -u admin:123456
	
	# 可以看到返回中有x-auth-token头信息
	
# 3. 通过x-auth-token进行访问

	curl -v http://localhost:8080/api/users -H "x-auth-token: 替换成实际x-auth-token返回值"
	
	# 除返回x-auth-token外，同时返回API的内容