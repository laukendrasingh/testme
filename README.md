### OVERVIEW:
It's a test microservice app developed with spring-boot and java-11.

### 1. IMPORTANT COMMANDS
    1. Install docker
    2. Start docker using docker desktop
    3. Got to IntelliJ project and set docker path:  export PATH="/Applications/Docker.app/Contents/Resources/bin:$PATH"
    4. Build project: mvn clean install
    5. Build docker image:  sudo docker build -t testme .
    6. Run docker image: docker run -p 8080:8080 testme
    7. Run from browser: http://localhost:8080/testme/
