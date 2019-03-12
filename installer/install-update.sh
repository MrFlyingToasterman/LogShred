#! /bin/bash
echo "installing update..."
if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi
sudo chmod 777 /usr/share/LogShred
sudo rm -rf /usr/share/LogShred/*
cp ../dist/jshred.jar /usr/share/LogShred
cp su-to-logshred.sh /usr/share/LogShred
rm /usr/share/applications/logshred.desktop
cp logshred.desktop /usr/share/applications
sudo rm /bin/ssls
sudo touch /bin/ssls
sudo echo "#! /bin/bash" > /bin/ssls
sudo echo "java -jar /usr/share/LogShred/jshred.jar"
sudo chmod ugo+x /bin/ssls
echo "ready."
