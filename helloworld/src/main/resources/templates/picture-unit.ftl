<#macro pictureUnit photo>
    <#if photo??>
        <#include photo>
    <br><br>
    <#else>
    Nothing to show ((
    </#if>
</#macro>