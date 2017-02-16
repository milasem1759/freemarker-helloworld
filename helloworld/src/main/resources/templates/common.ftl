<#macro page title header footer>
<html lang="en">
<head>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>
</head>

<body>
<div class="page">
    <div class="header">
    ${header}
    </div>
    <div class="content">
        <#nested/>
    </div>
    <div class="footer">
    ${footer}
    </div>
</div>
</body>
</html>
</#macro>