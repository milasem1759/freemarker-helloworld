<#import "picture-unit.ftl" as p>
<#import "header.ftl" as h>
<#import "footer.ftl" as f>

<#macro page title>
<html lang="en">
<head>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>
</head>

<body>
<div class="page">
    <#nested/>
</div>
</body>
</html>
</#macro>
