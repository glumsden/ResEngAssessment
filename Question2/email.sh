#!/bin/sh
host=172.26.85.13
port=25
echo open $host $port
sleep 10
echo HELO Exchange.support.lab
sleep 10
echo MAIL FROM:domainUser01@support.lab
sleep 10
echo RCPT TO:domainUser01@support.lab
sleep 10
echo DATA
sleep 10
echo -e "From: Gavin Lumsden <domainUser01@support.lab>\nSubject: Question 2 - Research Engineer Assessment\n\nHere is my test script"
echo .
sleep 10
echo QUIT
