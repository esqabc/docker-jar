#下面是通过Dockerfile文件打包镜像的maven-pom.xml文件配置

        <!-- docker镜像名称前缀 -->
        <docker.image.prefix>dockerjarweb</docker.image.prefix>
        <!-- docker镜像版本号-->
        <docker.image.tag>v1</docker.image.tag>
        
    <!--Docker构建配置信息 begin-->
		<plugin>
	      <groupId>com.spotify</groupId>
	      <artifactId>docker-maven-plugin</artifactId>
	      <version>1.2.0</version>
		  <configuration>
		  			<!-- 镜像名称：版本号 -->
                    <imageName>dockerjarweb:v1</imageName>
                    <dockerHost>http://ip:2375</dockerHost>
                    <dockerDirectory>src/main/docker</dockerDirectory>
                    <resources>
                        <resource>
                            <targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.build.finalName}.jar</include>
                    </resource>
                </resources>
           </configuration>
	    </plugin>
		<!--Docker构建配置信息 end-->
    
    
  #下面是通过pom.xml文件打包镜像的maven-pom.xml文件配置：
