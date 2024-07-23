FROM kcllang/kcl:0.9.0
RUN apt-get update && apt-get install -y software-properties-common
RUN add-apt-repository ppa:rmescandon/yq  && apt-get update && apt-get install -y yq
