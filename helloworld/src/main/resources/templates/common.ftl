<#macro page title>
<html lang="en">
<head>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>
</head>

<body>
<div class="page">
    <div class="content">
        <#nested/>
    </div>
</div>
</body>
</html>
</#macro>

<#macro header>
<div class="header">
    <div class="header__container">
        <div class="header__logo">
            <a href="/"> <img src="images/logo.png"/></a>
        </div>
        <div class="header__text">
            Digital Zone
        </div>
    </div>
</div>
</#macro>

<#macro footer>
<div class="footer">
    <div class="footer__container">
        <table class="footer__table">
            <tr>
                <th class="footer__table__text">
                    <a href="/" class="footer-menu__item">Home</a>
                </th>
                <th class="footer__table__text">
                    <a href="/about" class="footer-menu__item">Info</a>
                </th>
                <th class="footer__table__text">
                    <a href="/contacts" class="footer-menu__item">Contacts</a>
                </th>
            </tr>
        </table>
    </div>
</div>
</#macro>

<#macro pictureUnit photo>
    <#if photo??>
        <#include photo>
    <br><br>
    <#else>
    Nothing to show ((
    </#if>
</#macro>