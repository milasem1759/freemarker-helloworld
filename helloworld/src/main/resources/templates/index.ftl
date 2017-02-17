<#import "common.ftl" as c/>

<@c.page title="${title}">
    <@c.h.header/>

<div class="about">
    <h1 class="about__header">
        Digital Zone — разработчик информационных систем полного цикла.</h1>

    <p class="about__text">Компания создает и развивает программные решения под любые задачи. С нами заказчику не
        нужен
        собственный штат
        разработчиков, можно не разбираться в архитектуре ПО и не контролировать каждый этап. Сконцентрируйтесь на
        своем
        бизнесе!</p>

    <h3>Digital Zone оказывает услуги:</h3>

    <ul>
        <#list services as service>
            <li>
            ${service.item}
            </li>
        </#list>
    </ul>

    <br/>
    <br/>

    <img src="images/dz-foto.jpg" class="about__photo-in-text">
</div>

    <@c.f.footer/>
</@c.page>
