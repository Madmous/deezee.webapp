<html>
<head>
    <meta name='layout' content='main'/>
    <title><g:message code="springSecurity.login.title"/></title>
    <asset:stylesheet src="login.css"/>
    <asset:stylesheet src="plugins/animate-custom.css"/>
    <link href='https://fonts.googleapis.com/css?family=Josefin+Sans:700' rel='stylesheet' type='text/css'>
</head>

<body>
<div id='login'>
    <div class='inner'>
        <div class="login-text">
            <p>PERSON OF INTEREST</p>
        </div>
        <div class="page-icon animated bounceInDown">
            <asset:image src="account/user-icon.png" alt="Key icon"/>
        </div>
        <div class="animated flipInX">
            <div class='fheader'><g:message code="springSecurity.login.header"/></div>

            <g:if test='${flash.message}'>
                <div class='login_message'>${flash.message}</div>
            </g:if>

            <form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
                <input type='text' class='text_' name='j_username' id='username' placeholder="Usernamee"/>
                <input type='password' class='text_' name='j_password' id='password' placeholder="Password"/>
                <input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
            </form>
        </div>
    </div>
    <b>POI</b> v<g:meta name="app.version"></g:meta>
</div>
<script type='text/javascript'>
    <!--
    (function() {
        document.forms['loginForm'].elements['j_username'].focus();
    })();
    // -->
</script>
</body>
</html>
