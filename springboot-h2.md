**springboot+h2 ut启动内存数据库**
应用于jpa，mybatis都是可以的。
1.如果我们要让该例子只用于test的测试层面，那么需要在src/test下：创建resource --->src/test/resource
    resource:/application.properties(如果test/resource存在application.properties,那么优先读取该目录下的application.properties）
    resource:/data.sql（表的数据） 和 /schema.sql(保存表结构）
2.特别注意的点maven依赖：h2+jpa包详情看pom文件
