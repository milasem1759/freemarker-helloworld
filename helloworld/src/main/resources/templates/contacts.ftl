<#import "common.ftl" as c/>

<@c.page title="${title}">
    <@c.header/>

<h1 class="contacts__header">НАШИ ОФИСЫ</h1>

    <#if count == 4>
    <p>Мы находимся в четырёх офисах.</p>
    <#elseif count gt 4 >
    <p>Мы находимся в более, чем в четырёх офисах.</p>
    <#else >
    <p>Мы находимся в менее, чем в четырёх офисах.</p>
    </#if>

<div class="offices">
    <#list offices as office>
        <div class="offices-offices-item">
            <div class="offices-item__city"> ${office.city}</div>
            <div class="offices-item__address"> ${office.address}</div>
            <div class="offices-item__mail"> ${office.phone} ${office.email}</div>
        </div>
        <br><br>
    </#list>
</div>

    <@c.footer/>
</@c.page>