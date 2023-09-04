#!/bin/bash
rm -rf /tmp/.X99-lock
Xvfb :99 &

timeout -s 2 10 ./node_modules/.bin/electron . --disable-gpu --no-sandbox
sleep 10