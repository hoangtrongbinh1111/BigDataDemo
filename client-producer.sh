#!/bin/bash
./gradlew clean
./gradlew build

cd cart-producer
./../gradlew run
