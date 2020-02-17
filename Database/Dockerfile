FROM mysql:5.7.29

ENV MYSQL_DATABASE=ecommerce
ENV MYSQL_ROOT_PASSWORD=bilal123
ENV MYSQL_USER=belal
ENV MYSQL_PASSWORD=Belal2016

# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/