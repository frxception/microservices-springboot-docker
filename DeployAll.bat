SET CURRENTDIR= %CD%

cd %CURRENTDIR%\clientui
call ./mvnw clean install
call ./mvnw -Dmaven.test.skip=true package

cd %CURRENTDIR%\microservice-produits
call ./mvnw clean install
call ./mvnw -Dmaven.test.skip=true package

cd %CURRENTDIR%
call docker-compose down
call docker-compose up -d