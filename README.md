play-https-redirect-fixer
=========================

Tiny Play 1.x plugin to fix an issue with SSL/TLS-enabled reverse proxy. [Credit.][1]

Usage
=====

Step 1 - Add this to dependencies.yml:
--------------------------------------

     # Application dependencies

    require:
        - play
        - itsadok -> https-redirect-fixer 0.1
        
        
    repositories:
         - itsadok:
            type: http
            artifact:  https://github.com/itsadok/play-https-redirect-fixer/releases/download/v[revision]/[module]-[revision].zip
            contains:
            - itsadok -> *

Step 2 - Add this to your virtualhost configuration:
----------------------------------------------------

    RequestHeader set X-FORWARDED-PROTO 'https'
    
I'm assuming you're using Apache2. You need to install and enable mod_headers.


Details
=======

See the [linked article][1] for more details.

License
=======

[CC0](http://creativecommons.org/publicdomain/zero/1.0/).

[1]: http://www.philipp.haussleiter.de/2012/05/fixing-redirects-of-a-play-app-behind-an-apache2-ssl-proxy/
