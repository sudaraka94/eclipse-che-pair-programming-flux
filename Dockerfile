# This is a comment
FROM codenvy/ubuntu_jdk8
MAINTAINER Randika Navagamuwa <randika.12@cse.mrt.ac.lk>

RUN  sudo apt-get update \
  && sudo apt-get install -y wget \
  && sudo apt-get install -y libgtk2.0-0 libxtst6 \
  && sudo apt-get clean \
  && sudo rm -rf /var/lib/apt/lists/*

WORKDIR /home/user/
RUN wget http://www.mirrorservice.org/sites/download.eclipse.org/eclipseMirror/technology/epp/downloads/release/mars/2/eclipse-jee-mars-2-linux-gtk-x86_64.tar.gz && \
    tar -zxvf eclipse-jee-mars-2-linux-gtk-x86_64.tar.gz && \
    rm eclipse-jee-mars-2-linux-gtk-x86_64.tar.gz


