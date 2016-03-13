
<%@ page import="com.madmous.deezee.Client" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'client.label', default: 'Client')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
    <asset:stylesheet href="graph.css"/>
    <asset:stylesheet src="main.css"/>
    <asset:stylesheet src="plugins/font-awesome-4.5.0/css/font-awesome.css"/>
    <asset:stylesheet src="plugins/animate-custom.css"/>
</head>
<body>
    <header>
        <a href="#list-client" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul class="pres">
                <li><a class="home" href="${createLink(uri: '/')}">Home</a></li>
                <li><g:link controller="graph" action="index" class="suivi">Follow-up</g:link></li>
            </ul>
            <ul class="log">
                <li><g:link class="logout" controller='logout'>Logout</g:link></li>
            </ul>
        </div>
    </header>
    <article>
        <section class="intro text-center">
            <i class="fa fa-bank fa-4x animated bounceInDown"></i>
            <h1 class="animated flipInX">Time is money</h1>
        </section>
        <section class="summary">
            <div class="container">
                <div class="col-md-12 col-sm-12">
                    <div id="donut-example"></div>
                </div>
            </div>
        </section>
        <section>
            <div class="container">
                <div class="col-md-6 col-sm-6">
                    <h1>Maintenir Satisfait</h1>
                    <g:each in="${maintenirSatisfait}">
                        <li>${it}</li>
                    </g:each>
                </div>
                <div class="col-md-6 col-sm-6">
                    <h1>Impliquer Etroitement</h1>
                    <g:each in="${impliquerEtroitement}">
                        <li>${it}</li>
                    </g:each>
                </div>
                <div class="col-md-6 col-sm-6">
                    <h1>Suivi Occasionnel</h1>
                    <g:each in="${suiviOccasionnel}">
                        <li>${it}</li>
                    </g:each>
                </div>
                <div class="col-md-6 col-sm-6">
                    <h1>Maintenir Informe</h1>
                    <g:each in="${maintenirInforme}">
                        <li>${it}</li>
                    </g:each>
                </div>
            </div>
        </section>
    </article>

    <footer></footer>
    <asset:javascript src="graph.js"/>

    <script>

        /*var dataProgress=[[]];
        jQuery.map(${client}, function(item){
            dataProgress[0].push([item.personneRessource]);
        });*/
        Morris.Donut({
            element: 'donut-example',
            data: [
                {label: "Maintenir Satisfait    ", value: ${maintenirSatisfaitPourcent}},
                {label: "Impliquer Étroitement", value: ${impliquerEtroitementPourcent}},
                {label: "Suivi Occasionnel", value: ${suiviOccasionnelPourcent}},
                {label: "Maintenir Informé", value: ${maintenirInformePourcent}}
            ]
        });
    </script>
</body>
</html>
