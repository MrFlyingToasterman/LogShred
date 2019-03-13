#! /bin/bash
echo "removing LogShred..."
if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi
sudo rm -rf /usr/share/LogShred
sudo rm /bin/ssls
sudo rm /usr/share/applications/logshred.desktop
sudo rm /usr/share/applications/logshred-root.desktop
echo "ready."
