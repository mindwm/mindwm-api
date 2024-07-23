FROM kcllang/kcl:0.9.0
ENV YQ_VERSION v4.44.2
ENV YQ_BINARY yq_linux_amd64
RUN apt-get update && apt-get install -y wget
RUN wget https://github.com/mikefarah/yq/releases/download/${YQ_VERSION}/${YQ_BINARY}.tar.gz -O - |\
  tar xz && mv ${YQ_BINARY} /usr/bin/yq
