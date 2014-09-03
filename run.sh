#!/bin/bash
export PORT="8088"
java -jar build/dependency/webapp-runner.jar --port $PORT build/libs/*.war
