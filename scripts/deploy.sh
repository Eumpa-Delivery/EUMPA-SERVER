#!/bin/bash
 echo "> now ing app pid find!"
 CURRENT_PID=$(pgrep -f delivery)
 echo "$CURRENT_PID"
 if [ -z $CURRENT_PID ]; then
         echo "> no ing app."
 else
         echo "> kill -9 $CURRENT_PID"
         kill -9 $CURRENT_PID
         sleep 3
 fi
 echo "> new app deploy"

 cd /home/ubuntu/deploy/build/libs
 JAR_NAME=$(ls | grep 'SNAPSHOT.jar' | tail -n 1)
 echo "> JAR Name: $JAR_NAME"

 # nohup java -jar -Duser.timezone=Asia/Seoul $JAR_NAME &
 nohup java -jar -Duser.timezone=Asia/Seoul $JAR_NAME 1>nohup/stdout.txt 2>nohup/stderr.txt &
 sleep 2