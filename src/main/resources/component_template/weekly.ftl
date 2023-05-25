本周工作
<#list thisWeek as projectMap>
${projectMap.project}
<#list projectMap?values as s>
<#if ! s?contains("、") >
${s}
</#if>
</#list>
</#list>
下周工作
<#--<#list nextWeek as projectMap>-->
<#--${projectMap.project}-->
<#--<#list projectMap?values as s>-->
<#--<#if ! s?contains("项目") >-->
<#--${s}-->
<#--</#if>-->
<#--</#list>-->
<#--</#list>-->
