http://localhost:9001/api/student

{
	"id" : "2",
	"name" : "Vova",
	"school" : "1"
}

run redis
docker container start newredis
docker ps
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                    NAMES
e35420e1efe4        redis:alpine        "docker-entrypoint.s…"   3 days ago          Up 2 seconds        0.0.0.0:6379->6379/tcp   newredis


C:\Users\vgonc>docker ps -a
CONTAINER ID        IMAGE                       COMMAND                  CREATED             STATUS                     PORTS                                                NAMES
43c4121a2c80        4b2315bf1ad2                "redis-cli"              3 days ago          Exited (0) 3 days ago                                                           redis-cli

docker container start redis-cli

docker exec -it 43c4121a2c80 redis-cli -h 192.168.112.193 -p 6379
192.168.112.193:6379> monitor

press Enter for update
send message and see message in cli console