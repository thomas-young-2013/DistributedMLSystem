#!/bin/bash

ps -ef | grep "java -jar src/client-worker-1.0-SNAPSHOT-jar-with-dependencies.jar -p:8080" | awk '{print $2}' | xargs kill -9
