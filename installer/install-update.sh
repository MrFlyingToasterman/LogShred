#! /bin/bash
echo "installing update..."
if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi
chmod 777 /usr/share/LogShred
rm -rf /usr/share/LogShred/*
cp ../dist/jshred.jar /usr/share/LogShred
chmod ugo+x /usr/share/LogShred/jshred.jar
cp data/su-to-logshred.sh /usr/share/LogShred
chmod ugo+x /usr/share/LogShred/su-to-logshred.sh
rm /usr/share/applications/logshred.desktop
cp data/logshred.desktop /usr/share/applications
rm /bin/ssls
touch /bin/ssls
echo "#! /bin/bash" > /bin/ssls
echo "java -jar /usr/share/LogShred/jshred.jar" >> /bin/ssls
chmod ugo+x /bin/ssls
echo "ready."
