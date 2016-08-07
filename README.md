# hello-aws

This mini web-server displays a single page, which contains
the public IP address of the AWS instance.  It gets this
info by polling the address http://169.254.169.254/latest/meta-data.

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server <port | 3000>
    lein ring server-headless <port | 3000>
    lein with-profile +production ring uberjar

## License

Copyright © 2016 FIXME
