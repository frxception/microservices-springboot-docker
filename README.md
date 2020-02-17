# Microservices-SpringBoot-Docker

# Prerequisities
In order to run this container you'll need docker installed.
We are using windows host for our example

https://docs.docker.com/windows/started
https://docs.docker.com/docker-for-windows/install/

# Build -> Package -> Deploy
./Deploy.bat

# Deploy only
docker-compose up --force-recreate -d

# Remove all stuffs done by compose up
docker-compose down  --rmi all --remove-orphans 
