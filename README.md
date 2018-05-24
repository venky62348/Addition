# Addition

### To skip the java files from compilation:

    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.1</version>
      <configuration>
        <excludes>
          <exclude>com\devops\calculator\simple\Simple.java</exclude>
        </excludes>
      </configuration>
    </plugin>
    
  ### To skip the test cases compilation & execution
  
      <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.1</version>
          <configuration>
            <excludes>
              <exclude>com\devops\calculator\simple\Simple.java</exclude>
            </excludes>
            <skip>true</skip> -->
          </configuration>
        </plugin>
  
### To skip the test cases execution: mvn clean install -DskipTests=true

### To skip the test cases execution: mvn clean install -Dmaven.test.skip=true
