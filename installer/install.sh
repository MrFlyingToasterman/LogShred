#! /bin/bash
echo "Installing LogShred..."
if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi
mkdir /usr/share/LogShred
chmod 777 /usr/share/LogShred
cp ../dist/jshred.jar /usr/share/LogShred
cp su-to-logshred.sh /usr/share/LogShred
cp logshred.desktop /usr/share/applications
touch /bin/ssls
echo "#! /bin/bash" > /bin/ssls
echo "java -jar /usr/share/LogShred/jshred.jar" >> /bin/ssls
chmod ugo+x /bin/ssls
echo "ready."
