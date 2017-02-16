<#import "common.ftl" as c/>
<#import "header.ftl" as h/>
<#import "footer.ftl" as f/>

<@c.page title="${title}" header=h.headerContent footer=f.footerContent>
<div class="alert-danger">
    <h1>Oops. Something went wrong</h1>
    <h2>${status} ${error}</h2>
</div>
</@c.page>
