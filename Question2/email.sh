#!/bin/sh

#set host equal to 172.26.85.13 and port to 25
host=172.26.85.13
port=25
#Open the connection
echo open $host $port
#Wait for response
sleep 10
#Connect to SMTP server
echo HELO Exchange.support.lab
#Wait for response
sleep 10
#Set the FROM address
echo MAIL FROM:domainUser01@support.lab
#Wait for response
sleep 10
#Set the TO address
echo RCPT TO:domainUser01@support.lab
#Wait for response
sleep 10
#Write the mail
echo DATA
#Wait
sleep 10
#Output the mail
echo -e "From: Gavin Lumsden <domainUser01@support.lab>\nSubject: Question 2 - Research Engineer Assessment\n\nHere is my test script"
#End and Send the mail
echo .
#Wait for response
sleep 10
Close connection
echo QUIT