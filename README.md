<h1>IO Zeta backend</h1>

[![Lint Code Base](https://github.com/MCjasiux/Spring_IOZeta/actions/workflows/super-linter.yml/badge.svg)](https://github.com/MCjasiux/Spring_IOZeta/actions/workflows/super-linter.yml)

To run this application, you will need to set up a local postgres SQL
database and create a database and user in it according to the file:
<h5><strong><code>application.properties</code></strong></h5>

you will find these properties:

<h6><strong><code>
spring.datasource.url=jdbc:postgresql://localhost:5432/io
</code></strong></h6>
<h6><strong><code>
spring.datasource.username=postgres
</code></strong></h6>
<h6><strong><code>
spring.datasource.password=kopyto
</code></strong></h6>

the last step is to configure java for the project as 17, and run the main function in the file:

<h5><strong><code>SpringIoZetaApplication.java</code></strong></h5>
