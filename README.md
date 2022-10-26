# cpo2


```bash
docker run --name postgres-db --rm -P -p 127.0.0.1:5434:5432 -e POSTGRES\_USER=postgres -e POSTGRES\_PASSWORD=postgres -v app\_vol:/var/lib/postgresql/data -d postgres

docker exec -it postgres-db psql -U postgres

CREATE DATABASE app_db;
\c app_db;
INSERT INTO users(first_name,last_name,email,phone_number,password) VALUES('Harry','Potter','harry.potter@gmail.com','+44 123456789', crypt('1234',gen_salt('bf', 8)));

Connection connection =  
 DriverManager.getConnection(
  "jdbc:postgresql://localhost:5434/app_db", 
  "postgres", "postgres");
```
